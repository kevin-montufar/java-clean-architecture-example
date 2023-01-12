package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.contracttypes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface ContractTypeDataRepository extends CrudRepository<ContractTypeData, Long>, QueryByExampleExecutor<ContractTypeData> {
}
