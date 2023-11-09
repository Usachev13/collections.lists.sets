package pro.sky.collections.listssets.service;

import pro.sky.collections.listssets.model.Employee;

import java.util.Collection;
import java.util.Map;

public interface EmployeeService {

    Employee add(Employee employee);

    Employee remove(String fullName);

    String find(String fullName);

    Map <String, Employee> getMap();

    Collection<Employee> findAll();
    }
