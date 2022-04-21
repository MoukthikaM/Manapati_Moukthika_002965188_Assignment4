/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserUI;

import CartUI.CartPage;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import onlinepetstore.Clothing;
import onlinepetstore.ClothingDirectory;
import onlinepetstore.Food;
import onlinepetstore.FoodList;
import onlinepetstore.Medicine;
import onlinepetstore.MedicineList;
import onlinepetstore.MerchOrderList;
import onlinepetstore.Merchandise;
import onlinepetstore.MerchandiseList;
import onlinepetstore.OnlineStore;
import onlinepetstore.Order;
import onlinepetstore.OrderItemMerch;
import onlinepetstore.Pet;
import onlinepetstore.PetDirectory;
import onlinepetstore.User;
import ui.MainJFrame;

/**
 *
 * @author moukthikamanapati
 */
public class Merch extends javax.swing.JPanel {

    /**
     * Creates new form Merch
     */
    ClothingDirectory clothingDirectory;
    JPanel userProcess;
    FoodList foodList;
    MedicineList medList;
    MerchOrderList merchList;
PetDirectory petDirectory;
   Order currentorder;
    private OnlineStore os;
    private User user;
    MerchandiseList merchandiseList;
    MerchOrderList merchOrderList;
    private OrderItemMerch orderitemmerch;
    public Merch(JPanel userProcess, PetDirectory petDirectory, Order currentorder,ClothingDirectory clothingDirectory, FoodList foodList, MedicineList medList, MerchOrderList merchList) {
        initComponents();
        this.userProcess = userProcess;
        this.clothingDirectory = clothingDirectory;
        this.foodList = foodList;
        this.medList = medList;
        this.merchList = merchList;
        this.petDirectory = petDirectory;
        this.currentorder = currentorder;
        populateTable();
        populatecmb();
    }

    Merch(JPanel userProcess, OnlineStore os,User user) {
        
        initComponents();
        this.userProcess = userProcess;
        this.os = os;
        this.clothingDirectory = os.getClothingDirectory();
        this.foodList = os.getFoodList();
        this.medList = os.getMedList();
        this.currentorder = os.getOrder();
        this.user = user;
        this.merchandiseList = os.getMerchandiseList();
        this.merchOrderList = os.getMerchList();
        
        populateTable();
        populatecmb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblCloth = new javax.swing.JTable();
        back = new javax.swing.JButton();
        cart = new javax.swing.JButton();
        btncart = new javax.swing.JButton();
        cmbMerchType = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(123, 69, 12));

        TblCloth.setBackground(new java.awt.Color(219, 210, 196));
        TblCloth.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "price", "Quant"
            }
        ));
        TblCloth.setRowHeight(18);
        jScrollPane1.setViewportView(TblCloth);

        back.setBackground(new java.awt.Color(255, 255, 204));
        back.setFont(new java.awt.Font("Marker Felt", 0, 18)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        cart.setBackground(new java.awt.Color(255, 255, 204));
        cart.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        cart.setText("CART");
        cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartActionPerformed(evt);
            }
        });

        btncart.setBackground(new java.awt.Color(255, 255, 204));
        btncart.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        btncart.setText("Add to Cart");
        btncart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncartActionPerformed(evt);
            }
        });

        cmbMerchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMerchType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMerchTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMerchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncart)
                        .addGap(403, 403, 403))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cart, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cmbMerchType, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(btncart, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMerchTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMerchTypeActionPerformed
        String merch = (String) cmbMerchType.getSelectedItem();

        if (merch==null) {
            populateTable();
        } else if (merch.equalsIgnoreCase(""))
            populateTable();
        else
            populateTable(merch);
    }//GEN-LAST:event_cmbMerchTypeActionPerformed

    private void btncartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncartActionPerformed

        int selectedrow = TblCloth.getSelectedRow();
        if (selectedrow < 0) {
            JOptionPane.showMessageDialog(this, "please select a product");
            return;
        }
        Merchandise merch = (Merchandise) TblCloth.getValueAt(selectedrow, 0);
       
         if(this.merchOrderList==null)
         {
             merchOrderList = new MerchOrderList();
         }
          orderitemmerch = merchOrderList.addOrderItemMerch();
           orderitemmerch.setMerch(merch);
       orderitemmerch.setUsername(user.getUsername());
       os.setMerchandiseList(merchandiseList);
        os.setMerchList(merchOrderList);
        for(OrderItemMerch m: merchOrderList.getMerchList()){
            System.out.println(m);
            System.out.println(m.getUsername());
        }
         
         
    }//GEN-LAST:event_btncartActionPerformed

    private void cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartActionPerformed
      // CartPage cp = new CartPage(userProcess, petDirectory, currentorder, clothingDirectory,merchList);
      CartPage cp = new CartPage(userProcess,os,user);
        userProcess.add("CartPage", cp);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_cartActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        UserWorkArea uw = new UserWorkArea(userProcess, os, user);

//               UserWorkArea uw = new UserWorkArea(userprocess, petDirectory, currentorder, clothingDirectory, pricingDirectory, userDirectory, user, doclist, apphis, adl, foodList, medList, merchList,papp);
            userProcess.add("UserWorkArea", uw);
            CardLayout layout = (CardLayout) userProcess.getLayout();
            layout.next(userProcess);
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblCloth;
    private javax.swing.JButton back;
    private javax.swing.JButton btncart;
    private javax.swing.JButton cart;
    private javax.swing.JComboBox<String> cmbMerchType;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) TblCloth.getModel();
        model.setRowCount(0);
        System.out.println("testing merch");
        //  System.out.println(p.getHouse().getCommunity().getCity().getCityName());
        for (Merchandise m : merchandiseList.getmerchandiseList()) {
                   
                    Object row[] = new Object[3];
                    row[0] = m;
                    row[1] = m.getPrice();
                    row[2] = m.getQuantity();

                    model.addRow(row);
                }
    }

    private void populateTable(String merch) {

        DefaultTableModel model = (DefaultTableModel) TblCloth.getModel();
        model.setRowCount(0);
       // System.out.println("testing merch");
      
           
                for (Merchandise m : merchandiseList.getmerchandiseList()) {
                   if (merch.equalsIgnoreCase(m.getMerchType())) {
                    Object row[] = new Object[3];
                    row[0] = m;
                    row[1] = m.getPrice();
                    row[2] = m.getQuantity();

                    model.addRow(row);
                }
           
            }

        }
    

    private void populatecmb() {
        cmbMerchType.removeAllItems();
        cmbMerchType.addItem("");
        cmbMerchType.addItem("clothing");
        cmbMerchType.addItem("food");
        cmbMerchType.addItem("medicine");

    }
}
