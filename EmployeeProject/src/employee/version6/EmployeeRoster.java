/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;
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
         System.out.println(type+" "+type.computeSalary());
        }
    }

    public void displayAllEmployees(){
        if(!this.emp.isEmpty()){
            int i;
            for(i=0; i<this.emp.size(); i++){
               System.out.println(this.emp.get(i)+" "+this.emp.get(i).computeSalary());
            }
            System.out.println();
        }
    }

    public boolean addEmployee(Employee e){
        int b = this.emp.size();
        this.emp.add(e);
        return b!=this.emp.size();
    }
    
    public Employee removeEmployee(int id){
        int i; Employee ret = null;
        for(i=0; i<this.emp.size() && this.emp.get(i).getEmpID()!=id; i++){}
        if(i!=this.emp.size()){
            ret = this.emp.get(i);
            this.emp.remove(i);
        }
        return ret;
    }
    
    public boolean updateEmployee(int id, Name name){
        int i;
        for(i=0; i<this.emp.size() && this.emp.get(i).getEmpID()!=id; i++){}
        if(this.emp.get(i).getEmpID()==id){
            this.emp.get(i).setName(name);
            return true;
        }
        return false;
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
    
    public EmployeeRoster searchEmployee(String keyword){
        int i; EmployeeRoster search = new EmployeeRoster();;
        
        for(i=0; i<this.emp.size() && !(this.emp.get(i).getName().getFname().equalsIgnoreCase(keyword)); i++){}
        
        if(i != this.emp.size()){
           search.addEmployee(this.emp.get(i));
        }
        return search;
    }
}
