/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.AlumniLogin;

/**
 *
 * @author riaka
 */
public class AlumniLoginJPanel extends javax.swing.JPanel {
    AlumniLogin alumnilogin;
    private JPanel workArea;
    
     public AlumniLoginJPanel(JPanel workA ) {
        this.workArea=workA;
        initComponents();
     }
    

    /**
     * Creates new form AlumniLoginJPanel
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAlumnitLogin = new javax.swing.JLabel();
        lblAlumniUsername = new javax.swing.JLabel();
        lblAlumniPassword = new javax.swing.JLabel();
        txtAlumniUsername = new javax.swing.JTextField();
        btnAlumniLogin = new javax.swing.JButton();
        txtAlumniPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        lblAlumnitLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAlumnitLogin.setForeground(new java.awt.Color(0, 153, 255));
        lblAlumnitLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlumnitLogin.setText("Alumni Login");

        lblAlumniUsername.setText("Username");

        lblAlumniPassword.setText("Password");

        btnAlumniLogin.setText("Login");
        btnAlumniLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumniLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAlumnitLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAlumniUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(lblAlumniPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAlumniPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtAlumniUsername)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnAlumniLogin)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblAlumnitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtAlumniUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblAlumniUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlumniPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlumniPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnAlumniLogin)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlumniLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumniLoginActionPerformed
        // TODO add your handling code here:
        String uname = txtAlumniUsername.getText();
        String pwd = txtAlumniPassword.getText();
        if(uname.equals("Alumni") && pwd.equals("Alumni"))
        {
            AlumniInfoJPanel alumniPanel = new AlumniInfoJPanel(workArea);
            workArea.add("AlumniInfoJPanel", alumniPanel);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
            JOptionPane.showMessageDialog(this, "Login Successful");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Username or Password incorrect");
        }
    }//GEN-LAST:event_btnAlumniLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumniLogin;
    private javax.swing.JLabel lblAlumniPassword;
    private javax.swing.JLabel lblAlumniUsername;
    private javax.swing.JLabel lblAlumnitLogin;
    private javax.swing.JPasswordField txtAlumniPassword;
    private javax.swing.JTextField txtAlumniUsername;
    // End of variables declaration//GEN-END:variables
}