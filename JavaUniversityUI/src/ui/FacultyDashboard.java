/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JPanel;

/**
 *
 * @author riaka
 */
public class FacultyDashboard extends javax.swing.JPanel {
    private JPanel workArea;
    
    public FacultyDashboard(JPanel workA) {
        initComponents();
        this.workArea=workA;
    }

    /**
     * Creates new form FacultyDashboard
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFacultyDashboard = new javax.swing.JLabel();
        lblMyClasseSchedule = new javax.swing.JButton();
        btnCheckMyRating = new javax.swing.JButton();
        btnGradeStudents = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblFacultyDashboard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFacultyDashboard.setForeground(new java.awt.Color(0, 153, 255));
        lblFacultyDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFacultyDashboard.setText("Faculty Dashboard");

        lblMyClasseSchedule.setText("View my Schedule");

        btnCheckMyRating.setText("View my Rating");

        btnGradeStudents.setText("Grade Students");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFacultyDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMyClasseSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnCheckMyRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGradeStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblFacultyDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lblMyClasseSchedule)
                .addGap(18, 18, 18)
                .addComponent(btnCheckMyRating)
                .addGap(18, 18, 18)
                .addComponent(btnGradeStudents)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckMyRating;
    private javax.swing.JButton btnGradeStudents;
    private javax.swing.JLabel lblFacultyDashboard;
    private javax.swing.JButton lblMyClasseSchedule;
    // End of variables declaration//GEN-END:variables
}
