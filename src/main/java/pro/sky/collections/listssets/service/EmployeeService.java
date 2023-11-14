package pro.sky.collections.listssets.service;

import pro.sky.collections.listssets.model.Employee;

import java.util.Collection;
import java.util.Map;

public interface EmployeeService {

    Employee add(String name, String surname, int department, int salary);

    Employee remove(String name, String surname);

    Employee find(String name, String surname);

    Map <String, Employee> getMap();

    Collection<Employee> findAll();
    }
