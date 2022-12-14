
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rbac.application.user.UserListDirectory;
import rbac.context.RbacApplicationContext;
import rbac.role.Role;
import rbac.roles.roleImplementation.ArmyEmployeeRoleBase;
import rbac.roles.roleImplementation.ArmyheadRoleBase;
import rbac.roles.roleImplementation.CivilResponseRoleBase;
import rbac.roles.roleImplementation.CommunityAdminRoleBase;
import rbac.roles.roleImplementation.DisasterManagementHeadRoleBase;
import rbac.roles.roleImplementation.DoctorRoleBase;
import rbac.roles.roleImplementation.DonoRoleBase;
import rbac.roles.roleImplementation.FundRaiserRoleBase;
import rbac.roles.roleImplementation.HospitalAdminRoleBase;
import rbac.roles.roleImplementation.NavyEmployeeRoleBase;
import rbac.roles.roleImplementation.NavyHeadRoleBase;
import rbac.roles.roleImplementation.PatientRoleBase;
import rbac.roles.roleImplementation.PharmacyRoleBase;
import rbac.roles.roleImplementation.PoliceEmployeeRoleBase;
import rbac.roles.roleImplementation.PoliceHeadRoleBase;
import rbac.roles.roleImplementation.RecordsRoleBase;
import rbac.roles.roleImplementation.SiteReportingEmployeeRoleBase;
import rbac.roles.roleImplementation.SystemAdminRoleBase;
import ui.SingUp.RoleSignUpPanel;
import ui.fundraiser.DonateFundsPanel;
import ui.fundraiser.FundRaiserPanel;
import ui.hospital.CommunityAdminPanel;
import ui.hospital.DoctorPanel;
import ui.hospital.DoctorPanel;
import ui.hospital.HospitalAdminPanel;
import ui.hospital.PatientPanel;
import ui.hospital.PharmacyPanel;
import ui.SingUp.UserDetailsSignUpPanel;
import ui.SingUp.UserNamePassPanel;

import ui.hospital.SystemAdminPanel;

import ui.army.ArmyDashboardPanel;
import ui.army.ArmyEmpDashboardPanel;
import ui.navy.NavyDashboardPanel;
import ui.navy.NavyEmpDashboardPanel;
import ui.police.PoliceDashboardPanel;
import ui.police.PoliceEmpDashboardPanel;


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
        roles.add("Civil Response ");
        roles.add("Fund Raising");
        roles.add("Hopsital Admin");
        roles.add("Patient");
        roles.add("Doctor");
        roles.add("Pharmacy");
        roles.add("Charity");
        roles.add("Community Admin");
        roles.add("Army head");
        roles.add("Army Employee");
        roles.add("Police Head");
        roles.add("Police Employee");
        roles.add("Navy Head");
        roles.add("Navy Employee");
        
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
private void userNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {                                              
        // TODO add your handling code here:
        String cona = "^[a-z A-Z]{0,30}$";
        Pattern ptt = Pattern.compile(cona);
        Matcher mat = ptt.matcher(userNameTextField.getText());
        if(!mat.matches()){
            msgLabel1.setText("Username should start with a letter!");
           
        }
        else{
            msgLabel1.setText(null);
            
        }
    }

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {                                          
        // TODO add your handling code here:
        
        String conb = "^[a-zA-Z0-9]{0,50}@[0-9]{0,3}$"; //will show error message when password doesnot accept this expression
        Pattern ptt = Pattern.compile(conb);
        Matcher mat = ptt.matcher(passwordField.getText());
        if(!mat.matches()){
            msgLabel2.setText("<html>Password should contain the following:<br/>1. An upper case letter.<br/>2. A lower case letter.<br/>3. A special character and a number.</html>");
           
            
        }
        else{
            msgLabel2.setText(null);
          
        }
         
    }
private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
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
        forgotPasswordLabel = new javax.swing.JLabel();
        msgLabel1 = new javax.swing.JLabel();
        msgLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN IN");

        userTypeLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        userTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        userTypeLabel.setText("USER TYPE");

        jLabel4.setBackground(new java.awt.Color(220, 245, 228));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");

        userTypeDropBox.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        userTypeDropBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Patient", "Doctor", "Hospital Admin", "Community Admin", "Event Reporting", "Disaster Head", "Fund Head", "Civil Response Head" }));

        userNameTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });
        userNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userNameTextFieldKeyReleased(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(173, 79, 79));
        loginButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
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

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Don't Have an Account?");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        signUpLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
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

        forgotPasswordLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        forgotPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        forgotPasswordLabel.setText("Forgot Password");
        forgotPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                forgotPasswordLabelMousePressed(evt);
            }
        });

        msgLabel1.setForeground(new java.awt.Color(255, 255, 255));

        msgLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DISASTER MANAGEMENT SYSTEM");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1249, 1249, 1249)
                        .addComponent(msgLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(577, 577, 577)
                        .addComponent(signUpLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(forgotPasswordLabel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(347, 347, 347)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(100, 100, 100)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordField)
                                .addComponent(userNameTextField)
                                .addComponent(userTypeDropBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(230, 230, 230))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(msgLabel1)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTypeLabel)
                    .addComponent(userTypeDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(99, 99, 99)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signUpLabel)
                .addGap(18, 18, 18)
                .addComponent(forgotPasswordLabel)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       
String userName = userNameTextField.getText();
        String password = passwordField.getText();
        int userTypeIndex = userTypeDropBox.getSelectedIndex();
        UserListDirectory userListDirectory = new UserListDirectory();
       // System.out.println("index = " +userTypeIndex);
        Role role = null;
        Component comp = null;
        RbacApplicationContext rbacApplicationContext = RbacApplicationContext.getInstance();
        boolean checkuserValidation = false;
        
        if (userName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter credentials");
            return;

        }
        //if(QueryExecutor.validateCreds(userName, password))
        if(userListDirectory.checkUserValidation(userName, password, userTypeIndex))
        {
            switch (userTypeIndex) {
                case 0:
                    role = new SystemAdminRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    comp= new SystemAdminPanel();
                    break;
                case 1:
                    role = new SiteReportingEmployeeRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    comp = new DisasterReportingDashboardPanel();
                    break;
                case 2:
                    role = new CivilResponseRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                     comp = new CivilResponseDashboardPanel();
                    break;
                case 3:
                    role = new FundRaiserRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    comp = new FundRaiserPanel();
                    break;
                    
                case 4:
                    role = new HospitalAdminRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    comp = new HospitalAdminPanel();
                    break;
                    
                    
                case 5:
                    role = new PatientRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    comp = new PatientPanel();
                    break;
                    
                    
                case 6:
                    role = new DoctorRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    comp = new DoctorPanel();
                    break;
                    
                case 7:
                    role = new PharmacyRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    comp = new PharmacyPanel();
                    break;
                    
                   
                    
                case 8:
                    role = new DonoRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    
                    comp=new DonateFundsPanel();
                    break;
                    
                case 9:
                    role = new CommunityAdminRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    comp=new CommunityAdminPanel();
                    break;
                case 10:
                    role = new ArmyheadRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    comp = new ArmyDashboardPanel();
                    break;
                case 11:
                    role = new ArmyEmployeeRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    rbacApplicationContext.setUser(userListDirectory.getUser(userName, userTypeIndex));
                    comp = new ArmyEmpDashboardPanel(1);
                    break;
                    
                case 12:
                    role = new PoliceHeadRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    rbacApplicationContext.setUser(userListDirectory.getUser(userName, userTypeIndex));
                    comp = new PoliceDashboardPanel();
                    break;
                    
                 case 13:
                    role = new PoliceEmployeeRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    rbacApplicationContext.setUser(userListDirectory.getUser(userName, userTypeIndex));
                    comp = new PoliceEmpDashboardPanel();
                    break;
                    
                  case 14:
                    role = new NavyHeadRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    rbacApplicationContext.setUser(userListDirectory.getUser(userName, userTypeIndex));
                    comp = new NavyDashboardPanel();
                    break;
                    
                   case 15:
                    role = new NavyEmployeeRoleBase();
                    rbacApplicationContext.setRoleContext(role);
                    rbacApplicationContext.setUser(userListDirectory.getUser(userName, userTypeIndex));
                    comp = new NavyEmpDashboardPanel();
                    break;
                    
                default:
                    break;
            }
            

            rbacApplicationContext.setUser(userListDirectory.getUser(userName, userTypeIndex));

            JOptionPane.showMessageDialog(this, "Login Successful");
            
            
            MainJFrame.mainPanel.removeAll();
            // MainJFrame.mainPanel.add(new SignupPanel());
            MainJFrame.mainPanel.add(comp);
            MainJFrame.mainPanel.repaint();
            MainJFrame.mainPanel.revalidate();
            
            
            
        } else{
            JOptionPane.showMessageDialog(this, "Login Failed try again");
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
       MainJFrame.mainPanel.add(new RoleSignUpPanel());
       MainJFrame.mainPanel.repaint();
       MainJFrame.mainPanel.revalidate();
       
    }//GEN-LAST:event_signUpLabelMousePressed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonMouseClicked

    private void forgotPasswordLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordLabelMousePressed
        // TODO add your handling code here:
        
         MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new ResetCredsPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
    }//GEN-LAST:event_forgotPasswordLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgotPasswordLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel msgLabel1;
    private javax.swing.JLabel msgLabel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JComboBox<String> userTypeDropBox;
    private javax.swing.JLabel userTypeLabel;
    // End of variables declaration//GEN-END:variables

    private Component ArmyEmpDashboardPanel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
