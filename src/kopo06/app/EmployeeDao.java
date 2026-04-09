package kopo06.app;

import java.util.List;

public interface EmployeeDao {
        //Create
        Employee create(Employee employee);

        //Read
        Employee readOne(String name);

        List<Employee> readAll();

        //Update
        Employee update(int id, Employee employee);

        //Delete
        Employee delete(String name);




}



