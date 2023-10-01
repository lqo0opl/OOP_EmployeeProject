    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;

/**
 *
 * @author User
 */
public class Name{
    private String fname = null;
    private String lname = null;
    private String mname = null;
    
    public Name(String fname){
        this.fname = fname;
    }
    
    public Name(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
    
    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(fname).append(" ");
        
        if(mname != null){
            sb.append(mname).append(" ");
        }
        
        if(lname != null){
            sb.append(lname).append(" ");
        }
        
        return sb.toString();
    }
   
}
