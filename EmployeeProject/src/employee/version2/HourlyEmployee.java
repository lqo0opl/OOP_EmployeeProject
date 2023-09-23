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
public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;        

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHoursWWorked, float ratePerHour) {   
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary(){
       double maxhours = 5*8;
       double overtime = this.totalHoursWorked - maxhours;
       double salary;
            
      if(overtime>0){
          double overtimesalary = overtime * this.ratePerHour * 1.5;
          salary = overtimesalary + (maxhours * this.ratePerHour);
      }else{
         salary = this.totalHoursWorked * this.ratePerHour;
      }
       
       return salary;
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
        .append(this.totalHoursWorked).append(" ").append(this.ratePerHour);
        
        return sb.toString();
    }  
}
