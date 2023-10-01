/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class EmployeeRoster{
    ArrayList<Employee> emp;

    public EmployeeRoster() {
        this.emp = new ArrayList<>();
    }
    
    public EmployeeRoster(int size) {
        this.emp = new ArrayList<>(size);
    }

    public ArrayList<Employee> getEmp() {
        return emp;
    }

    public void setEmp(ArrayList<Employee> emp) {
        this.emp = emp;
    }
    
    public void displayEmployee(Employee type){
        if(type.getName()!=null){
            if(type instanceof HourlyEmployee){
                HourlyEmployee temp = (HourlyEmployee)type;
                System.out.println(type+" "+temp.computeSalary());
            }
            else if(type instanceof CommissionEmployee){
                if(type instanceof BasePlusCommissionEmployee){
                    BasePlusCommissionEmployee temp = (BasePlusCommissionEmployee)type;
                    System.out.println(type+" "+temp.computeSalary());
                }else{
                    CommissionEmployee temp = (CommissionEmployee)type;
                    System.out.println(type+" "+temp.computeSalary());
                }
            }  
            else if(type instanceof PieceWorkerEmployee){
                PieceWorkerEmployee temp = (PieceWorkerEmployee)type;
                System.out.println(type+" "+temp.computeSalary());
            }
        }
    }

    public void displayAllEmployees(){
        if(!this.emp.isEmpty()){
            int i;
            for(i=0; i<this.emp.size(); i++){
                if(this.emp.get(i) instanceof HourlyEmployee){
                    HourlyEmployee temp = (HourlyEmployee)this.emp.get(i);
                    System.out.println(this.emp.get(i)+" "+temp.computeSalary());
                }
                else if(this.emp.get(i) instanceof CommissionEmployee){
                    if(this.emp.get(i) instanceof BasePlusCommissionEmployee){
                        BasePlusCommissionEmployee temp = (BasePlusCommissionEmployee)this.emp.get(i);
                        System.out.println(this.emp.get(i)+" "+temp.computeSalary());
                    }else{
                        CommissionEmployee temp = (CommissionEmployee)this.emp.get(i);
                        System.out.println(this.emp.get(i)+" "+temp.computeSalary());
                    }
                }             
                else if(this.emp.get(i) instanceof PieceWorkerEmployee){
                    PieceWorkerEmployee temp = (PieceWorkerEmployee)this.emp.get(i);
                    System.out.println(this.emp.get(i)+" "+temp.computeSalary());
                }
            }
            System.out.println();
        }
    }

    public void addEmployee(Employee e){
        this.emp.add(e);
    }
    
    public void removeEmployee(int id){
        int i;
        for(i=0; i<this.emp.size() && this.emp.get(i).getEmpID()!=id; i++){}
        if(i!=this.emp.size()){
            this.emp.remove(i);
        }
    }
    
    public void updateEmployee(int id, Name name){
        int i;
        for(i=0; i<this.emp.size() && this.emp.get(i).getEmpID()!=id; i++){}
        if(this.emp.get(i).getEmpID()==id){
            this.emp.get(i).setName(name);
        }
    }
    
        public int countHE(){
        int list = 0; 
        int i;
        for(i=0;i<this.emp.size();i++){
            if(this.emp.get(i) instanceof HourlyEmployee){
            list++;
            }
        }
        return list;
    }
    
    public int countPWE(){
        int list = 0; 
        int i;
        for(i=0;i<this.emp.size();i++){
            if(this.emp.get(i) instanceof PieceWorkerEmployee){
            list++;
            }
        }
        return list;
    }
    
    public int countCE(){
        int list = 0; 
        int i;
        for(i=0;i<this.emp.size();i++){
            if(this.emp.get(i) instanceof CommissionEmployee){
                if(this.emp.get(i) instanceof BasePlusCommissionEmployee){            
                }else{
                   list++; 
                }
            }
        }
        return list;
    }
    
    public int countBCE(){
        int list = 0; 
        int i;
        for(i=0;i<this.emp.size();i++){
            if(this.emp.get(i) instanceof BasePlusCommissionEmployee){
            list++;
            }
        }
        return list;
    }
    
    public Employee searchEmployee(String keyword){
        int i; Employee search = null;
        
        for(i=0; i<this.emp.size() && !(this.emp.get(i).getName().getFname().equalsIgnoreCase(keyword)); i++){}
        
        if(i != this.emp.size()){
           if(this.emp.get(i) instanceof HourlyEmployee){
               search = new HourlyEmployee();
           }
           if(this.emp.get(i) instanceof CommissionEmployee){
               search = new CommissionEmployee();
           }
           if(this.emp.get(i) instanceof BasePlusCommissionEmployee){
               search = new BasePlusCommissionEmployee();
           }
           if(this.emp.get(i) instanceof PieceWorkerEmployee){
               search = new PieceWorkerEmployee();
           }
      
            search = this.emp.get(i);
        }
        return search;
    }
}
