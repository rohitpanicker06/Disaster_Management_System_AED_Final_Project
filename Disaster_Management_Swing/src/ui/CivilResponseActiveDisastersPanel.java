/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import CivilResponse.CivilResponseDisasterList;
import CivilResponse.CivilResponseReport;
import CivilResponse.CivilResponseReportDirectory;
import Disaster.Disaster;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gayatrisk
 */
public class CivilResponseActiveDisastersPanel extends javax.swing.JPanel {

    /**
     * Creates new form CivilResponseWorkspacePanel
     */
    CivilResponseDisasterList crDisDir;
    CivilResponseReportDirectory crDir;

    public CivilResponseActiveDisastersPanel() {
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

        buttonGroupExtTerrain = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitleCivilResponseWorkspace = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisasterjTable = new javax.swing.JTable();
        lblDisasterId = new javax.swing.JLabel();
        txtDisasterId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblLevelOfSeverity = new javax.swing.JLabel();
        jComboBoxLevelOfSeverity = new javax.swing.JComboBox<>();
        txtLevelOfSeverity = new javax.swing.JTextField();
        lblLevelOfRisk = new javax.swing.JLabel();
        jComboBoxLevelOfRisk = new javax.swing.JComboBox<>();
        txtLevelOfRisk = new javax.swing.JTextField();
        ArmyjCheckBox1 = new javax.swing.JCheckBox();
        NavyjCheckBox2 = new javax.swing.JCheckBox();
        PolicejCheckBox3 = new javax.swing.JCheckBox();
        lblDisasterEvent = new javax.swing.JLabel();
        txtDisasterEvent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblForcesAssigned = new javax.swing.JLabel();
        btnSubmitResponse = new javax.swing.JButton();
        lblReportId = new javax.swing.JLabel();
        txtReportId = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        lblTitleCivilResponseWorkspace.setFont(new java.awt.Font("Segoe UI Variable", 1, 30)); // NOI18N
        lblTitleCivilResponseWorkspace.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleCivilResponseWorkspace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleCivilResponseWorkspace.setText("~ Civil Response Workspace ~");

        DisasterjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Disaster Event", "Diaster ID", "Disaster Time", "Disaster Date", "Disaster Location", "Disaster Coordinates"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DisasterjTable);

        lblDisasterId.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterId.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDisasterId.setText("Disaster ID:");

        txtDisasterId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisasterIdActionPerformed(evt);
            }
        });

        jButton1.setText("Initiate Response");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblLevelOfSeverity.setBackground(new java.awt.Color(255, 255, 255));
        lblLevelOfSeverity.setForeground(new java.awt.Color(255, 255, 255));
        lblLevelOfSeverity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLevelOfSeverity.setText("Level of Severity:");

        jComboBoxLevelOfSeverity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Catastrophic", "2 - Critical", "3 - Moderate", "4 - Minimal" }));
        jComboBoxLevelOfSeverity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLevelOfSeverityActionPerformed(evt);
            }
        });

        lblLevelOfRisk.setBackground(new java.awt.Color(255, 255, 255));
        lblLevelOfRisk.setForeground(new java.awt.Color(255, 255, 255));
        lblLevelOfRisk.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLevelOfRisk.setText("Level of Risk:");

        jComboBoxLevelOfRisk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - High", "2 - Medium", "3 - Low", " " }));
        jComboBoxLevelOfRisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLevelOfRiskActionPerformed(evt);
            }
        });

        ArmyjCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        ArmyjCheckBox1.setText("Army");

        NavyjCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        NavyjCheckBox2.setText("Navy");

        PolicejCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        PolicejCheckBox3.setText("Police");

        lblDisasterEvent.setBackground(new java.awt.Color(255, 255, 255));
        lblDisasterEvent.setForeground(new java.awt.Color(255, 255, 255));
        lblDisasterEvent.setText("Disaster Event:");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Response Report");

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

        lblForcesAssigned.setBackground(new java.awt.Color(255, 255, 255));
        lblForcesAssigned.setForeground(new java.awt.Color(255, 255, 255));
        lblForcesAssigned.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblForcesAssigned.setText("Forces Assigned");

        btnSubmitResponse.setText("Submit Report");
        btnSubmitResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitResponseActionPerformed(evt);
            }
        });

        lblReportId.setBackground(new java.awt.Color(255, 255, 255));
        lblReportId.setForeground(new java.awt.Color(255, 255, 255));
        lblReportId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReportId.setText("Report ID:");

        txtReportId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitleCivilResponseWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnSubmitResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDisasterId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtDisasterId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(lblDisasterEvent)
                                .addGap(38, 38, 38)
                                .addComponent(txtDisasterEvent))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLevelOfRisk, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblForcesAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBoxLevelOfRisk, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtLevelOfRisk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtLevelOfSeverity, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(ArmyjCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(NavyjCheckBox2)
                                                .addGap(50, 50, 50)
                                                .addComponent(PolicejCheckBox3)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblLevelOfSeverity, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(jComboBoxLevelOfSeverity, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblReportId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtReportId, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitleCivilResponseWorkspace)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnBack))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisasterId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisasterId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisasterEvent)
                    .addComponent(txtDisasterEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReportId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReportId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLevelOfSeverity)
                            .addComponent(jComboBoxLevelOfSeverity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLevelOfRisk)
                            .addComponent(jComboBoxLevelOfRisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtLevelOfSeverity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtLevelOfRisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PolicejCheckBox3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ArmyjCheckBox1)
                        .addComponent(lblForcesAssigned))
                    .addComponent(NavyjCheckBox2))
                .addGap(18, 18, 18)
                .addComponent(btnSubmitResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean inputValidation(String regexExp, String inputText) {

        Pattern p = Pattern.compile(regexExp);
        Matcher m = p.matcher(inputText);
        boolean result = m.matches();

        return result;

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = DisasterjTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a disaster for initiation");
            return;
        }

        Disaster selectedDisaster = (Disaster) DisasterjTable.getValueAt(selectedRowIndex, 0);

        txtDisasterId.setText(String.valueOf(selectedDisaster.getDisasterId()));
        txtDisasterEvent.setText(selectedDisaster.getDisasterEvent());


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDisasterIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisasterIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisasterIdActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:

        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new CivilResponseDashboardPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new CivilResponseDashboardPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitResponseActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = DisasterjTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a disaster for initiation");
            return;
        }

        Disaster selectedDisaster = (Disaster) DisasterjTable.getValueAt(selectedRowIndex, 0);

        String reportId = txtReportId.getText();
        String levelOfSeverity = txtLevelOfSeverity.getText();
        String levelOfRisk = txtLevelOfRisk.getText();
        boolean armyAssigned = ArmyjCheckBox1.isSelected();
        boolean navyAssigned = NavyjCheckBox2.isSelected();
        boolean policeAssigned = PolicejCheckBox3.isSelected();

        //    Array of all the  validation errors
        ArrayList<String> errList = new ArrayList<String>();
        int errCount = 0;

        if (levelOfRisk == "") {
            errList.add("Please input level of Severity.");
            errCount++;
        }

        if (levelOfRisk == "") {
            errList.add("Please input level of Risk.");
            errCount++;
        }

        if (!armyAssigned && !navyAssigned && !policeAssigned) {
            errList.add("Please select one or more Forces.");
            errCount++;
        }

        String errMessageFinal = "";
        if (errCount > 0) {
            for (int i = 0; i < errList.size(); i++) {
                errMessageFinal = errMessageFinal + errList.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(this, errMessageFinal);
        } else {
            try {
                //Create new Employee with function from EmployeeHistory
                CivilResponseReport report = crDir.addNewReport();

                // Set all the values of the new employee with setters and text field values
                report.setCrDisaster(selectedDisaster);
                report.setCrReportId(reportId);
                report.setLvlOfSeverity(levelOfSeverity);
                report.setLvlOfRisk(levelOfRisk);
                report.setArmyAssigned(armyAssigned);
                report.setNavyAssigned(navyAssigned);
                report.setPoliceAssigned(policeAssigned);

                JOptionPane.showMessageDialog(this, "New Report Created. The forces will be informed.");
            } catch (Exception e) {
                //  Block of code to handle errors
                JOptionPane.showMessageDialog(this, "Error in creating a Response Report" + e);

            }

            txtDisasterEvent.setText("");
            txtDisasterId.setText("");
            txtLevelOfRisk.setText("");
            txtLevelOfSeverity.setText("");
            txtReportId.setText("");
            ArmyjCheckBox1.setSelected(false);
            NavyjCheckBox2.setSelected(false);
            PolicejCheckBox3.setSelected(false);
        }

    }//GEN-LAST:event_btnSubmitResponseActionPerformed

    private void txtReportIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportIdActionPerformed

    private void jComboBoxLevelOfSeverityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLevelOfSeverityActionPerformed
        // TODO add your handling code here:
        
        String selectedValue = jComboBoxLevelOfSeverity.getSelectedItem().toString();
        
        txtLevelOfSeverity.setText(selectedValue);
        
        
    }//GEN-LAST:event_jComboBoxLevelOfSeverityActionPerformed

    private void jComboBoxLevelOfRiskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLevelOfRiskActionPerformed
        // TODO add your handling code here:
       
        String selectedValue = jComboBoxLevelOfRisk.getSelectedItem().toString();
        
        txtLevelOfRisk.setText(selectedValue);
        
    }//GEN-LAST:event_jComboBoxLevelOfRiskActionPerformed

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
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ArmyjCheckBox1;
    private javax.swing.JTable DisasterjTable;
    private javax.swing.JCheckBox NavyjCheckBox2;
    private javax.swing.JCheckBox PolicejCheckBox3;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmitResponse;
    private javax.swing.ButtonGroup buttonGroupExtTerrain;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxLevelOfRisk;
    private javax.swing.JComboBox<String> jComboBoxLevelOfSeverity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDisasterEvent;
    private javax.swing.JLabel lblDisasterId;
    private javax.swing.JLabel lblForcesAssigned;
    private javax.swing.JLabel lblLevelOfRisk;
    private javax.swing.JLabel lblLevelOfSeverity;
    private javax.swing.JLabel lblReportId;
    private javax.swing.JLabel lblTitleCivilResponseWorkspace;
    private javax.swing.JTextField txtDisasterEvent;
    private javax.swing.JTextField txtDisasterId;
    private javax.swing.JTextField txtLevelOfRisk;
    private javax.swing.JTextField txtLevelOfSeverity;
    private javax.swing.JTextField txtReportId;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) DisasterjTable.getModel();
        model.setRowCount(0);

        if (CivilResponseDisasterList.CrDisasterArrayList != null) {
            for (Disaster di : CivilResponseDisasterList.CrDisasterArrayList) {
                Object[] row = new Object[6];

                row[0] = di;
                row[1] = di.getDisasterId();
                row[2] = di.getDisasterTime();
                row[3] = di.getDisasterDate();
                row[4] = di.getDisasterLocation();
                row[5] = di.getDisasterCoordinates();

                model.addRow(row);

            }
        }

    }

}
