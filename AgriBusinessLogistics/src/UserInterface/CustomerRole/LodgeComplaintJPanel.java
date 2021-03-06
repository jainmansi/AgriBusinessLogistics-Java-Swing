/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.FDAOrganization;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.Sensors.RFID;
import Business.UserAccount.UserAccount;
import Business.Utils.MyStringVerifier;
import Business.WorkQueue.CustomerWorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class LodgeComplaintJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LodgeComplaintJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;

    public LodgeComplaintJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.network = network;
        populateProductCombo();
        MyStringVerifier myStringVerifier = new MyStringVerifier();
        issueTxtField.setInputVerifier(myStringVerifier);
    }

    public void populateProductCombo() {
        productComboBox.removeAllItems();

        HashSet<Product> hs = new HashSet<>();
        for (Order o : network.getMasterOrderCatalog().getOrderCatalog()) {
            if (o.getBuyer().equals(account)) {
                for (OrderItem oi : o.getOrderItemList()) {
                    hs.add(oi.getProduct());
                }

            }
        }
        for (Product p : hs) {
            productComboBox.addItem(p);
        }
    }

    public void populatePurchaseTable() {
        DefaultTableModel dtm = (DefaultTableModel) purchaseJTable.getModel();
        Product p = (Product) productComboBox.getSelectedItem();
        dtm.setRowCount(0);
        if (p != null) {
            for (Order o : network.getMasterOrderCatalog().getOrderCatalog()) {
                if (o.getBuyer().equals(account)) {
                    for (OrderItem oi : o.getOrderItemList()) {
                        if (oi.getProduct().equals(p)) {
                            for (RFID rfid : oi.getRfid()) {
                                Object row[] = new Object[3];
                                row[0] = rfid;
                                row[1] = o.getDate();
                                row[2] = o.getSeller();
                                dtm.addRow(row);
                            }
                        }
                    }
                }
            }
        }
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
        productComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        purchaseJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        complaintBtn = new javax.swing.JButton();
        issueTxtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Lodge Complaints Here");

        productComboBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        productComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Product:");

        purchaseJTable.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        purchaseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFID", "Date", "Seller"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(purchaseJTable);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Brief Description of issues:");

        backBtn.setBackground(new java.awt.Color(51, 51, 51));
        backBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< Back");
        backBtn.setBorder(new javax.swing.border.MatteBorder(null));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        complaintBtn.setBackground(new java.awt.Color(51, 51, 51));
        complaintBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        complaintBtn.setForeground(new java.awt.Color(255, 255, 255));
        complaintBtn.setText("Lodge Complaint");
        complaintBtn.setBorder(new javax.swing.border.MatteBorder(null));
        complaintBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        complaintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaintBtnActionPerformed(evt);
            }
        });

        issueTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        issueTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueTxtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(complaintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(issueTxtField))))
                            .addGap(139, 139, 139))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(49, 49, 49)
                            .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(249, 249, 249)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(233, 233, 233))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addComponent(complaintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void productComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productComboBoxActionPerformed
        populatePurchaseTable();
    }//GEN-LAST:event_productComboBoxActionPerformed

    private void complaintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaintBtnActionPerformed
        String issue = issueTxtField.getText();
        CustomerWorkRequest request = new CustomerWorkRequest();
        request.setIssue(issue);
        Product product = (Product) productComboBox.getSelectedItem();
        request.setProduct(product);
        request.setSender(account);
        String date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());
        request.setRequestDate(date);
        request.setStatus("sent");

        int selectedRow = purchaseJTable.getSelectedRow();
        RFID rfid;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            rfid = (RFID) purchaseJTable.getValueAt(selectedRow, 0);
        }

        request.setRfid(rfid);
        Organization org = null;
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof FDAOrganization) {
                    org = organization;
                    break;
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
        }
    }//GEN-LAST:event_complaintBtnActionPerformed

    private void issueTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton complaintBtn;
    private javax.swing.JTextField issueTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox productComboBox;
    private javax.swing.JTable purchaseJTable;
    // End of variables declaration//GEN-END:variables
}
