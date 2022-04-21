/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserUI;

import db4o.Email;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import onlinepetstore.ClothingDirectory;
import onlinepetstore.DoctorList;
import onlinepetstore.FoodList;
import onlinepetstore.MedicineList;
import onlinepetstore.MerchOrderList;
import onlinepetstore.OnlineStore;
import onlinepetstore.Pet;
import onlinepetstore.PetDirectory;
import onlinepetstore.PricingDirectory;
import onlinepetstore.User;
import onlinepetstore.UserDirectory;
import ui.MainJFrame;

/**
 *
 * @author moukthikamanapati
 */
public class RegisterUser extends javax.swing.JPanel {

    /**
     * Creates new form RegisterUser
     */
//    public RegisterUser() {
//        initComponents();
//    }
    JPanel userprocess;
    UserDirectory userDirectory;
    PetDirectory petDirectory;
    DoctorList doclist;
    ClothingDirectory clothingDirectory;
    FoodList foodList;
    MedicineList medList;
    MerchOrderList merchList;
    PricingDirectory pricingDirectory;
    OnlineStore os;

    public RegisterUser(JPanel userprocess, UserDirectory userDirectory, PetDirectory petDirectory, DoctorList doclist, ClothingDirectory clothingDirectory, PricingDirectory pricingDirectory, FoodList foodList, MedicineList medList, MerchOrderList merchList, OnlineStore os) {
        initComponents();
        this.userprocess = userprocess;
        this.userDirectory = userDirectory;
        this.petDirectory = petDirectory;
        this.doclist = doclist;
        this.clothingDirectory = clothingDirectory;
        this.pricingDirectory = pricingDirectory;
        this.foodList = foodList;
        this.medList = medList;
        this.os = os;
        this.merchList = merchList;

    }

    public RegisterUser(JPanel userprocess, OnlineStore os) {
        initComponents();
        this.userprocess = userprocess;
        this.os = os;
        userDirectory = os.getUserDirectory();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        BTnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Btnreg = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(123, 69, 12));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Get Registered!!");

        BTnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        BTnBack.setText("BACK");
        BTnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(225, 219, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Password");

        txtusername.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        txtpass.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        txtemail.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("email");

        Btnreg.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        Btnreg.setText("SignUp");
        Btnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnregActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btnreg, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txtpass, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(Btnreg, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/WhatsApp Image 2022-05-01 at 3.51.43 AM.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed
 private boolean checkifexists(String username) {

        for (User p : userDirectory.getUserList()) {
            if (p.getUsername().equalsIgnoreCase(username)) {
                return false;
            }
        }
        return true;

    }
    private void BtnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnregActionPerformed

       String email;
         String username;
         String password;
        try {
         email = String.valueOf(txtemail.getText());
         username = String.valueOf(txtusername.getText());
         password = String.valueOf(txtpass.getText());
          if (email.equals("") || username.equals("") || password.equals("") ) {
                JOptionPane.showMessageDialog(this, "Please check if you have entered all the values", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        if (userDirectory == null) {
            userDirectory = new UserDirectory();
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check if you have entered all the values", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         if (!checkifexists(username)) {
            JOptionPane.showMessageDialog(this, "Enter Unique username name ");
            return;
        }
        User user = userDirectory.addUser();
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);
        // user.getPet();
        JOptionPane.showMessageDialog(null, "user Registered Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
        txtemail.setText("");
        txtusername.setText("");
        txtpass.setText("");
         Email e = new Email();
        
       String body = "Thank you for Registering to OnlinePetStore";
        //String body = " your pet is on the way :) ";
       e.sendMail(email, "Registration", body);

    }//GEN-LAST:event_BtnregActionPerformed

    private void BTnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTnBackActionPerformed
        os.setUserDirectory(userDirectory);

        new MainJFrame(os).setVisible(true);

    }//GEN-LAST:event_BTnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTnBack;
    private javax.swing.JButton Btnreg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
