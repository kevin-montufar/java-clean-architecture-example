package co.com.devmont.mspayment.infraestructure.drivenadapters.jparepository.contracttypes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface ContractTypeDataRepository extends CrudRepository<ContractTypeData, Long>, QueryByExampleExecutor<ContractTypeData> {
}
