/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.hospital;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.doctor.Doctor;
import model.hospital.Hospital;
import model.hospital.HospitalDirectory;
import model.patient.Patient;
import rbac.context.RbacApplicationContext;
import ui.LoginPanel;
import ui.MainJFrame;
import ui.hospital.cruds.HospitalCrud;
import ui.hospital.cruds.PatientCrud;

/**
 *
 * @author rohitpanicker
 */
public class HospitalAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminPanel
     */
     private Hospital hospital = null;
    public HospitalAdminPanel() {
        initComponents();
        setOpaque(false);
        setSearchComponentsVisibility(false);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        allHospitalBtn2 = new javax.swing.JButton();
        searchHospitalBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        searchLabel = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        createHospitalBtn = new javax.swing.JButton();
        deleteHospitalBtn = new javax.swing.JButton();
        viewDetailsBtn = new javax.swing.JButton();
        viewAllDoctorsBtn = new javax.swing.JButton();
        viewPatientsBtn = new javax.swing.JButton();
        searchByComboBox = new javax.swing.JComboBox<>();
        searchTxtField = new javax.swing.JTextField();
        goBtn = new javax.swing.JButton();
        logoutLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        allHospitalBtn2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        allHospitalBtn2.setText("All Hospitals");
        allHospitalBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allHospitalBtn2ActionPerformed(evt);
            }
        });

        searchHospitalBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchHospitalBtn.setText("Search Hospital");
        searchHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHospitalBtnActionPerformed(evt);
            }
        });

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

        searchLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchLabel.setText("Search By");

        updateBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateBtn.setText("Update Hospital Record");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        createHospitalBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        createHospitalBtn.setText("Create Hospital");
        createHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHospitalBtnActionPerformed(evt);
            }
        });

        deleteHospitalBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteHospitalBtn.setText("Delete Hospital");
        deleteHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHospitalBtnActionPerformed(evt);
            }
        });

        viewDetailsBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        viewDetailsBtn.setText("View Hospital Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });

        viewAllDoctorsBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        viewAllDoctorsBtn.setText("View Doctors");
        viewAllDoctorsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllDoctorsBtnActionPerformed(evt);
            }
        });

        viewPatientsBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        viewPatientsBtn.setText("View Patients");
        viewPatientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientsBtnActionPerformed(evt);
            }
        });

        searchByComboBox.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchByComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        searchByComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByComboBoxActionPerformed(evt);
            }
        });

        searchTxtField.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        goBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        goBtn.setText("Go");
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOSPITAL ADMIN WORKSPACE ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchHospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(searchByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(goBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteHospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allHospitalBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(createHospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewPatientsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewAllDoctorsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchHospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allHospitalBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewPatientsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 120, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteHospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createHospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewAllDoctorsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(122, 122, 122))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void allHospitalBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allHospitalBtn2ActionPerformed
        // TODO add your handling code here:
        
        searchByComboBox.setVisible(false);
        searchLabel.setVisible(false);
        goBtn.setVisible(false);
        searchTxtField.setVisible(false);
        updateBtn.setText("Update Hospital Record");
        createHospitalBtn.setText("Create New Hospital");
        deleteHospitalBtn.setText("Delete Hospital");
        viewDetailsBtn.setText("View Hospital Details");
        String searchText= searchByComboBox.getItemAt(searchByComboBox.getSelectedIndex());
        populateHospitalTable(HospitalDirectory.hospitalList);
    }//GEN-LAST:event_allHospitalBtn2ActionPerformed
 private void populateHospitalTable(ArrayList<Hospital> hospitalList) {
       
    
     
      DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
      
        
        tableModel.addColumn("ID" );
       
        tableModel.addColumn("Hospital Name");
       
        tableModel.addColumn("Community Name");
        
        tableModel.addColumn("ZipCode");
        
       
        
        
        try {
            for (Hospital  hospital : hospitalList) {

                Object[] row = new Object[4];
                row[0] = hospital;
                row[1] = hospital.getHospitalName();
                row[2] = hospital.getCommunity().getCommunityName();
                row[3] = hospital.getCommunity().getZipCode();
               
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }

     
     
    }
 

    private void searchHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHospitalBtnActionPerformed
        // TODO add your handling code here:
        setSearchComponentsVisibility(true);
        
        populateJCombobox();

    }//GEN-LAST:event_searchHospitalBtnActionPerformed
private void setSearchComponentsVisibility(boolean value)
    {
        searchLabel.setVisible(value);
        searchByComboBox.setVisible(value);
        goBtn.setVisible(value);
        searchTxtField.setVisible(value);
    }
 private void populateJCombobox() {
    
    searchByComboBox.removeAllItems();
    searchByComboBox.addItem("ID");
    searchByComboBox.addItem("Name");
    searchByComboBox.addItem("City");
    searchByComboBox.addItem("Community");
    }
 
 private void changePanel(Component comp)
 {
            MainJFrame.mainPanel.removeAll();
            MainJFrame.mainPanel.add(comp);
            MainJFrame.mainPanel.repaint();
            MainJFrame.mainPanel.revalidate();
 }
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:

        try{
        String txt = updateBtn.getText();
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Record is selected, Please Try Again");
            return;
        }

        if(txt.contains("Hospital"))
        {
            Hospital hospital = (Hospital) tblRecords.getValueAt(selectedRowIndex, 0);
            HospitalCrud hospitalCrud = new HospitalCrud(hospital, "update", this);
            changePanel(hospitalCrud);
            

        }else if (txt.contains("Doctor")){
            Doctor doctor = (Doctor) tblRecords.getValueAt(selectedRowIndex, 0);
            PatientCrud patientCrud = new PatientCrud(doctor, "du");
            changePanel(patientCrud);
           
        }  else if(txt.contains("Patient"))
        {
            Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);

            PatientCrud patientCrud = new PatientCrud(patient, "pu");
            changePanel(patientCrud);
            
        }
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void createHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHospitalBtnActionPerformed
        // TODO add your handling code here:

        try{
        String txt = createHospitalBtn.getText();
        if(txt.contains("Patient"))
        {
            PatientCrud patientCrud = new PatientCrud("cp");
            changePanel(patientCrud);
           
        }else if(txt.contains("Doctor")){
            PatientCrud patientCrud = new PatientCrud("cd");
            changePanel(patientCrud);
        }else if (txt.contains("Hospital"))
        {
            HospitalCrud hospitalCrud = new HospitalCrud("create");
            changePanel(hospitalCrud);
            
        }
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_createHospitalBtnActionPerformed
private void deleteRecord(Patient patient){
    try{
   this.hospital.getPatientList().remove(patient);
   

        JOptionPane.showMessageDialog(this, "Record deleted successfully");
        }catch(Exception e)
        {
            
        }
        
}
    private void deleteHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHospitalBtnActionPerformed
        // TODO add your handling code here:

        try{
        String txt = deleteHospitalBtn.getText();
        int selectedRowIndex = tblRecords.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Row is selected to Delete, Please Try Again");
            return;
        }
        if(txt.contains("Patient")){

            DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            Patient patient = (Patient) tableModel.getValueAt(selectedRowIndex, 0);
            deleteRecord(patient);
            populateTableWithPatientRecords();

        }
        else if (txt.contains("Doctor")){
            DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            Doctor doctor = (Doctor) tableModel.getValueAt(selectedRowIndex, 0);
            deleteDoctorRecord(doctor);
            populateTableWithDoctorRecords();

        }else if (txt.contains("Hospital")){
            DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            Hospital hospital = (Hospital) tableModel.getValueAt(selectedRowIndex, 0);
            deleteHospitalRecord(hospital);
            populateTableWithHospitalRecords();
        }
}catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_deleteHospitalBtnActionPerformed

    private void populateTableWithDoctorRecords() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
          tableModel.setRowCount(0);
       
        tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Doctor Name");
        tableModel.addColumn("Age");
        tableModel.addColumn("Hospital");
        
       
      
       
        
        try {
            for (Doctor  doctor : this.hospital.getDoctorList()) {

                Object[] row = new Object[4];
                row[0] = doctor;
                row[1] = doctor.getPerson().getName();
                row[2] = doctor.getPerson().getAge();
                row[3] = doctor.getHospital().getHospitalName();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
    }

    private void populateTableWithHospitalRecords() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
        HospitalDirectory hospitalDirectory = new HospitalDirectory();
        
          
        tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Doctor Count");
        tableModel.addColumn("Community Name");
        tableModel.addColumn("Zip Code");
        
        
      
       
        
        
        try {
            for (Hospital  hospital : hospitalDirectory.getHospitalList()) {

                Object[] row = new Object[5];
                row[0] = hospital;
                row[1] = hospital.getHospitalName();
                row[2] = hospital.getDoctorList().size();
                row[3] = hospital.getCommunity().getCommunityName();
                row[4] = hospital.getCommunity().getZipCode();
               
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
    }

    private void deleteDoctorRecord(Doctor doctor)
    {
        try{
      this.hospital.getDoctorList().remove(doctor);
       JOptionPane.showMessageDialog(this, "Record deleted successfully");
       }catch(Exception e)
        {
            
        }
      
    }

  private void deleteHospitalRecord(Hospital hospital)
   {
       try{
       HospitalDirectory.hospitalList.remove(hospital);
       JOptionPane.showMessageDialog(this, "Record deleted successfully");
       }catch(Exception e)
        {
            
        }
      
   }

    private void populateTableWithPatientRecords() {
       
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
      
         JTableHeader th = tblRecords.getTableHeader();
         
         tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Age");
        tableModel.addColumn("Hospital");
        
         
         
         
       
        try {
            for (Patient  patient : this.hospital.getPatientList()) {

                Object[] row = new Object[5];
                row[0] = patient;
                row[1] = patient.getPerson().getName();
                row[2] = patient.getPerson().getGender();
                row[3] = patient.getPerson().getAge();
                row[4] = patient.getHospital().getHospitalName();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
    }

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        String txt = viewDetailsBtn.getText();
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }

        if(txt.contains("Patient"))
        {

            Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);

            PatientCrud patientCrud = new PatientCrud(patient, "pv");
            changePanel(patientCrud);
           
        }else if(txt.contains("Doctor")){

            Doctor doctor = (Doctor) tblRecords.getValueAt(selectedRowIndex, 0);
            PatientCrud patientCrud = new PatientCrud(doctor, "dv");
            changePanel(patientCrud);
           

        }else if(txt.contains("Hospital"))
        {
            Hospital hospital = (Hospital) tblRecords.getValueAt(selectedRowIndex, 0);
            HospitalCrud hospitalCrud = new HospitalCrud(hospital,"populate");
            changePanel(hospitalCrud);
           

        }
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void viewAllDoctorsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllDoctorsBtnActionPerformed
        // TODO add your handling code here:

        try{
        updateBtn.setText("Update Doctor Record");
        createHospitalBtn.setText("Create Doctor Record");
        deleteHospitalBtn.setText("Delete Doctor Record");
        viewDetailsBtn.setText("View Doctor Details");

        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();

        Hospital hospital = (Hospital) tableModel.getValueAt(selectedRowIndex, 0);
        this.hospital = hospital;
        populateDoctorRecords(hospital.getDoctorList());
        }catch(Exception e)
        {
            
        }

    }//GEN-LAST:event_viewAllDoctorsBtnActionPerformed
 private void populateDoctorRecords(ArrayList<Doctor> doctorList)
    {
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
      
        
        tableModel.addColumn("ID" );
       
        tableModel.addColumn("Doctor Name");
       
        tableModel.addColumn("Age");
        
        tableModel.addColumn("Hospital");
        
       
        
        
        try {
            for (Doctor  doctor : doctorList) {

                Object[] row = new Object[4];
                row[0] = doctor;
                row[1] = doctor.getPerson().getName();
                row[2] = doctor.getPerson().getAge();
                row[3] = doctor.getHospital().getHospitalName();
               
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
    }
    private void viewPatientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientsBtnActionPerformed
        // TODO add your handling code here:
        try{
        updateBtn.setText("Update Patient Record");
        createHospitalBtn.setText("Create Patient Record");
        deleteHospitalBtn.setText("Delete Patient Record");
        viewDetailsBtn.setText("View Patient Details");
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }
        DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();

        Hospital hospital = (Hospital) tableModel.getValueAt(selectedRowIndex, 0);
        this.hospital = hospital;
        populatePatientRecords(hospital.getPatientList());
        }catch(Exception e)
        {
            
        }

    }//GEN-LAST:event_viewPatientsBtnActionPerformed
private void populatePatientRecords(ArrayList<Patient> patientList)
    {
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
      
        
        tableModel.addColumn("ID" );
       
        tableModel.addColumn("Patient Name");
       
        tableModel.addColumn("Age");
        
        tableModel.addColumn("Community Name");
        tableModel.addColumn("ZipCode");
        
        
       
        
        
        try {
            for (Patient  patient : patientList) {

                Object[] row = new Object[5];
                row[0] = patient;
                row[1] = patient.getPerson().getName();
                row[2] = patient.getPerson().getAge();
                row[3] = patient.getPerson().getResidence().getCommunity().getCommunityName();
                row[4] = patient.getPerson().getResidence().getCommunity().getZipCode();
               
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
    }
    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        // TODO add your handling code here:

        try{
        String selectedIndex = (String) searchByComboBox.getSelectedItem();
        String searchText = searchTxtField.getText();

        ArrayList<Hospital> result = new ArrayList<>();

        if(selectedIndex.contains("ID"))
        {
            result = searchById(searchText, result);
        }else if(selectedIndex.contains("Name"))
        {
            result = searchByName(searchText, result);
        }else if(selectedIndex.contains("City")){
            result = searchByCity(searchText, result);
        }else if(selectedIndex.contains("Community")){
            result = searchByCommunity(searchText, result);
        }
        populateHospitalTable(result);
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_goBtnActionPerformed
private ArrayList<Hospital> searchById(String id, ArrayList<Hospital> result) {
     
        try{
        
        for(Hospital hospital: HospitalDirectory.hospitalList){
         if(hospital.getHospitalId() == Integer.parseInt(id)){
            
             
             result.add(hospital);
             return result;
         }
     }
        }catch(Exception e)
        {
            
        }
        return result;
    }
    
    
    
    private ArrayList<Hospital> searchByCity(String city, ArrayList<Hospital> result) {
     
        try{
        
        for(Hospital hospital: HospitalDirectory.hospitalList){
         if(hospital.getCommunity().getCity().getName().contains(city)){
             
             result.add(hospital);
             
         }
     }
        }catch(Exception e)
        {
            
        }
        return result;
    }
    
    
    private ArrayList<Hospital> searchByName(String name, ArrayList<Hospital> result) {
     
        
        try{
        for(Hospital hospital: HospitalDirectory.hospitalList){
         if(hospital.getHospitalName().contains(name)){
             
             result.add(hospital);
             
         }
     }
        }catch(Exception e)
        {
            
        }
        return result;
    }
    
      private ArrayList<Hospital> searchByCommunity(String community, ArrayList<Hospital> result) {
     
        
        try{
        for(Hospital hospital: HospitalDirectory.hospitalList){
         if(hospital.getCommunity().getCommunityName().contains(community)){
             
             result.add(hospital);
             
         }
     }
        }catch(Exception e)
        {
            
        }
        return result;
    }
    private void searchByComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByComboBoxActionPerformed

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
    private javax.swing.JButton allHospitalBtn2;
    private javax.swing.JButton createHospitalBtn;
    private javax.swing.JButton deleteHospitalBtn;
    private javax.swing.JButton goBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JComboBox<String> searchByComboBox;
    private javax.swing.JButton searchHospitalBtn;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JTable tblRecords;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewAllDoctorsBtn;
    private javax.swing.JButton viewDetailsBtn;
    private javax.swing.JButton viewPatientsBtn;
    // End of variables declaration//GEN-END:variables
}
