/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;
    private double baseSalary;

    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }
    
     public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public int getEmpID() {
        return empID;
    }
    
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public String getEmpName() {
        return empName;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }
    
    public Date getEmpDateHired() {
        return empDateHired;
    }
    
    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }
    
    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double getTotalSales() {
        return totalSales;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    public double computeSalary(){  
        double sales = this.totalSales;
        double salary;
         if(sales < 50000){
             salary = sales * 0.05;
         }else if(sales >= 50000 && sales < 100000){
             salary = sales *.20;
         }else if(sales >= 100000 && sales < 500000){
             salary = sales *.30;
         }else{
             salary = sales *.50;
         }
         
         salary = salary + this.baseSalary;
         return salary;
    }
            
    
    public void displayInfo(){
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        System.out.printf("%d %s %s %s %.2f %.2f %.2f", this.empID, this.empName, ft.format(this.empDateHired),
                ft.format(this.empBirthDate), this.totalSales, this.baseSalary, this.computeSalary());
    }
    
    public String toString(){
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        return this.empID+" "+empName+" "+ft.format(empDateHired)+" "+ft.format(empBirthDate)
                +" "+this.totalSales+" "+this.baseSalary;
    }
}
