package com.pluralsight;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {




   private int employeeId;
   private String name;

   private String department;

   private float payRate;

   private  int hoursWorked;

   private double startTime;

    public Employee(int employeeId, String name, String department, float payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getRegularHours(){

        int regularHours = 0;

        if(this.hoursWorked <= 40){


            regularHours = this.hoursWorked;

        }else{
            regularHours = 40;
        }

        return regularHours;
    }

    public int getOvertimeHours(){
        int overTimeHours = 0;

        if(this.hoursWorked > 40){
            overTimeHours = this.hoursWorked - 40;

        }

        return overTimeHours;

    }

    public float getTotalPay(){

      float totalPay = getRegularHours()* payRate + getOvertimeHours() * 1.5f * payRate;

      return  totalPay;
    }

    public void punchIn(double time){


        this.startTime = time;

    }

    public void punchOut(double time){

       this.hoursWorked += time - this.startTime;



    }

    public void punchIn(){

       LocalDateTime now = LocalDateTime.now();

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        String formatDateTime = now.format(formatter);

        //System.out.println(formatDateTime);

        this.startTime = Double.parseDouble(formatDateTime);


    }

    public void punchOut(){
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        String formatDateTime = now.format(formatter);

        //System.out.println(formatDateTime);

       // this.hoursWorked += formatDateTime;

    }

}