/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Awais
 */ 

public class form extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    public form() {
        initComponents();
        getContentPane().setBackground(Color.WHITE); 
         setExtendedState(MAXIMIZED_BOTH);
         this.setTitle("PayRoll Management System");
       
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Showallowances = new javax.swing.JButton();
        showDeduction = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD New Employee");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 380, 210, 33);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/punjab govt logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 40, 150, 127);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PAY ROLL MANAGEMENT SYSTEM");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 140, 490, 29);

        Showallowances.setBackground(new java.awt.Color(0, 204, 51));
        Showallowances.setForeground(new java.awt.Color(255, 255, 255));
        Showallowances.setText("Show Allowances");
        Showallowances.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Showallowances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowallowancesActionPerformed(evt);
            }
        });
        getContentPane().add(Showallowances);
        Showallowances.setBounds(580, 480, 210, 33);

        showDeduction.setBackground(new java.awt.Color(204, 0, 0));
        showDeduction.setForeground(new java.awt.Color(255, 255, 255));
        showDeduction.setText("Show Deductions");
        showDeduction.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        showDeduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDeductionActionPerformed(evt);
            }
        });
        getContentPane().add(showDeduction);
        showDeduction.setBounds(580, 530, 210, 33);

        jButton4.setBackground(new java.awt.Color(0, 204, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Show Employees");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(580, 430, 210, 32);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(246, 144, 48, 24);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(570, 80, 155, 43);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b5.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-7, -6, 1790, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new addemployeeform().show();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ShowallowancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowallowancesActionPerformed
        // TODO add your handling code here:
        
        new Allowances().show();
    }//GEN-LAST:event_ShowallowancesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        // TODO add your handling code here:
        new EmployeeDataView().show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void showDeductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDeductionActionPerformed
        // TODO add your handling code here:
        new Deduction().show();
    }//GEN-LAST:event_showDeductionActionPerformed

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Showallowances;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton showDeduction;
    // End of variables declaration//GEN-END:variables
}