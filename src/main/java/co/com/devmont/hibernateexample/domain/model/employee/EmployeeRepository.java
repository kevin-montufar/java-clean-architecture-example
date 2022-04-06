package co.com.devmont.hibernateexample.domain.model.employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> listEmployees();
    Employee saveEmployee(Employee employee);
    Employee findEmployeeByCode(Long code);
    void deleteEmployee(Employee employee);
}
