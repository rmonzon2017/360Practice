package Hibernate_Controll;
// Generated 08-jul-2019 23:10:16 by Hibernate Tools 4.3.1



/**
 * Automobile generated by hbm2java
 */
public class Automobile  implements java.io.Serializable {


     private String vin;
     private int year;
     private String make;
     private String model;
     private String body;
     private String color;

    public Automobile() {
    }

    public Automobile(String vin, int year, String make, String model, String body, String color) {
       this.vin = vin;
       this.year = year;
       this.make = make;
       this.model = model;
       this.body = body;
       this.color = color;
    }
   
    public String getVin() {
        return this.vin;
    }
    
    public void setVin(String vin) {
        this.vin = vin;
    }
    public int getYear() {
        return this.year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    public String getMake() {
        return this.make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }




}

