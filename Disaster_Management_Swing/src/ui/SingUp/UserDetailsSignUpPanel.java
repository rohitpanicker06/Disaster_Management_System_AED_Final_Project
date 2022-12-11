/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SingUp;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import ui.LoginPanel;
import ui.MainJFrame;
import utility.ValidationHelper;

/**
 *
 * @author rohitpanicker
 */
public class UserDetailsSignUpPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserDetailsSignUpPanel
     */
    
    int selectedIndex ;
    String name ;
    String email;
    int id;
    String phoneNumber;
    String gender;
    int age;
    public UserDetailsSignUpPanel(int selectedIndex) {
        initComponents();
        this.selectedIndex= selectedIndex;
        setOpaque(false);
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
        personIdLabel1 = new javax.swing.JLabel();
        idTxtField = new javax.swing.JTextField();
        personNameLabel = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        emailIdPersonLabel = new javax.swing.JLabel();
        emailIdTxtField = new javax.swing.JTextField();
        phonePersonalLabel = new javax.swing.JLabel();
        phnNumberTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        genderTxtField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        browseImage = new javax.swing.JButton();
        photoLabel = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        personIdLabel1.setText("ID:");

        personNameLabel.setText("Name:");

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });

        emailIdPersonLabel.setText("Email ID:");

        phonePersonalLabel.setText("Phone Number:");

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP : 1/3");

        genderLabel.setText("Gender");

        ageLabel.setText("Age:");

        jLabel4.setText("Image");

        browseImage.setText("Browse Image");
        browseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseImageActionPerformed(evt);
            }
        });

        photoLabel.setBackground(new java.awt.Color(255, 255, 255));
        photoLabel.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(browseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(303, 303, 303)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailIdPersonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phonePersonalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phnNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(personIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(personNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(304, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(browseImage))
                .addGap(18, 18, 18)
                .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(302, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(personIdLabel1))
                    .addGap(33, 33, 33)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(personNameLabel))
                    .addGap(37, 37, 37)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailIdPersonLabel))
                    .addGap(44, 44, 44)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phnNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phonePersonalLabel))
                    .addGap(216, 216, 216)))
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

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed
    private Image globalImage=null;
    private String selectedImage;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       int errorCount =0;
       StringBuffer errorNotifier = new StringBuffer();
        Image image= null;
       
        if(ValidationHelper.isInteger(idTxtField.getText()))
            {
                id = Integer.parseInt(idTxtField.getText());
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Hospital ID should be an Integer\n");
            }
        
        if(ValidationHelper.isValidName(nameTxtField.getText()))
            {
                name = nameTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Name should be a String\n");
            }
        
         if(ValidationHelper.isValidEmailID(emailIdTxtField.getText())){
                email = emailIdTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Email Id should be in xyz@gmail.com format\n");
            }
         
       if(ValidationHelper.checkPhoneNumberWith10Digits(phnNumberTxtField.getText())){
                phoneNumber = phnNumberTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Phone number should be of 10 digits\n");
            }
       
        if(ValidationHelper.isValidName(genderTxtField.getText())){
                gender = genderTxtField.getText();
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Gender should be a String\n");
            }
         if(this.globalImage != null)
            {
                image= globalImage;
            }else{
                 errorCount++;
                errorNotifier.append(errorCount).append(". Please upload a  picture\n");
            }
        if(ValidationHelper.isInteger(ageTxtField.getText())){
                age = Integer.parseInt(ageTxtField.getText());
            }else{
                errorCount++;
                errorNotifier.append(errorCount).append(". Age should be an Integer\n");
            }
        
        if(errorCount > 0 )
            {
                JOptionPane.showMessageDialog(this, errorNotifier.toString());
                return;
            }
        else{
        if(this.selectedIndex == 5 || this.selectedIndex == 6)
        {
         MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new HospitalAndInsuranceIDPanel(selectedIndex, id, name, email, phoneNumber, gender, age, globalImage));
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate(); 
        }else{
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new AddressSignUpPanel(selectedIndex, id, name, email, phoneNumber, gender, age, globalImage, null, null));
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void browseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseImageActionPerformed
        // TODO add your handling code here:

        globalImage = null;
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Choose your extension", "jpg");
        jFileChooser.setFileFilter(fileNameExtensionFilter);

        try {
            int selectedOperation = jFileChooser.showOpenDialog(this);
            if (selectedOperation == JFileChooser.APPROVE_OPTION) {
                File file = jFileChooser.getSelectedFile();
                selectedImage = file.getAbsolutePath();

                JOptionPane.showInternalMessageDialog(null, "Are you sure you want this Photo?");

                ImageIcon imageIcon = new ImageIcon(selectedImage);
                Image imageDefault = imageIcon.getImage();
                Image imageDisplay = imageDefault.getScaledInstance(photoLabel.getWidth(), photoLabel.getHeight(), Image.SCALE_SMOOTH);
                globalImage = imageDisplay;
                photoLabel.setIcon(new ImageIcon(imageDisplay));
            }
        } catch (Exception e) {
            System.out.println("Exception occured while choosing image e= " + e.getMessage());
        }
    }//GEN-LAST:event_browseImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton browseImage;
    private javax.swing.JLabel emailIdPersonLabel;
    private javax.swing.JTextField emailIdTxtField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxtField;
    private javax.swing.JTextField idTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel personIdLabel1;
    private javax.swing.JLabel personNameLabel;
    private javax.swing.JTextField phnNumberTxtField;
    private javax.swing.JLabel phonePersonalLabel;
    private javax.swing.JLabel photoLabel;
    // End of variables declaration//GEN-END:variables
}
