package co.com.devmont.hibernateexample.infraestructure.drivenadapters.jparepository.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface EmployeeDataRepository extends CrudRepository<EmployeeData, Long>, QueryByExampleExecutor<EmployeeData> {
}
