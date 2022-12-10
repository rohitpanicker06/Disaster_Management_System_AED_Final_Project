/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.army;

import CivilResponse.Army.ArmyEmployee;
import CivilResponse.Army.ArmyReportDirectory;
import CivilResponse.CivilResponseReport;
import CivilResponse.OfficerAllocation;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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

        jPanel1.setOpaque(false);

        lblTitleOperationWorkspace.setFont(new java.awt.Font("Segoe UI Variable", 1, 30)); // NOI18N
        lblTitleOperationWorkspace.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleOperationWorkspace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleOperationWorkspace.setText("~ Operation Workspace ~");

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
        lblReportId.setForeground(new java.awt.Color(255, 255, 255));
        lblReportId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReportId.setText("Report ID:");

        txtReportId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportIdActionPerformed(evt);
            }
        });

        lblDisasterEvent.setBackground(new java.awt.Color(255, 255, 255));
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

        lblAssignedOfficer.setForeground(new java.awt.Color(255, 255, 255));
        lblAssignedOfficer.setText("Assigned Officers");

        jComboBoxViewOfficers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSaveAssignment.setText("Save");
        btnSaveAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAssignmentActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblOfAllocation, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTakeAction, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBack))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblAssignedOfficer)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jComboBoxViewOfficers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSaveAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblReportId, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtReportId, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(lblDisasterEvent)
                                .addGap(18, 18, 18)
                                .addComponent(txtDisasterEvent))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitleOperationWorkspace, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitleOperationWorkspace)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnTakeAction))
                .addGap(72, 72, 72)
                .addComponent(lblOfAllocation)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReportId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReportId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisasterEvent)
                    .addComponent(txtDisasterEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAssignedOfficer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxViewOfficers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSaveAssignment, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
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

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a report to take Action");
            return;
        }

        CivilResponseReport crReport = (CivilResponseReport) ReportjTable.getValueAt(selectedRowIndex, 0);

        for (ArmyEmployee armyEmp : officersAdded) {
            OfficerAllocation.ArmyOffAllocation.put(armyEmp, crReport);
        }


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

        CivilResponseReport crReport = (CivilResponseReport) ReportjTable.getValueAt(selectedRowIndex, 0);

        txtReportId.setText(crReport.getCrReportId());
        txtDisasterEvent.setText(crReport.getCrDisaster().getDisasterEvent());

    }//GEN-LAST:event_btnTakeActionActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = OfficerTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select an Officer");
            return;
        }

        ArmyEmployee officer = (ArmyEmployee) OfficerTable.getValueAt(selectedRowIndex, 0);

        jComboBoxViewOfficers.addItem(officer.toString());

        officersAdded.add(officer);

    }//GEN-LAST:event_btnAddActionPerformed


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
}
