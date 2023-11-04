package pro.sky.collections.listssets.service;

import org.springframework.stereotype.Service;
import pro.sky.collections.listssets.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class DepartmentServiceImpl implements DepartmentService{
    private final EmployeeServiceImpl employeeService;

    public DepartmentServiceImpl(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }


    public Optional<Employee> maxSalary(int department){
        return employeeService.getMap().values()
                .stream()
                .filter(employee -> employee.getDepartment() == department)
                .max(Comparator.comparingInt(Employee::getSalary));
    }
    public Optional<Employee> minSalary(int department){
        return employeeService.getMap().values()
                .stream()
                .filter(employee -> employee.getDepartment() == department)
                .min(Comparator.comparingInt(Employee::getSalary));
    }
    public List<Employee> findAllDepartment(Integer department){
        return employeeService.findAll()
                .stream()
                .filter(employee -> employee.getDepartment() == department)
                .collect(Collectors.toList());
    }
    public Map<Integer, List<Employee>> getAll(){
        return employeeService.findAll()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}

