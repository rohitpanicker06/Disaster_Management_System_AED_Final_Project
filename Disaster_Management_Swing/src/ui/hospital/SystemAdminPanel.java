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
import model.doctor.DoctorDirectory;
import model.hospital.Hospital;
import model.hospital.HospitalDirectory;
import model.patient.Patient;
import model.patient.PatientDirectory;
import person.Person;
import person.PersonDirectory;
import ui.MainJFrame;
import ui.ResetCredsPanel;
import ui.hospital.cruds.HospitalCrud;
import ui.hospital.cruds.PatientCrud;

/**
 *
 * @author rohitpanicker
 */
public class SystemAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminPanel
     */
    public SystemAdminPanel() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPatientDirectory = new javax.swing.JButton();
        btnDoctorDirectory = new javax.swing.JButton();
        btnHospitalDirectory = new javax.swing.JButton();
        allPersonsBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        createRecordBtn = new javax.swing.JButton();
        viewRecordBtn = new javax.swing.JButton();
        updateRecordBtn = new javax.swing.JButton();
        deleteRecordBtn = new javax.swing.JButton();

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SYSTEM ADMIN");

        btnPatientDirectory.setText("Patient Directory");
        btnPatientDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientDirectoryActionPerformed(evt);
            }
        });

        btnDoctorDirectory.setText("Doctor Directory");
        btnDoctorDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorDirectoryActionPerformed(evt);
            }
        });

        btnHospitalDirectory.setText("Hospital Directory");
        btnHospitalDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalDirectoryActionPerformed(evt);
            }
        });

        allPersonsBtn.setText("All Registered Users");
        allPersonsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allPersonsBtnActionPerformed(evt);
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
        jScrollPane1.setViewportView(tblRecords);

        createRecordBtn.setText("Create New Patient");
        createRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRecordBtnActionPerformed(evt);
            }
        });

        viewRecordBtn.setText("View Patient Details");
        viewRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecordBtnActionPerformed(evt);
            }
        });

        updateRecordBtn.setText("Update Patient Details");
        updateRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRecordBtnActionPerformed(evt);
            }
        });

        deleteRecordBtn.setText("Delete Patient Record");
        deleteRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecordBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPatientDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(allPersonsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHospitalDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDoctorDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(createRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(viewRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(updateRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(deleteRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(allPersonsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnHospitalDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnDoctorDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnPatientDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
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

    private void btnPatientDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientDirectoryActionPerformed
        // TODO add your handling code here:
        createRecordBtn.setText("Create New Patient");
        viewRecordBtn.setText("View Patient Details");
        updateRecordBtn.setText("Update Patient Details");
        deleteRecordBtn.setText("Delete Patient");
        populateAndFillPatientRecordsTable();

    }//GEN-LAST:event_btnPatientDirectoryActionPerformed

    private void populateAndFillHospitalRecord(){
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
    
     private void populateAndFillPatientRecordsTable() {
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
            for (Patient  patient : PatientDirectory.patientList) {

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
    
      private void hideButtons(boolean value)
   {
       createRecordBtn.setVisible(value);
       viewRecordBtn.setVisible(value);
       updateRecordBtn.setVisible(value);
       deleteRecordBtn.setVisible(value);
   }
      private void deleteHospitalRecord(Hospital hospital)
   {
       HospitalDirectory.hospitalList.remove(hospital);
       JOptionPane.showMessageDialog(this, "Record deleted successfully");
       populateAndFillHospitalRecord();
   }
    private void deleteDoctorRecord(Doctor doctor)
    {
      DoctorDirectory.doctorList.remove(doctor); 
       JOptionPane.showMessageDialog(this, "Record deleted successfully");
       populateDoctorDirectoryTable();
    }
    
    private void deleteRecord(Patient patient){
    PatientDirectory.patientList.remove(patient);

        JOptionPane.showMessageDialog(this, "Record deleted successfully");
        populateAndFillPatientRecordsTable();
}
     
    private void btnDoctorDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorDirectoryActionPerformed
        // TODO add your handling code here:
        createRecordBtn.setText("Create New Doctor");
        viewRecordBtn.setText("View Doctor Record");
        updateRecordBtn.setText("Update Doctor Record");
        deleteRecordBtn.setText("Delete Doctor Record");
        populateDoctorDirectoryTable();

    }//GEN-LAST:event_btnDoctorDirectoryActionPerformed

    
    private void populateDoctorDirectoryTable()
    {
          
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
          tableModel.setRowCount(0);
       
        tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Doctor Name");
        tableModel.addColumn("Age");
        tableModel.addColumn("Hospital");
        
       
      
       
        DoctorDirectory doctorDirectory = new DoctorDirectory();
        try {
            for (Doctor  doctor : doctorDirectory.getDoctorList()) {

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
    
    private void populateAllPersons(ArrayList<Person> personList) {
          
     
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
         tableModel.setRowCount(0);
         tableModel.setColumnCount(0);
         
           tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Age");
       
      
       
        tableModel.setRowCount(0);
        try {
            for (Person  person : personList) {

                Object[] row = new Object[4];
                row[0] = person;
                row[1] = person.getName();
                row[2] = person.getGender();
                row[3] = person.getAge();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
     
    }
    private void btnHospitalDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalDirectoryActionPerformed

        createRecordBtn.setText("Create New Hospital");
        viewRecordBtn.setText("View Hospital Details");
        updateRecordBtn.setText("Update Hospital Details");
        deleteRecordBtn.setText("Delete Hospital Record");
        populateAndFillHospitalRecord();

    }//GEN-LAST:event_btnHospitalDirectoryActionPerformed

    private void allPersonsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allPersonsBtnActionPerformed
        // TODO add your handling code here:
        hideButtons(false);
        createRecordBtn.setVisible(true);
        createRecordBtn.setText("Reset Credentials");

        populateAllPersons(PersonDirectory.personList);
    }//GEN-LAST:event_allPersonsBtnActionPerformed

    private void createRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRecordBtnActionPerformed
        // TODO add your handling code here:

        String txt = createRecordBtn.getText();
        if(txt.contains("Patient"))
        {
            PatientCrud patientCrud = new PatientCrud("cp");
            changeScreen(patientCrud);
        }else if(txt.contains("Doctor")){
            PatientCrud patientCrud = new PatientCrud("cd");
            changeScreen(patientCrud);
        }else if (txt.contains("Hospital"))
        {
            HospitalCrud hospitalCrud = new HospitalCrud("create");
            changeScreen(hospitalCrud);
        }else if(txt.contains("Reset"))
        {
            int selectedRowIndex = tblRecords.getSelectedRow();
            if (selectedRowIndex == -1) {
                JOptionPane.showMessageDialog(this, "No Record is selected, Please Try Again");
                return;
            }

            Person person = (Person) tblRecords.getValueAt(selectedRowIndex, 0);
            ResetCredentials resetCredentials = new ResetCredentials(person);
            changeScreen(resetCredentials);
        }

    }//GEN-LAST:event_createRecordBtnActionPerformed
    private void changeScreen(Component comp)
    {
         MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(comp);
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
    }
    private void viewRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecordBtnActionPerformed
        // TODO add your handling code here:
        String txt = viewRecordBtn.getText();
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Record is selected, Please Try Again");
            return;
        }

        if(txt.contains("Patient"))
        {

            Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);

            PatientCrud patientCrud = new PatientCrud(patient, "pv");
            changeScreen(patientCrud);
        }else if(txt.contains("Doctor")){

            Doctor doctor = (Doctor) tblRecords.getValueAt(selectedRowIndex, 0);
            PatientCrud patientCrud = new PatientCrud(doctor, "dv");
            changeScreen(patientCrud);

        }else if(txt.contains("Hospital"))
        {
            Hospital hospital = (Hospital) tblRecords.getValueAt(selectedRowIndex, 0);
            HospitalCrud hospitalCrud = new HospitalCrud(hospital,"populate");
            changeScreen(hospitalCrud);

        }
    }//GEN-LAST:event_viewRecordBtnActionPerformed

    private void updateRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRecordBtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String txt = updateRecordBtn.getText();
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Patient is selected, Please Try Again");
            return;
        }

        if(txt.contains("Patient"))
        {
            Patient patient = (Patient) tblRecords.getValueAt(selectedRowIndex, 0);

            PatientCrud patientCrud = new PatientCrud(patient, "pu");
            changeScreen(patientCrud);
        }else if (txt.contains("Doctor")){
            Doctor doctor = (Doctor) tblRecords.getValueAt(selectedRowIndex, 0);
            PatientCrud patientCrud = new PatientCrud(doctor, "du");
            changeScreen(patientCrud);
        }else if (txt.contains("Hospital"))
        {
            Hospital hospital = (Hospital) tblRecords.getValueAt(selectedRowIndex, 0);
            HospitalCrud hospitalCrud = new HospitalCrud(hospital, "update");
            changeScreen(hospitalCrud);
        }
    }//GEN-LAST:event_updateRecordBtnActionPerformed

    private void deleteRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecordBtnActionPerformed
        // TODO add your handling code here:

        String txt = deleteRecordBtn.getText();
        int selectedRowIndex = tblRecords.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Row is selected to Delete, Please Try Again");
            return;
        }
        if(txt.contains("Patient")){

            DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            Patient patient = (Patient) tableModel.getValueAt(selectedRowIndex, 0);
            deleteRecord(patient);

        }
        else if (txt.contains("Doctor")){
            DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            Doctor doctor = (Doctor) tableModel.getValueAt(selectedRowIndex, 0);
            deleteDoctorRecord(doctor);

        }else if (txt.contains("Hospital")){
            DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            Hospital hospital = (Hospital) tableModel.getValueAt(selectedRowIndex, 0);
            deleteHospitalRecord(hospital);
        }
    }//GEN-LAST:event_deleteRecordBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allPersonsBtn;
    private javax.swing.JButton btnDoctorDirectory;
    private javax.swing.JButton btnHospitalDirectory;
    private javax.swing.JButton btnPatientDirectory;
    private javax.swing.JButton createRecordBtn;
    private javax.swing.JButton deleteRecordBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecords;
    private javax.swing.JButton updateRecordBtn;
    private javax.swing.JButton viewRecordBtn;
    // End of variables declaration//GEN-END:variables
}
