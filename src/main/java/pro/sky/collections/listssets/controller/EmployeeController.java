package pro.sky.collections.listssets.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.collections.listssets.model.Employee;
import pro.sky.collections.listssets.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname,
            @RequestParam("department") int department,
            @RequestParam("salary") int salary


    ) {
        return employeeService.add(name, surname, department, salary);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname
    ) {
        return employeeService.remove(name, surname);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam(
            "name")String name,
                               @RequestParam("surname") String surname
    ) {
        return employeeService.find(name, surname);
    }

}
