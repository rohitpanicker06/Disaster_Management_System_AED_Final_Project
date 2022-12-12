/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.army;

import CivilResponse.Army.ArmyEmployee;
import CivilResponse.Army.ArmyEmployeeDirectory;
import CivilResponse.Army.ArmyReportDirectory;
import CivilResponse.CivilResponseReport;
import CivilResponse.CivilResponseReportDirectory;
import CivilResponse.OfficerAllocation;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rbac.context.RbacApplicationContext;
import ui.LoginPanel;
import ui.MainJFrame;

/**
 *
 * @author gayatrisk
 */
public class ArmyActiveAssignmentsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ArmyActiveAssignmentsPanel
     */
//     OfficerAllocation offAddedHm;
    public ArmyActiveAssignmentsPanel() {
        initComponents();
        setOpaque(false);
        populateTable();
        populateOfficersTable();
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
        lblTitleOperationWorkspace = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportjTable = new javax.swing.JTable();
        btnTakeAction = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblOfAllocation = new javax.swing.JLabel();
        lblReportId = new javax.swing.JLabel();
        txtReportId = new javax.swing.JTextField();
        txtDisasterEvent = new javax.swing.JTextField();
        lblDisasterEvent = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        OfficerTable = new javax.swing.JTable();
        lblAssignedOfficer = new javax.swing.JLabel();
        jComboBoxViewOfficers = new javax.swing.JComboBox<>();
        btnSaveAssignment = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        logoutLabel = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        lblTitleOperationWorkspace.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        lblTitleOperationWorkspace.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleOperationWorkspace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleOperationWorkspace.setText("Operation Workspace ");

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
        jScrollPane1.setViewportView(ReportjTable);

        btnTakeAction.setText("Take Action");
        btnTakeAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeActionActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOfAllocation.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblOfAllocation.setForeground(new java.awt.Color(255, 255, 255));
        lblOfAllocation.setText("Officer Allocation");

        lblReportId.setBackground(new java.awt.Color(255, 255, 255));
        lblReportId.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblReportId.setForeground(new java.awt.Color(255, 255, 255));
        lblReportId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReportId.setText("Report ID:");

        txtReportId.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtReportId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportIdActionPerformed(evt);
            }
        });

        txtDisasterEvent.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        lblDisasterEvent.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterEvent.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDisasterEvent.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterEvent.setText("Disaster Event:");

        OfficerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Officer Id", "Officer Name", "Squad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(OfficerTable);

        lblAssignedOfficer.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblAssignedOfficer.setForeground(new java.awt.Color(255, 255, 255));
        lblAssignedOfficer.setText("Assigned Officers");

        btnSaveAssignment.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSaveAssignment.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveAssignment.setText("SAVE");
        btnSaveAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAssignmentActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnBack)
                        .addGap(189, 189, 189)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(btnSaveAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(txtReportId, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 365, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitleOperationWorkspace, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTakeAction, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOfAllocation, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblReportId, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDisasterEvent)
                                    .addGap(31, 31, 31))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAssignedOfficer)
                                .addComponent(txtDisasterEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxViewOfficers, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitleOperationWorkspace))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTakeAction)
                .addGap(49, 49, 49)
                .addComponent(lblOfAllocation)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReportId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReportId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisasterEvent)
                    .addComponent(txtDisasterEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAssignedOfficer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxViewOfficers, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaveAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack))
                        .addGap(32, 32, 32))))
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

    private void txtReportIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportIdActionPerformed

    public ArrayList<ArmyEmployee> officersAdded = new ArrayList<>();


    private void btnSaveAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAssignmentActionPerformed

        // TODO add your handling code here:
        int selectedRowIndex = ReportjTable.getSelectedRow();
        int selectedRowIndexOfficer = OfficerTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a report to take Action");
            return;
        } else if (jComboBoxViewOfficers.getItemCount() == 0){
            JOptionPane.showMessageDialog(this, "Please select one or more Officers");
            return;
        }

        String crReportID = (String) ReportjTable.getValueAt(selectedRowIndex, 0);
        CivilResponseReport cv = null;
        for (CivilResponseReport cr : CivilResponseReportDirectory.crReportList) {
            if (cr.getCrReportId().equals(crReportID)) {
                cv = cr;
                break;
            }
        }
        
        String msg = cv.getCrReportId();
        
        JOptionPane.showMessageDialog(this, "Task force assigned for Civil Response Report ID: "+msg);

        
        txtDisasterEvent.setText("");
        txtReportId.setText("");
        jComboBoxViewOfficers.removeAllItems();
        
        ArmyReportDirectory.crReport.remove(cv);
        populateTable();

        
        
        
       

    }//GEN-LAST:event_btnSaveAssignmentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new ArmyDashboardPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
    }//GEN-LAST:event_btnBackActionPerformed


    private void btnTakeActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeActionActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = ReportjTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a report to take Action");
            return;
        }

        String crReportID = (String) ReportjTable.getValueAt(selectedRowIndex, 0);
        CivilResponseReport cv = null;
        for (CivilResponseReport cr : CivilResponseReportDirectory.crReportList) {
            if (cr.getCrReportId().equals(crReportID)) {
                cv = cr;
                break;
            }
        }

        txtReportId.setText(cv.getCrReportId());
        txtDisasterEvent.setText(cv.getCrDisaster().getDisasterEvent());

    }//GEN-LAST:event_btnTakeActionActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = OfficerTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select an Officer");
            return;
        }

        String OfficerID = (String) OfficerTable.getValueAt(selectedRowIndex, 0);
        
        int selectedRowIndexforReport = ReportjTable.getSelectedRow();

        String crReportID = (String) ReportjTable.getValueAt(selectedRowIndexforReport, 0);
        CivilResponseReport cv = null;
        for (CivilResponseReport cr : CivilResponseReportDirectory.crReportList) {
            if (cr.getCrReportId().equals(crReportID)) {
                cv = cr;
                break;
            }
        }

        ArmyEmployee armyemp = null;
        for (ArmyEmployee armyEmp : ArmyEmployeeDirectory.armyEmpList) {
            if (armyEmp.getEmpId().equals(OfficerID)) {
                armyemp = armyEmp;
                break;
            }
        }

        jComboBoxViewOfficers.addItem(armyemp.getPerson().getName());
        armyemp.getCrReportList().add(cv);

        officersAdded.add(armyemp);
        

    }//GEN-LAST:event_btnAddActionPerformed

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
    private javax.swing.JTable OfficerTable;
    private javax.swing.JTable ReportjTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveAssignment;
    private javax.swing.JButton btnTakeAction;
    private javax.swing.JComboBox<String> jComboBoxViewOfficers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAssignedOfficer;
    private javax.swing.JLabel lblDisasterEvent;
    private javax.swing.JLabel lblOfAllocation;
    private javax.swing.JLabel lblReportId;
    private javax.swing.JLabel lblTitleOperationWorkspace;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JTextField txtDisasterEvent;
    private javax.swing.JTextField txtReportId;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) ReportjTable.getModel();
        model.setRowCount(0);

        if (ArmyReportDirectory.crReport != null) {
            for (CivilResponseReport crReport : ArmyReportDirectory.crReport) {
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

    public void populateOfficersTable() {

        DefaultTableModel model = (DefaultTableModel) OfficerTable.getModel();
        model.setRowCount(0);

        if (ArmyEmployeeDirectory.armyEmpList != null) {
            for (ArmyEmployee armyEmp : ArmyEmployeeDirectory.armyEmpList) {
                Object[] row = new Object[3];

                row[0] = armyEmp.getEmpId();
                row[1] = armyEmp.getPerson().getName();
                row[2] = armyEmp.getSquad();

                model.addRow(row);

            }
        }

    }
}
