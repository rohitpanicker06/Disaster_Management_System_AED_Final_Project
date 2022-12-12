/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.army;

import CivilResponse.Army.ArmyReportDirectory;
import CivilResponse.CivilResponseReport;
import CivilResponse.CivilResponseReportDirectory;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rbac.context.RbacApplicationContext;
import ui.LoginPanel;
import ui.MainJFrame;

/**
 *
 * @author gayatrisk
 */
public class ArmyAllDisasterPanel extends javax.swing.JPanel {

    /**
     * Creates new form ArmyAllDisasterPanel
     */
    public ArmyAllDisasterPanel() {
        initComponents();
        setOpaque(false);
        populateTable();
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
        lblTitleCivilResponseAllDisasters = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblDisasterId = new javax.swing.JLabel();
        lblDisasterEvent = new javax.swing.JLabel();
        lblDisasterLocation = new javax.swing.JLabel();
        txtReportId = new javax.swing.JTextField();
        txtDisasterEvent = new javax.swing.JTextField();
        txtLvlOfSeverity = new javax.swing.JTextField();
        lblDisasterTime = new javax.swing.JLabel();
        lblDisasterCoordinates = new javax.swing.JLabel();
        txtDisasterId = new javax.swing.JTextField();
        txtLvlofRisk = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReportjTable = new javax.swing.JTable();
        logoutLabel = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        lblTitleCivilResponseAllDisasters.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        lblTitleCivilResponseAllDisasters.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleCivilResponseAllDisasters.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleCivilResponseAllDisasters.setText(" Disaster Operations Allocated ");
        lblTitleCivilResponseAllDisasters.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        btnView.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnView.setText("View Disaster");
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
        });
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblDisasterId.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterId.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDisasterId.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterId.setText("Report ID:");

        lblDisasterEvent.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterEvent.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDisasterEvent.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterEvent.setText("Disaster Event:");

        lblDisasterLocation.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterLocation.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDisasterLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterLocation.setText("Level Of Severity:");

        txtDisasterEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisasterEventActionPerformed(evt);
            }
        });

        lblDisasterTime.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterTime.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDisasterTime.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterTime.setText("Disaster ID:");

        lblDisasterCoordinates.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterCoordinates.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDisasterCoordinates.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterCoordinates.setText("Level of Risk");

        ReportjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Report Id", "Disaster Event", "Diaster ID", "Level of Severity", "Level of Risk"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ReportjTable);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(lblTitleCivilResponseAllDisasters, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView))
                        .addContainerGap(397, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDisasterTime)
                                    .addComponent(lblDisasterEvent))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDisasterId)
                                .addGap(53, 53, 53)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtReportId, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(242, 242, 242))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDisasterId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDisasterEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDisasterLocation)
                                    .addComponent(lblDisasterCoordinates))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLvlofRisk, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLvlOfSeverity, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(385, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblTitleCivilResponseAllDisasters))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisasterId)
                    .addComponent(txtReportId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisasterLocation)
                    .addComponent(txtLvlOfSeverity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisasterTime)
                    .addComponent(txtDisasterId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisasterCoordinates)
                    .addComponent(txtLvlofRisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisasterEvent)
                    .addComponent(txtDisasterEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
        // TODO add your handling code here:

        int selectedRowIndex = ReportjTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        
        CivilResponseReport crReport = (CivilResponseReport) ReportjTable.getValueAt(ReportjTable.getSelectedRow(), 0);
        
        txtReportId.setText(String.valueOf(crReport.getCrReportId()));
        txtDisasterId.setText(String.valueOf(crReport.getCrDisaster().getDisasterId()));
        txtDisasterEvent.setText(String.valueOf(crReport.getCrDisaster().getDisasterEvent()));
        txtLvlOfSeverity.setText(String.valueOf(crReport.getLvlOfSeverity()));
        txtLvlofRisk.setText(String.valueOf(crReport.getLvlOfRisk()));
        
    }//GEN-LAST:event_btnViewMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:

        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new ArmyDashboardPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new ArmyDashboardPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDisasterEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisasterEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisasterEventActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

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
    private javax.swing.JTable ReportjTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDisasterCoordinates;
    private javax.swing.JLabel lblDisasterEvent;
    private javax.swing.JLabel lblDisasterId;
    private javax.swing.JLabel lblDisasterLocation;
    private javax.swing.JLabel lblDisasterTime;
    private javax.swing.JLabel lblTitleCivilResponseAllDisasters;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JTextField txtDisasterEvent;
    private javax.swing.JTextField txtDisasterId;
    private javax.swing.JTextField txtLvlOfSeverity;
    private javax.swing.JTextField txtLvlofRisk;
    private javax.swing.JTextField txtReportId;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) ReportjTable.getModel();
        model.setRowCount(0);

        if (ArmyReportDirectory.crReport != null) {
            for (CivilResponseReport crReport : CivilResponseReportDirectory.crReportList) {
                Object[] row = new Object[5];

                row[0] = crReport.getCrReportId();
                row[1] = crReport.getCrDisaster().getDisasterId();
                row[2] = crReport.getCrDisaster().getDisasterEvent();
                row[3] = crReport.getLvlOfSeverity();
                row[4] = crReport.getLvlOfRisk();

                model.addRow(row);

            }
        }
    }
}
