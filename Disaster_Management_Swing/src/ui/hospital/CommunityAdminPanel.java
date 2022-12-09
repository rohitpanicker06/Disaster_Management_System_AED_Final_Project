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
import model.doctor.Doctor;
import model.doctor.DoctorDirectory;
import model.hospital.Hospital;
import model.hospital.HospitalDirectory;
import model.patient.Patient;
import model.patient.PatientDirectory;
import model.state.city.community.CommunityDirectory;
import person.Person;
import person.PersonDirectory;
import rbac.context.RbacApplicationContext;
import ui.LoginPanel;
import ui.MainJFrame;
import ui.hospital.cruds.HospitalCrud;
import ui.hospital.cruds.PatientCrud;
import us.state.city.community.Community;

/**
 *
 * @author rohitpanicker
 */
public class CommunityAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminPanel
     */
    public CommunityAdminPanel() {
        initComponents();
        setOpaque(false);
         populateComboBox();
    }
    private void populateHospitalTable(ArrayList<Hospital> hospitalList, String searchText) {
        ArrayList<Hospital> result = new ArrayList<>();
     for(Hospital hospital: hospitalList)
     {
         if(hospital.getCommunity().getCommunityName().equalsIgnoreCase(searchText))
         {
             result.add(hospital);
         }
     }
     
      DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
      
        
        tableModel.addColumn("ID" );
       
        tableModel.addColumn("Hospital Name");
       
        tableModel.addColumn("Community Name");
        
       
        
        
        try {
            for (Hospital  hospital : result) {

                Object[] row = new Object[3];
                row[0] = hospital;
                row[1] = hospital.getHospitalName();
                row[2] = hospital.getCommunity().getCommunityName();
               
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }

     
     
    }

    private void populateDoctorTable(ArrayList<Doctor> doctorList, String searchText) {
       
         ArrayList<Doctor> result = new ArrayList<>();
     for(Doctor doctor: doctorList)
     {
         if(doctor.getPerson().getResidence().getCommunity().getCommunityName().equalsIgnoreCase(searchText))
         {
             result.add(doctor);
         }
     }
     
     
         DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
         tableModel.setRowCount(0);
         tableModel.setColumnCount(0);
        
       
        
        tableModel.addColumn("ID" );
       
        tableModel.addColumn("Doctor Name");
       

        try {
            for (Doctor  doctor : result) {

                Object[] row = new Object[2];
                row[0] = doctor;
                row[1] = doctor.getPerson().getName();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
       
    }

    private void populatePatientTable(ArrayList<Patient> patientList, String searchText) {
       
         
         ArrayList<Patient> result = new ArrayList<>();
     for(Patient patient: patientList)
     {
         if(patient.getPerson().getResidence().getCommunity().getCommunityName().equalsIgnoreCase(searchText))
         {
             result.add(patient);
         }
     }
     
     
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
            for (Patient  patient : result) {

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

    private void populateComboBox() {
        communityNameSearchComboBox.removeAllItems();
        for(Community community: CommunityDirectory.communityList)
        {
            communityNameSearchComboBox.addItem(community.getCommunityName());
        }
    }

    private void populateAllPersons(ArrayList<Person> personList, String searchText) {
       
        
         ArrayList<Person> result = new ArrayList<>();
     for(Person person: personList)
     {
         if(person.getResidence().getCommunity().getCommunityName().equalsIgnoreCase(searchText))
         {
             result.add(person);
         }
     }
     
     
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
            for (Person  patient : result) {

                Object[] row = new Object[4];
                row[0] = patient;
                row[1] = patient.getName();
                row[2] = patient.getGender();
                row[3] = patient.getAge();
                tableModel.addRow(row);

            }
        } catch (Exception e) {
            System.out.println("Exception occured while populating Table e= " + e.getMessage());
        }
        
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
        allHospitalBtn = new javax.swing.JButton();
        allDoctorsBtn = new javax.swing.JButton();
        allPatientsBtn = new javax.swing.JButton();
        allPersonsBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        communityNameSearchLabel = new javax.swing.JLabel();
        communityNameSearchComboBox = new javax.swing.JComboBox<>();
        logoutLabel = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        allHospitalBtn.setText("All Hospitals");
        allHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allHospitalBtnActionPerformed(evt);
            }
        });

        allDoctorsBtn.setText("All Doctors");
        allDoctorsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allDoctorsBtnActionPerformed(evt);
            }
        });

        allPatientsBtn.setText("All Patients");
        allPatientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allPatientsBtnActionPerformed(evt);
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
        tblRecords.setOpaque(false);
        jScrollPane1.setViewportView(tblRecords);

        updateBtn.setText("Update Hospital Record");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        communityNameSearchLabel.setText("Community Name");

        communityNameSearchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        communityNameSearchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityNameSearchComboBoxActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(allPatientsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(allPersonsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(allDoctorsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(updateBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(allHospitalBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(communityNameSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(communityNameSearchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(communityNameSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(communityNameSearchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(allPatientsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(allPersonsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(allDoctorsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(allHospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 117, Short.MAX_VALUE))
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

    private void allHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allHospitalBtnActionPerformed
        // TODO add your handling code here:
        updateBtn.setText("Update Hospital Record");
        String searchText= communityNameSearchComboBox.getItemAt(communityNameSearchComboBox.getSelectedIndex());
        populateHospitalTable(HospitalDirectory.hospitalList, searchText);
    }//GEN-LAST:event_allHospitalBtnActionPerformed

    private void allDoctorsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDoctorsBtnActionPerformed
        // TODO add your handling code here:
        updateBtn.setText("Update Doctor Record");
        String searchText= communityNameSearchComboBox.getItemAt(communityNameSearchComboBox.getSelectedIndex());
        populateDoctorTable(DoctorDirectory.doctorList, searchText);
    }//GEN-LAST:event_allDoctorsBtnActionPerformed
private void changePanel(Component comp)
 {
            MainJFrame.mainPanel.removeAll();
            MainJFrame.mainPanel.add(comp);
            MainJFrame.mainPanel.repaint();
            MainJFrame.mainPanel.revalidate();
 }
    private void allPatientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allPatientsBtnActionPerformed
        // TODO add your handling code here:
        updateBtn.setText("Update Patient Record");
        String searchText= communityNameSearchComboBox.getItemAt(communityNameSearchComboBox.getSelectedIndex());
        populatePatientTable(PatientDirectory.patientList, searchText);
    }//GEN-LAST:event_allPatientsBtnActionPerformed

    private void allPersonsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allPersonsBtnActionPerformed
        // TODO add your handling code here:
        updateBtn.setText("Update Person Record");
        String searchText= communityNameSearchComboBox.getItemAt(communityNameSearchComboBox.getSelectedIndex());
        populateAllPersons(PersonDirectory.personList, searchText);
    }//GEN-LAST:event_allPersonsBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:

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
            
        }else if(txt.contains("Person"))
        {
           
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void communityNameSearchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityNameSearchComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityNameSearchComboBoxActionPerformed

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
    private javax.swing.JButton allDoctorsBtn;
    private javax.swing.JButton allHospitalBtn;
    private javax.swing.JButton allPatientsBtn;
    private javax.swing.JButton allPersonsBtn;
    private javax.swing.JComboBox<String> communityNameSearchComboBox;
    private javax.swing.JLabel communityNameSearchLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JTable tblRecords;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
