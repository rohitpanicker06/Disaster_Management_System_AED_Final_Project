/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Disaster.Disaster;
import ReportingManagement.InjuryKilledCasualties;
import ReportingManagement.SiteReportingEmployee;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static ui.ManageDisasterWorkspacePanel.disDir;
import static ui.SiteManagementWorkspacePanel.mgmtList;


/**
 *
 * @author Rohit Paul G
 */
public class ViewReportsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewReportsPanel
     */
    public ViewReportsPanel() {
        initComponents();
        populateMissingCasualtiesTable();
        populateInjuredKilledCasualtiesTable();
        setOpaque(false);
        for (Disaster d : disDir.getDisasterList()){
            chooseDisasterBox.addItem(d.toString());
        }
        
        
        
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
        lblMissingReport = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        missingCasualtiesjTable = new javax.swing.JTable();
        lblInjuredKilledReport = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        injuredKilledCasualtiesjTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnGenerateMissing = new javax.swing.JButton();
        btnGenerateInjuredKilled = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        missingReport = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        injuryKilledReport = new javax.swing.JTextArea();
        btnPrintMissing = new javax.swing.JButton();
        chooseDisasterBox = new javax.swing.JComboBox<>();
        btnPrintInjuredKilled = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI Variable", 1, 30)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("~ View Site Reports ~");

        lblMissingReport.setForeground(new java.awt.Color(255, 255, 255));
        lblMissingReport.setText("Missing Report:");

        missingCasualtiesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Full Name", "Age", "Phone Number", "Email ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        missingCasualtiesjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missingCasualtiesjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(missingCasualtiesjTable);

        lblInjuredKilledReport.setForeground(new java.awt.Color(255, 255, 255));
        lblInjuredKilledReport.setText("Injured/Killed Report:");

        injuredKilledCasualtiesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Injury Count", "Kill Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        injuredKilledCasualtiesjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                injuredKilledCasualtiesjTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(injuredKilledCasualtiesjTable);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnGenerateMissing.setBackground(new java.awt.Color(0, 204, 204));
        btnGenerateMissing.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGenerateMissing.setText("Generate Report 1");
        btnGenerateMissing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateMissingActionPerformed(evt);
            }
        });

        btnGenerateInjuredKilled.setBackground(new java.awt.Color(0, 204, 153));
        btnGenerateInjuredKilled.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGenerateInjuredKilled.setText("Generate Report 2");
        btnGenerateInjuredKilled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateInjuredKilledActionPerformed(evt);
            }
        });

        missingReport.setColumns(20);
        missingReport.setRows(5);
        jScrollPane3.setViewportView(missingReport);

        injuryKilledReport.setColumns(20);
        injuryKilledReport.setRows(5);
        jScrollPane4.setViewportView(injuryKilledReport);

        btnPrintMissing.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrintMissing.setText("Print Report 1");
        btnPrintMissing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintMissingActionPerformed(evt);
            }
        });

        chooseDisasterBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooseDisasterBoxItemStateChanged(evt);
            }
        });

        btnPrintInjuredKilled.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrintInjuredKilled.setText("Print Report 2");
        btnPrintInjuredKilled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintInjuredKilledActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGenerateMissing)
                    .addComponent(btnGenerateInjuredKilled)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chooseDisasterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInjuredKilledReport)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblMissingReport))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPrintMissing)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPrintInjuredKilled)
                        .addGap(47, 47, 47))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(384, 384, 384))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(222, 222, 222))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(chooseDisasterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMissingReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerateMissing)
                    .addComponent(btnPrintMissing))
                .addGap(28, 28, 28)
                .addComponent(lblInjuredKilledReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerateInjuredKilled)
                    .addComponent(btnPrintInjuredKilled))
                .addGap(40, 40, 40)
                .addComponent(btnBack)
                .addGap(125, 125, 125))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void missingCasualtiesjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missingCasualtiesjTableMouseClicked
        // TODO add your handling code here:
        
//        int i = missingCasualtiesjTable.getSelectedRow();
//        TableModel model = missingCasualtiesjTable.getModel();
//        txtFullName.setText(model.getValueAt(i, 0).toString());
//        txtAge.setText(model.getValueAt(i, 1).toString());
//        txtPhoneNumber.setText(model.getValueAt(i, 2).toString());
//        txtEmail.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_missingCasualtiesjTableMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new SiteManagementWorkspacePanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
    }//GEN-LAST:event_btnBackActionPerformed

    private void injuredKilledCasualtiesjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_injuredKilledCasualtiesjTableMouseClicked
        // TODO add your handling code here:
        
//        int j = injuredKilledCasualtiesjTable.getSelectedRow();
//        TableModel model2 = injuredKilledCasualtiesjTable.getModel();
//        txtInjuryCount.setText(model2.getValueAt(j, 0).toString());
//        txtKillCount.setText(model2.getValueAt(j, 1).toString());
    }//GEN-LAST:event_injuredKilledCasualtiesjTableMouseClicked

    private void btnGenerateMissingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateMissingActionPerformed
        // TODO add your handling code here:
        
        missingReport.setText(missingReport.getText()+"===================================================\n");
        missingReport.setText(missingReport.getText()+" \t Missing Casualties Report \n");
        missingReport.setText(missingReport.getText()+"===================================================\n");
        DefaultTableModel model = (DefaultTableModel)missingCasualtiesjTable.getModel();
        missingReport.setText(missingReport.getText()+"Full Name"+"\t"+"Age"+"\t"+"Phone Number"+"\t"+"Email ID"+"\n");
        for (int i = 0; i < missingCasualtiesjTable.getRowCount(); i++){
            String FullName = missingCasualtiesjTable.getValueAt(i, 0).toString();
            String Age = missingCasualtiesjTable.getValueAt(i, 1).toString();
            String PhoneNumber = missingCasualtiesjTable.getValueAt(i, 2).toString();
            String EmailID = missingCasualtiesjTable.getValueAt(i, 3).toString();
            missingReport.setText(missingReport.getText()+FullName+"\t"+Age+"\t"+PhoneNumber+"\t"+"\t"+EmailID+"\n");
        }
        
        missingReport.setText(missingReport.getText()+"\n");
        missingReport.setText(missingReport.getText()+"===================================================\n");
        missingReport.setText(missingReport.getText()+"\t\t End Report!\n");
        
    }//GEN-LAST:event_btnGenerateMissingActionPerformed

    private void btnGenerateInjuredKilledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateInjuredKilledActionPerformed
        // TODO add your handling code here:
        
        injuryKilledReport.setText(injuryKilledReport.getText()+"===================================================\n");
        injuryKilledReport.setText(injuryKilledReport.getText()+" \t Injury/Killed Casualties Report \n");
        injuryKilledReport.setText(injuryKilledReport.getText()+"===================================================\n");
        DefaultTableModel model = (DefaultTableModel)injuredKilledCasualtiesjTable.getModel();
        injuryKilledReport.setText(injuryKilledReport.getText()+"Injury Count"+"\t"+"Kill Count"+"\n");
        for (int j = 0; j < injuredKilledCasualtiesjTable.getRowCount(); j++){
            String Injury = injuredKilledCasualtiesjTable.getValueAt(j, 0).toString();
            String Kill = injuredKilledCasualtiesjTable.getValueAt(j, 1).toString();
            injuryKilledReport.setText(injuryKilledReport.getText()+Injury+"\t"+Kill+"\n");
        }
        
        injuryKilledReport.setText(injuryKilledReport.getText()+"\n");
        injuryKilledReport.setText(injuryKilledReport.getText()+"===================================================\n");
        injuryKilledReport.setText(injuryKilledReport.getText()+"\t\t End Report!\n");
    }//GEN-LAST:event_btnGenerateInjuredKilledActionPerformed

    private void btnPrintMissingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintMissingActionPerformed
        // TODO add your handling code here:
        try{
            missingReport.print();
        }
        catch(Exception e){
            
        }
        
    }//GEN-LAST:event_btnPrintMissingActionPerformed

    private void chooseDisasterBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseDisasterBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseDisasterBoxItemStateChanged

    private void btnPrintInjuredKilledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintInjuredKilledActionPerformed
        // TODO add your handling code here:
        
        try{
            injuryKilledReport.print();
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnPrintInjuredKilledActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateInjuredKilled;
    private javax.swing.JButton btnGenerateMissing;
    private javax.swing.JButton btnPrintInjuredKilled;
    private javax.swing.JButton btnPrintMissing;
    private javax.swing.JComboBox<String> chooseDisasterBox;
    private javax.swing.JTable injuredKilledCasualtiesjTable;
    private javax.swing.JTextArea injuryKilledReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblInjuredKilledReport;
    private javax.swing.JLabel lblMissingReport;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable missingCasualtiesjTable;
    private javax.swing.JTextArea missingReport;
    // End of variables declaration//GEN-END:variables

    private void populateMissingCasualtiesTable() {
        DefaultTableModel model = (DefaultTableModel)missingCasualtiesjTable.getModel();
        model.setRowCount(0);
        
        
        if(mgmtList.getSiteReportingEmpList()!=null){
            for(SiteReportingEmployee sr : mgmtList.getSiteReportingEmpList()){
                Object[] row = new Object[4];
                
                row[0] = sr.getCasualtyName();
                row[1] = sr.getCasualtyAge();
                row[2] = sr.getCasualtyPhn();
                row[3] = sr.getCasualtyEmail();
                
                model.addRow(row);
            }
        }
    }

    private void populateInjuredKilledCasualtiesTable() {
        DefaultTableModel model1 = (DefaultTableModel)injuredKilledCasualtiesjTable.getModel();
        model1.setRowCount(0);
        
        if(mgmtList.getInjuryKilledList()!=null){
            for(InjuryKilledCasualties injkill : mgmtList.getInjuryKilledList()){
                Object[] row1 = new Object[2];
                
                row1[0] = injkill.getInjuryCount();
                row1[1] = injkill.getKillCount();
                
                model1.addRow(row1);
            }
        }
    }

   
}
