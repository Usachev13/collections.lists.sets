package pro.sky.collections.listssets.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pro.sky.collections.listssets.exception.EmployeeInvalidInputException;
import pro.sky.collections.listssets.exception.EmployeesAlredyAddedException;
import pro.sky.collections.listssets.exception.EmployeesNotFoundException;
import pro.sky.collections.listssets.model.Employee;

import java.util.*;

import static org.apache.commons.lang3.StringUtils.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employees = new HashMap<>(Map.of(
            "Александр Пушкин",
            new Employee("Александр", "Пушкин", 1, 60000),
            "Михаил Лермонтов",
            new Employee("Михаил", "Лермонтов", 1, 70000),
            "Александр Блок",
            new Employee("Александр", "Блок", 1, 80000),
            "Сергей Есенин",
            new Employee("Сергей", "Есенин", 2, 90000),
            "Владимир Маяковский",
            new Employee("Владимир", "Маяковский", 2, 100000),
            "Булат Окуджава",
            new Employee("Булат", "Окуджава", 2, 110000),
            "Иосиф Бродский",
            new Employee("Иосиф", "Бродский", 3, 120000),
            "Дмитрий Быков",
            new Employee("Дмитрий", "Быков", 3, 130000),
            "Алишер Моргенштерн",
            new Employee("Алишер", "Моргенштерн", 3, 140000)
    )
    );

    private void checkIsAlfa(String name, String surname){
        if (!(isAlpha(surname)&& isAlpha(name))){
            throw new EmployeeInvalidInputException("Не правильно введены данные");
        }
    }

    @Override
    public Employee add(Employee employee) {
        checkIsAlfa(employee.getName(), employee.getSurname());
        if (employees.containsKey(employee.getFullName())){
            throw new EmployeesAlredyAddedException("УЖе есть такой человек");
        }
        employees.put(employee.getFullName(), employee);

        return employee;
    }

    @Override
    public Employee remove(String fullName) {
        final Employee employee = employees.get(fullName);
        if (employee == null) {
            throw new EmployeesNotFoundException("Человек не найден");
        }
        employees.remove(employee.getFullName(), employee);
        return employee;
    }
    public String find(String fullName) {
        final Employee employee = employees.get(fullName);
        if (employee == null){
            throw new EmployeesNotFoundException("Человек не найден");
        }
        return " "
                + employee.getName() + " "
                + employee.getSurname() + " "
                + employee.getDepartment() + " "
                + employee.getSalary() + " ";
    }

    @Override
    public Map<String, Employee> getMap() {
        return employees;
    }

    public Collection<Employee> findAll(){
        return Collections.unmodifiableCollection(employees.values());
    }
}
