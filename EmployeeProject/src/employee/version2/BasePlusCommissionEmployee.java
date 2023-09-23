/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    @Override
    public double computeSalary(){  
        double sales = getTotalSales();
        double rate;
         if(sales < 50000){
             rate = 0.05;
         }else if(sales >= 50000 && sales < 100000){
             rate = .20;
         }else if(sales >= 100000 && sales < 500000){
             rate = .30;
         }else{
             rate = .50;
         }
         
         return (sales * rate) + this.baseSalary;
    }
            
    @Override
    public void displayInfo(){
        System.out.println(this+" "+this.computeSalary());
    }
    
    @Override
    public String toString(){
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        StringBuilder sb = new StringBuilder();
        
        sb.append(getEmpID()).append(" ")
        .append(getEmpName()).append(" ")
        .append(ft.format(getEmpDateHired())).append(" ")
        .append(ft.format(getEmpBirthDate())).append(" ")
        .append(this.getTotalSales()).append(" ").append(this.baseSalary);
        
        return sb.toString();
    }
}
