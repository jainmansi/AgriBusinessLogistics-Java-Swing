/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RetailerRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class RetailerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RetailerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    public RetailerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        viewReportsBtn = new javax.swing.JButton();
        manageWarehouseBtn = new javax.swing.JButton();
        manageOrdersBtn = new javax.swing.JButton();
        manageProdCatBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Retailer Work Area");

        viewReportsBtn.setBackground(new java.awt.Color(51, 51, 51));
        viewReportsBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        viewReportsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewReportsBtn.setText("View Reports >>");
        viewReportsBtn.setBorder(new javax.swing.border.MatteBorder(null));
        viewReportsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportsBtnActionPerformed(evt);
            }
        });

        manageWarehouseBtn.setBackground(new java.awt.Color(51, 51, 51));
        manageWarehouseBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        manageWarehouseBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageWarehouseBtn.setText("Manage Warehouse >>");
        manageWarehouseBtn.setBorder(new javax.swing.border.MatteBorder(null));
        manageWarehouseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageWarehouseBtnActionPerformed(evt);
            }
        });

        manageOrdersBtn.setBackground(new java.awt.Color(51, 51, 51));
        manageOrdersBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        manageOrdersBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageOrdersBtn.setText("Manage Orders >>");
        manageOrdersBtn.setBorder(new javax.swing.border.MatteBorder(null));
        manageOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersBtnActionPerformed(evt);
            }
        });

        manageProdCatBtn.setBackground(new java.awt.Color(51, 51, 51));
        manageProdCatBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        manageProdCatBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageProdCatBtn.setText("Manage Product Catalog >>");
        manageProdCatBtn.setBorder(new javax.swing.border.MatteBorder(null));
        manageProdCatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProdCatBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/RetailerRole/tomatoKing.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageWarehouseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageProdCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageOrdersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewReportsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(257, 257, 257))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(manageProdCatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(manageWarehouseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(manageOrdersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(viewReportsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(410, 410, 410))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewReportsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportsBtnActionPerformed
        ViewReportJPanel viewReportRetailerJPanel = new ViewReportJPanel(userProcessContainer, account, enterprise);
        userProcessContainer.add("viewReportRetailerJPanel", viewReportRetailerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewReportsBtnActionPerformed

    private void manageWarehouseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageWarehouseBtnActionPerformed
        ManageInventoryJPanel manageInventoryRetailerJPanel = new ManageInventoryJPanel(userProcessContainer, account, enterprise);
        userProcessContainer.add("manageInventoryRetailerJPanel", manageInventoryRetailerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageWarehouseBtnActionPerformed

    private void manageProdCatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProdCatBtnActionPerformed
        ManageProductsJPanel manageProductsRetailerJPanel = new ManageProductsJPanel(userProcessContainer, account, enterprise);
        userProcessContainer.add("manageProductsRetailerJPanel", manageProductsRetailerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProdCatBtnActionPerformed

    private void manageOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersBtnActionPerformed
        ManageOrdersJPanel manageOrdersRetailerJPanel = new ManageOrdersJPanel(userProcessContainer, account, enterprise);
        userProcessContainer.add("manageOrdersRetailerJPanel", manageOrdersRetailerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrdersBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageOrdersBtn;
    private javax.swing.JButton manageProdCatBtn;
    private javax.swing.JButton manageWarehouseBtn;
    private javax.swing.JButton viewReportsBtn;
    // End of variables declaration//GEN-END:variables
}