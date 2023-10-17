package pro.sky.collections.listssets;
import org.springframework.stereotype.Service;
import pro.sky.collections.listssets.exception.EmployeesAlredyAddedException;
import pro.sky.collections.listssets.exception.EmployeesNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
      private final List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Александр", "Пушкин"),
            new Employee("Михаил", "Лермонтов"),
            new Employee("Александр", "Блок"),
            new Employee("Сергей", "Есенин"),
            new Employee("Владимир","Маяковский"),
            new Employee("Булат", "Окуджава"),
            new Employee("Иосиф","Бродский"),
            new Employee("Дмитрий", "Быков"),
            new Employee("Алишер","Моргенштерн")
      )
      );

    private final int  limit = 11;
    @Override
    public Employee add(String name, String surname){
        Employee employee = new Employee(name, surname);
        if (employees.contains(employee)){
            throw new EmployeesAlredyAddedException();
        }
        employees.add(employee);
        return employee;

    }
    @Override
    public Employee remove(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employees.contains(employee)) {
            employees.remove(employee);
            return employee;
        }
        throw new EmployeesNotFoundException();
    }
    @Override
    public Employee find(String name, String surname){
        Employee employee = new Employee(name, surname);
        if (employees.contains(employee)){
            return employee;
        }
        throw new EmployeesNotFoundException();
    }

    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableList(employees);
    }
}
