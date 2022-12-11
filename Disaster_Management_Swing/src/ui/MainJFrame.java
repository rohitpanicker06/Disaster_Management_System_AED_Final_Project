/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import DataForDisasterAndSiteManagementWorkflow.PopulateDataDisasterAndSiteManagement;
import java.awt.Color;

/**
 *
 * @author rohitpanicker
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        PopulateDataDisasterAndSiteManagement.populateDataDisasterAndSiteManagement();
        configuration.data.PopulateData.populateData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        loginPanel1 = new ui.LoginPanel();
        manageDisasterWorkspacePanel1 = new ui.ManageDisasterWorkspacePanel();
        siteManagementWorkspacePanel1 = new ui.SiteManagementWorkspacePanel();
        viewDisasterPanel1 = new ui.ViewDisasterPanel();
        fundRaiserPanel1 = new ui.fundraiser.FundRaiserPanel();
        donateFundsPanel1 = new ui.fundraiser.DonateFundsPanel();
        createNewFundRaiserPanel1 = new ui.fundraiser.CreateNewFundRaiserPanel();
        patientPanel1 = new ui.hospital.PatientPanel();
        doctorPanel1 = new ui.hospital.DoctorPanel();
        doctorPanelT1 = new ui.hospital.DoctorPanel();
        communityAdminPanel1 = new ui.hospital.CommunityAdminPanel();
        hospitalAdminPanel1 = new ui.hospital.HospitalAdminPanel();
        encounterHistoryPanel1 = new ui.hospital.cruds.EncounterHistoryPanel();
        hospitalCrud1 = new ui.hospital.cruds.HospitalCrud();
        patientCrud1 = new ui.hospital.cruds.PatientCrud();
        pieChartPanel1 = new ui.fundraiser.PieChartPanel();
        prescriptionPanel1 = new ui.hospital.PrescriptionPanel();
        pharmacyPanel1 = new ui.hospital.PharmacyPanel();
        roleSignUpPanel1 = new ui.SingUp.RoleSignUpPanel();
        resetCredsPanel1 = new ui.ResetCredsPanel();
        resetCredsPanel2 = new ui.ResetCredsPanel();
        systemAdminPanel1 = new ui.hospital.SystemAdminPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 780));
        setUndecorated(true);

        mainPanel.setMaximumSize(new java.awt.Dimension(1200, 800));
        mainPanel.setMinimumSize(new java.awt.Dimension(1200, 800));
        mainPanel.setPreferredSize(new java.awt.Dimension(1200, 800));
        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(loginPanel1, "card24");
        mainPanel.add(manageDisasterWorkspacePanel1, "card5");
        mainPanel.add(siteManagementWorkspacePanel1, "card6");
        mainPanel.add(viewDisasterPanel1, "card7");
        mainPanel.add(fundRaiserPanel1, "card8");
        mainPanel.add(donateFundsPanel1, "card9");
        mainPanel.add(createNewFundRaiserPanel1, "card10");
        mainPanel.add(patientPanel1, "card11");

        javax.swing.GroupLayout doctorPanel1Layout = new javax.swing.GroupLayout(doctorPanel1);
        doctorPanel1.setLayout(doctorPanel1Layout);
        doctorPanel1Layout.setHorizontalGroup(
            doctorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doctorPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doctorPanelT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        doctorPanel1Layout.setVerticalGroup(
            doctorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorPanel1Layout.createSequentialGroup()
                .addComponent(doctorPanelT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 127, Short.MAX_VALUE))
        );

        mainPanel.add(doctorPanel1, "card12");
        mainPanel.add(communityAdminPanel1, "card13");
        mainPanel.add(hospitalAdminPanel1, "card14");
        mainPanel.add(encounterHistoryPanel1, "card15");
        mainPanel.add(hospitalCrud1, "card16");
        mainPanel.add(patientCrud1, "card17");
        mainPanel.add(pieChartPanel1, "card18");
        mainPanel.add(prescriptionPanel1, "card19");
        mainPanel.add(pharmacyPanel1, "card20");
        mainPanel.add(roleSignUpPanel1, "card21");
        mainPanel.add(resetCredsPanel1, "card22");
        mainPanel.add(resetCredsPanel2, "card23");
        mainPanel.add(systemAdminPanel1, "card23");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPanel2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPanel2KeyPressed

    private void manageDisasterWorkspacePanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDisasterWorkspacePanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_manageDisasterWorkspacePanel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.hospital.CommunityAdminPanel communityAdminPanel1;
    private ui.fundraiser.CreateNewFundRaiserPanel createNewFundRaiserPanel1;
    private ui.hospital.DoctorPanel doctorPanel1;
    private ui.hospital.DoctorPanel doctorPanelT1;
    private ui.fundraiser.DonateFundsPanel donateFundsPanel1;
    private ui.hospital.cruds.EncounterHistoryPanel encounterHistoryPanel1;
    private ui.fundraiser.FundRaiserPanel fundRaiserPanel1;
    private ui.hospital.HospitalAdminPanel hospitalAdminPanel1;
    private ui.hospital.cruds.HospitalCrud hospitalCrud1;
    private ui.LoginPanel loginPanel1;
    public static javax.swing.JPanel mainPanel;
    private ui.ManageDisasterWorkspacePanel manageDisasterWorkspacePanel1;
    private ui.hospital.cruds.PatientCrud patientCrud1;
    private ui.hospital.PatientPanel patientPanel1;
    private ui.hospital.PharmacyPanel pharmacyPanel1;
    private ui.fundraiser.PieChartPanel pieChartPanel1;
    private ui.hospital.PrescriptionPanel prescriptionPanel1;
    private ui.ResetCredsPanel resetCredsPanel1;
    private ui.ResetCredsPanel resetCredsPanel2;
    private ui.SingUp.RoleSignUpPanel roleSignUpPanel1;
    private ui.SiteManagementWorkspacePanel siteManagementWorkspacePanel1;
    private ui.hospital.SystemAdminPanel systemAdminPanel1;
    private ui.ViewDisasterPanel viewDisasterPanel1;
    // End of variables declaration//GEN-END:variables
}
