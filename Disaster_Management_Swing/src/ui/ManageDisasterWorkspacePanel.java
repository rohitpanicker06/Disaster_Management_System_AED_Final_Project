/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import CivilResponse.CivilResponseDisasterList;
import Disaster.Disaster;
import Disaster.DisasterDirectory;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import rbac.context.RbacApplicationContext;

/**
 *
 * @author Rohit Paul G
 */
public class ManageDisasterWorkspacePanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDisasterWorkspacePanel
     */
    
    public static DisasterDirectory disDir = new DisasterDirectory();
    
    public ManageDisasterWorkspacePanel() {
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

        lblTitle1 = new javax.swing.JLabel();
        lblDisasterId = new javax.swing.JLabel();
        lblDisasterEvent = new javax.swing.JLabel();
        lblDisasterTime = new javax.swing.JLabel();
        lblDisasterDate = new javax.swing.JLabel();
        lblDisasterLocation = new javax.swing.JLabel();
        lblDisasterCoordinates = new javax.swing.JLabel();
        txtDisasterId = new javax.swing.JTextField();
        txtDisasterEvent = new javax.swing.JTextField();
        txtDisasterTime = new javax.swing.JTextField();
        txtDisasterCoordinates = new javax.swing.JTextField();
        btnSaveDisaster = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnViewDisaster = new javax.swing.JButton();
        txtDisasterLocation = new javax.swing.JTextField();
        msgLabel1 = new javax.swing.JLabel();
        msgLabel2 = new javax.swing.JLabel();
        msgLabel3 = new javax.swing.JLabel();
        txtDisasterDate = new com.toedter.calendar.JDateChooser();

        lblTitle1.setFont(new java.awt.Font("Segoe UI Variable", 1, 30)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("~ Disaster Workspace ~");

        lblDisasterId.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterId.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterId.setText("Disaster ID:");

        lblDisasterEvent.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterEvent.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterEvent.setText("Disaster Event:");

        lblDisasterTime.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterTime.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterTime.setText("Disaster Time:");

        lblDisasterDate.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterDate.setText("Disaster Date:");

        lblDisasterLocation.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterLocation.setText("Disaster Location:");

        lblDisasterCoordinates.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterCoordinates.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterCoordinates.setText("Disaster Coordinates:");

        txtDisasterId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDisasterIdKeyReleased(evt);
            }
        });

        txtDisasterEvent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDisasterEventKeyReleased(evt);
            }
        });

        btnSaveDisaster.setText("Save Disaster");
        btnSaveDisaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveDisasterMouseClicked(evt);
            }
        });
        btnSaveDisaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDisasterActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        btnViewDisaster.setText("View Disaster");
        btnViewDisaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewDisasterMouseClicked(evt);
            }
        });

        txtDisasterLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDisasterLocationKeyReleased(evt);
            }
        });

        msgLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel1.setForeground(new java.awt.Color(255, 255, 255));

        msgLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel2.setForeground(new java.awt.Color(255, 255, 255));

        msgLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        msgLabel3.setForeground(new java.awt.Color(255, 255, 255));
        msgLabel3.setText("Logout");
        msgLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(btnSaveDisaster)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewDisaster))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDisasterCoordinates)
                                    .addComponent(lblDisasterDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDisasterTime, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(lblDisasterEvent, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDisasterId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDisasterLocation, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDisasterId, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txtDisasterEvent)
                            .addComponent(txtDisasterTime)
                            .addComponent(txtDisasterCoordinates)
                            .addComponent(txtDisasterLocation)
                            .addComponent(txtDisasterDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(lblTitle1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(msgLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(msgLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(341, 341, 341))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle1)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDisasterId)
                                .addComponent(txtDisasterId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(msgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDisasterEvent)
                            .addComponent(txtDisasterEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(msgLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisasterTime)
                    .addComponent(txtDisasterTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDisasterDate)
                    .addComponent(txtDisasterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDisasterLocation)
                        .addComponent(txtDisasterLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(msgLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisasterCoordinates)
                    .addComponent(txtDisasterCoordinates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveDisaster)
                    .addComponent(btnViewDisaster))
                .addGap(32, 32, 32)
                .addComponent(btnBack)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDisasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveDisasterMouseClicked
        // TODO add your handling code here:
        
        Disaster disas = new Disaster();

        disas.setDisasterId(Integer.parseInt(txtDisasterId.getText()));
        disas.setDisasterEvent(txtDisasterEvent.getText());
        disas.setDisasterTime(txtDisasterTime.getText());

        disas.setDisasterDate(txtDisasterDate.getDate().toString());

        //disas.setDisasterLocation(txtDisasterLocation.getText());
        disas.setDisasterLocation(txtDisasterLocation.getText());
        disas.setDisasterCoordinates(txtDisasterCoordinates.getText());

        
        disDir.addNewDisaster(disas);
        
        
        JOptionPane.showMessageDialog(this, "Disaster created successfully!");

        vanishDataInDisasterCreation();
        
        CivilResponseDisasterList.CrDisasterArrayList.add(disas);
        
    }//GEN-LAST:event_btnSaveDisasterMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        
        //ManageDisasterWorkspacePanel.removeAll();
        //DisasterReportingWorkArea.add(DisasterReporting);
        //DisasterReportingWorkArea.repaint();
        //DisasterReportingWorkArea.revalidate();
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new DisasterReportingDashboardPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
        
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnViewDisasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewDisasterMouseClicked
        // TODO add your handling code here:
        
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new ViewDisasterPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
        
        
    }//GEN-LAST:event_btnViewDisasterMouseClicked


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

    private void txtDisasterIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisasterIdKeyReleased
        // TODO add your handling code here:
        
        String conv = "^[0-9]{0,4}$";
        Pattern ptt = Pattern.compile(conv);
        Matcher mat = ptt.matcher(txtDisasterId.getText());
        if(!mat.matches()){
            msgLabel1.setText("Enter a valid ID!");
        }
        else {
            msgLabel1.setText(null);
        }
    }//GEN-LAST:event_txtDisasterIdKeyReleased

    private void txtDisasterEventKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisasterEventKeyReleased
        // TODO add your handling code here:
        
        String conv2 = "^[a-z A-Z]{0,30}$";
        Pattern ptt2 = Pattern.compile(conv2);
        Matcher mat2 = ptt2.matcher(txtDisasterEvent.getText());
        if(!mat2.matches()){
            msgLabel2.setText("Incorrect Input!");
        }
        else {
            msgLabel2.setText(null);
        }
        
        
    }//GEN-LAST:event_txtDisasterEventKeyReleased

    private void txtDisasterLocationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisasterLocationKeyReleased
        // TODO add your handling code here:
        String conv3 = "^[a-z A-Z]{0,30}$";
        Pattern ptt3 = Pattern.compile(conv3);
        Matcher mat3 = ptt3.matcher(txtDisasterLocation.getText());
        if(!mat3.matches()){
            msgLabel3.setText("Incorrect Input!");
        }
        else {
            msgLabel3.setText(null);
        }
        
        
    }//GEN-LAST:event_txtDisasterLocationKeyReleased

    private void btnSaveDisasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDisasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveDisasterActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveDisaster;
    private javax.swing.JButton btnViewDisaster;
    private javax.swing.JLabel lblDisasterCoordinates;
    private javax.swing.JLabel lblDisasterDate;
    private javax.swing.JLabel lblDisasterEvent;
    private javax.swing.JLabel lblDisasterId;
    private javax.swing.JLabel lblDisasterLocation;
    private javax.swing.JLabel lblDisasterTime;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel msgLabel1;
    private javax.swing.JLabel msgLabel2;
    private javax.swing.JLabel msgLabel3;
    private javax.swing.JTextField txtDisasterCoordinates;
    private com.toedter.calendar.JDateChooser txtDisasterDate;
    private javax.swing.JTextField txtDisasterEvent;
    private javax.swing.JTextField txtDisasterId;
    private javax.swing.JTextField txtDisasterLocation;
    private javax.swing.JTextField txtDisasterTime;
    // End of variables declaration//GEN-END:variables

    private void vanishDataInDisasterCreation() {
        txtDisasterId.setText("");
        txtDisasterEvent.setText("");
        txtDisasterTime.setText("");

       // txtDisasterDate.setDateFormatString(null);

        txtDisasterLocation.setText("");
        txtDisasterCoordinates.setText("");
    }
}
