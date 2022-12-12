/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.army;

import CivilResponse.Army.ArmyEmployee;
import CivilResponse.Army.ArmyEmployeeDirectory;
import CivilResponse.CivilResponseReport;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import person.Person;
import rbac.application.user.User;
import rbac.application.user.UserListDirectory;
import rbac.context.RbacApplicationContext;
import ui.LoginPanel;
import ui.MainJFrame;

/**
 *
 * @author gayatrisk
 */

public class ArmyEmpDashboardPanel extends javax.swing.JPanel {

    /**
     * Creates new form ArmyEmpDashboardPanel
     */
    RbacApplicationContext rbacApplicationContext = RbacApplicationContext.getInstance();

    public static void main(String[] args) {
        
    }
    public ArmyEmpDashboardPanel() {
        initComponents();
        setOpaque(false);
      
    }
    
    public ArmyEmpDashboardPanel(int i ) {
        initComponents();
        setOpaque(false);
        populateFields();
      
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
        lblempId = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblSquad = new javax.swing.JLabel();
        txtSquad = new javax.swing.JTextField();
        lblemailId = new javax.swing.JLabel();
        txtemailId = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportjTable = new javax.swing.JTable();
        lblOfAllocation = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        logoutLabel2 = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText(" Welcome Officer ");
        lblTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        lblempId.setBackground(new java.awt.Color(255, 255, 255));
        lblempId.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblempId.setForeground(new java.awt.Color(255, 255, 255));
        lblempId.setText("Employee ID");

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Name");

        txtEmpId.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        lblSquad.setBackground(new java.awt.Color(255, 255, 255));
        lblSquad.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblSquad.setForeground(new java.awt.Color(255, 255, 255));
        lblSquad.setText("Squad");

        txtSquad.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        lblemailId.setBackground(new java.awt.Color(255, 255, 255));
        lblemailId.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblemailId.setForeground(new java.awt.Color(255, 255, 255));
        lblemailId.setText("Email ID");

        txtemailId.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        lblPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPhone.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("Gender");

        ReportjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CR Report ID", "Diaster ID", "Disaster Time", "Level of Severity", "Level of Risk"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ReportjTable);

        lblOfAllocation.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblOfAllocation.setForeground(new java.awt.Color(255, 255, 255));
        lblOfAllocation.setText("Operations Allocated");

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Start Operation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        logoutLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logoutLabel2.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel2.setText("Logout");
        logoutLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256)
                .addComponent(logoutLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblempId)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSquad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSquad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblemailId)
                                .addGap(26, 26, 26)
                                .addComponent(txtemailId, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPhone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOfAllocation, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(logoutLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblempId)
                            .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSquad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSquad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblemailId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhone))))
                .addGap(59, 59, 59)
                .addComponent(lblOfAllocation)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Operation started. Good luck!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabel2MousePressed
        // TODO add your handling code here:

        RbacApplicationContext rbacApplicationContext = RbacApplicationContext.getInstance();
        rbacApplicationContext.setRoleContext(null);
        rbacApplicationContext.setUser(null);
        JOptionPane.showMessageDialog(this, "Logged Out");
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new LoginPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
    }//GEN-LAST:event_logoutLabel2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ReportjTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOfAllocation;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSquad;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblemailId;
    private javax.swing.JLabel lblempId;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel logoutLabel2;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSquad;
    private javax.swing.JTextField txtemailId;
    // End of variables declaration//GEN-END:variables

    public void populateFields() {

        User user = rbacApplicationContext.getUser();
        
        String username = user.getUserName();
        Person person = UserListDirectory.getUserNameToPersonMap().get(username);

        ArmyEmployee currentEmp = null;

        for (ArmyEmployee armEmp : ArmyEmployeeDirectory.armyEmpList) {
            if (armEmp.getPerson().getId().equals(person.getId())) {
                currentEmp = armEmp;
            }
        }

        txtEmpId.setText(currentEmp.getEmpId());
        txtName.setText(currentEmp.getPerson().getName());
        txtSquad.setText(currentEmp.getSquad());
        txtemailId.setText(currentEmp.getPerson().getEmailid());
        txtGender.setText(currentEmp.getPerson().getGender());
        
        DefaultTableModel model = (DefaultTableModel) ReportjTable.getModel();
        model.setRowCount(0);

        if (currentEmp.getCrReportList() != null) {
            for (CivilResponseReport crReport : currentEmp.getCrReportList()) {
                Object[] row = new Object[5];

                row[0] = crReport;
                row[1] = crReport.getCrDisaster().getDisasterId();
                row[2] = crReport.getCrDisaster().getDisasterTime();
                row[3] = crReport.getLvlOfSeverity();
                row[4] = crReport.getLvlOfRisk();

                model.addRow(row);

            }

        }
        
    }
    
  
}
