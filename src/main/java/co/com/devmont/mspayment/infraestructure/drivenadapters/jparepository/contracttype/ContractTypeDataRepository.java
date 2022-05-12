package co.com.devmont.mspayment.infraestructure.drivenadapters.jparepository.contracttype;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface ContractTypeDataRepository extends CrudRepository<ContractTypeData, Long>, QueryByExampleExecutor<ContractTypeData> {
}
