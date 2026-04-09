package kopo06.Dao;

import kopo06.app.Employee;

import java.util.List;

public interface EmployeeDao {
        //Create
        Employee create(Employee employee);

        //Read
        Employee readOne(String name);

        //ALL
        List<Employee> readAll();

        //Update
        Employee update(int id, Employee employee);

        //Delete
        Employee delete(String name);


}



