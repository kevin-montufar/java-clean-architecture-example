package co.com.devmont.hibernateexample.domain.usecase;

import co.com.devmont.hibernateexample.domain.model.employee.Employee;
import co.com.devmont.hibernateexample.domain.model.employee.EmployeeRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class EmployeeUseCase {

    private final EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.saveEmployee(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.listEmployees();
    }

    public Employee getEmployeeByCode(Long code) {
        return employeeRepository.findEmployeeByCode(code);
    }

    public void deleteEmployee(Employee employee) {
        employeeRepository.deleteEmployee(employee);
    }
}
