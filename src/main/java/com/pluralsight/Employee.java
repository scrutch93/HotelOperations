package com.pluralsight;

public class Employee {
    private float totalPay;
    private int regularHours;

    private int overtimeHours;

    public Employee(float totalPay, int regularHours, int overtimeHours) {
        this.totalPay = totalPay;
        this.regularHours = regularHours;
        this.overtimeHours = overtimeHours;
    }

    public float getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(float totalPay) {
        this.totalPay = totalPay;
    }

    public int getRegularHours() {
        return regularHours;
    }

    public void setRegularHours(int regularHours) {
        this.regularHours = regularHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}
