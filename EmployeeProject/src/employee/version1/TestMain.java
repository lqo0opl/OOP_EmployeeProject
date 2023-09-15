/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;
import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author User
 */
public class TestMain {
     public static void main(String[] args) {
         Calendar calendar = Calendar.getInstance(); 
         
         calendar.set(2018, (1)-1, 2); Date date = calendar.getTime();
         calendar.set(2020, (5)-1, 3); Date dates = calendar.getTime();
         
         //Hourly Employee
         HourlyEmployee e1 = new HourlyEmployee(1,"Mark", date, dates,41,30);
         System.out.println(e1.computeSalary());
         e1.displayInfo();
         System.out.println(e1+"\n");
         
         //CommissionEmployee
         CommissionEmployee e2 = new CommissionEmployee(1,"Ash", date, dates, 5000);
         System.out.println(e2.computeSalary());
         e2.displayInfo();
         System.out.println(e2+"\n");
         
         //BasePlusCommissionEmployee
         BasePlusCommissionEmployee e3 = new BasePlusCommissionEmployee(1,"Mike", date, dates, 5000, 500);
         System.out.println(e3.computeSalary());
         e3.displayInfo();
         System.out.println(e3+"\n");
         
         //PieceWorkerEmployee
         PieceWorkerEmployee e4 = new PieceWorkerEmployee(1,"Jake", date, dates, 100, 500);
         System.out.println(e4.computeSalary());
         e4.displayInfo();
         System.out.println(e4+"\n");
    
    }   
    
}
