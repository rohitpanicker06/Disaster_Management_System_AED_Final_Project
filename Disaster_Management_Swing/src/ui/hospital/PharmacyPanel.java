/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.hospital;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.pharmacy.Medicine;
import model.pharmacy.Pharmacy_Prescription_Queue;
import model.pharmacy.Prescriptions;
import rbac.context.RbacApplicationContext;
import ui.LoginPanel;
import ui.MainJFrame;

/**
 *
 * @author rohitpanicker
 */
public class PharmacyPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyPanel
     */
    
    public PharmacyPanel() {
        initComponents();
         setOpaque(false);
         populateRecords();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        viewAllMedicinesList = new javax.swing.JButton();
        approveReqButton = new javax.swing.JButton();
        medicineListJcomboBox = new javax.swing.JComboBox<>();
        logoutLabel = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Price", "Doctor Name", "Patient Name"
            }
        ));
        tblRecords.setOpaque(false);
        jScrollPane1.setViewportView(tblRecords);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHARMACY");

        jLabel2.setText(" Medicine Requests:");

        viewAllMedicinesList.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        viewAllMedicinesList.setForeground(new java.awt.Color(255, 255, 255));
        viewAllMedicinesList.setText("View All Medicines List");
        viewAllMedicinesList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllMedicinesListActionPerformed(evt);
            }
        });

        approveReqButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        approveReqButton.setForeground(new java.awt.Color(255, 255, 255));
        approveReqButton.setText("Approve Request");
        approveReqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveReqButtonActionPerformed(evt);
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
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(medicineListJcomboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewAllMedicinesList, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(approveReqButton, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAllMedicinesList, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approveReqButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(medicineListJcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
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

    private void viewAllMedicinesListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllMedicinesListActionPerformed
        // TODO add your handling code here:
        
         
         int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Request is selected, Please Try Again");
            return;
        }
        
        Prescriptions prescriptions = (Prescriptions) tblRecords.getValueAt(selectedRowIndex, 0);
        
        for(Medicine med: prescriptions.getMedicineList())
        {
            medicineListJcomboBox.addItem(med.toString());
        }
        
    }//GEN-LAST:event_viewAllMedicinesListActionPerformed

    private void approveReqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveReqButtonActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = tblRecords.getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "No Request is selected, Please Try Again");
            return;
        }
       
        Prescriptions prescriptions = (Prescriptions) tblRecords.getValueAt(selectedRowIndex, 0);
        
        Pharmacy_Prescription_Queue.prescriptionQueue.remove(prescriptions);
        String patientName = prescriptions.getPatient().getPerson().getName();
        String patientEmail = prescriptions.getPatient().getPerson().getEmailid();
        String doctorName = prescriptions.getDoctor().getPerson().getName();
        long totalPrice = getTotalPrice(prescriptions);
        StringBuffer listOfMedicines = new StringBuffer();
        int count=0;
        StringBuffer emailMessage = new StringBuffer();
        emailMessage.append("Hello,\n").append(patientName).append(",\n");
        emailMessage.append("Here is your receipt according to the Pharmacy Purchase:").append("\n");
        emailMessage.append("List of Medicines:\n");
        
        for(Medicine med: prescriptions.getMedicineList())
        {
            
            listOfMedicines.append("").append(++count).append(". ").append(med.getName()).append("\n");
        }
        emailMessage.append(listOfMedicines.toString()).append("\n");
        emailMessage.append("Total Price:").append("  $").append(totalPrice).append("\n");
        emailMessage.append("Consulting Doctor: ").append(doctorName).append("\n\n\n");
        try {
            emailSendingService.SendEmail.sendEmail(emailMessage.toString(), patientEmail);
            JOptionPane.showMessageDialog(this, "Request Approved");
        } catch (MessagingException ex) {
            Logger.getLogger(PharmacyPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        populateRecords();
        
       
            
    }//GEN-LAST:event_approveReqButtonActionPerformed

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
    private javax.swing.JButton approveReqButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JComboBox<String> medicineListJcomboBox;
    private javax.swing.JTable tblRecords;
    private javax.swing.JButton viewAllMedicinesList;
    // End of variables declaration//GEN-END:variables

    private void populateRecords() {
       
           DefaultTableModel tableModel = (DefaultTableModel) tblRecords.getModel();
           tableModel.setRowCount(0);
       for(Prescriptions pres: Pharmacy_Prescription_Queue.prescriptionQueue)
       {
          Prescriptions prescriptions = pres;
           Object[] row = new Object[4];
                row[0] = prescriptions;
                row[1] = getTotalPrice(prescriptions);
                row[2] = prescriptions.getDoctor().getPerson().getName();
                row[3] = prescriptions.getPatient().getPerson().getName();
 
                tableModel.addRow(row);
          
       }
        
    }
    
    public int getTotalPrice(Prescriptions p)
    {
        int sum = 0;
        for(Medicine med: p.getMedicineList())
        {
            sum+= Integer.parseInt(med.getPrice());
        }
        return sum;
    }
}
