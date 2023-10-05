        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version6;

import java.util.Date;

/**
 *
 * @author angel
 */
public abstract class Employee extends EmployeeRoster{
    private int empID;
    private Date empDateHired;
    private Date empBirthDate;
    private Name name;

    public Employee() {
        this.empID = -1;
        this.name = new Name();
        this.empDateHired = new Date();
        this.empBirthDate = new Date();
    }
    
    public Employee(int empID, Name name, Date empDateHired, Date empBirthDate) {
        this.name = name;
        this.empID = empID;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }
    
    public Employee(int id, Name name, int yearHire, int monthHire, int dayHire, int yearBirth, int monthBirth, int dayBirth){
        this.empID = id;
        this.name = name;
        this.empBirthDate = new Date(yearBirth, monthBirth, dayBirth); 
        this.empDateHired = new Date(yearHire, monthHire, dayHire);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
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

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
    
    public abstract double computeSalary();
}
