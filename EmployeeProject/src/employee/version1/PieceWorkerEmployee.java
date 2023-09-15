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
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }
    
    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public float getRatePerPiece() {
        return ratePerPiece;
    }
    
    public double computeSalary(){
        double salary;
        int perhundpieces = this.totalPiecesFinished / 100;
        if(perhundpieces > 0){
            double bonus = 10*this.ratePerPiece;
            double bonussalary = perhundpieces * bonus;
            salary = bonussalary +(this.totalPiecesFinished * this.ratePerPiece);
        }else{
            salary = this.totalPiecesFinished * this.ratePerPiece;
        }
    
        return salary;
    }
    
    public void displayInfo(){
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        System.out.printf("%d %s %s %s %d %.2f %.2f", this.empID, this.empName, ft.format(this.empDateHired),
                ft.format(this.empBirthDate), this.totalPiecesFinished, this.ratePerPiece, this.computeSalary());
    }
    
    public String toString(){
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        return this.empID+" "+empName+" "+ft.format(empDateHired)+" "+ft.format(empBirthDate)
                +" "+this.totalPiecesFinished+" "+this.ratePerPiece;
    }
}
