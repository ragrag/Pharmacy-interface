/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import javax.swing.JOptionPane;

/**
 *
 * @author ragrag
 */
public class adminScreen extends javax.swing.JFrame {

    /**
     * Creates new form adminScreen
     */
    
    Pharmacy p;
    Admin admin;
    Customer customer;
    
    public adminScreen(Pharmacy p,Admin admin,Customer customer) {
        initComponents();
        this.p = p;
        this.admin =admin;
        this.customer = customer;
        setVisible(true);
 
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        productsBtn = new javax.swing.JButton();
        ordersBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ADMIN");

        productsBtn.setText("Products");
        productsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsBtnActionPerformed(evt);
            }
        });

        ordersBtn.setText("Orders");
        ordersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ordersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(backBtn)))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(productsBtn)
                .addGap(18, 18, 18)
                .addComponent(ordersBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsBtnActionPerformed
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminProductsScreen(p,admin,customer);
            }
        });
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_productsBtnActionPerformed

    private void ordersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersBtnActionPerformed
   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminOrdersScreen(p,admin,customer);
            }
        });
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ordersBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainScreen(p,admin,customer);
            }
        });
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ordersBtn;
    private javax.swing.JButton productsBtn;
    // End of variables declaration//GEN-END:variables
}
