package co.com.devmont.mspayment.application.configuration.usecaseconfig;

import co.com.devmont.mspayment.domain.model.employee.EmployeeRepository;
import co.com.devmont.mspayment.domain.model.type.ContractTypeRepository;
import co.com.devmont.mspayment.domain.usecase.PaymentUseCase;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
    @Bean
    public PaymentUseCase createPaymentUseCase(EmployeeRepository employeeRepository, ContractTypeRepository contractTypeRepository) {
        return new PaymentUseCase(employeeRepository, contractTypeRepository);
    }

    @Bean
    public ObjectMapperImp createObjectMapper() {
        return new ObjectMapperImp();
    }
}
