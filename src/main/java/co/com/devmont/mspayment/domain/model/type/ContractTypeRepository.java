package co.com.devmont.mspayment.domain.model.type;

public interface ContractTypeRepository {
    ContractType save(ContractType contractType);
    ContractType findById(Long employeeId);
}
