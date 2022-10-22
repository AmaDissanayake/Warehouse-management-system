/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.warehousemanagementsystem;

import DBwarehouse.DBconnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ama
 */
public class OPregisterClientsMenu extends javax.swing.JFrame {

    /**
     * Creates new form OPregisterClientsMenu
     */
    public OPregisterClientsMenu() {
        initComponents();
        
        Update_reg_client();
    }

    public void Update_reg_client()
    {
        int log;
        
         try {
            DBconnector db = new DBconnector();
            Connection con = db.getConnection();
           
            PreparedStatement pre2 = null;
            pre2 = con.prepareStatement("SELECT * FROM `clientsregistration`");
            ResultSet R_set  = pre2.executeQuery();
            
            ResultSetMetaData result = R_set.getMetaData();
            log = result.getColumnCount();
            DefaultTableModel Deftbl = (DefaultTableModel)jTableregclients.getModel();
            Deftbl.setRowCount(0);
            
            while(R_set.next())
            {
                Vector table = new Vector();
                for (int i=1; i<=log; i++)
                {
                   table.add(R_set.getString("Client_ID")); 
                   table.add(R_set.getString("Client_Name"));
                   table.add(R_set.getString("NIC"));
                   table.add(R_set.getString("Company_Name"));
                   table.add(R_set.getString("Address"));
                   table.add(R_set.getString("Phone_Number"));
                   table.add(R_set.getString("Category"));
                }
                
                Deftbl.addRow(table);
                
            }
          
            
        } catch (SQLException ex) {
            Logger.getLogger(CreateOperatorAccounts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClientID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBackRegClientstoManagerMenu = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableregclients = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtCompanyName = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        txtPhnNO = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        txtCRID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("REGISTER CLIENTS");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Warehouse Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(326, 326, 326))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Client Name");

        txtClientID.setBackground(new java.awt.Color(255, 255, 255));
        txtClientID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtClientID.setForeground(new java.awt.Color(0, 0, 0));
        txtClientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientIDActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("NIC");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Company Name");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Address");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Phone Number");

        txtClientName.setBackground(new java.awt.Color(255, 255, 255));
        txtClientName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtClientName.setForeground(new java.awt.Color(0, 0, 0));
        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 153, 153));
        btnSave.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBackRegClientstoManagerMenu.setBackground(new java.awt.Color(0, 153, 153));
        btnBackRegClientstoManagerMenu.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBackRegClientstoManagerMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnBackRegClientstoManagerMenu.setText("BACK");
        btnBackRegClientstoManagerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackRegClientstoManagerMenuActionPerformed(evt);
            }
        });

        btnClearAll.setBackground(new java.awt.Color(0, 153, 153));
        btnClearAll.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnClearAll.setForeground(new java.awt.Color(0, 0, 0));
        btnClearAll.setText("CLEAR ALL");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Category");

        btnEdit.setBackground(new java.awt.Color(0, 153, 153));
        btnEdit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 0, 0));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jTableregclients.setBackground(new java.awt.Color(255, 255, 255));
        jTableregclients.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTableregclients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client ID", "Client name", "NIC", "Company name", "Address", "Phone number", "Category"
            }
        ));
        jTableregclients.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableregclients.setRowHeight(25);
        jTableregclients.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jTableregclients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableregclientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableregclients);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Clients Information Table");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        txtCompanyName.setBackground(new java.awt.Color(255, 255, 255));
        txtCompanyName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtCompanyName.setForeground(new java.awt.Color(0, 0, 0));
        txtCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyNameActionPerformed(evt);
            }
        });

        txtNIC.setBackground(new java.awt.Color(255, 255, 255));
        txtNIC.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtNIC.setForeground(new java.awt.Color(0, 0, 0));
        txtNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICActionPerformed(evt);
            }
        });

        txtPhnNO.setBackground(new java.awt.Color(255, 255, 255));
        txtPhnNO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtPhnNO.setForeground(new java.awt.Color(0, 0, 0));
        txtPhnNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhnNOActionPerformed(evt);
            }
        });

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(0, 0, 0));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Client ID");

        cmbCategory.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Food Items", "Cloths Items", "Glass Items", "Spare Parts", "Raw Materials" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtClientID, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtClientName, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtNIC, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtPhnNO, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnBackRegClientstoManagerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnClearAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(249, 249, 249))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCRID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCRID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtPhnNO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnClearAll)
                            .addComponent(btnEdit))
                        .addGap(18, 18, 18)
                        .addComponent(btnBackRegClientstoManagerMenu)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtClientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientIDActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        String ClientID = txtClientID.getText();
        String ClientName = txtClientName.getText();
        String NIC = txtNIC.getText();
        String CompanyName = txtCompanyName.getText();
        String Address = txtAddress.getText();
        String PhoneNumber = txtPhnNO.getText();
        String Categories = cmbCategory.getSelectedItem().toString();

        if(ClientID.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert The Client ID");
        }

        else if(ClientName.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert The Client Name");
        }

        else if(NIC.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert The NIC");
        }

        else if(CompanyName.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert The Company Name");
        }

        else if(Address.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert The Address");
        }

        else if(PhoneNumber.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert The Phone Number");
        }

        else if(Categories.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Select the Product Category");
        }
        else {

            try {

                PreparedStatement stmt1;
                String query = "INSERT INTO `clientsregistration`(`Client_ID`, `Client_Name`, `NIC`, `Company_Name`, `Address`, `Phone_Number`, `Category`) VALUES (?,?,?,?,?,?,?)";

                stmt1 = DBconnector.getConnection().prepareStatement(query);

                stmt1.setString(1, ClientID);
                stmt1.setString(2, ClientName);
                stmt1.setString(3, NIC);
                stmt1.setString(4, CompanyName);
                stmt1.setString(5, Address);
                stmt1.setString(6, PhoneNumber);
                stmt1.setString(7, Categories);

                if(stmt1.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null,"User Added");
                }

                txtClientID.setText("");
                txtClientName.setText("");
                txtNIC.setText("");
                txtCompanyName.setText("");
                txtAddress.setText("");
                txtPhnNO.setText("");
                txtCRID.setText("");
                txtClientID.requestFocus();

                Update_reg_client();

            }

            catch (SQLException ex) {
                Logger.getLogger(RegisterClients.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackRegClientstoManagerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackRegClientstoManagerMenuActionPerformed
        // TODO add your handling code here:

        OperatorMenu mngr = new OperatorMenu();
        mngr.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnBackRegClientstoManagerMenuActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        // TODO add your handling code here:

        txtClientID.setText("");
        txtClientName.setText("");
        txtNIC.setText("");
        txtCompanyName.setText("");
        txtAddress.setText("");
        txtPhnNO.setText("");
        cmbCategory.setSelectedItem(-1);
        txtClientID.requestFocus();
    }//GEN-LAST:event_btnClearAllActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:

        DefaultTableModel def3 = (DefaultTableModel)jTableregclients.getModel();

        int selectIndex = jTableregclients.getSelectedRow();

        try {
            //String uno = def3.getValueAt(selectIndex,0).toString();
            String ClientID = def3.getValueAt(selectIndex,0).toString();
            //String ClientID = txtClientID.getText();
            String ClientName = txtClientName.getText();
            String NIC = txtNIC.getText();
            String companyName = txtCompanyName.getText();
            String Address = txtAddress.getText();
            String Phnno = txtPhnNO.getText();
            String Category = cmbCategory.getSelectedItem().toString();

            DBconnector dbCon = new DBconnector();
            Connection con = dbCon.getConnection();

            PreparedStatement pre3 = null;
            pre3 = con.prepareStatement("UPDATE `clientsregistration` SET `Client_Name`=?,`NIC`=?,`Company_Name`=?,`Address`=?, `Phone_Number`=?, `Category`=?, WHERE `Client_ID`=?");

            //pre3.setString(1,ClientID);
            pre3.setString(1,ClientName);
            pre3.setString(2,NIC);
            pre3.setString(3,companyName);
            pre3.setString(4,Address);
            pre3.setString(5,Phnno);
            pre3.setString(6,Category);
            pre3.setString(7,ClientID);
            pre3.executeUpdate();

            JOptionPane.showMessageDialog(this, "User Details Updated");
            Update_reg_client();

        } catch (SQLException ex) {
            Logger.getLogger(RegisterClients.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void jTableregclientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableregclientsMouseClicked
        // TODO add your handling code here:

        DefaultTableModel def3 = (DefaultTableModel)jTableregclients.getModel();

        int selectIndex = jTableregclients.getSelectedRow();

        txtClientID.setText(def3.getValueAt(selectIndex, 0).toString());
        txtClientName.setText(def3.getValueAt(selectIndex, 1).toString());
        txtNIC.setText(def3.getValueAt(selectIndex, 2).toString());
        txtCompanyName.setText(def3.getValueAt(selectIndex, 3).toString());
        txtAddress.setText(def3.getValueAt(selectIndex, 4).toString());
        txtPhnNO.setText(def3.getValueAt(selectIndex, 5).toString());
        cmbCategory.setSelectedItem(def3.getValueAt(selectIndex, 6).toString());
    }//GEN-LAST:event_jTableregclientsMouseClicked

    private void txtCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyNameActionPerformed

    private void txtNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICActionPerformed

    private void txtPhnNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhnNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhnNOActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OPregisterClientsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OPregisterClientsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OPregisterClientsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OPregisterClientsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OPregisterClientsMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackRegClientstoManagerMenu;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableregclients;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCRID;
    private javax.swing.JTextField txtClientID;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtPhnNO;
    // End of variables declaration//GEN-END:variables
}
