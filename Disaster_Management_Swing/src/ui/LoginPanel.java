/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import database.connectivity.QueryExecutor;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rbac.application.user.UserListDirectory;
import rbac.context.RbacApplicationContext;
import rbac.role.Role;
import rbac.roles.roleImplementation.CivilResponseRoleBase;
import rbac.roles.roleImplementation.CommunityAdminRoleBase;
import rbac.roles.roleImplementation.DisasterManagementHeadRoleBase;
import rbac.roles.roleImplementation.DoctorRoleBase;
import rbac.roles.roleImplementation.DonoRoleBase;
import rbac.roles.roleImplementation.FundRaiserRoleBase;
import rbac.roles.roleImplementation.HospitalAdminRoleBase;
import rbac.roles.roleImplementation.PatientRoleBase;
import rbac.roles.roleImplementation.PharmacyRoleBase;
import rbac.roles.roleImplementation.RecordsRoleBase;
import rbac.roles.roleImplementation.SiteReportingEmployeeRoleBase;
import rbac.roles.roleImplementation.SystemAdminRoleBase;
import ui.fundraiser.DonateFundsPanel;
import ui.fundraiser.FundRaiserPanel;

/**
 *
 * @author rohitpanicker
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    
    static ArrayList<String> roles = new ArrayList<>();
    
    static{
        roles.add("System Admin");
        roles.add("Site/Event Reporting ");
        roles.add("Disaster Head");
        roles.add("Civil Response ");
        roles.add("Fund Raising");
        roles.add("Hopsital Admin");
        roles.add("Patient");
        roles.add("Doctor");
        roles.add("Pharmacy");
        roles.add("Records");
        roles.add("Donor");
        
    }
    public LoginPanel() {
        initComponents();
        populateComboBox();
     setOpaque(false);
    }
    
    public void populateComboBox(){
        
        userTypeDropBox.removeAllItems();
        for(String role:roles)
        {
            userTypeDropBox.addItem(role);
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userTypeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userTypeDropBox = new javax.swing.JComboBox<>();
        userNameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        signUpLabel = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign In");

        userTypeLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        userTypeLabel.setText("User type");

        jLabel4.setBackground(new java.awt.Color(220, 245, 228));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        userTypeDropBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Patient", "Doctor", "Hospital Admin", "Community Admin", "Event Reporting", "Disaster Head", "Fund Head", "Civil Response Head" }));

        loginButton.setBackground(new java.awt.Color(173, 79, 79));
        loginButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Don't Have an Account?");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        signUpLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpLabel.setText("SIGN UP");
        signUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(475, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(userTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(userTypeDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(signUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTypeDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(243, 243, 243))
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

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       
String userName = userNameTextField.getText();
        String password = passwordField.getText();
        int userTypeIndex = userTypeDropBox.getSelectedIndex();
       // UserListDirectory userListDirectory = new UserListDirectory();
       // System.out.println("index = " +userTypeIndex);
        Role role = null;
        Component comp = null;
        RbacApplicationContext rbacApplicationContext = RbacApplicationContext.getInstance();
        boolean checkuserValidation = false;
        
        try {
            if(QueryExecutor.validateCreds(userName, password))
            {
                switch (userTypeIndex) {
                    case 0:
                        role = new SystemAdminRoleBase();
                        rbacApplicationContext.setRoleContext(role);
                        //comp= new AllDirectoriesPanel();
                        break;
                    case 1:
                        role = new SiteReportingEmployeeRoleBase();
                        rbacApplicationContext.setRoleContext(role);
                        comp = new ManageDisasterWorkspacePanel();
                        
                        break;
                    case 2:
                        role = new DisasterManagementHeadRoleBase();
                        rbacApplicationContext.setRoleContext(role);
                        // comp= new DoctorPanel();
                        break;
                    case 3:
                        role = new CivilResponseRoleBase();
                        rbacApplicationContext.setRoleContext(role);
                        // comp = new HospitalAdminPanel();
                        break;
                    case 4:
                        role = new FundRaiserRoleBase();
                        rbacApplicationContext.setRoleContext(role);
                        comp = new FundRaiserPanel();
                        break;
                        
                    case 5:
                        role = new HospitalAdminRoleBase();
                        rbacApplicationContext.setRoleContext(role);
                        // comp = new CommunityAdminPanel();
                        break;
                        
                        
                    case 6:
                        role = new PatientRoleBase();
                        rbacApplicationContext.setRoleContext(role);
                        // comp = new CommunityAdminPanel();
                        break;
                        
                        
                    case 7:
                        role = new DoctorRoleBase();
                        rbacApplicationContext.setRoleContext(role);
                        // comp = new CommunityAdminPanel();
                        break;
                        
                    case 8:
                        role = new PharmacyRoleBase();
                        rbacApplicationContext.setRoleContext(role);
                        // comp = new CommunityAdminPanel();
                        break;
                        
                        
                    case 9:
                        role = new RecordsRoleBase();
                        rbacApplicationContext.setRoleContext(role);
                        // comp = new CommunityAdminPanel();
                        break;
                        
                    case 10:
                        role = new DonoRoleBase();
                        rbacApplicationContext.setRoleContext(role);
                        comp=new DonateFundsPanel();
                        
                        
                    default:
                        
                        break;
                }
                
                // rbacApplicationContext.setUser(userListDirectory.getUser(userName, userTypeIndex));
                
                JOptionPane.showMessageDialog(this, "Login Successful");
                
                
                MainJFrame.mainPanel.removeAll();
                // MainJFrame.mainPanel.add(new SignupPanel());
                MainJFrame.mainPanel.add(comp);
                MainJFrame.mainPanel.repaint();
                MainJFrame.mainPanel.revalidate();
                
                
                
            } else{
                JOptionPane.showMessageDialog(this, "Login Failed try again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
           

    }//GEN-LAST:event_loginButtonActionPerformed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MousePressed

    private void signUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpLabelMouseClicked

    private void signUpLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMousePressed
        // TODO add your handling code here:
       MainJFrame.mainPanel.removeAll();
       MainJFrame.mainPanel.add(new SignupPanel());
       MainJFrame.mainPanel.repaint();
       MainJFrame.mainPanel.revalidate();
       
    }//GEN-LAST:event_signUpLabelMousePressed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JComboBox<String> userTypeDropBox;
    private javax.swing.JLabel userTypeLabel;
    // End of variables declaration//GEN-END:variables
}
