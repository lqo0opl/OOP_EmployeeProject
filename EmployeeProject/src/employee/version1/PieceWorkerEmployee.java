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
        int perhundpieces = this.totalPiecesFinished / 100;
        double bonussalary = perhundpieces * 10* this.ratePerPiece;
      
        return this.totalPiecesFinished * this.ratePerPiece + bonussalary;
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
        .append(this.totalPiecesFinished).append(" ").append(this.ratePerPiece);
        
        return sb.toString();
    }
}
