/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.AdminLogin;

/**
 *
 * @author riaka
 */
public class AdminLoginJPanel extends javax.swing.JPanel {
    AdminLogin adminlogin;
    private JPanel workArea;
    
     public AdminLoginJPanel(JPanel workA ) {
         
        this.workArea=workA;
        initComponents();
     }

    /**
     * Creates new form AdminLoginJPanel
     */
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdminLogin = new javax.swing.JLabel();
        lblAdminUsername = new javax.swing.JLabel();
        lblAdminPassword = new javax.swing.JLabel();
        txtAdminUsername = new javax.swing.JTextField();
        btnAdminLogin = new javax.swing.JButton();
        txtAdminPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        lblAdminLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAdminLogin.setForeground(new java.awt.Color(0, 153, 255));
        lblAdminLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminLogin.setText("Admin Login");

        lblAdminUsername.setText("Username");

        lblAdminPassword.setText("Password");

        btnAdminLogin.setText("Login");
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdminLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAdminUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(lblAdminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtAdminUsername)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnAdminLogin)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnAdminLogin)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        // TODO add your handling code here:
        String uname = txtAdminUsername.getText();
        String pwd = txtAdminPassword.getText();
        if(uname.equals("Admin") && pwd.equals("Admin"))
        {
            AdminInfoJPanel adminPanel = new AdminInfoJPanel(workArea);
            workArea.add("AdminInfoJPanel", adminPanel);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
            JOptionPane.showMessageDialog(this, "Login Successful");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Username or Password incorrect");
        }
    }//GEN-LAST:event_btnAdminLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JLabel lblAdminLogin;
    private javax.swing.JLabel lblAdminPassword;
    private javax.swing.JLabel lblAdminUsername;
    private javax.swing.JPasswordField txtAdminPassword;
    private javax.swing.JTextField txtAdminUsername;
    // End of variables declaration//GEN-END:variables
}
