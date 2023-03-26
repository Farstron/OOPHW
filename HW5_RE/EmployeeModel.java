package HW5_RE;

import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {
    private List<Employee> employeeList;

    public EmployeeModel() {
        employeeList = new ArrayList<Employee>();
        // Инициализируем список сотрудников, например, из базы данных
        employeeList.add(new Employee(1, "John Smith", "Manager", 5000));
        employeeList.add(new Employee(2, "Jane Doe", "Developer", 4000));
        employeeList.add(new Employee(3, "Bob Johnson", "Developer", 4500));
    }

    public Employee[] getAllEmployees() {
        return employeeList.toArray(new Employee[0]);
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void updateEmployee(Employee employee) {
        Employee oldEmployee = getEmployeeById(employee.getId());
        oldEmployee.setName(employee.getName());
        oldEmployee.setPosition(employee.getPosition());
        oldEmployee.setSalary(employee.getSalary());
    }

    public void deleteEmployee(int id) {
        Employee employee = getEmployeeById(id);
        employeeList.remove(employee);
    }
}