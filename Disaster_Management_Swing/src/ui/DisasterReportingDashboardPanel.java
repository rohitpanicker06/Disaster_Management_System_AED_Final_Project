/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;


import javax.swing.JOptionPane;
import rbac.context.RbacApplicationContext;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Rohit Paul G
 */
public class DisasterReportingDashboardPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisasterReportingDashboardPanel
     */
    public DisasterReportingDashboardPanel() {
        initComponents();
        setOpaque(false);
    }
    
    public static void main(String[] args) {
        
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

        lblTitle = new javax.swing.JLabel();
        btnDisasterWorkspace = new javax.swing.JButton();
        btnSiteManagementWorkspace = new javax.swing.JButton();
        logoutLabel = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText(" Disaster Reporting Dashboard ");
        lblTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        btnDisasterWorkspace.setBackground(new java.awt.Color(255, 0, 0));
        btnDisasterWorkspace.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnDisasterWorkspace.setForeground(new java.awt.Color(255, 255, 255));
        btnDisasterWorkspace.setText("Disaster Workspace");
        btnDisasterWorkspace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDisasterWorkspaceMouseClicked(evt);
            }
        });

        btnSiteManagementWorkspace.setBackground(new java.awt.Color(255, 0, 0));
        btnSiteManagementWorkspace.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnSiteManagementWorkspace.setForeground(new java.awt.Color(255, 255, 255));
        btnSiteManagementWorkspace.setText("Site Management Workspace");
        btnSiteManagementWorkspace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiteManagementWorkspaceMouseClicked(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(190, 190, 190)
                .addComponent(logoutLabel)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDisasterWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSiteManagementWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(logoutLabel))
                .addGap(120, 120, 120)
                .addComponent(btnDisasterWorkspace, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(btnSiteManagementWorkspace, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisasterWorkspaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisasterWorkspaceMouseClicked
        // TODO add your handling code here:
        
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new ManageDisasterWorkspacePanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
        
    }//GEN-LAST:event_btnDisasterWorkspaceMouseClicked


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

    private void btnSiteManagementWorkspaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiteManagementWorkspaceMouseClicked
        // TODO add your handling code here:
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new SiteManagementWorkspacePanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
    }//GEN-LAST:event_btnSiteManagementWorkspaceMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisasterWorkspace;
    private javax.swing.JButton btnSiteManagementWorkspace;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel logoutLabel;
    // End of variables declaration//GEN-END:variables
}
