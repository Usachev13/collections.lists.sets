package pro.sky.collections.listssets;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    Map<String, Employee> employees = new HashMap<>(Map.of(
            "Александр Пушкин",
            new Employee("Александр", "Пушкин", 1, 60000, "Александр Пушкин"),
            "Михаил Лермонтов",
            new Employee("Михаил", "Лермонтов", 1, 70000, "Михаил Лермонтов"),
            "Александр Блок",
            new Employee("Александр", "Блок", 1, 80000, "Александр Блок"),
            "Сергей Есенин",
            new Employee("Сергей", "Есенин", 2, 90000, "Сергей Есенин"),
            "Владимир Маяковский",
            new Employee("Владимир", "Маяковский", 2, 100000, "Владимир Маяковский"),
            "Булат Окуджава",
            new Employee("Булат", "Окуджава", 2, 110000, "Булат Окуджава"),
            "Иосиф Бродский",
            new Employee("Иосиф", "Бродский", 3, 120000, "Иосиф Бродский"),
            "Дмитрий Быков",
            new Employee("Дмитрий", "Быков", 3, 130000, "Дмитрий Быков"),
            "Алишер Моргенштерн",
            new Employee("Алишер", "Моргенштерн", 3, 140000, "Алишер Моргенштерн")
    )
    );

    @Override
    public String add(Employee employee) {
        if (employees.containsKey(employee.getFullName())){
            throw new RuntimeException("Такой человек уже есть");
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
        return " "
                + employee.getName() + " "
                + employee.getSurname() + " "
                + employee.getDepartment() + " "
                + employee.getSalary() + " ";
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
}
