package pro.sky.collections.listssets.service;

import pro.sky.collections.listssets.model.Employee;

import java.util.Map;

public interface EmployeeService {

    String add(Employee employee);

    String remove(String fullName);

    String find(String fullName);

    Map <String, Employee> getMap();
}
