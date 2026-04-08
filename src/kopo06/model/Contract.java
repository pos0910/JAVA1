package kopo06.model;

import kopo06.app.Employee;

public class Contract extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Contract(String name, int age, String dept, double hourlyRate, int hoursWorked) {
        super(name, age, dept);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calcSalary() {
        return hourlyRate * hoursWorked / 10000;
    }

    @Override
    public String getType() {
        return "계약직";
    }

    @Override
    public void print() {
        System.out.printf("[%s] %s | %s | %d세 | 시급:%.0f원 | 월급:%.0f만%n",
                getType(), getName(), getDepartment(), getAge(),
                hourlyRate, calcSalary());
    }
}