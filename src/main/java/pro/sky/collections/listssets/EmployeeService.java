package pro.sky.collections.listssets;

public interface EmployeeService {

    String add(Employee employee);

    String remove(String fullName);

    String find(String fullName);
}
