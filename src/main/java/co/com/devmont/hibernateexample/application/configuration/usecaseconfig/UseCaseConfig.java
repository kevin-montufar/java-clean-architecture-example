package co.com.devmont.hibernateexample.application.configuration.usecaseconfig;

import co.com.devmont.hibernateexample.domain.model.employee.EmployeeRepository;
import co.com.devmont.hibernateexample.domain.usecase.EmployeeUseCase;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
    @Bean
    public EmployeeUseCase createEmployeeUseCase (EmployeeRepository employeeRepository) {
        return new EmployeeUseCase(employeeRepository);
    }

    @Bean
    public ObjectMapperImp createObjectMapper() {
        return new ObjectMapperImp();
    }
}
