package kopo06.model;

import kopo06.app.Employee;

public class Intern extends Employee {
    private double stipend;

    public Intern(String name, int age, String dept, double stipend) {
        super(name, age, dept);
        this.stipend = stipend;
    }

    @Override
    public double calcSalary() {
        return stipend;
    }

    @Override
    public String getType() {
        return "인턴";
    }

    @Override
    public void print() {
        System.out.printf("[%s] %s | %s | %d세 | 수당:%.0f만%n",
                getType(), getName(), getDepartment(), getAge(), stipend);
    }
}