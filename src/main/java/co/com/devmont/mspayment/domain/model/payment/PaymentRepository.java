package co.com.devmont.mspayment.domain.model.payment;

import java.util.List;

public interface PaymentRepository {
    Payment savePayment(Payment payment);
    List<Payment> listPaymentsByEmployee(Long employeeId);

    List<Payment> listAll();
}
