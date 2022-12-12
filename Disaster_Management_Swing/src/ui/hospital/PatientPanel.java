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
import model.doctor.Doctor;
import model.hospital.Hospital;
import model.hospital.HospitalDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rbac.application.user.User;
import rbac.context.RbacApplicationContext;
import ui.LoginPanel;
import ui.MainJFrame;

/**
 *
 * @author rohitpanicker
 */
public class PatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPanel
     */
    public PatientPanel() {
        initComponents();
        setOpaque(false);
        makeLabelAndButtonDisappearOrAppear(false);
        
    }
    private void makeLabelAndButtonDisappearOrAppear(Boolean value)
    {
        searchBylabel.setVisible(value);
        searchComboBoxHospital.setVisible(value);
        btnSearchGo.setVisible(value);
       txtSearchHospital.setVisible(value);
       
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
     private User getLoggedInUser()
    {
        User user = RbacApplicationContext.getInstance().getUser();
        return user;
    }
     
     public static void main(String[] args) {
        
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
        btnNearbyHospitals = new javax.swing.JButton();
        btnViewDoctors = new javax.swing.JButton();
        btnSearchHospitals = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        searchBylabel = new javax.swing.JLabel();
        searchComboBoxHospital = new javax.swing.JComboBox<>();
        txtSearchHospital = new javax.swing.JTextField();
        btnSearchGo = new javax.swing.JButton();
        logoutLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        btnNearbyHospitals.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnNearbyHospitals.setForeground(new java.awt.Color(255, 255, 255));
        btnNearbyHospitals.setText("View Nearby Hospitals");
        btnNearbyHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNearbyHospitalsActionPerformed(evt);
            }
        });

        btnViewDoctors.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnViewDoctors.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDoctors.setText("View Doctors ");
        btnViewDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorsActionPerformed(evt);
            }
        });

        btnSearchHospitals.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSearchHospitals.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchHospitals.setText("Search Hospitals ");
        btnSearchHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHospitalsActionPerformed(evt);
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

        searchBylabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchBylabel.setForeground(new java.awt.Color(255, 255, 255));
        searchBylabel.setText("Search By");

        searchComboBoxHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchComboBoxHospital.setForeground(new java.awt.Color(255, 255, 255));
        searchComboBoxHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Pincode", "City" }));

        btnSearchGo.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSearchGo.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchGo.setText("Search");
        btnSearchGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(searchBylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(searchComboBoxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(txtSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnSearchGo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNearbyHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnViewDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnSearchHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNearbyHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBylabel)
                    .addComponent(searchComboBoxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchGo))
                .addContainerGap(157, Short.MAX_VALUE))
        );

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
        jLabel1.setText("WELCOME");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
 private void populateNearbyHospitalsTable(ArrayList<Hospital> nearbyHospitalList)
    {
        DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
      
        
        tableModel.addColumn("ID" );
       
        tableModel.addColumn("Hospital Name");
       
        tableModel.addColumn("Community Name");
        
       
        
        
        try {
            for (Hospital  hospital : nearbyHospitalList) {

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
    
    private ArrayList<Hospital> searchNearbyHospitalsByCity(String city, HospitalDirectory hospitalDirectory)
    {   
        ArrayList<Hospital> result = new ArrayList<Hospital>();
        for(Hospital hospital : hospitalDirectory.getHospitalList())
        {
            if(hospital.getCommunity().getCity().getName().equalsIgnoreCase(city))
            {
                result.add(hospital);
            }else{
                continue;
            }
        }
        return result;
        
    }
    private void btnNearbyHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNearbyHospitalsActionPerformed
        // TODO add your handling code here:
        makeLabelAndButtonDisappearOrAppear(false);
        User user = getLoggedInUser();
        String city = user.getPerson().getResidence().getCommunity().getCity().getName();
        String zipcode = user.getPerson().getResidence().getCommunity().getZipCode();
        HospitalDirectory hospitalDirectory = new HospitalDirectory();
        ArrayList<Hospital> nearbyHospital = searchNearbyHospitalsByCity(city, hospitalDirectory);
        populateNearbyHospitalsTable(nearbyHospital);

    }//GEN-LAST:event_btnNearbyHospitalsActionPerformed

    private void btnViewDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorsActionPerformed
        // TODO add your handling code here:
        makeLabelAndButtonDisappearOrAppear(false);
        int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Hospital is selected, Please Try Again");
            return;
        }
        Hospital hospital = (Hospital) tblRecords.getValueAt(selectedRowIndex, 0);
        populateTableRecordsWithEncounterHistory(hospital);
        }
        private void populateTableRecordsWithEncounterHistory(Hospital hospital)
        {

            DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
            tableModel.setRowCount(0);
            tableModel.setColumnCount(0);

            tableModel.addColumn("ID" );

            tableModel.addColumn("Doctor Name");

            ArrayList<Doctor> doctorList = hospital.getDoctorList();
            try {
                for (Doctor  doctor : doctorList) {

                    Object[] row = new Object[2];
                    row[0] = doctor;
                    row[1] = doctor.getPerson().getName();
                    tableModel.addRow(row);

                }
            } catch (Exception e) {
                System.out.println("Exception occured while populating Table e= " + e.getMessage());
            }

    }//GEN-LAST:event_btnViewDoctorsActionPerformed

    private void btnSearchHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHospitalsActionPerformed
        // TODO add your handling code here:

        makeLabelAndButtonDisappearOrAppear(true);
    }//GEN-LAST:event_btnSearchHospitalsActionPerformed

    private void btnSearchGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchGoActionPerformed
        // TODO add your handling code here:
        int userTypeIndex = searchComboBoxHospital.getSelectedIndex();
        String txtSearch = txtSearchHospital.getText();
        if(txtSearch.isBlank() || txtSearch.isEmpty() || txtSearch == null)
        {
            JOptionPane.showMessageDialog(this, "Please enter the key for Searching and Try Again");
            return;
        }
        HospitalDirectory hospitalDirectory = new HospitalDirectory();
        ArrayList<Hospital> nearbyHospital = null;

        switch (userTypeIndex) {
            case 0:
            nearbyHospital = searchById(Integer.parseInt(txtSearch), hospitalDirectory);
            break;
            case 1:
            nearbyHospital = searchByName(txtSearch, hospitalDirectory);
            break;
            case 2:
            nearbyHospital = searchByZipCode(txtSearch, hospitalDirectory);
            break;
            case 3:
            nearbyHospital = searchNearbyHospitalsByCity(txtSearch, hospitalDirectory);
            break;

            default:

            break;
        }

        populateNearbyHospitalsTable(nearbyHospital);

    }//GEN-LAST:event_btnSearchGoActionPerformed

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
 private ArrayList<Hospital> searchById(int id, HospitalDirectory hospitalDirectory)
   {
        ArrayList<Hospital> result = new ArrayList<Hospital>();
        for(Hospital hospital : hospitalDirectory.getHospitalList())
        {
            if(hospital.getHospitalId() == id)
            {
                result.add(hospital);
            }else{
                continue;
            }
        }
        return result;
   }
   
   private ArrayList<Hospital> searchByName(String name, HospitalDirectory hospitalDirectory)
   {
        ArrayList<Hospital> result = new ArrayList<Hospital>();
        for(Hospital hospital : hospitalDirectory.getHospitalList())
        {
            if(hospital.getHospitalName().contains(name))
            {
                result.add(hospital);
            }else{
                continue;
            }
        }
        return result;
   }
   
   private ArrayList<Hospital> searchByZipCode(String zipCode, HospitalDirectory hospitalDirectory)
   {
        ArrayList<Hospital> result = new ArrayList<Hospital>();
        for(Hospital hospital : hospitalDirectory.getHospitalList())
        {
            if(hospital.getCommunity().getZipCode().equals(zipCode))
            {
                result.add(hospital);
            }else{
                continue;
            }
        }
        return result;
   }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNearbyHospitals;
    private javax.swing.JButton btnSearchGo;
    private javax.swing.JButton btnSearchHospitals;
    private javax.swing.JButton btnViewDoctors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel searchBylabel;
    private javax.swing.JComboBox<String> searchComboBoxHospital;
    private javax.swing.JTable tblRecords;
    private javax.swing.JTextField txtSearchHospital;
    // End of variables declaration//GEN-END:variables
}
