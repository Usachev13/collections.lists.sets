package pro.sky.collections.listssets.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.collections.listssets.model.Employee;
import pro.sky.collections.listssets.service.DepartmentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping("/max-salary")
    public Optional<Employee> maxSalary(@RequestParam int dep) {
        return service.maxSalary(dep);
    }

    @GetMapping("/min-salary")
    public Optional<Employee> minSalary(@RequestParam int departmentId) {
        return service.minSalary(departmentId);
    }

    @GetMapping(value = "/all", params = "department")
    public ResponseEntity<?> findAll(@RequestParam(required = false) Integer departmentId) {
        return departmentId == null?
                ResponseEntity.ok(service.getAll())
                :
                ResponseEntity.ok(service.findAllDepartment(departmentId));

    }

}
