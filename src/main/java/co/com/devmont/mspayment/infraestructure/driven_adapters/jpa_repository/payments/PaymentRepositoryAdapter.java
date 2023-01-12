package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.payments;

import co.com.devmont.mspayment.domain.model.payment.Payment;
import co.com.devmont.mspayment.domain.model.payment.PaymentRepository;
import co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentRepositoryAdapter extends AdapterOperations<Payment, PaymentData, Long, PaymentDataRepository>
        implements PaymentRepository {

    public PaymentRepositoryAdapter(PaymentDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Payment.PaymentBuilder.class).build());
    }

    @Override
    public Payment savePayment(Payment payment) {
        return super.save(payment);
    }

    @Override
    public List<Payment> listPaymentsByEmployee(Long employeeId) {
        return super.toList(repository.findByEmployeeId(employeeId));
    }

    @Override
    public List<Payment> listAll() {
        return super.findAll();
    }
}
