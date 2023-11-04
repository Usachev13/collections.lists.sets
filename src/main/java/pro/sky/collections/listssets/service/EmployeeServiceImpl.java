package pro.sky.collections.listssets.service;

import org.springframework.stereotype.Service;
import pro.sky.collections.listssets.model.Employee;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    Map<String, Employee> employees = new HashMap<>(Map.of(
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

    @Override
    public String add(Employee employee) {
        if (employees.containsKey(employee.getFullName())){
            throw new RuntimeException("УЖе есть такой человек");
        }
        employees.put(employee.getFullName(), employee);

        return "Человек добавлен";
    }

    @Override
    public String remove(String fullName) {
        final Employee employee = employees.get(fullName);
        if (employee == null) {
            throw new RuntimeException("Человек не найден");
        }
        employees.remove(employee.getFullName(), employee);
        return "Человек удален";
    }
    public String find(String fullName) {
        final Employee employee = employees.get(fullName);
        if (employee == null){
            throw new RuntimeException("Человек не найден");
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
