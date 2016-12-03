
package budgieapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import my.budgieui.FinancialInfoUI;

public class EnterFinancialInfo extends FinancialInfoUI{
    

    FinancialInfoUI infoUI = new FinancialInfoUI();
    //FinancialInfoGUI ui = new FinancialInfoGUI();
    
    String monthlyIncomeStr;
    String monthlyBillsStr;
    String monthlyOtherExpenseStr;
    String monthlyLivingExpenseStr;
    boolean flag = false;
    boolean errorTrap = false;
    
    float income;
    float bills;
    float otherExpense;
    float livingExpense;
    
    float yearlyIncome;
    float totalMonthlyExpense;
    float totalYearlyExpense;
    
    String yearlyIncomeStr;
    String totalMonthlyExpenseStr;
    String totalYearlyExpenseStr;
   
    public void getInputInfo(){ 
        while(flag == false){
            System.out.println(infoUI.submitBool);
            if (infoUI.isVisible() && infoUI.submitBool == true){
                
            //convert strings to numbers   
            //monthlyBillsStr = infoUI.textBills;
            while(errorTrap == false){
                try{
                income = Float.valueOf(infoUI.textIncome);
                bills = Float.valueOf(infoUI.textBills);
                otherExpense = Float.valueOf(infoUI.textOtherExpense);
                livingExpense = Float.valueOf(infoUI.textLivingExpense);
                }
                catch(Exception e){
                    System.out.println("Please enter a numerical value");
                    infoUI.notificationLabel.setText("Please enter a numerical value.");
                    infoUI.submitBool = false;
                }
                if(income < 0 || bills < 0 || otherExpense < 0 || livingExpense < 0){
                    System.out.println("no negatives");
                    infoUI.notificationLabel.setText("The entered value is negative. Please enter a new value.");
                    infoUI.submitBool = false;
                }
                else if(income > 1000000 || bills > 1000000 || otherExpense > 1000000 || livingExpense > 1000000){
                    System.out.println("no large numbers");
                    infoUI.notificationLabel.setText("The entered value is too high. Please enter a new value");
                    infoUI.submitBool = false;
                }
                else
                    errorTrap = true;
            }
            
            //simple calulations for financial info
            yearlyIncome = income * 12;
            totalMonthlyExpense = bills + otherExpense + livingExpense;
            totalYearlyExpense = totalMonthlyExpense * 12;
            
            yearlyIncomeStr = Float.toString(yearlyIncome);
            totalMonthlyExpenseStr = Float.toString(totalMonthlyExpense);
            totalYearlyExpenseStr = Float.toString(totalYearlyExpense);
            
            System.out.println(yearlyIncome + " " + totalMonthlyExpense + " " + totalYearlyExpense);
            infoUI.submitBool = false;
            flag = true;
            }
        }
        //infoUI.jLabel1.setText("Hello");
        //infoUI.getContentPane().setBackground(Color.white);
        //monthlyIncomeStr = infoUI.userMonthlyIncome.getText();
       //// monthlyBillsStr = infoUI.userMonthlyLivingExpense.getText();
       /// monthlyOtherExpenseStr = infoUI.userMonthlyOtherExpense.getText();
       // monthlyLivingExpenseStr = infoUI.userMonthlyLivingExpense.getText();
        
        //simple calculations for annual financial facts
        //yearlyIncome = income * 12;
        //totalMonthlyExpense = bills + otherExpense + livingExpense;
        //totalYearlyExpense = totalMonthlyExpense * 12;
    }

    public String getMonthlyBillsStr() {
        return monthlyBillsStr;
    }

    public void setMonthlyBillsStr(String monthlyBillsStr) {
        this.monthlyBillsStr = monthlyBillsStr;
    }
    
}
     
            
    
