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

        loginPanel1 = new ui.LoginPanel();
        mainPanel = new javax.swing.JPanel();
        loginPanel2 = new ui.LoginPanel();
        signupPanel1 = new ui.SignupPanel();
        disasterReportingDashboardPanel1 = new ui.DisasterReportingDashboardPanel();
        manageDisasterWorkspacePanel1 = new ui.ManageDisasterWorkspacePanel();
        viewDisasterPanel2 = new ui.ViewDisasterPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setLayout(new java.awt.CardLayout());

        loginPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginPanel2KeyPressed(evt);
            }
        });
        mainPanel.add(loginPanel2, "card2");
        mainPanel.add(signupPanel1, "card3");
        mainPanel.add(disasterReportingDashboardPanel1, "card4");

        manageDisasterWorkspacePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageDisasterWorkspacePanel1MouseClicked(evt);
            }
        });
        mainPanel.add(manageDisasterWorkspacePanel1, "card5");
        mainPanel.add(viewDisasterPanel2, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private ui.DisasterReportingDashboardPanel disasterReportingDashboardPanel1;
    private ui.LoginPanel loginPanel1;
    private ui.LoginPanel loginPanel2;
    public static javax.swing.JPanel mainPanel;
    private ui.ManageDisasterWorkspacePanel manageDisasterWorkspacePanel1;
    private ui.SignupPanel signupPanel1;
    private ui.ViewDisasterPanel viewDisasterPanel2;
    // End of variables declaration//GEN-END:variables
}
