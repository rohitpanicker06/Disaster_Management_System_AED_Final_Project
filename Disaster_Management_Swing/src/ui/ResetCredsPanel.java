/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import person.Person;
import rbac.application.user.User;
import rbac.application.user.UserListDirectory;
import emailSendingService.SendEmail;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import ui.SingUp.UserNamePassPanel;

/**
 *
 * @author rohitpanicker
 */
public class ResetCredsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResetCredsPanel
     */
    public ResetCredsPanel() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userNameTxtField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORGOT PASSWORD");

        jLabel6.setText("Username:");

        resetButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset Password");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
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

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:

        String userName = userNameTxtField.getText();
        Person person = null;
        if(UserListDirectory.getUserNameToPersonMap().containsKey(userName))
        {   
            person = UserListDirectory.getUserNameToPersonMap().get(userName);
            
        }else{
            JOptionPane.showMessageDialog(this, "Entered userName not found");
            return;
        }
         person = UserListDirectory.getUserNameToPersonMap().get(userName);
         User user = findUser(person);
         String password= user.getPassword();
        try {
            SendEmail.sendEmail("Username: "+userName +"\n" +" Password: " +password+" \n", person.getEmailid());
        } catch (MessagingException ex) {
            Logger.getLogger(ResetCredsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(this, "Your password has been emailed to " + person.getEmailid());
        
         MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new LoginPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
       
        
    }//GEN-LAST:event_resetButtonActionPerformed
public  User findUser(Person person) {
        User userog = null;
       
        for(User user: UserListDirectory.getCommunityAdminList())
        {
           if(user.getPerson().equals(person))
           {
               userog=user;
               return userog;
               
           }
               
        }
        
        for(User user: UserListDirectory.getDoctorUserList())
        {
           if(user.getPerson().equals(person))
           {
              userog=user;
               return userog;
               
           }
               
        }
        
         for(User user: UserListDirectory.getHospitalAdminList())
        {
           if(user.getPerson().equals(person))
           {
              userog=user;
               return userog;
               
           }
               
        }
         
          for(User user: UserListDirectory.getPatientList())
        {
           if(user.getPerson().equals(person))
           {
               userog=user;
               return userog;
               
           }
               
        }
          
           for(User user: UserListDirectory.getSystemAdminList())
        {
           if(user.getPerson().equals(person))
           {
              userog=user;
               return userog;
               
           }
               
        }
           for (User user : UserListDirectory.getCommunityAdminList()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            
            for (User user : UserListDirectory.getEventReportingList()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            for (User user : UserListDirectory.getFundRaiserList()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            
            for (User user : UserListDirectory.getPharmacyList()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            
            for (User user : UserListDirectory.getDonor()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            
            for (User user : UserListDirectory.getCivilResponseList()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            
            for (User user : UserListDirectory.getArmyHeadList()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            
            for (User user : UserListDirectory.getArmyEmployeeList()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            for (User user : UserListDirectory.getNavyHeadList()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            
            for (User user : UserListDirectory.getNavyEmployeeList()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            
            for (User user : UserListDirectory.getPoliceHeadList()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            
            for (User user : UserListDirectory.getPoliceEmployeeList()) {
                if (user.getPerson().equals(person)) {
                    userog = user;
                    return userog;

                }

            }
            
        
        
    
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField userNameTxtField;
    // End of variables declaration//GEN-END:variables
}
