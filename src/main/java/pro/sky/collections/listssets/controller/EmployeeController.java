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
    public String add(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname,
            @RequestParam("department") int department,
            @RequestParam("salary") int salary,
            @RequestParam("fullName") String fullName


    ) {
        Employee employee = new Employee(name,
                surname,
                department,
                salary);
        return employeeService.add(employee);
    }

    @GetMapping("/remove")
    public String removeEmployee(
            @RequestParam("fullName") String fullName
    ) {
        return employeeService.remove(fullName);
    }

    @GetMapping("/find")
    public String findEmployee(@RequestParam("fullName")String fullName){
        return employeeService.find(fullName);
    }

}
