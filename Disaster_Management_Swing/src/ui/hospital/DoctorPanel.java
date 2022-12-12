/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.hospital;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.doctor.Doctor;
import model.doctor.DoctorDirectory;
import model.encounter.Encounter;
import model.patient.Patient;
import model.patient.PatientDirectory;
import model.vitalsigns.VitalSigns;
import person.Person;
import rbac.application.user.User;
import rbac.application.user.UserListDirectory;
import rbac.context.RbacApplicationContext;
import ui.LoginPanel;
import ui.MainJFrame;
import utility.DateParser;
import utility.ValidationHelper;

/**
 *
 * @author rohitpanicker
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPanelT
     */
    static int prescId =0;
    public DoctorPanel() {
        initComponents();
         setOpaque(false);
        searchComboBox.setVisible(false);
        searchTextField.setVisible(false);
        goButton.setVisible(false);
        DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
        makeLabelsDisappear(false);
        makeTxtFieldsDisappear();
         
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
     private void makeTxtFieldsDisappear(){
        
        patientIDtxtField.setVisible(false);
        nameTxtField.setVisible(false);
        ageTxtField.setVisible(false);
        genderTxtField.setVisible(false);
        addressTextField.setVisible(false);
        insuranceIdTxtField.setVisible(false);
        emailidTextField.setVisible(false);
        phoneNumberTextField.setVisible(false);
        
    }
    
    private void makeAllTxtFieldsAppear()
    {
         patientIDtxtField.setVisible(true);
        nameTxtField.setVisible(true);
        ageTxtField.setVisible(true);
        genderTxtField.setVisible(true);
        addressTextField.setVisible(true);
        insuranceIdTxtField.setVisible(true);
        emailidTextField.setVisible(true);
        phoneNumberTextField.setVisible(true); 
        
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
    
    
     private void populateAndFillRecordsTable() {
        DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();

        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Age");
        /* JTableHeader th = tblRecords.getTableHeader();
         TableColumnModel tcm = th.getColumnModel();
         TableColumn tc = tcm.getColumn(0);
        tc.setHeaderValue( "ID" );
        TableColumn tc_one = tcm.getColumn(1);
        tc_one.setHeaderValue("Name");
        TableColumn tc_two = tcm.getColumn(2);
        tc_two.setHeaderValue("Gender");
        TableColumn tc_three = tcm.getColumn(3);
        tc_three.setHeaderValue("Age");*/
        try{
        TableColumn tableColumn = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn);
        
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 4");
        }
        
        try{
        TableColumn tableColumn_two = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn_two);
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 5");
        }
       // th.repaint();
        tableModel.setRowCount(0);
        try {
            for (Patient  patient : PatientDirectory.patientList) {

                Object[] row = new Object[4];
                row[0] = patient;
                row[1] = patient.getPerson().getName();
                row[2] = patient.getPerson().getGender();
                row[3] = patient.getPerson().getAge();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }

    }

    
    public void makeLabelsDisappear(boolean value)
    {
        searchComboBox.setVisible(value);
       searchByLabel.setVisible(value);
        searchTextField.setVisible(value);
        goButton.setVisible(value);
        patientIDLabel.setVisible(value);
        nameLabel.setVisible(value);
       ageLabel.setVisible(value);
       genderLabel.setVisible(value);
       addressLabel.setVisible(value);
       insuranceIdLabel.setVisible(value);
       emailIdLabel.setVisible(value);
       phoneNumberLabel.setVisible(value);
       enterVitalRecordLabel.setVisible(value);
       saveVariable.setVisible(value);
        
    }
    
    public void txtFieldsDisapper(boolean value)
    {
        patientIDtxtField.setVisible(value);
        searchTextField.setVisible(value);
        nameTxtField.setVisible(value);
        ageTxtField.setVisible(value);
        genderTxtField.setVisible(value);
        addressTextField.setVisible(value);
        insuranceIdTxtField.setVisible(value);
        emailidTextField.setVisible(value);
        phoneNumberTextField.setVisible(value);
    }
    private void populateTableRecordsWithEncounterHistory(Patient patient)
    {
        
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
         try{
        TableColumn tableColumn = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn);
        
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 4");
        }
        
        try{
        TableColumn tableColumn_two = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn_two);
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 5");
        }
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
                row[5]= encounter.getVitalSigns().getDoctor().getPerson().getName(); //toBeDone
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
        
        
    }
    private void disappearVitalLabels(){
       
       searchByLabel.setVisible(false);
       searchComboBox.setVisible(false);
        searchTextField.setVisible(false);
        goButton.setVisible(false);
        
       
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
     private void populatePatientsTable(ArrayList<Patient> patientList)
    {
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();

        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Age");
       
        try{
        TableColumn tableColumn = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn);
        
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 4");
        }
        
        try{
        TableColumn tableColumn_two = tblRecords.getColumnModel().getColumn(4);
        tblRecords.removeColumn(tableColumn_two);
        }catch(Exception e)
        {
            System.out.println("Error while deleting table column 5");
        }
       // th.repaint();
        tableModel.setRowCount(0);
        try {
            for (Patient  patient : patientList) {

                Object[] row = new Object[4];
                row[0] = patient;
                row[1] = patient.getPerson().getName();
                row[2] = patient.getPerson().getGender();
                row[3] = patient.getPerson().getAge();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }

    
    }
    private ArrayList<Patient> searchById(String id) {
       
        ArrayList<Patient> patientResult = new ArrayList<>();
        for(Patient patient : PatientDirectory.patientList)
        {
            if(patient.getPerson().getId().equals(id))
            {
                patientResult.add(patient);
                return patientResult;
            }
        }
        
        return patientResult;
    }

    private ArrayList<Patient> searchByName(String name) {
       ArrayList<Patient> patientResult = new ArrayList<>();
        for(Patient patient : PatientDirectory.patientList)
        {
            if(patient.getPerson().getName().contains(name))
            {
                patientResult.add(patient);
                
            }
        }
        
        return patientResult;
    }

    private ArrayList<Patient> searchByInsuranceID(String insuranceId) {
         
         ArrayList<Patient> patientResult = new ArrayList<>();
        for(Patient patient : PatientDirectory.patientList)
        {
            if(patient.getInsuranceId() == Integer.parseInt(insuranceId))
            {
                patientResult.add(patient);
                return patientResult;
                
            }
        }
        
        return patientResult;
        
    }

    private ArrayList<Patient> searchByMobileNumber(String mobileNumber) {
          ArrayList<Patient> patientResult = new ArrayList<>();
        for(Patient patient : PatientDirectory.patientList)
        {
            if(patient.getPerson().getPhoneNumber()== Long.parseLong(mobileNumber))
            {
                patientResult.add(patient);
               
                
            }
        }
        
        return patientResult;
    }

    private ArrayList<Patient> searchByAge(String age) {
        ArrayList<Patient> patientResult = new ArrayList<>();
        for(Patient patient : PatientDirectory.patientList)
        {
            if(patient.getPerson().getAge()== Integer.parseInt(age))
            {
                patientResult.add(patient);
               
                
            }
        }
        
        return patientResult;
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
        jButton2 = new javax.swing.JButton();
        encounterHistoryButton = new javax.swing.JButton();
        viewAllPatientsButton = new javax.swing.JButton();
        recordEncounterButton = new javax.swing.JButton();
        searchByLabel = new javax.swing.JLabel();
        searchComboBox = new javax.swing.JComboBox<>();
        searchTextField = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        enterVitalRecordLabel = new javax.swing.JLabel();
        patientIDtxtField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        patientIDLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        ageTxtField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderTxtField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        insuranceIdLabel = new javax.swing.JLabel();
        insuranceIdTxtField = new javax.swing.JTextField();
        emailIdLabel = new javax.swing.JLabel();
        emailidTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        saveVariable = new javax.swing.JButton();
        logoutLabel = new javax.swing.JLabel();
        writePrescription = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        tblRecords.setOpaque(false);
        jScrollPane1.setViewportView(tblRecords);

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search Patient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        encounterHistoryButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        encounterHistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        encounterHistoryButton.setText("Encounter History");
        encounterHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterHistoryButtonActionPerformed(evt);
            }
        });

        viewAllPatientsButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        viewAllPatientsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewAllPatientsButton.setText("View All Patients");
        viewAllPatientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllPatientsButtonActionPerformed(evt);
            }
        });

        recordEncounterButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        recordEncounterButton.setForeground(new java.awt.Color(255, 255, 255));
        recordEncounterButton.setText("Record Encounter");
        recordEncounterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordEncounterButtonActionPerformed(evt);
            }
        });

        searchByLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchByLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchByLabel.setText("Search By");

        searchComboBox.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchComboBox.setForeground(new java.awt.Color(255, 255, 255));
        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Insurance ID", "Mobile Number", "Age" }));

        searchTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(255, 255, 255));
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        goButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        goButton.setForeground(new java.awt.Color(255, 255, 255));
        goButton.setText("Search");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        enterVitalRecordLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        enterVitalRecordLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterVitalRecordLabel.setText("Enter Vital Record");
        enterVitalRecordLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        nameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        nameLabel.setText("Name");

        patientIDLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        patientIDLabel.setText("Patient ID:");
        patientIDLabel.setMaximumSize(new java.awt.Dimension(100, 17));
        patientIDLabel.setPreferredSize(new java.awt.Dimension(100, 17));

        ageLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        ageLabel.setText("Age");

        genderLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        genderLabel.setText("Gender");

        addressLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addressLabel.setText("Address");

        insuranceIdLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        insuranceIdLabel.setText("Insurance ID");

        emailIdLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        emailIdLabel.setText("Email ID:");

        phoneNumberLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        phoneNumberLabel.setText("Phone Number:");

        saveVariable.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        saveVariable.setText("SAVE");
        saveVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveVariableActionPerformed(evt);
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

        writePrescription.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        writePrescription.setForeground(new java.awt.Color(255, 255, 255));
        writePrescription.setText("Write Prescription");
        writePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writePrescriptionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(searchByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(encounterHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(recordEncounterButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(writePrescription)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(goButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(patientIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addComponent(patientIDtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(255, 255, 255)
                                        .addComponent(insuranceIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(insuranceIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(genderTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(150, 150, 150)
                                                        .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(260, 260, 260)
                                                .addComponent(emailIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(150, 150, 150)
                                                        .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(255, 255, 255)
                                                .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailidTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(363, 363, 363)
                                .addComponent(saveVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(enterVitalRecordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewAllPatientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(enterVitalRecordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goButton))
                .addGap(18, 18, 18)
                .addComponent(viewAllPatientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(patientIDtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(insuranceIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insuranceIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(recordEncounterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(emailidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(227, 227, 227)
                        .addComponent(saveVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(writePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(encounterHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        makeLabelsDisappear(false);
        makeTxtFieldsDisappear();
        searchComboBox.setVisible(true);
        searchTextField.setVisible(true);
        searchByLabel.setVisible(true);
        goButton.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void encounterHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterHistoryButtonActionPerformed
        // TODO add your handling code here:
        disappearVitalLabels();
        makeTxtFieldsDisappear();
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);
        populateTableRecordsWithEncounterHistory(patient);
    }//GEN-LAST:event_encounterHistoryButtonActionPerformed

    private void viewAllPatientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllPatientsButtonActionPerformed
        // TODO add your handling code here:
        disappearVitalLabels();
        searchByLabel.setVisible(false);
        makeTxtFieldsDisappear();
        populateAndFillRecordsTable();
    }//GEN-LAST:event_viewAllPatientsButtonActionPerformed

    private void recordEncounterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordEncounterButtonActionPerformed
        // TODO add your handling code here:
        makeLabelsDisappear(false);
        clearTxtFields();

        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        saveVariable.setVisible(true);
        enterVitalRecordLabel.setVisible(true);
        Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);
        
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
    }//GEN-LAST:event_recordEncounterButtonActionPerformed

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
        ArrayList<Patient> patientList = null;

        switch (userTypeIndex) {
            case 0:
            patientList = searchById(txtSearch );
            break;
            case 1:
            patientList = searchByName(txtSearch);
            break;
            case 2:
            patientList = searchByInsuranceID(txtSearch);
            break;
            case 3:
            patientList = searchByMobileNumber(txtSearch);
            break;
            case 4:
            patientList = searchByAge(txtSearch);
            break;

            default:

            break;
        }

        populatePatientsTable(patientList);
    }//GEN-LAST:event_goButtonActionPerformed

    private void saveVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveVariableActionPerformed
        // TODO add your handling code here:
        int errorCount = 0;
        int pulseRate =0, respirationRate=0, bodyTemp=0;
        String bloodPressure = null;
        StringBuffer errorNotifier = new StringBuffer("Please correct the following Errors\n");
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

            // if(ValidationHelper.checkBodyTemp(patientIDtxtField.getText())){
                if(!patientIDtxtField.getText().isEmpty() && !patientIDtxtField.getText().isBlank()){
                    bodyTemp = Integer.parseInt(patientIDtxtField.getText());
                }else{
                    errorCount++;
                    errorNotifier.append(errorCount).append(". Body Temp should be in proper Format\n");

                }
            }catch(Exception e)
            {

            }
            if (errorCount > 0) {
                JOptionPane.showMessageDialog(this, errorNotifier.toString());
            }else{
                User user = RbacApplicationContext.getInstance().getUser();
                Person person = UserListDirectory.getUserNameToPersonMap().get(user.getUserName());
                Doctor doctor = new DoctorDirectory().findDoctorByName(person.getName());

                VitalSigns vitalSigns = new VitalSigns(bodyTemp,pulseRate, respirationRate, bloodPressure, doctor);
                int selectedRowIndex = tblRecords.getSelectedRow();
                if (selectedRowIndex == -1) {
                    JOptionPane.showMessageDialog(this, "Please select the Patient, and try again");
                    return;
                }
                Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);
                try {
                    patient.getEncounterHistory().newEcounter(DateParser.getCurrentDate(), vitalSigns, LocalTime.now());
                    JOptionPane.showMessageDialog(this, "Vital Record Added");
                } catch (ParseException ex) {
                   
                }
                clearTxtFields();

            }
    }//GEN-LAST:event_saveVariableActionPerformed

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

    private void writePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writePrescriptionActionPerformed

        makeLabelsDisappear(false);
        clearTxtFields();

        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }  
        
        Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);
        User user = RbacApplicationContext.getInstance().getUser();
        Person person = user.getPerson();
        Doctor doc  = DoctorDirectory.getDoctorByPerson(person);
        
    
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new PrescriptionPanel(patient,doc));
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
        
        
    }//GEN-LAST:event_writePrescriptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JLabel emailIdLabel;
    private javax.swing.JTextField emailidTextField;
    private javax.swing.JButton encounterHistoryButton;
    private javax.swing.JLabel enterVitalRecordLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxtField;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel insuranceIdLabel;
    private javax.swing.JTextField insuranceIdTxtField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel patientIDLabel;
    private javax.swing.JTextField patientIDtxtField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton recordEncounterButton;
    private javax.swing.JButton saveVariable;
    private javax.swing.JLabel searchByLabel;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTable tblRecords;
    private javax.swing.JButton viewAllPatientsButton;
    private javax.swing.JButton writePrescription;
    // End of variables declaration//GEN-END:variables
}
