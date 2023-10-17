package pro.sky.collections.listssets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname) {
        return employeeService.add(name, surname);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname) {
        return employeeService.remove(name, surname);


    }

    @GetMapping("/find")
    public Employee findEmployee(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname) {
        return employeeService.find(name, surname);
    }
    @GetMapping
    public Collection<Employee> findAll(){
        return employeeService.findAll();
    }
}
