/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version6;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author angel
 */
public class CommissionEmployee extends Employee {
    private double totalSales;

    public CommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }
    
    public CommissionEmployee(){   
        super();
        this.totalSales = 0;
    }
    
    public CommissionEmployee(int empID, Name empName, int yearHire, int monthHire, int dayHire, int yearBirth, int monthBirth, int dayBirth, double totalSales){
        super(empID, empName, yearHire, monthHire, dayHire, yearBirth, monthBirth, dayBirth);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    @Override
    public double computeSalary(){
        double rate;
         if(getTotalSales() < 50000){
             rate = 0.05;
         }else if(getTotalSales() >= 50000 && getTotalSales() < 100000){
             rate = .20;
         }else if(getTotalSales() >= 100000 && getTotalSales() < 500000){
             rate = .30;
         }else{
             rate = .50;
         }
         
         return getTotalSales() * rate;
    }
    
    public void displayInfo(){
       System.out.println(this+" "+this.computeSalary());
    }
    
    @Override
    public String toString(){
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        StringBuilder sb = new StringBuilder();
        
        sb.append(getEmpID()).append(" ").append(getName())
        .append(ft.format(getEmpDateHired())).append(" ")
        .append(ft.format(getEmpBirthDate())).append(" ")
        .append(this.totalSales);
        
        return sb.toString();
    }
}
