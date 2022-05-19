package co.com.devmont.mspayment.infraestructure.drivenadapters.jparepository.payments;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface PaymentDataRepository extends CrudRepository<PaymentData, Long>, QueryByExampleExecutor<PaymentData> {
    List<PaymentData> findPaymentDataByEmployeeId(Long employeeId);
}
