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
    
    public void addEmployee(Employee e){
        if(this.count<this.size){
            this.emplist[this.count] = e;
            this.count++;
        }
    }
    
    public void removeEmployee(int id){
        int i;
        for(i=0; i<this.count && this.emplist[i].getEmpID()!=id; i++){}
        if(this.emplist[i]!=null){
            while(i<this.count){
                this.emplist[i] = this.emplist[i+1];
                i++;
            }
            this.count--;
        }
    }
    
    public void updateEmployee(int id, Name name){
        int i;
        for(i=0; i<this.count && this.emplist[i].getEmpID()!=id; i++){}
        if(this.emplist[i].getEmpID()==id){
            this.emplist[i].setName(name);
        }
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
    
    public Employee searchEmployee(String keyword){
        int i; Employee search = null;
        
        for(i=0; i<this.count && !(this.emplist[i].getName().getFname().equalsIgnoreCase(keyword)); i++){}
        
        if(this.emplist[i]!=null){
           if(this.emplist[i] instanceof HourlyEmployee){
               search = new HourlyEmployee();
           }
           if(this.emplist[i] instanceof CommissionEmployee){
               search = new CommissionEmployee();
           }
           if(this.emplist[i] instanceof BasePlusCommissionEmployee){
               search = new BasePlusCommissionEmployee();
           }
           if(this.emplist[i] instanceof PieceWorkerEmployee){
               search = new PieceWorkerEmployee();
           }
      
            search = this.emplist[i];
        }
        return search;
    }
}
