/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Dashboard;

/**
 *
 * @author riaka
 */
public class DashboardJPanel extends javax.swing.JPanel {
    Dashboard dashboard;
    private JPanel workArea;
    
     public DashboardJPanel(JPanel workA ) {
        this.workArea=workA;
        initComponents();
     }
     

    /**
     * Creates new form DashboardJPanel
     */
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        comboCollegeRanking = new javax.swing.JComboBox<>();
        lblCollege = new javax.swing.JLabel();
        txtCollegeRanking = new javax.swing.JTextField();
        btnGetCollegeRank = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboFacultyRanking = new javax.swing.JComboBox<>();
        txtFacultyRanking = new javax.swing.JTextField();
        btnGetFacultyRanking = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblTypeReport = new javax.swing.JLabel();
        comboPerformance = new javax.swing.JComboBox<>();
        txtPerformance = new javax.swing.JTextField();
        btnPerformance = new javax.swing.JButton();

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        comboCollegeRanking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "College of Engineering", "College of Law", "College of Sciences" }));
        comboCollegeRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCollegeRankingActionPerformed(evt);
            }
        });

        lblCollege.setText("College");

        btnGetCollegeRank.setText("Get Rank");
        btnGetCollegeRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetCollegeRankActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblCollege)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCollegeRanking)
                            .addComponent(comboCollegeRanking, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnGetCollegeRank, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCollegeRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCollege))
                .addGap(62, 62, 62)
                .addComponent(txtCollegeRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnGetCollegeRank)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("College Ranking ", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Subject");

        comboFacultyRanking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Maths", "Science", "Law" }));
        comboFacultyRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFacultyRankingActionPerformed(evt);
            }
        });

        btnGetFacultyRanking.setText("Get Rank");
        btnGetFacultyRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetFacultyRankingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFacultyRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboFacultyRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnGetFacultyRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboFacultyRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(txtFacultyRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnGetFacultyRanking)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Faculty Ranking", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblTypeReport.setText("Type of Report");

        comboPerformance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "GPA vs Success", "Growth vs Courses", "Growth graph for 5 years" }));
        comboPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPerformanceActionPerformed(evt);
            }
        });

        btnPerformance.setText("See Graph");
        btnPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblTypeReport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTypeReport)
                    .addComponent(comboPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(txtPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnPerformance)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Perfomance", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboCollegeRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCollegeRankingActionPerformed
        // TODO add your handling code here:
        //if(evt.getSource()=comboCollegeRanking) {
         //   comboCollegeRanking.getSelectedItem();
         //String selected_text = comboCollegeRanking.getItemAt(comboCollegeRanking.getSelectedIndex());
           String t = (String) comboCollegeRanking.getSelectedItem();
	   if (t == null) t = "Nothing selected";
           txtCollegeRanking.setText(t);
          
        
    }//GEN-LAST:event_comboCollegeRankingActionPerformed

    private void comboFacultyRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFacultyRankingActionPerformed
        // TODO add your handling code here:
        String t = (String) comboFacultyRanking.getSelectedItem();
	  if (t == null) t = "Nothing selected";
      txtFacultyRanking.setText(t);
    }//GEN-LAST:event_comboFacultyRankingActionPerformed

    private void comboPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPerformanceActionPerformed
        // TODO add your handling code here:
        String t = (String) comboPerformance.getSelectedItem();
	  if (t == null) t = "Nothing selected";
      txtPerformance.setText(t);
    }//GEN-LAST:event_comboPerformanceActionPerformed

    private void btnGetCollegeRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetCollegeRankActionPerformed
        // TODO add your handling code here:
        
        //GetRankJPanel getrank1 = new GetRankJPanel(getrank);
        //splitPane.setBottomComponent(getrank1);
        //GetRankJPanel getrank1 = new GetRankJPanel(workArea);
          //  workArea.add("StudentInfoJPanel", getrank1);
         //   CardLayout layout = (CardLayout) workArea.getLayout();
        //    layout.next(workArea);
         GetRankJPanel getrank1 = new GetRankJPanel(workArea);
            workArea.add("GetRankJPanel", getrank1);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
    }//GEN-LAST:event_btnGetCollegeRankActionPerformed

    private void btnGetFacultyRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetFacultyRankingActionPerformed
        // TODO add your handling code here:
        GetRankJPanel getrank1 = new GetRankJPanel(workArea);
            workArea.add("GetRankJPanel", getrank1);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
    }//GEN-LAST:event_btnGetFacultyRankingActionPerformed

    private void btnPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformanceActionPerformed
        // TODO add your handling code here:
        SeeGraph seegraph = new SeeGraph(workArea);
            workArea.add("SeeGraph", seegraph);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
    }//GEN-LAST:event_btnPerformanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetCollegeRank;
    private javax.swing.JButton btnGetFacultyRanking;
    private javax.swing.JButton btnPerformance;
    private javax.swing.JComboBox<String> comboCollegeRanking;
    private javax.swing.JComboBox<String> comboFacultyRanking;
    private javax.swing.JComboBox<String> comboPerformance;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCollege;
    private javax.swing.JLabel lblTypeReport;
    private javax.swing.JTextField txtCollegeRanking;
    private javax.swing.JTextField txtFacultyRanking;
    private javax.swing.JTextField txtPerformance;
    // End of variables declaration//GEN-END:variables
}