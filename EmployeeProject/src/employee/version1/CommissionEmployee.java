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
public class CommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
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
         
         return sales * rate;
    }
    
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
        .append(this.totalSales);
        
        return sb.toString();
    }
}
