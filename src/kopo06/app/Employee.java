package kopo06.app;

import kr.ac.koopo.ctc.aisw.kopo06.model.Printable;

public abstract class Employee implements Printable {
    private String name;
    private int age;
    private String department;
    private static int totalCount = 0;
    private int id;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
        totalCount++;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public static int getTotalCount() { return totalCount; }

    public abstract double calcSalary();
    public abstract String getType();

    public abstract void print();

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}