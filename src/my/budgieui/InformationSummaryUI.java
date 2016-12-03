/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.budgieui;
import budgieapp.EnterFinancialInfo;
import budgieapp.TransportationCost;
import java.awt.Color;
/**
 *
 * @author jonpi
 */
public class InformationSummaryUI extends javax.swing.JFrame {
    /**
     * Creates new form InformationSummaryUI
     */
    TransportationCost transCost = new TransportationCost();
    LoanCalcUI loanCalc = new LoanCalcUI();
    EnterFinancialInfo info = new EnterFinancialInfo();
    public InformationSummaryUI() {
        getContentPane().setBackground(Color.white);
        initComponents();
        budgieTitle1.setBackground(Color.white);
        budgieTitle2.setBackground(Color.white);
        textFieldEnterBills.setBackground(Color.white);
        textFieldEnterIncome.setBackground(Color.white);
        textFieldEnterLivingExpense.setBackground(Color.white);
        budgieTitle1.setEditable(false);
        budgieTitle2.setEditable(false);
        textFieldEnterBills.setEditable(false);
        textFieldEnterIncome.setEditable(false);
        textFieldEnterLivingExpense.setEditable(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTotalIncome1 = new javax.swing.JLabel();
        budgieTitle1 = new javax.swing.JTextField();
        budgieTitle2 = new javax.swing.JTextField();
        textFieldEnterIncome = new javax.swing.JTextField();
        textFieldEnterLivingExpense = new javax.swing.JTextField();
        textFieldEnterBills = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelTotalIncome = new javax.swing.JLabel();
        jLabelTotalYearlyExpense = new javax.swing.JLabel();
        jLabelTotalMonthlyExpense = new javax.swing.JLabel();
        loanCalcButton = new javax.swing.JButton();
        transportationCostButton = new javax.swing.JButton();

        jLabelTotalIncome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalIncome1.setText("---");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        budgieTitle1.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        budgieTitle1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        budgieTitle1.setText("Budgie");
        budgieTitle1.setBorder(null);
        budgieTitle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budgieTitle1ActionPerformed(evt);
            }
        });

        budgieTitle2.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        budgieTitle2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        budgieTitle2.setText("Finance Made Simple");
        budgieTitle2.setBorder(null);
        budgieTitle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budgieTitle2ActionPerformed(evt);
            }
        });

        textFieldEnterIncome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        textFieldEnterIncome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldEnterIncome.setText("Yearly Total Income:");
        textFieldEnterIncome.setBorder(null);
        textFieldEnterIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEnterIncomeActionPerformed(evt);
            }
        });

        textFieldEnterLivingExpense.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        textFieldEnterLivingExpense.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldEnterLivingExpense.setText("Monthly Total Expense:");
        textFieldEnterLivingExpense.setBorder(null);
        textFieldEnterLivingExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEnterLivingExpenseActionPerformed(evt);
            }
        });

        textFieldEnterBills.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        textFieldEnterBills.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldEnterBills.setText("Yearly Total Expense:");
        textFieldEnterBills.setBorder(null);
        textFieldEnterBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEnterBillsActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/budgieapp/pictures/budgie bird.jpg"))); // NOI18N

        jLabelTotalIncome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalIncome.setText("---");

        jLabelTotalYearlyExpense.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalYearlyExpense.setText("---");

        jLabelTotalMonthlyExpense.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalMonthlyExpense.setText("---");

        loanCalcButton.setBackground(new java.awt.Color(153, 255, 255));
        loanCalcButton.setText("Loan Calculator");
        loanCalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanCalcButtonActionPerformed(evt);
            }
        });

        transportationCostButton.setBackground(new java.awt.Color(153, 255, 255));
        transportationCostButton.setText("Transportation Cost");
        transportationCostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportationCostButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(118, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(budgieTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(233, 233, 233))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textFieldEnterBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldEnterLivingExpense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldEnterIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTotalYearlyExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTotalMonthlyExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTotalIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(budgieTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loanCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(transportationCostButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(budgieTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(budgieTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldEnterIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTotalIncome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldEnterLivingExpense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTotalMonthlyExpense))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldEnterBills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTotalYearlyExpense))))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transportationCostButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void budgieTitle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budgieTitle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_budgieTitle1ActionPerformed

    private void budgieTitle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budgieTitle2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_budgieTitle2ActionPerformed

    private void textFieldEnterIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEnterIncomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEnterIncomeActionPerformed

    private void textFieldEnterLivingExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEnterLivingExpenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEnterLivingExpenseActionPerformed

    private void textFieldEnterBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEnterBillsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEnterBillsActionPerformed

    private void loanCalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanCalcButtonActionPerformed
        loanCalc.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_loanCalcButtonActionPerformed

    private void transportationCostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportationCostButtonActionPerformed
        // TODO add your handling code here:
        transCost.setVisible(true);
    }//GEN-LAST:event_transportationCostButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InformationSummaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformationSummaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformationSummaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformationSummaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformationSummaryUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField budgieTitle1;
    private javax.swing.JTextField budgieTitle2;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabelTotalIncome;
    public javax.swing.JLabel jLabelTotalIncome1;
    public javax.swing.JLabel jLabelTotalMonthlyExpense;
    public javax.swing.JLabel jLabelTotalYearlyExpense;
    public javax.swing.JButton loanCalcButton;
    private javax.swing.JTextField textFieldEnterBills;
    private javax.swing.JTextField textFieldEnterIncome;
    private javax.swing.JTextField textFieldEnterLivingExpense;
    public javax.swing.JButton transportationCostButton;
    // End of variables declaration//GEN-END:variables
}