/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author angel
 */
public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee(){
    }
    
    public PieceWorkerEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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
        double bonus = 10*this.ratePerPiece;
        double bonussalary = perhundpieces * bonus;
      
        return (this.totalPiecesFinished * this.ratePerPiece) + bonussalary;
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
        .append(this.totalPiecesFinished).append(" ").append(this.ratePerPiece);
        
        return sb.toString();
    }
}

