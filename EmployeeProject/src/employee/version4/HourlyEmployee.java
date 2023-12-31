/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author angel
 */
public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;        
    
    public HourlyEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {   
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(){   
        super();
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }
    
    public HourlyEmployee(int empID, Name empName, int yearHire, int monthHire, int dayHire, int yearBirth, int monthBirth, int dayBirth, float totalHoursWorked, float ratePerHour){
        super(empID, empName, yearHire, monthHire, dayHire, yearBirth, monthBirth, dayBirth);
        this.totalHoursWorked = totalHoursWorked;
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
          double overtimesalary = overtime * (this.ratePerHour * 1.5);
          salary = (overtimesalary + (maxhours * this.ratePerHour));
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
        
        sb.append(getEmpID()).append(" ").append(getName())
        .append(ft.format(getEmpDateHired())).append(" ")
        .append(ft.format(getEmpBirthDate())).append(" ")
        .append(this.totalHoursWorked).append(" ").append(this.ratePerHour);
        
        return sb.toString();
    } 
}
