package pro.sky.collections.listssets.service;

import pro.sky.collections.listssets.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DepartmentService {

    public Optional<Employee> maxSalary(int department);

    public Optional<Employee> minSalary(int department);

    public List<Employee> findAllDepartment(Integer department);

    public Map<Integer, List<Employee>> getAll();

}
