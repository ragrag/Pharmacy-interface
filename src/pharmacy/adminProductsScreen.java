/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ragrag
 */
public class adminProductsScreen extends javax.swing.JFrame {

    /**
     * Creates new form adminProductsScreen
     */
    Pharmacy p;
    Admin admin;
    Customer customer;
    
    public adminProductsScreen(Pharmacy p,Admin admin,Customer customer) {
        this.p = p;
        this.admin =admin;
        this.customer = customer;
        initComponents();
  
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

        backBtn = new javax.swing.JButton();
        prodID = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        String col[] = {"ID","Name","Price","Stock","Expiry"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        jTable1 = new javax.swing.JTable(tableModel);
        writeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        prodID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodIDActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add Product");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        for (int i=0;i<p.productList.size();i++)
        {
            String name  = p.productList.get(i).getProductName();
            String price = String.valueOf(p.productList.get(i).getPrice());
            String stock = p.productList.get(i).getStock();
            String ed = p.productList.get(i).getExpiryDate();
            Object[] data = {i+1,name,price,stock,ed};
            tableModel.addRow(data);

        }
        jScrollPane2.setViewportView(jTable1);

        writeBtn.setText("Write Products To File");
        writeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(writeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(prodID, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(backBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(writeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn))
                .addGap(28, 28, 28)
                .addComponent(backBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       int id = Integer.valueOf(prodID.getText()) - 1;
       p.productList.remove(id);
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminProductsScreen(p,admin,customer);
            }
        });
        this.dispose();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminScreen(p,admin,customer);
            }
        });
        this.dispose(); 
    }//GEN-LAST:event_backBtnActionPerformed

    private void prodIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodIDActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
    
    int id;
    String productName;
    String type;
    String expiryDate;
    int price;
    int quantity;
        
    id = Integer.valueOf(JOptionPane.showInputDialog(this, "Enter Product ID", ""));
    productName = JOptionPane.showInputDialog(this, "Enter Product Name", "");
    type = JOptionPane.showInputDialog(this, "Enter Product Type", "");
    expiryDate = JOptionPane.showInputDialog(this, "Enter Product Expiry Date", "");
    price = Integer.valueOf(JOptionPane.showInputDialog(this, "Enter Product Price", ""));
    quantity = Integer.valueOf(JOptionPane.showInputDialog(this, "Enter Product Quantity", ""));
    Product pobj = new Product(id,productName,type,expiryDate,price,quantity,p);
    
    
    JOptionPane.showMessageDialog(this, "Product Added Successfully");
     
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new adminProductsScreen(p,admin,customer);
        }
    });
    this.dispose();
    }//GEN-LAST:event_addBtnActionPerformed

    private void writeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeBtnActionPerformed

            FileWriter writer = null; 
        try {
            writer = new FileWriter("products.txt");
            for(Product product: p.productList) {
                writer.write(product.toString()+"\r\n");
            }
            writer.close();        // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(adminOrdersScreen.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(adminOrdersScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        JOptionPane.showMessageDialog(this, "Products Written Successfully To File products.txt");
        // TODO add your handling code here:
    }//GEN-LAST:event_writeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField prodID;
    private javax.swing.JButton writeBtn;
    // End of variables declaration//GEN-END:variables
}