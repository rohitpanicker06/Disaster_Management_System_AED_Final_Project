/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SingUp;

import emailSendingService.SendEmail;
import house.House;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.doctor.Doctor;
import model.doctor.DoctorDirectory;
import model.hospital.Hospital;
import model.hospital.HospitalDirectory;
import model.patient.Patient;
import model.patient.PatientDirectory;
import model.state.city.community.CommunityDirectory;
import person.Person;
import person.PersonDirectory;
import rbac.application.user.User;
import rbac.application.user.UserListDirectory;
import ui.MainJFrame;
import ui.OtpVerificationPanel;
import us.state.city.City;
import us.state.city.community.Community;
import utility.ValidationHelper;

/**
 *
 * @author rohitpanicker
 */
public class UserNamePassPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserNamePassPanel
     */
    String userName;
    String password;
    int selectedIndex;
    int id;
    int age;
    String  name;
    String email;
    String phoneNumber;
    String gender;
    Image globalImage;
    String insuranceId;
    Hospital hospital;
    String city;
    String communityName;
    String state;
    String zipCode;
    String Country;
    String address;
    public UserNamePassPanel( int selectedIndex, int id, int age,String  name, String email, String phoneNumber, String gender,Image globalImage,String insuranceId,Hospital hospital,String city, String communityName, String state, String zipCode, String Country, String address) {
        initComponents();
        setOpaque(false);
        this.selectedIndex = selectedIndex;
        this.id = id;
        this.age= age;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.globalImage = globalImage;
        this.insuranceId = insuranceId;
        this.hospital = hospital;
        this.city = city;
        this.communityName = communityName;
        this.state = state;
        this.zipCode = zipCode;
        this.Country = Country;
        this.address= address;
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
        userNameTxtField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");

        userNameTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SIGN UP ");

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(312, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userNameTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(359, 359, 359))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userNameTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
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

    private void userNameTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int errorCount =0;
       StringBuffer errorNotifier = new StringBuffer();
       

        if(ValidationHelper.checkUsername(userNameTxtField1.getText())){
            
         if(ValidationHelper.checkIfUserNameIsUnique(userNameTxtField1.getText(), selectedIndex))
            {
                userName = userNameTxtField1.getText();
            }else{
                 errorCount++;
                errorNotifier.append(errorCount).append(". This username already exists, please choose another\n");
            }
        }
         else{
                    
           errorCount++;
        errorNotifier.append(errorCount).append("Please enter a valid username. It cannot start with a number.\n");
        
                 }
            

        if(passwordTxtField.getText()!= null)
            {
                if(ValidationHelper.checkStrongPassword(passwordTxtField.getText())){
                    password = passwordTxtField.getText();
                } else {
                    errorCount++;
                errorNotifier.append(errorCount).append(". Please enter password with one uppercase, one lowercase, one digit and one special character\n");
                }
                
            }else{
                 errorCount++;
                errorNotifier.append(errorCount).append(". Please enter password\n");
            }
        
         if(errorCount > 0 )
            {
                JOptionPane.showMessageDialog(this, errorNotifier.toString());
                return;
            }
        else{
        
          City cityx = new City(this.state, this.Country,  this.city);
            Community community = new Community(cityx, communityName, this.Country, zipCode);
            CommunityDirectory.communityList.add(community);
            House house = new House(community, 7, 8);
            Person person = new Person(String.valueOf(id), name, this.email, Long.parseLong(phoneNumber), house, gender, age, globalImage);
            PersonDirectory.personList.add(person);
            User newUser = new User(userName, password, person);
           
            
            switch (selectedIndex) {
                case 0:
                    UserListDirectory.getSystemAdminList().add(newUser);
                    break;
                case 1:
                    UserListDirectory.getEventReportingList().add(newUser);
                    break;
                case 2:
                     UserListDirectory.getCivilResponseList().add(newUser);
                   
                    break;
                case 3:
                    UserListDirectory.getFundRaiserList().add(newUser);
                    break;
                case 4:
                    UserListDirectory.getHospitalAdminList().add(newUser);
                    break;
                case 5:
                    UserListDirectory.getPatientList().add(newUser);
                    Hospital hospital_x =this.hospital;
                    Patient newPatient = new Patient(person, null, Integer.parseInt(insuranceId),hospital_x, null);
                    hospital_x.getPatientList().add(newPatient);
                    PatientDirectory.patientList.add(newPatient);
                    break;
                    
                case 6:
                    
                    Doctor doctor = new Doctor(person,hospital);
                    hospital.getDoctorList().add(doctor);
                    DoctorDirectory.doctorList.add(doctor);
                    UserListDirectory.getDoctorUserList().add(newUser);
                    break;
                    
                case 7:
                    UserListDirectory.getPharmacyList().add(newUser);
                    break;
                case 8:
                    UserListDirectory.getDoctorUserList().add(newUser);
                    break;
                case 9:
                     UserListDirectory.getCommunityAdminList().add(newUser);
                    break;
                      
                default:
                    break;
            }
             
        
         HashMap<String,Person> personToUserName =UserListDirectory.getUserNameToPersonMap();
                personToUserName.put(userName, person);
               
         try{
            int otp = SendEmail.sendEmail(userName, this.email);
                
            MainJFrame.mainPanel.removeAll();
            MainJFrame.mainPanel.add(new ui.OtpVerificationPanel(otp, userName,password, this.email));
            MainJFrame.mainPanel.repaint();
            MainJFrame.mainPanel.revalidate();
                }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "Unable to send OTP, PLease try later");
                }

  
         }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JTextField userNameTxtField1;
    // End of variables declaration//GEN-END:variables
}
