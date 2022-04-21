/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserUI;

import PetCareUI.PetAppointmentView;
import java.awt.CardLayout;
import javax.swing.JPanel;
import onlinepetstore.MyPets;
import onlinepetstore.MyPetsList;
import onlinepetstore.OnlineStore;
import onlinepetstore.PetCareAppointment;
import onlinepetstore.PetDirectory;
import onlinepetstore.PricingDirectory;
import onlinepetstore.User;

/**
 *
 * @author moukthikamanapati
 */
public class PetCareServices extends javax.swing.JPanel {

    /**
     * Creates new form PetCareServices
     */
//    public PetCareServices() {
//        initComponents();
//    }
PetDirectory petDirectory;
JPanel userProcess;
PricingDirectory pricingDirectory;
User user;
PetCareAppointment papp;
    private OnlineStore os;
    private MyPetsList mypets;
    PetCareServices(JPanel userProcess, PetDirectory petDirectory, PricingDirectory pricingDirectory,User user,PetCareAppointment papp) {
       initComponents();
       this.userProcess = userProcess;
       this.petDirectory = petDirectory;
       this.user = user;
       this.pricingDirectory = pricingDirectory;
       this.papp = papp;
    }

    PetCareServices(JPanel userProcess, OnlineStore os,User user) {
       initComponents();
       this.userProcess = userProcess;
       this.os =os;
       this.papp = os.getPapp();
    this.user = user;
  this.mypets = os.getMypetList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrooming = new javax.swing.JButton();
        BtnTraining = new javax.swing.JButton();
        service = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(123, 69, 12));

        BtnGrooming.setBackground(new java.awt.Color(255, 255, 204));
        BtnGrooming.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        BtnGrooming.setText("Grooming");
        BtnGrooming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGroomingActionPerformed(evt);
            }
        });

        BtnTraining.setBackground(new java.awt.Color(255, 255, 204));
        BtnTraining.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        BtnTraining.setText("Training");
        BtnTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTrainingActionPerformed(evt);
            }
        });

        service.setLayout(new java.awt.CardLayout());

        Back.setBackground(new java.awt.Color(255, 255, 204));
        Back.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        jButton1.setText("App");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Back)
                        .addGap(264, 264, 264))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(BtnGrooming)
                .addGap(141, 141, 141)
                .addComponent(BtnTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(407, 407, 407))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGrooming, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGroomingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGroomingActionPerformed
        Grooming gr = new Grooming(service,os,user);
        service.add("Grooming", gr);
        CardLayout layout = (CardLayout) service.getLayout();
        layout.next(service);     
    }//GEN-LAST:event_BtnGroomingActionPerformed

    private void BtnTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTrainingActionPerformed
        Training tr = new Training(service,os,user);
        service.add("training", tr);
        CardLayout layout = (CardLayout) service.getLayout();
        layout.next(service);  
    }//GEN-LAST:event_BtnTrainingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           os.setMypetList(mypets);
           os.setPapp(papp);
           this.user = user;
        PetAppointmentView pr = new PetAppointmentView(service,os,user);
        service.add("PetAppointmentView", pr);
        CardLayout layout = (CardLayout) service.getLayout();
        layout.next(service); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       
         os.setMypetList(mypets);
         for(MyPets p:mypets.getPetsList()){
             System.out.println("hello mypets"+ p.getPet().getPetName());
         }
        os.setPapp(papp);
       UserWorkArea uw = new UserWorkArea(userProcess, os, user);

//               UserWorkArea uw = new UserWorkArea(userprocess, petDirectory, currentorder, clothingDirectory, pricingDirectory, userDirectory, user, doclist, apphis, adl, foodList, medList, merchList,papp);
            userProcess.add("UserWorkArea", uw);
            CardLayout layout = (CardLayout) userProcess.getLayout();
            layout.next(userProcess);
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton BtnGrooming;
    private javax.swing.JButton BtnTraining;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel service;
    // End of variables declaration//GEN-END:variables
}
