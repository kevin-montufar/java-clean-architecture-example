package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.payments;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface PaymentDataRepository extends CrudRepository<PaymentData, Long>, QueryByExampleExecutor<PaymentData> {
    List<PaymentData> findByEmployeeId(Long employeeId);
}
