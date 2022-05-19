package co.com.devmont.mspayment.domain.usecase.payment;

import co.com.devmont.mspayment.domain.model.employee.EmployeeRepository;
import co.com.devmont.mspayment.domain.model.payment.Payment;
import co.com.devmont.mspayment.domain.model.payment.PaymentRepository;
import co.com.devmont.mspayment.domain.model.type.ContractTypeRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PaymentUseCase {
    private final EmployeeRepository employeeRepository;
    private final ContractTypeRepository contractTypeRepository;
    private final PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment) {
        return paymentRepository.savePayment(payment);
    }

    public List<Payment> findPaymentsByEmployee(Long employeeId) {
        return paymentRepository.listPaymentsByEmployee(employeeId);
    }

    public List<Payment> findAllPayments() {
        return paymentRepository.listAll();
    }
}
