package co.com.devmont.mspayment.application.configuration.usecaseconfig;

import co.com.devmont.mspayment.domain.model.employee.EmployeeRepository;
import co.com.devmont.mspayment.domain.model.payment.PaymentRepository;
import co.com.devmont.mspayment.domain.model.type.ContractTypeRepository;
import co.com.devmont.mspayment.domain.usecase.employee.EmployeeUseCase;
import co.com.devmont.mspayment.domain.usecase.payment.PaymentUseCase;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
    @Bean
    public EmployeeUseCase createEmployeeUseCase(EmployeeRepository employeeRepository) {
        return new EmployeeUseCase(employeeRepository);
    }

    @Bean
    public PaymentUseCase createPaymentUseCase(EmployeeRepository employeeRepository,
                                               ContractTypeRepository contractTypeRepository,
                                               PaymentRepository paymentRepository) {
        return new PaymentUseCase(employeeRepository, contractTypeRepository, paymentRepository);
    }

    @Bean
    public ObjectMapperImp createObjectMapper() {
        return new ObjectMapperImp();
    }
}
