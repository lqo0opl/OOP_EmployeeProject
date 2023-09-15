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
public class HourlyEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;        

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHoursWWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWWorked) {
        this.totalHoursWorked = totalHoursWWorked;
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
    
    //NO DATE CUH
    public void displayInfo(){
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        System.out.printf("%d %s %s %s %.2f %.2f %.2f", this.empID, this.empName, ft.format(this.empDateHired),
                ft.format(this.empBirthDate), this.totalHoursWorked, this.ratePerHour, this.computeSalary());
    }
    
    public String toString(){
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        return this.empID+" "+empName+" "+ft.format(empDateHired)+" "+ft.format(empBirthDate)
                +" "+this.totalHoursWorked+" "+this.ratePerHour;
    }
}   
     