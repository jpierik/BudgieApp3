/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgieapp;
import my.budgieui.FinancialInfoUI;
import my.budgieui.InformationSummaryUI;
import my.budgieui.LoanCalcUI;
/**
 *
 * @author jonpi
 */
public class BudgieTest {
    
    
    public static void main(String[] args) {
        InformationSummaryUI infoSummary = new InformationSummaryUI();
        infoSummary.setResizable(false);
        EnterFinancialInfo info = new EnterFinancialInfo();
        info.infoUI.setResizable(false);
        LoanCalcUI loanCalc = new LoanCalcUI();
        info.infoUI.setVisible(true);
        info.getInputInfo();
        if (info.flag == true){
            infoSummary.setVisible(true);
            info.infoUI.setVisible(false);
            infoSummary.jLabelTotalIncome.setText("$" + info.yearlyIncomeStr);
            infoSummary.jLabelTotalMonthlyExpense.setText("$" + info.totalMonthlyExpenseStr);
            infoSummary.jLabelTotalYearlyExpense.setText("$" + info.totalYearlyExpenseStr);
            
        }
        
       
    }
    
}
