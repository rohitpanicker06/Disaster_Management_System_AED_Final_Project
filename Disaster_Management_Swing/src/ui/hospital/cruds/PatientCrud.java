/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.hospital.cruds;

import house.House;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.doctor.Doctor;
import model.doctor.DoctorDirectory;
import model.hospital.Hospital;
import model.hospital.HospitalDirectory;
import model.patient.Patient;
import model.patient.PatientDirectory;
import person.Person;
import rbac.context.RbacApplicationContext;
import rbac.role.Role;
import rbac.roles.roleImplementation.DoctorRoleBase;
import rbac.roles.roleImplementation.HospitalAdminRoleBase;
import rbac.roles.roleImplementation.SystemAdminRoleBase;
import ui.LoginPanel;
import ui.MainJFrame;
import us.state.city.City;
import us.state.city.community.Community;
import utility.ValidationHelper;

/**
 *
 * @author rohitpanicker
 */
public class PatientCrud extends javax.swing.JPanel {

    /**
     * Creates new form PatientCrud
     */
    public PatientCrud() {
        initComponents();
        setOpaque(false);
    }
     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth(), h = getHeight();
        Color color1 = Color.RED;
        Color color2 = Color.BLACK;
        GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
     private Patient patient ;
    private String operation;
    private Doctor doctor;
    private Image globalImage = null;
    private void populateHospitalJComboBox() {
        hospitalNameComboBox.removeAllItems();
      for(Hospital hospital: HospitalDirectory.hospitalList)
      {
          hospitalNameComboBox.addItem(hospital.getHospitalName());
      }
      
      if(this.operation == "pu" )
      {
          hospitalNameComboBox.setSelectedItem(this.patient.getHospital().getHospitalName());
      }
      else if(this.operation == "du")
      {
          hospitalNameComboBox.setSelectedItem(this.doctor.getHospital().getHospitalName());
      }
    }
    
    public PatientCrud(Doctor doctor, String operation)
    {
        this.doctor = doctor;
        this.operation = operation;
        initComponents();
         insuranceIdLabel.setVisible(false);
            insuranceIdTxtField.setVisible(false);
           browseButton.setVisible(true);
         populateDoctorCrudFields();
         if(operation.equals("du"))
        {   encounterHistoryBtn.setVisible(false);
         browseButton.setVisible(false);
            populateHospitalJComboBox();
            createPatientBtn.setText("Update");
            createPatientBtn.setVisible(true);
        }else if(operation.equals("dv"))
        {
            encounterHistoryBtn.setVisible(false);
            browseButton.setVisible(false);
            hospitalNameComboBox.removeAllItems();
            hospitalNameComboBox.addItem(doctor.getHospital().getHospitalName());
        }
    }
 private void populateDoctorCrudFields(){
         createPatientBtn.setVisible(false);
         insuranceIdLabel.setVisible(false);
         insuranceIdTxtField.setVisible(false);
        idTxtField.setText(doctor.getPerson().getId());
        nameTxtField.setText(doctor.getPerson().getName());
        emailIdTxtField.setText(doctor.getPerson().getEmailid());
        phnNumberTxtField.setText(String.valueOf(doctor.getPerson().getPhoneNumber()));
        cityTxtField.setText(doctor.getPerson().getResidence().getCommunity().getCity().getName());
        stateTxtField.setText(doctor.getPerson().getResidence().getCommunity().getCity().getState());
        countryTxtField.setText(doctor.getPerson().getResidence().getCommunity().getCity().getCountry());
        genderTxtField.setText(doctor.getPerson().getGender());
        ageTxtField.setText(String.valueOf(doctor.getPerson().getAge()));
        //insuranceIdTxtField.setText(String.valueOf(doctor.getInsuranceId()));
        communityNameTxtField.setText(doctor.getPerson().getResidence().getCommunity().getCommunityName());
        zipCodeTxtField.setText(doctor.getPerson().getResidence().getCommunity().getZipCode());
        addressTxtField.setText(doctor.getPerson().getResidence().getCommunity().getLocation());
        photoLabel.setIcon(new ImageIcon(doctor.getPerson().getImage()));
         
     }
 public PatientCrud(String operation)
     {
         this.operation = operation;
         
         initComponents();
         if(operation.contains("cp"))
         {
            populateHospitalJComboBox(); 
            encounterHistoryBtn.setVisible(false);
            browseButton.setVisible(true);
         }
         
         else if(operation.contains("cd")){
         try{
             browseButton.setVisible(true);
             insuranceIdLabel.setText("");
             insuranceIdLabel.setVisible(false);
         insuranceIdTxtField.setText("");
         insuranceIdTxtField.setVisible(false);
         hospitalLable.setVisible(true);
         hospitalNameComboBox.setVisible(true);
         encounterHistoryBtn.setVisible(false);
          populateHospitalJComboBox(); 
         }catch(Exception e)
         {
             System.out.println(e.getMessage()); 
         }
         }
     }
     
    
    
    public PatientCrud(Patient patient, String operation)
    {
        this.patient = patient;
        this.operation = operation;
        initComponents();
        populatePatinetCrudFields();
        if(operation.equals("pv")){
            browseButton.setVisible(false);
        hospitalNameComboBox.removeAllItems();
        hospitalNameComboBox.addItem(patient.getHospital().getHospitalName());
        }
        else if(operation.equals("pu"))
        {
            createPatientBtn.setText("Update");
            browseButton.setVisible(false);
            createPatientBtn.setVisible(true);
            populateHospitalJComboBox();
           
        }
    }
     private void updateDoctor(){
        doctor.getPerson().setId(idTxtField.getText());
         doctor.getPerson().setName( nameTxtField.getText());
        doctor.getPerson().setEmailid(emailIdTxtField.getText());
        doctor.getPerson().setPhoneNumber(Long.parseLong(phnNumberTxtField.getText()));
        doctor.getPerson().getResidence().getCommunity().getCity().setName( cityTxtField.getText());
        doctor.getPerson().getResidence().getCommunity().getCity().setState( stateTxtField.getText());
        doctor.getPerson().getResidence().getCommunity().getCity().setCountry(countryTxtField.getText());
       doctor.getPerson().setGender( genderTxtField.getText());
        doctor.getPerson().setAge( Integer.parseInt(ageTxtField.getText()));
       // doctor.setInsuranceId(Integer.parseInt(insuranceIdTxtField.getText()));
         doctor.getPerson().getResidence().getCommunity().setCommunityName( communityNameTxtField.getText());
        doctor.getPerson().getResidence().getCommunity().setZipCode( zipCodeTxtField.getText());
        doctor.getPerson().getResidence().getCommunity().setLocation( addressTxtField.getText());
        Hospital hospital = new HospitalDirectory().findHospitalByName((String) hospitalNameComboBox.getSelectedItem());
        doctor.setHospital(hospital);
        JOptionPane.showMessageDialog(this, "Record Updated Successfuly");
        clearPatinetCrudFields();
    }
     
      private void updatePatient()
    {
         patient.getPerson().setId(idTxtField.getText());
         patient.getPerson().setName( nameTxtField.getText());
        patient.getPerson().setEmailid(emailIdTxtField.getText());
        patient.getPerson().setPhoneNumber(Long.parseLong(phnNumberTxtField.getText()));
        patient.getPerson().getResidence().getCommunity().getCity().setName( cityTxtField.getText());
        patient.getPerson().getResidence().getCommunity().getCity().setState( stateTxtField.getText());
        patient.getPerson().getResidence().getCommunity().getCity().setCountry(countryTxtField.getText());
       patient.getPerson().setGender( genderTxtField.getText());
        patient.getPerson().setAge( Integer.parseInt(ageTxtField.getText()));
        patient.setInsuranceId(Integer.parseInt(insuranceIdTxtField.getText()));
         patient.getPerson().getResidence().getCommunity().setCommunityName( communityNameTxtField.getText());
        patient.getPerson().getResidence().getCommunity().setZipCode( zipCodeTxtField.getText());
        patient.getPerson().getResidence().getCommunity().setLocation( addressTxtField.getText());
        String hospitalName = (String)hospitalNameComboBox.getSelectedItem();
        patient.setHospital(new HospitalDirectory().findHospitalByName(hospitalName));
        JOptionPane.showMessageDialog(this, "Record Updated Successfuly");
        clearPatinetCrudFields();
        
        
    }
    private void clearPatinetCrudFields()
    {
        idTxtField.setText("");
        nameTxtField.setText("");
        emailIdTxtField.setText("");
        phnNumberTxtField.setText("");
        cityTxtField.setText("");
        stateTxtField.setText("");
        countryTxtField.setText("");
        genderTxtField.setText("");
        ageTxtField.setText("");
        insuranceIdTxtField.setText("");
        communityNameTxtField.setText("");
        zipCodeTxtField.setText("");
        addressTxtField.setText("");
            
    }
    
    private void populatePatinetCrudFields()
    {   try{
        createPatientBtn.setVisible(false);
        idTxtField.setText(patient.getPerson().getId());
        nameTxtField.setText(patient.getPerson().getName());
        emailIdTxtField.setText(patient.getPerson().getEmailid());
        phnNumberTxtField.setText(String.valueOf(patient.getPerson().getPhoneNumber()));
        cityTxtField.setText(patient.getPerson().getResidence().getCommunity().getCity().getName());
        stateTxtField.setText(patient.getPerson().getResidence().getCommunity().getCity().getState());
        countryTxtField.setText(patient.getPerson().getResidence().getCommunity().getCity().getCountry());
        genderTxtField.setText(patient.getPerson().getGender());
        ageTxtField.setText(String.valueOf(patient.getPerson().getAge()));
        insuranceIdTxtField.setText(String.valueOf(patient.getInsuranceId()));
        communityNameTxtField.setText(patient.getPerson().getResidence().getCommunity().getCommunityName());
        zipCodeTxtField.setText(patient.getPerson().getResidence().getCommunity().getZipCode());
        addressTxtField.setText(patient.getPerson().getResidence().getCommunity().getLocation());
        photoLabel.setIcon(new ImageIcon(patient.getPerson().getImage()));
    }catch(Exception e)
    {
        
    }
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        personIdLabel1 = new javax.swing.JLabel();
        idTxtField = new javax.swing.JTextField();
        personNameLabel = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        emailIdPersonLabel = new javax.swing.JLabel();
        emailIdTxtField = new javax.swing.JTextField();
        phonePersonalLabel = new javax.swing.JLabel();
        phnNumberTxtField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityTxtField = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        stateTxtField = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        countryTxtField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderTxtField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTxtField = new javax.swing.JTextField();
        insuranceIdLabel = new javax.swing.JLabel();
        insuranceIdTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        communityNameLabel = new javax.swing.JLabel();
        communityNameTxtField = new javax.swing.JTextField();
        zipCodeLabel = new javax.swing.JLabel();
        zipCodeTxtField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTxtField = new javax.swing.JTextField();
        hospitalLable = new javax.swing.JLabel();
        hospitalNameComboBox = new javax.swing.JComboBox<>();
        encounterHistoryBtn = new javax.swing.JButton();
        createPatientBtn = new javax.swing.JButton();
        logoutLabel = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        personIdLabel1.setText("ID:");

        personNameLabel.setText("Name:");

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });

        emailIdPersonLabel.setText("Email ID:");

        phonePersonalLabel.setText("Phone Number:");

        cityLabel.setText("City:");

        stateLabel.setText("State");

        countryLabel.setText("Country:");

        genderLabel.setText("Gender");

        ageLabel.setText("Age:");

        insuranceIdLabel.setText("Insurance ID:");

        jLabel4.setText("Image");

        photoLabel.setBackground(new java.awt.Color(255, 255, 255));

        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        communityNameLabel.setText("Community Name:");

        zipCodeLabel.setText("ZipCode:");

        addressLabel.setText("Address:");

        hospitalLable.setText("Hospital");

        hospitalNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        encounterHistoryBtn.setText("View Encounter History");
        encounterHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterHistoryBtnActionPerformed(evt);
            }
        });

        createPatientBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        createPatientBtn.setText("CREATE");
        createPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientBtnActionPerformed(evt);
            }
        });

        logoutLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setText("Logout");
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(createPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(personIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(idTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(personNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailIdPersonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(160, 160, 160)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)
                            .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(phonePersonalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(phnNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(420, 420, 420)
                            .addComponent(browseButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)
                            .addComponent(cityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(communityNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(communityNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)
                            .addComponent(stateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(zipCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(zipCodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(80, 80, 80)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(countryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(genderTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(160, 160, 160)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(80, 80, 80)
                            .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(hospitalLable, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(130, 130, 130)
                            .addComponent(hospitalNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(insuranceIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(insuranceIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(encounterHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 631, Short.MAX_VALUE)
                .addComponent(createPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(personIdLabel1)
                        .addComponent(idTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(personNameLabel)
                            .addGap(43, 43, 43)
                            .addComponent(emailIdPersonLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(emailIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jLabel4))
                        .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(phonePersonalLabel)
                        .addComponent(phnNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(browseButton)))
                    .addGap(17, 17, 17)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cityLabel)
                        .addComponent(cityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(communityNameLabel)
                        .addComponent(communityNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(zipCodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(stateLabel)
                                .addComponent(stateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(zipCodeLabel))))
                    .addGap(17, 17, 17)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(countryLabel)
                            .addGap(43, 43, 43)
                            .addComponent(genderLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(countryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(genderTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(addressLabel))
                        .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(hospitalNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ageLabel)
                                .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hospitalLable))))
                    .addGap(37, 37, 37)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(insuranceIdLabel)
                        .addComponent(insuranceIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(encounterHistoryBtn))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        // TODO add your handling code here:

        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Choose your extension", "jpg");
        jFileChooser.setFileFilter(fileNameExtensionFilter);

        try {
            int selectedOperation = jFileChooser.showOpenDialog(this);
            if (selectedOperation == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser.getSelectedFile();
                String selectedImage = file.getAbsolutePath();

                JOptionPane.showInternalMessageDialog(null, "Are you sure you want this Photo?");

                ImageIcon imageIcon = new ImageIcon(selectedImage);
                Image imageDefault = imageIcon.getImage();
                Image imageDisplay = imageDefault.getScaledInstance(photoLabel.getWidth(), photoLabel.getHeight(), Image.SCALE_SMOOTH);
                globalImage = imageDisplay;
                photoLabel.setIcon(new ImageIcon(imageDisplay));
            }
        } catch (Exception e) {
            System.out.println("Exception occured while choosing image e= " + e.getMessage());
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void encounterHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterHistoryBtnActionPerformed
        // TODO add your handling code here:
        //if(applicationContext.getUser() != null){
        if(true){
           // Role role = applicationContext.getRoleContext();
           Role role = null;
            if(role instanceof SystemAdminRoleBase || role instanceof HospitalAdminRoleBase || role instanceof DoctorRoleBase)
            {
                EncounterHistoryPanel encounterHistoryPanel = new EncounterHistoryPanel(patient);
                
            }else{
                JOptionPane.showMessageDialog(this, "You dont have access to this");
                return;
            }
        }

    }//GEN-LAST:event_encounterHistoryBtnActionPerformed

    private void createPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientBtnActionPerformed
        // TODO add your handling code here:
        int errorCount =0;
        StringBuffer errorNotifier = new StringBuffer();
        String id = null, name = null, emailId = null, phoneNumber = null, cityName = null, state = null,
        country = null, gender = null, age = null, insuranceId = null, communityName = null, zipCode = null,
        address = null;
        Image image = null;
        String hospitalName = null;
        if(this.operation.contains("cp") || this.operation.contains("cd")){
            if(ValidationHelper.isInteger(idTxtField.getText()))
            {
                id = idTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Hospital ID should be an Integer\n");
            }
            if(ValidationHelper.isValidName(nameTxtField.getText()))
            {
                name = nameTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Name should be a String\n");
            }
            if(ValidationHelper.isValidEmailID(emailIdTxtField.getText())){
                emailId = emailIdTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Email Id should be in xyz@gmail.com format\n");
            }
            if(ValidationHelper.checkPhoneNumberWith10Digits(phnNumberTxtField.getText())){
                phoneNumber = phnNumberTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Phone number should be of 10 digits\n");
            }
            if(ValidationHelper.isValidName(cityTxtField.getText())){
                cityName = cityTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Phone number should be a String\n");
            }
            if(ValidationHelper.isValidName(stateTxtField.getText()))
            {
                state = stateTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". State should be a String\n");
            }

            if(ValidationHelper.isValidName(countryTxtField.getText())){
                country = countryTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Country should be a String\n");
            }
            if(ValidationHelper.isValidName(genderTxtField.getText())){
                gender = genderTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Gender should be a String\n");
            }
            if(ValidationHelper.isInteger(ageTxtField.getText())){
                age = ageTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Age should be an Integer\n");
            }
            if(this.operation.equalsIgnoreCase("cd"))
            {
            }
            else
            {
                if(ValidationHelper.isInteger(insuranceIdTxtField.getText())){
                    insuranceId = insuranceIdTxtField.getText();
                }else{
                    errorCount++;
                    errorNotifier.append(errorCount).append(". Insurance ID should be an Integer\n");
                }
            }

            if(hospitalName == null)
            {
                hospitalName = (String) hospitalNameComboBox.getSelectedItem();
            }

            if(ValidationHelper.isValidName(communityNameTxtField.getText())){
                communityName = communityNameTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Community Name should be a String\n");
            }
            if(ValidationHelper.isInteger(zipCodeTxtField.getText())){
                zipCode = zipCodeTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Zipcode should be an Integer\n");
            }
            if(ValidationHelper.isValidName(addressTxtField.getText())){
                address = addressTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Address should be a String\n");
            }

            if(globalImage!= null)
            {
                image= globalImage;
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Please select a Image\n");
            }

            if(errorCount > 0 )
            {
                JOptionPane.showMessageDialog(this, errorNotifier.toString());
            }else{

                City city = new City(state, country,  cityName);
                Community community = new Community(city, communityName, country, zipCode);
                House house = new House(community, 7, 8);
                Person person = new Person(id, name, emailId, Long.parseLong(phoneNumber), house, gender, Integer.parseInt(age), image);
                if(this.operation.contains("cp")){
                    Hospital hospital = new HospitalDirectory().findHospitalByName(hospitalName);
                    Patient newPatient = new Patient(person, null, Integer.parseInt(insuranceId), hospital,null);
                    hospital.getPatientList().add(newPatient);
                    PatientDirectory.patientList.add(newPatient);
                    JOptionPane.showMessageDialog(this,"Created New Patient");
                }else if(this.operation.contains("cd")){
                    Hospital hospital = new HospitalDirectory().findHospitalByName(hospitalName);
                    Doctor doctor_new = new Doctor(person,hospital);
                    DoctorDirectory.doctorList.add(doctor_new);
                    hospital.getDoctorList().add(doctor_new);
                    JOptionPane.showMessageDialog(this,"Created New Doctor");
                }
            }
        }
        else if(this.operation.contains("pu")){
            updatePatient();
        }
        else if(this.operation.contains("du"))
        {
            updateDoctor();
        }
        clearPatinetCrudFields();

    }//GEN-LAST:event_createPatientBtnActionPerformed

    private void logoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMousePressed
        // TODO add your handling code here:

        RbacApplicationContext rbacApplicationContext = RbacApplicationContext.getInstance();
        rbacApplicationContext.setRoleContext(null);
        rbacApplicationContext.setUser(null);
        JOptionPane.showMessageDialog(this, "Logged Out");
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new LoginPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
    }//GEN-LAST:event_logoutLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTxtField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTxtField;
    private javax.swing.JLabel communityNameLabel;
    private javax.swing.JTextField communityNameTxtField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryTxtField;
    private javax.swing.JButton createPatientBtn;
    private javax.swing.JLabel emailIdPersonLabel;
    private javax.swing.JTextField emailIdTxtField;
    private javax.swing.JButton encounterHistoryBtn;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxtField;
    private javax.swing.JLabel hospitalLable;
    private javax.swing.JComboBox<String> hospitalNameComboBox;
    private javax.swing.JTextField idTxtField;
    private javax.swing.JLabel insuranceIdLabel;
    private javax.swing.JTextField insuranceIdTxtField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel personIdLabel1;
    private javax.swing.JLabel personNameLabel;
    private javax.swing.JTextField phnNumberTxtField;
    private javax.swing.JLabel phonePersonalLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateTxtField;
    private javax.swing.JLabel zipCodeLabel;
    private javax.swing.JTextField zipCodeTxtField;
    // End of variables declaration//GEN-END:variables
}
