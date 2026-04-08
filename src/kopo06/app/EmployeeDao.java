package kopo06.app;

import java.util.List;

public interface EmployeeDao {
        //Create
        Employee create(Employee employee);

        //Read
        Employee readOne(int id);
        List<Employee> readAll();

        //Update
        Employee update(int id, Employee employee);

        //Delate
        Employee delete(int id);

        //Pagination, Sorting, Filter
        Employee findByName(String name);



}



