/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author angel
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }
    
    public BasePlusCommissionEmployee(){   
        super();
        this.baseSalary = 0;
    }
    
    public BasePlusCommissionEmployee(int empID, Name empName, int yearHire, int monthHire, int dayHire, int yearBirth, int monthBirth, int dayBirth, double totalSales, double baseSalary){
        super(empID, empName, yearHire, monthHire, dayHire, yearBirth, monthBirth, dayBirth, totalSales);
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
        return super.computeSalary() + this.baseSalary;
    }
            
    @Override
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
        .append(this.getTotalSales()).append(" ").append(this.baseSalary);
        
        return sb.toString();
    }
}