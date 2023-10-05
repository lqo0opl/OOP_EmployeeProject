/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;

import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author User
 */
public class TestMain{
     public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); 
        calendar.set(2018, (1)-1, 2); Date date = calendar.getTime();
        calendar.set(2020, (5)-1, 3); Date dates = calendar.getTime();

        //EMPLOYEES
        HourlyEmployee e1 = new HourlyEmployee(1, new Name("Jack"), date, dates,41,30);
        Employee e2 = new CommissionEmployee(2,new Name("Ash", "Dunno"), date, dates, 5000);
        Employee e3 = new BasePlusCommissionEmployee(3,new Name("Blake", "W", "What"), date, dates, 5000, 500);
        Employee e4 = new PieceWorkerEmployee(4, new Name("Jake", "M", "Paul"), date, dates, 100, 500);
        Employee e5 = new HourlyEmployee();
        
        //EMPLOYEE LIST
        EmployeeRoster roster = new EmployeeRoster(6);
        
        //ADD EMPLOYEES
        roster.addEmployee(e1);
        roster.addEmployee(e2);
        roster.addEmployee(e3);
        roster.addEmployee(e4);

        //DISPLAY ALL EMPLOYEES
        roster.displayAllEmployees();
        
        //DISPLAY EMPLOYEE
        roster.displayEmployee(e5);
        
        //COUNT
        System.out.println(roster.countHE());
        System.out.println(roster.countBCE());
        System.out.println(roster.countCE());
        System.out.println(roster.countPWE());
        
        //DELETE EMPLOYEE
        roster.removeEmployee(1);
        roster.removeEmployee(2);
        roster.removeEmployee(3);
        roster.removeEmployee(4);
        roster.displayAllEmployees();
        
        //SEARCH FOR EMPLOYEE
        EmployeeRoster roster2 = new EmployeeRoster();
        roster2 = roster.searchEmployee("Jake");
        }
}