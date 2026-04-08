package kopo06.model;

import kopo06.app.Employee;

public class FullTime extends Employee {
    private double annualSalary;

    public FullTime(String name, int age, String dept, double annualSalary) {
        super(name, age, dept);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calcSalary() { return annualSalary / 12; }

    @Override
    public String getType() { return "정규직"; }

    @Override
    public void print() {
        System.out.printf("[%s] %s | %s | %d세 | 연봉:%.0f만 | 월급:%.0f만%n",
                getType(), getName(), getDepartment(), getAge(),
                annualSalary, calcSalary());
    }
}