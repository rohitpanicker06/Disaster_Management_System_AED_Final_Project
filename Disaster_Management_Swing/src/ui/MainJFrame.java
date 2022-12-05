/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

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
        signupPanel1 = new ui.SignupPanel();
        otpVerificationPanel1 = new ui.OtpVerificationPanel();
        manageDisasterWorkspacePanel1 = new ui.ManageDisasterWorkspacePanel();
        siteManagementWorkspacePanel1 = new ui.SiteManagementWorkspacePanel();
        viewDisasterPanel1 = new ui.ViewDisasterPanel();
        fundRaiserPanel1 = new ui.fundraiser.FundRaiserPanel();
        donateFundsPanel1 = new ui.fundraiser.DonateFundsPanel();
        createNewFundRaiserPanel1 = new ui.fundraiser.CreateNewFundRaiserPanel();
        homeScreen1 = new ui.hospital.HospitalHomeScreen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(loginPanel1, "card2");
        mainPanel.add(signupPanel1, "card3");
        mainPanel.add(otpVerificationPanel1, "card4");
        mainPanel.add(manageDisasterWorkspacePanel1, "card5");
        mainPanel.add(siteManagementWorkspacePanel1, "card6");
        mainPanel.add(viewDisasterPanel1, "card7");
        mainPanel.add(fundRaiserPanel1, "card8");
        mainPanel.add(donateFundsPanel1, "card9");
        mainPanel.add(createNewFundRaiserPanel1, "card10");
        mainPanel.add(homeScreen1, "card11");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    private ui.fundraiser.CreateNewFundRaiserPanel createNewFundRaiserPanel1;
    private ui.fundraiser.DonateFundsPanel donateFundsPanel1;
    private ui.fundraiser.FundRaiserPanel fundRaiserPanel1;
    private ui.hospital.HospitalHomeScreen homeScreen1;
    private ui.LoginPanel loginPanel1;
    public static javax.swing.JPanel mainPanel;
    private ui.ManageDisasterWorkspacePanel manageDisasterWorkspacePanel1;
    private ui.OtpVerificationPanel otpVerificationPanel1;
    private ui.SignupPanel signupPanel1;
    private ui.SiteManagementWorkspacePanel siteManagementWorkspacePanel1;
    private ui.ViewDisasterPanel viewDisasterPanel1;
    // End of variables declaration//GEN-END:variables
}
