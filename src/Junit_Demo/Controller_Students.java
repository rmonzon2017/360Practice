/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit_Demo;

/**
 *
 * @author Rafael.M
 */
public class Controller_Students {
    
   private String Code;
   private String Name;
   private String LastName;
   private double Grade; 
   private double FinaGrade;

    public Controller_Students(String Code, String Name, String LastName, double Grade, double FinaGrade) {
        this.Code = Code;
        this.Name = Name;
        this.LastName = LastName;
        this.Grade = Grade;
        this.FinaGrade = FinaGrade;
    }

        

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double Grade) {
        this.Grade = Grade;
    }

    public double getFinaGrade() {
        return FinaGrade;
    }

    public void setFinaGrade(double FinaGrade) {
        this.FinaGrade = FinaGrade;
    }
   
   public double CalculationGrade(){
       return (this.Grade + this.FinaGrade)/2;
   }
        
}
