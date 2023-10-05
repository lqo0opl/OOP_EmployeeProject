/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;
/**
 *
 * @author User
 */
public class EmployeeRoster{
    private int count;
    private int size;
    private Employee[] emplist;

    public EmployeeRoster() {
        this.emplist = new Employee[10];
        this.count = 0;
        this.size = 10;
    }
    
    public EmployeeRoster(int size){
        this.emplist = new Employee[size];
        this.count = 0;
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Employee[] getEmplist() {
        return emplist;
    }
    
    public void setEmplist(Employee[] emplist) {
        this.emplist = emplist;
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
        if(this.emplist[0]!=null){
            int i;
            for(i=0; i<this.count; i++){
                if(this.emplist[i] instanceof HourlyEmployee){
                    HourlyEmployee temp = (HourlyEmployee)this.emplist[i];
                    System.out.println(this.emplist[i]+" "+temp.computeSalary());
                }
                else if(this.emplist[i] instanceof CommissionEmployee){
                    if(this.emplist[i] instanceof BasePlusCommissionEmployee){
                        BasePlusCommissionEmployee temp = (BasePlusCommissionEmployee)this.emplist[i];
                        System.out.println(this.emplist[i]+" "+temp.computeSalary());
                    }else{
                        CommissionEmployee temp = (CommissionEmployee)this.emplist[i];
                        System.out.println(this.emplist[i]+" "+temp.computeSalary());
                    }
                }             
                else if(this.emplist[i] instanceof PieceWorkerEmployee){
                    PieceWorkerEmployee temp = (PieceWorkerEmployee)this.emplist[i];
                    System.out.println(this.emplist[i]+" "+temp.computeSalary());
                }
            }
            System.out.println();
        }
    }
    
    public boolean addEmployee(Employee e){
        if(this.count<this.size){
            this.emplist[this.count] = e;
            this.count++;
            return true;
        }
        return false;
    }
    
    public Employee removeEmployee(int id){
        int i; Employee ret = null;
        for(i=0; i<this.count && this.emplist[i].getEmpID()!=id; i++){}
        if(this.emplist[i]!=null){  
            ret = this.emplist[i];
            while(i<this.count){
                this.emplist[i] = this.emplist[i+1];
                i++;
            }
            this.count--;          
        }
        
        return ret;
    }
        
    
    public boolean updateEmployee(int id, Name name){
        int i;
        for(i=0; i<this.count && this.emplist[i].getEmpID()!=id; i++){}
        if(this.emplist[i].getEmpID()==id){
            this.emplist[i].setName(name);
            return true;
        }
        return false;
    }
    
    public int countHE(){
        int list = 0; 
        int i;
        for(i=0;i<this.count;i++){
            if(this.emplist[i] instanceof HourlyEmployee){
            list++;
            }
        }
        return list;
    }
    
    public int countPWE(){
        int list = 0; 
        int i;
        for(i=0;i<this.count;i++){
            if(this.emplist[i] instanceof PieceWorkerEmployee){
            list++;
            }
        }
        return list;
    }
    
    public int countCE(){
        int list = 0; 
        int i;
        for(i=0;i<this.count;i++){
            if(this.emplist[i] instanceof CommissionEmployee){
                if(this.emplist[i] instanceof BasePlusCommissionEmployee){            
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
        for(i=0;i<this.count;i++){
            if(this.emplist[i] instanceof BasePlusCommissionEmployee){
            list++;
            }
        }
        return list;
    }
    
    public EmployeeRoster searchEmployee(String keyword){
        int i; EmployeeRoster search = new EmployeeRoster();;
        
        for(i=0; i<this.count && !(this.emplist[i].getName().getFname().equalsIgnoreCase(keyword)); i++){}
        
        if(this.emplist[i]!=null){
           search.addEmployee(this.emplist[i]);
        }
        return search;
    }
}
