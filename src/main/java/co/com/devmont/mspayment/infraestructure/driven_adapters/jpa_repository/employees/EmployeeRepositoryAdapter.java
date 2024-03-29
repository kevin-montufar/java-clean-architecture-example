package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.employees;

import co.com.devmont.mspayment.domain.model.employee.Employee;
import co.com.devmont.mspayment.domain.model.employee.EmployeeRepository;
import co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryAdapter extends AdapterOperations<Employee, EmployeeData, Long, EmployeeDataRepository>
        implements EmployeeRepository {



    public EmployeeRepositoryAdapter(EmployeeDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Employee.EmployeeBuilder.class).build());
    }

    public List<Employee> listEmployees() {
        return super.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return super.save(employee);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        repository.deleteById(employee.getId());
    }

}
