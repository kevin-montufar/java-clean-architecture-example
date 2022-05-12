package co.com.devmont.mspayment.domain.usecase;

import co.com.devmont.mspayment.domain.model.employee.Employee;
import co.com.devmont.mspayment.domain.model.employee.EmployeeRepository;
import co.com.devmont.mspayment.domain.model.type.ContractType;
import co.com.devmont.mspayment.domain.model.type.ContractTypeRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PaymentUseCase {

    private final EmployeeRepository employeeRepository;
    private final ContractTypeRepository contractTypeRepository;

    public Employee saveEmployee(Employee employee) {
        ContractType contractType = contractTypeRepository.save(ContractType.builder().type("FULL").build());
        System.out.println(contractType.getType());
        employee.setContractTypeId(contractType.getId());
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
