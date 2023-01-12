package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.contracttypes;

import co.com.devmont.mspayment.domain.model.type.ContractType;
import co.com.devmont.mspayment.domain.model.type.ContractTypeRepository;
import co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ContractTypeDataRepositoryAdapter extends AdapterOperations<ContractType, ContractTypeData, Long, ContractTypeDataRepository>
        implements ContractTypeRepository {

    public ContractTypeDataRepositoryAdapter(ContractTypeDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, ContractType.ContractTypeBuilder.class).build());
    }

    @Override
    public ContractType findById(Long id) {
        return super.findById(id);
    }
}
