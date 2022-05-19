package co.com.devmont.mspayment.infraestructure.drivenadapters.jparepository.employees;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface EmployeeDataRepository extends CrudRepository<EmployeeData, Long>, QueryByExampleExecutor<EmployeeData> {
}
