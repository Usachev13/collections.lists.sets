package pro.sky.collections.listssets;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String name, String surname);

    Employee remove(String name, String surname);

    Employee find(String name, String surname);

    Collection<Employee> findAll();
}
