/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.FacultyLogin;

/**
 *
 * @author riaka
 */
public class FacultyLoginJPanel extends javax.swing.JPanel {
    FacultyLogin facultylogin;
    private JPanel workArea;

    /**
     * Creates new form FacultyLoginJPanel
     */
    public FacultyLoginJPanel(JPanel workA ) {
        this.workArea=workA;
        initComponents();
        //this.facultylogin = facultylogin;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFacultyLogin = new javax.swing.JLabel();
        lblFacultytUsername = new javax.swing.JLabel();
        lblFacultyPassword = new javax.swing.JLabel();
        txtFacultyUsername = new javax.swing.JTextField();
        btnFacultyLogin = new javax.swing.JButton();
        txtFacultyPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        lblFacultyLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFacultyLogin.setForeground(new java.awt.Color(0, 153, 255));
        lblFacultyLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFacultyLogin.setText("Faculty Login");

        lblFacultytUsername.setText("Username");

        lblFacultyPassword.setText("Password");

        btnFacultyLogin.setText("Login");
        btnFacultyLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacultyLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFacultyLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFacultytUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(lblFacultyPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFacultyUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtFacultyPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnFacultyLogin)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblFacultyLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultytUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFacultyUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultyPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFacultyPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnFacultyLogin)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacultyLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacultyLoginActionPerformed
        // TODO add your handling code here:
        String uname = txtFacultyUsername.getText();
        String pwd = txtFacultyPassword.getText();
        if(uname.equals("Faculty") && pwd.equals("Faculty"))
        {
            FacultyInfoJPanel facultypanel = new FacultyInfoJPanel(workArea);
            workArea.add("FacultyInfoJPanel", facultypanel);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
            JOptionPane.showMessageDialog(this, "Login Successful");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Username or Password incorrect");
        }
    }//GEN-LAST:event_btnFacultyLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacultyLogin;
    private javax.swing.JLabel lblFacultyLogin;
    private javax.swing.JLabel lblFacultyPassword;
    private javax.swing.JLabel lblFacultytUsername;
    private javax.swing.JPasswordField txtFacultyPassword;
    private javax.swing.JTextField txtFacultyUsername;
    // End of variables declaration//GEN-END:variables
}