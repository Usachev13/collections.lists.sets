package pro.sky.collections.listssets;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private int department;
    private int salary;
    private String fullName;

    public Employee(String name, String surname, int department, int salary, String fullName) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, department, salary, fullName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
