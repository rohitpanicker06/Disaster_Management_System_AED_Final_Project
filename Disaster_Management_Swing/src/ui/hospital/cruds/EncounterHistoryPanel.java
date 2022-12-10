/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.hospital.cruds;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.doctor.Doctor;
import model.doctor.DoctorDirectory;
import model.encounter.Encounter;
import model.patient.Patient;
import model.vitalsigns.VitalSigns;
import utility.DateParser;
import utility.ValidationHelper;

/**
 *
 * @author rohitpanicker
 */
public class EncounterHistoryPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterHistoryPanel
     */
    
     private Patient patient;
    public EncounterHistoryPanel(Patient patient) {
        initComponents();
        setOpaque(false);
        this.patient= patient;
        populateTableRecordsWithEncounterHistory();
        makeLabelsDisappear();
        makeTxtFieldsDisappear();
        
    }
    private void makeTxtFieldsDisappear(){
        
        patientIDtxtField.setVisible(false);
        nameTxtField.setVisible(false);
        ageTxtField.setVisible(false);
        genderTxtField.setVisible(false);
        addressTextField.setVisible(false);
        insuranceIdTxtField.setVisible(false);
        emailidTextField.setVisible(false);
        phoneNumberTextField.setVisible(false);
        doctorComboBox.setVisible(false);
        
    }
 private void populateTableRecordsWithEncounterHistory()
    {
        
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        
        tableModel.setColumnCount(0);
        tableModel.addColumn("Date");
        tableModel.addColumn("Body Temp");
        tableModel.addColumn("Pulse Rate");
        tableModel.addColumn("Respiration Rate");
        tableModel.addColumn("Blood Pressure");
        tableModel.addColumn("Doctor Name");
         /*JTableHeader th = tblRecords.getTableHeader();
         TableColumnModel tcm = th.getColumnModel();
         TableColumn tc = tcm.getColumn(0);
        tc.setHeaderValue( "Date" );
        TableColumn tc_one = tcm.getColumn(1);
        tc_one.setHeaderValue("Body Temp");
        TableColumn tc_two = tcm.getColumn(2);
        tc_two.setHeaderValue("Pulse Rate");
        TableColumn tc_three = tcm.getColumn(3);
        tc_three.setHeaderValue("Respiration Rate");*/
       
        
      //  th.repaint();
        tableModel.setRowCount(0);
        
        try {
            for (Encounter  encounter : patient.getEncounterHistoryList()) {

                Object[] row = new Object[6];
                row[0] = encounter;
                row[1] = encounter.getVitalSigns().getBodyTemperature();
                row[2] = encounter.getVitalSigns().getPulseRate();
                row[3] = encounter.getVitalSigns().getRespirationRate();
                row[4] = encounter.getVitalSigns().getBloodPressure();
                try{
                if(encounter.getVitalSigns().getDoctor() == null) {
                row[5]= "Created By System Admin";
                }else{
                    row[5] = encounter.getVitalSigns().getDoctor().getPerson().getName();
                }
                }catch(Exception e)
                {
                    
                }

                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
        
        
    }
 
 private void makeVitalTxtFieldsAppear()
    {
         patientIDtxtField.setVisible(true);
        nameTxtField.setVisible(true);
        ageTxtField.setVisible(true);
        genderTxtField.setVisible(true);
        addressTextField.setVisible(true);
        insuranceIdTxtField.setVisible(false);
        emailidTextField.setVisible(false);
        phoneNumberTextField.setVisible(false);
    }     
    public void makeLabelsDisappear()
    {
        searchComboBox.setVisible(false);
       searchByLabel.setVisible(false);
        searchTextField.setVisible(false);
        goButton.setVisible(false);
        patientIDLabel.setVisible(false);
        nameLabel.setVisible(false);
        ageLabel.setVisible(false);
        genderLabel.setVisible(false);
        addressLabel.setVisible(false);
        insuranceIdLabel.setVisible(false);
        emailIdLabel.setVisible(false);
        phoneNumberLabel.setVisible(false);
        doctorLabel.setVisible(false);
       
        saveVariable.setVisible(false);

    }
    private void deleteRecord(Encounter encounter) {
       this.patient.getEncounterHistoryList().remove(encounter);
       populateTableRecordsWithEncounterHistory();
    }

    private ArrayList<Encounter> searchByPulseRate(String txtSearch) {
        ArrayList<Encounter> result = new ArrayList<>();
    for(Encounter e : this.patient.getEncounterHistoryList())
    {
        if(e.getVitalSigns().getPulseRate() == Integer.parseInt(txtSearch))
        {
            result.add(e);
        }
    }
    return result;
    }

    private ArrayList<Encounter> searchByBodyTemp(String txtSearch) {
        ArrayList<Encounter> result = new ArrayList<>();
    for(Encounter e : this.patient.getEncounterHistoryList())
    {
        if(e.getVitalSigns().getBodyTemperature() == Integer.parseInt(txtSearch))
        {
            result.add(e);
        }
    }
    return result;
    }

    private ArrayList<Encounter> searchByRespRate(String txtSearch) {
       
         ArrayList<Encounter> result = new ArrayList<>();
    for(Encounter e : this.patient.getEncounterHistoryList())
    {
        if(e.getVitalSigns().getRespirationRate() == Integer.parseInt(txtSearch))
        {
            result.add(e);
        }
    }
    return result;
    }

    private ArrayList<Encounter> searchByBloodPressure(String txtSearch) {
        ArrayList<Encounter> result = new ArrayList<>();
    for(Encounter e : this.patient.getEncounterHistoryList())
    {
        if(e.getVitalSigns().getBloodPressure().equalsIgnoreCase(txtSearch))
        {
            result.add(e);
        }
    }
    return result;
    }

    private void populateTableRecordsWithEncounterHistory(ArrayList<Encounter> encounterList) {
      DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
     
        tableModel.setColumnCount(0);
        tableModel.addColumn("Date");
        tableModel.addColumn("Body Temp");
        tableModel.addColumn("Pulse Rate");
        tableModel.addColumn("Respiration Rate");
        tableModel.addColumn("Blood Pressure");
        tableModel.addColumn("Doctor Name");
       
      
        tableModel.setRowCount(0);
        
        try {
            for (Encounter  encounter : encounterList) {

                Object[] row = new Object[6];
                row[0] = encounter;
                row[1] = encounter.getVitalSigns().getBodyTemperature();
                row[2] = encounter.getVitalSigns().getPulseRate();
                row[3] = encounter.getVitalSigns().getRespirationRate();
                row[4] = encounter.getVitalSigns().getBloodPressure();
               if(encounter.getVitalSigns().getDoctor() == null )
               {
                   row[5]=  "Created by System Admin";
               }else{
                row[5]=  encounter.getVitalSigns().getDoctor().getPerson().getName();
                   }
               
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
        
    }

    private void populateJComboBox(Encounter encounter) {
     doctorComboBox.removeAllItems();
      String name = encounter.getVitalSigns().getDoctor().getPerson().getName();
     doctorComboBox.addItem(name);
     for(Doctor doctor : DoctorDirectory.doctorList)
     {
         if(!doctor.getPerson().getName().equals(name))
         {
           doctorComboBox.addItem(doctor.getPerson().getName());
         }
     }
    }
 private void clearTxtFields()
    {
        patientIDtxtField.setText("");
        nameTxtField.setText("");
        ageTxtField.setText("");
        genderTxtField.setText("");
        addressTextField.setText("");
        insuranceIdTxtField.setText("");
        emailidTextField.setText("");
        phoneNumberTextField.setText("");
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
    public EncounterHistoryPanel() {
        initComponents();
        setOpaque(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        createVitalBtn = new javax.swing.JButton();
        searchVitalBtn = new javax.swing.JButton();
        searchByLabel = new javax.swing.JLabel();
        searchComboBox = new javax.swing.JComboBox<>();
        patientIDLabel = new javax.swing.JLabel();
        patientIDtxtField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        genderTxtField = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        nameTxtField = new javax.swing.JTextField();
        updateVitalRecord = new javax.swing.JButton();
        deleteVitalBtn = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        doctorLabel = new javax.swing.JLabel();
        doctorComboBox = new javax.swing.JComboBox<>();
        insuranceIdLabel = new javax.swing.JLabel();
        insuranceIdTxtField = new javax.swing.JTextField();
        emailIdLabel = new javax.swing.JLabel();
        emailidTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        saveVariable = new javax.swing.JButton();
        logoutLabel = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Age"
            }
        ));
        jScrollPane1.setViewportView(tblRecords);

        createVitalBtn.setText("Create Vital Record");
        createVitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVitalBtnActionPerformed(evt);
            }
        });

        searchVitalBtn.setText("Search Vital Record");
        searchVitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVitalBtnActionPerformed(evt);
            }
        });

        searchByLabel.setText("Search By");

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pulse Rate", "Body Temp", "Respiration Rate", "Blood Pressure" }));

        patientIDLabel.setText("Patient ID:");
        patientIDLabel.setMaximumSize(new java.awt.Dimension(100, 17));
        patientIDLabel.setPreferredSize(new java.awt.Dimension(100, 17));

        nameLabel.setText("Name");

        ageLabel.setText("Age");

        genderLabel.setText("Gender");

        addressLabel.setText("Address");

        updateVitalRecord.setText("Update Vital Record");
        updateVitalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVitalRecordActionPerformed(evt);
            }
        });

        deleteVitalBtn.setText("Delete Vital Record");
        deleteVitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVitalBtnActionPerformed(evt);
            }
        });

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        goButton.setText("Search");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        doctorLabel.setText("Doctor");

        doctorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        insuranceIdLabel.setText("Insurance ID");

        emailIdLabel.setText("Email ID:");

        phoneNumberLabel.setText("Phone Number:");

        saveVariable.setText("SAVE");
        saveVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveVariableActionPerformed(evt);
            }
        });

        logoutLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setText("Logout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(971, Short.MAX_VALUE)
                .addComponent(logoutLabel)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(createVitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(searchVitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(updateVitalRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(deleteVitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(120, 120, 120)
                                    .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(searchByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(130, 130, 130)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(goButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(patientIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(patientIDtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(230, 230, 230)
                            .addComponent(doctorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(230, 230, 230)
                            .addComponent(insuranceIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(80, 80, 80)
                            .addComponent(insuranceIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(230, 230, 230)
                            .addComponent(emailIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(80, 80, 80)
                            .addComponent(emailidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(genderTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(230, 230, 230)
                            .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(420, 420, 420)
                            .addComponent(saveVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutLabel)
                .addContainerGap(742, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(createVitalBtn)
                        .addComponent(searchVitalBtn)
                        .addComponent(updateVitalRecord)
                        .addComponent(deleteVitalBtn))
                    .addGap(47, 47, 47)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(goButton))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(patientIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(patientIDtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(doctorLabel))))
                    .addGap(17, 17, 17)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(insuranceIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(insuranceIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(emailIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(genderTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(saveVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void createVitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createVitalBtnActionPerformed
        // TODO add your handling code here:
        clearTxtFields();
        doctorComboBox.setVisible(false);
        doctorLabel.setVisible(false);
        searchByLabel.setVisible(false);
        searchTextField.setVisible(false);
        goButton.setVisible(false);
        makeLabelsDisappear();
        saveVariable.setVisible(true);
        saveVariable.setText("Save");

        patientIDLabel.setText("Body Temperature");

        ageLabel.setText("Pulse Rate");
        genderLabel.setText("Respiration Rate");
        addressLabel.setText("Blood Pressure");
        nameTxtField.setText(patient.getPerson().getName());
        patientIDLabel.setVisible(true);
        nameLabel.setVisible(true);
        ageLabel.setVisible(true);
        genderLabel.setVisible(true);
        addressLabel.setVisible(true);

        makeVitalTxtFieldsAppear();
    }//GEN-LAST:event_createVitalBtnActionPerformed

    private void searchVitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVitalBtnActionPerformed
        // TODO add your handling code here:
        makeLabelsDisappear();
        makeTxtFieldsDisappear();
        doctorComboBox.setVisible(false);
        doctorLabel.setVisible(false);
        searchByLabel.setVisible(true);
        searchTextField.setVisible(true);
        goButton.setVisible(true);
        searchComboBox.setVisible(true);

    }//GEN-LAST:event_searchVitalBtnActionPerformed

    private void updateVitalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVitalRecordActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        makeLabelsDisappear();
        searchByLabel.setVisible(false);
        searchTextField.setVisible(false);
        doctorLabel.setVisible(true);
        doctorComboBox.setVisible(true);
        goButton.setVisible(false);

        Encounter encounter = (Encounter) tblRecords.getValueAt(selectedRowIndex, 0);

        saveVariable.setVisible(true);
        saveVariable.setText("Update");

        patientIDLabel.setText("Body Temperature");
        patientIDtxtField.setText(String.valueOf(encounter.getVitalSigns().getBodyTemperature()));
        ageLabel.setText("Pulse Rate");
        ageTxtField.setText(String.valueOf(encounter.getVitalSigns().getPulseRate()));
        genderLabel.setText("Respiration Rate");
        genderTxtField.setText(String.valueOf(encounter.getVitalSigns().getRespirationRate()));
        addressLabel.setText("Blood Pressure");
        addressTextField.setText(encounter.getVitalSigns().getBloodPressure());
        nameTxtField.setText(patient.getPerson().getName());
        patientIDLabel.setVisible(true);
        nameLabel.setVisible(true);
        ageLabel.setVisible(true);
        genderLabel.setVisible(true);
        addressLabel.setVisible(true);
        makeVitalTxtFieldsAppear();
        populateJComboBox(encounter);

    }//GEN-LAST:event_updateVitalRecordActionPerformed

    private void deleteVitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVitalBtnActionPerformed
        // TODO add your handling code here:
        clearTxtFields();
        makeLabelsDisappear();
        makeTxtFieldsDisappear();
        doctorComboBox.setVisible(false);
        doctorLabel.setVisible(false);
        searchByLabel.setVisible(false);
        searchTextField.setVisible(false);
        goButton.setVisible(false);
        int selectedRowIndex = tblRecords.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Row is selected to Delete, Please Try Again");
            return;
        }

        DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        Encounter encounter = (Encounter) tableModel.getValueAt(selectedRowIndex, 0);
        deleteRecord(encounter);

    }//GEN-LAST:event_deleteVitalBtnActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        // TODO add your handling code here:

        int userTypeIndex = searchComboBox.getSelectedIndex();
        String txtSearch = searchTextField.getText();

        if(txtSearch.isBlank() || txtSearch.isEmpty() || txtSearch == null)
        {
            JOptionPane.showMessageDialog(this, "Please enter the key for Searching and Try Again");
            return;
        }
        ArrayList<Encounter> encounterList = null;
        //Pulse Rate, Body Temp, Respiration Rate, Blood Pressure
        switch (userTypeIndex) {
            case 0:
            encounterList = searchByPulseRate(txtSearch );
            break;
            case 1:
            encounterList = searchByBodyTemp(txtSearch);
            break;
            case 2:
            encounterList = searchByRespRate(txtSearch);
            break;
            case 3:
            encounterList = searchByBloodPressure(txtSearch);
            break;

            default:

            break;
        }
        populateTableRecordsWithEncounterHistory(encounterList);
        // populatePatientsTable(patientList);
    }//GEN-LAST:event_goButtonActionPerformed

    private void saveVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveVariableActionPerformed
        // TODO add your handling code here:
        int errorCount = 0;
        int pulseRate =0, respirationRate=0, bodyTemp=0;
        String bloodPressure = null, doctorName = null;
        StringBuffer errorNotifier = new StringBuffer("Please correct the following Errors\n");
        Doctor doctor = null;
        try{
            if(ValidationHelper.isInteger(ageTxtField.getText()))
            {
                pulseRate = Integer.parseInt(ageTxtField.getText());
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Pulse Rate should be of integers\n");

            }
            if(ValidationHelper.isInteger(genderTxtField.getText()))
            {
                respirationRate = Integer.parseInt(genderTxtField.getText());
            }
            else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Respiration Rate should be of integers\n");
            }

            if(ValidationHelper.checkBloodPressure(addressTextField.getText())){
                bloodPressure = addressTextField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Blood Pressure Rate should be in proper Format\n");
            }

            if(!patientIDtxtField.getText().isBlank() || !patientIDtxtField.getText().isEmpty()){
                bodyTemp = Integer.parseInt(patientIDtxtField.getText());
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Body Temp should be in proper Format\n");

            }

            if(doctorName == null)
            {
                doctorName = (String)doctorComboBox.getSelectedItem();
                doctor = new DoctorDirectory().findDoctorByName(doctorName);

            }
        }catch(Exception e)
        {

        }
        if (errorCount > 0) {
            JOptionPane.showMessageDialog(this, errorNotifier.toString());
        }else{
            VitalSigns vitalSigns = new VitalSigns(bodyTemp,pulseRate, respirationRate, bloodPressure, null);

            try {
                if(saveVariable.getText().equalsIgnoreCase("Update")){
                    int selectedRowIndex = tblRecords.getSelectedRow();
                    if (selectedRowIndex == -1) {
                        JOptionPane.showMessageDialog(this, "Please select the Encounter, and try again");
                        return;
                    }
                    Encounter encounter = (Encounter) tblRecords.getValueAt(selectedRowIndex, 0);
                    VitalSigns vitalSigns1 = encounter.getVitalSigns();
                    vitalSigns1.setBloodPressure(bloodPressure);
                    vitalSigns1.setPulseRate(pulseRate);
                    vitalSigns1.setBodyTemperature(bodyTemp);
                    vitalSigns1.setRespirationRate(respirationRate);
                    vitalSigns1.setDoctor(doctor);
                    encounter.setVitalSigns(vitalSigns1);
                    JOptionPane.showMessageDialog(this, "Vital Record Updated");
                    populateTableRecordsWithEncounterHistory();
                    clearTxtFields();
                    return;

                }else{
                    patient.getEncounterHistory().newEcounter(DateParser.getCurrentDate(), vitalSigns, LocalTime.now());
                    JOptionPane.showMessageDialog(this, "Vital Record Added");
                }
            } catch (ParseException ex) {

            }
            clearTxtFields();
            populateTableRecordsWithEncounterHistory();
        }
    }//GEN-LAST:event_saveVariableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton createVitalBtn;
    private javax.swing.JButton deleteVitalBtn;
    private javax.swing.JComboBox<String> doctorComboBox;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JLabel emailIdLabel;
    private javax.swing.JTextField emailidTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxtField;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel insuranceIdLabel;
    private javax.swing.JTextField insuranceIdTxtField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel patientIDLabel;
    private javax.swing.JTextField patientIDtxtField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton saveVariable;
    private javax.swing.JLabel searchByLabel;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton searchVitalBtn;
    private javax.swing.JTable tblRecords;
    private javax.swing.JButton updateVitalRecord;
    // End of variables declaration//GEN-END:variables
}
