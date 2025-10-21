package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private final double REGULAR_HOURS = 40;

    public double getTotalPay() {
        double totalPay = this.payRate * this.hoursWorked;
        return totalPay;
    }

    public double getRegularHours() {
        if (hoursWorked < REGULAR_HOURS) {
            return hoursWorked;
        } else {
            return REGULAR_HOURS;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > REGULAR_HOURS) {
            return hoursWorked - REGULAR_HOURS;
        } else {
            return 0;
        }
    }
}
