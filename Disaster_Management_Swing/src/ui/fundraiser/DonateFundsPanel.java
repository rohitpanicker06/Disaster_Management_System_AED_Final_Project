/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.fundraiser;

import Disaster.Disaster;
import Disaster.DisasterDirectory;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.fundraiser.DisasterFundRaiser;
import model.fundraiser.FundRaiserDirectory;
import rbac.context.RbacApplicationContext;
import ui.LoginPanel;
import ui.MainJFrame;

/**
 *
 * @author rohitpanicker
 */
public class DonateFundsPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonateFundsPanel
     */
    
     private static ArrayList<String>currencyList = new ArrayList<>();
    static{
        currencyList.add("INR");
        currencyList.add("USD");
        currencyList.add("EUR");
        currencyList.add("CAD");
        
    }
    public DonateFundsPanel() {
        initComponents();
        setOpaque(false);
        setLabels(false);

        populateComboBox();
        
    }
    
    public void populateComboBox()
    {   
        try{
        disasterComboBox.removeAllItems();
        for(Disaster disaster: new DisasterDirectory().getDisasterList())
        {
            disasterComboBox.addItem(disaster.toString());

        }
        
        currencyComboBox.removeAllItems();
        for(String cur: currencyList)
        {
            currencyComboBox.addItem(cur);
        }
        }catch(Exception e)
        {
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        disasterComboBox = new javax.swing.JComboBox<>();
        currencyLabel = new javax.swing.JLabel();
        currencyComboBox = new javax.swing.JComboBox<>();
        currencyAmountTxtBox = new javax.swing.JTextField();
        progressBar = new javax.swing.JProgressBar();
        moneyRaisedLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        donateBtn = new javax.swing.JButton();
        televisionCheckBox = new javax.swing.JCheckBox();
        radioCheckBox = new javax.swing.JCheckBox();
        socialMediaCheckBox = new javax.swing.JCheckBox();
        whereLabel = new javax.swing.JLabel();
        goBtn = new javax.swing.JButton();
        logoutLabel = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Disaster ");

        disasterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        disasterComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                disasterComboBoxItemStateChanged(evt);
            }
        });
        disasterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disasterComboBoxActionPerformed(evt);
            }
        });

        currencyLabel.setBackground(new java.awt.Color(255, 255, 255));
        currencyLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        currencyLabel.setForeground(new java.awt.Color(255, 255, 255));
        currencyLabel.setText("Currency");

        currencyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        currencyAmountTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyAmountTxtBoxActionPerformed(evt);
            }
        });

        moneyRaisedLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        moneyRaisedLabel.setForeground(new java.awt.Color(255, 255, 255));
        moneyRaisedLabel.setText("Money Raised");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        donateBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        donateBtn.setForeground(new java.awt.Color(255, 255, 255));
        donateBtn.setText("DONATE");
        donateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateBtnActionPerformed(evt);
            }
        });

        televisionCheckBox.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        televisionCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        televisionCheckBox.setText("Television");
        televisionCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                televisionCheckBoxActionPerformed(evt);
            }
        });

        radioCheckBox.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        radioCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        radioCheckBox.setText("Radio");
        radioCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCheckBoxActionPerformed(evt);
            }
        });

        socialMediaCheckBox.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        socialMediaCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        socialMediaCheckBox.setText("Social Media");
        socialMediaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socialMediaCheckBoxActionPerformed(evt);
            }
        });

        whereLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        whereLabel.setForeground(new java.awt.Color(255, 255, 255));
        whereLabel.setText("Where did you know about thie event? ");

        goBtn.setText("Go");
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(currencyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(moneyRaisedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                            .addComponent(whereLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(322, 322, 322)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(currencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(televisionCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radioCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(socialMediaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(currencyAmountTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(donateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(goBtn)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addComponent(disasterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(260, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(goBtn)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currencyAmountTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currencyLabel))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(televisionCheckBox)
                    .addComponent(radioCheckBox)
                    .addComponent(socialMediaCheckBox)
                    .addComponent(whereLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(moneyRaisedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(donateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(disasterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(477, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void disasterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disasterComboBoxActionPerformed
        // TODO add your handling code here:
        
       /* String disaster = (String) disasterComboBox.getSelectedItem();
        Disaster event = getDisasterEventFromName(disaster);
        DisasterFundRaiser fundraiser = getDisasterFundRaiser(event);
        
        if(fundraiser != null){
        
        long amountRaised = fundraiser.getAmountRaisedSoFar();
        
        long targetAmountNeeded = fundraiser.getTargetAmount();
        double percentageReached = (amountRaised/targetAmountNeeded)*100;
        
        progressBar.setVisible(true);
        progressBar.setValue((int) percentageReached);
        progressBar.setStringPainted(true);
        }*/
        
        
    }//GEN-LAST:event_disasterComboBoxActionPerformed

    private void currencyAmountTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyAmountTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currencyAmountTxtBoxActionPerformed

    private void donateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateBtnActionPerformed
        // TODO add your handling code here:
        try{
        String disaster = (String) disasterComboBox.getSelectedItem();
        Disaster event = getDisasterEventFromName(disaster);
        DisasterFundRaiser fundraiser = getDisasterFundRaiser(event);
       long amountRaised = Long.parseLong(currencyAmountTxtBox.getText());
       fundraiser.setAmountRaisedSoFar(fundraiser.getAmountRaisedSoFar()+amountRaised);
       JOptionPane.showMessageDialog(this, "Amount Donated Successfuly");
        }catch(Exception e)
        {
            
        }
       
       
    }//GEN-LAST:event_donateBtnActionPerformed

    private void televisionCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_televisionCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_televisionCheckBoxActionPerformed

    private void radioCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCheckBoxActionPerformed

    private void socialMediaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socialMediaCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_socialMediaCheckBoxActionPerformed

    private void disasterComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_disasterComboBoxItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_disasterComboBoxItemStateChanged

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        // TODO add your handling code here:
        setLabels(true);
        setProgressBar();
        goBtn.setVisible(true);
    }//GEN-LAST:event_goBtnActionPerformed

    private void logoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMousePressed
        // TODO add your handling code here:
        
        try{
        RbacApplicationContext rbacApplicationContext = RbacApplicationContext.getInstance();
        rbacApplicationContext.setRoleContext(null);
        rbacApplicationContext.setUser(null);
        JOptionPane.showMessageDialog(this, "Logged Out");
        MainJFrame.mainPanel.removeAll();
        MainJFrame.mainPanel.add(new LoginPanel());
        MainJFrame.mainPanel.repaint();
        MainJFrame.mainPanel.revalidate();
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_logoutLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField currencyAmountTxtBox;
    private javax.swing.JComboBox<String> currencyComboBox;
    private javax.swing.JLabel currencyLabel;
    private javax.swing.JComboBox<String> disasterComboBox;
    private javax.swing.JButton donateBtn;
    private javax.swing.JButton goBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel moneyRaisedLabel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JCheckBox radioCheckBox;
    private javax.swing.JCheckBox socialMediaCheckBox;
    private javax.swing.JCheckBox televisionCheckBox;
    private javax.swing.JLabel whereLabel;
    // End of variables declaration//GEN-END:variables

    private DisasterFundRaiser getDisasterFundRaiser(Disaster disaster) {
        try{
        ArrayList<DisasterFundRaiser> al = FundRaiserDirectory.fundRaiserDirectory;
     for(DisasterFundRaiser fundRaiser: al){
         
         if(fundRaiser.getDisaster().getDisasterEvent().equals(disaster.getDisasterEvent()))
         {
             return fundRaiser;
         }
     
    }
        }catch(Exception e)
        {
            
        }
    return null;
    
}

   private Disaster getDisasterEventFromName(String name) {
       try{
        for(Disaster disaster : new DisasterDirectory().getDisasterList())
        {
            if(disaster.getDisasterEvent().equals(name))
            {
                return disaster;
            }
        }
       }catch(Exception e)
        {
            
        }
        
        return null;
    }

    private void setLabels(boolean value) {
      
    currencyLabel.setVisible(value);
    whereLabel.setVisible(value);
    moneyRaisedLabel.setVisible(value);
    progressBar.setVisible(value);
    televisionCheckBox.setVisible(value);
    radioCheckBox.setVisible(value);
    socialMediaCheckBox.setVisible(value);
    donateBtn.setVisible(value);
    currencyAmountTxtBox.setVisible(value);
    currencyComboBox.setVisible(value);
   
    }

    private void setProgressBar() {
        try{
      
        String disaster = (String) disasterComboBox.getSelectedItem();
        Disaster event = getDisasterEventFromName(disaster);
        DisasterFundRaiser fundraiser = getDisasterFundRaiser(event);
        
        if(fundraiser != null){
        
        long amountRaised = fundraiser.getAmountRaisedSoFar();
        
        long targetAmountNeeded = fundraiser.getTargetAmount();
        double percentageReached = (((double)amountRaised)/((double)targetAmountNeeded))*100;
        int val = (int) percentageReached;
        
        progressBar.setValue(val);
        progressBar.setStringPainted(true);
        
    }
        }catch(Exception e)
        {
            
        }
}
    
    /*public static void main(String[] args) {
        long amount = 5000;
        long target = 50000;
         double val = (((double)amount)/((double)target))*100;
        System.out.println((int)val);
    }*/
}
