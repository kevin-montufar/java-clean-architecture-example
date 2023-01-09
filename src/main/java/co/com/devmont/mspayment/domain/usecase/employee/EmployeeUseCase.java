package co.com.devmont.mspayment.domain.usecase.employee;

import co.com.devmont.mspayment.domain.model.employee.Employee;
import co.com.devmont.mspayment.domain.model.employee.EmployeeRepository;
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
        return employeeRepository.findEmployeeById(code);
    }

    public void deleteEmployee(Employee employee) {
        employeeRepository.deleteEmployee(employee);
    }
}
