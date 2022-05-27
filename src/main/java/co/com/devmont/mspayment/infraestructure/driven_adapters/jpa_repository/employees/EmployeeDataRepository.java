package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.employees;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface EmployeeDataRepository extends CrudRepository<EmployeeData, Long>, QueryByExampleExecutor<EmployeeData> {
}
