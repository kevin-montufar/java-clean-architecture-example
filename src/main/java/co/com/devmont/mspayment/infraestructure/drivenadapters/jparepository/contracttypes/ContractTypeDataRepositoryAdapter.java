package co.com.devmont.mspayment.infraestructure.drivenadapters.jparepository.contracttypes;

import co.com.devmont.mspayment.domain.model.type.ContractType;
import co.com.devmont.mspayment.domain.model.type.ContractTypeRepository;
import co.com.devmont.mspayment.infraestructure.drivenadapters.jparepository.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ContractTypeDataRepositoryAdapter extends AdapterOperations<ContractType, ContractTypeData, Long, ContractTypeDataRepository>
        implements ContractTypeRepository {

    public ContractTypeDataRepositoryAdapter(ContractTypeDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, ContractType.ContractTypeBuilder.class).build());
    }

}
