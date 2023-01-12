package co.com.devmont.mspayment.domain.usecase.payment;

import co.com.devmont.mspayment.domain.model.employee.Employee;
import co.com.devmont.mspayment.domain.model.employee.EmployeeRepository;
import co.com.devmont.mspayment.domain.model.payment.Payment;
import co.com.devmont.mspayment.domain.model.payment.PaymentRepository;
import co.com.devmont.mspayment.domain.model.type.ContractType;
import co.com.devmont.mspayment.domain.model.type.ContractTypeRepository;
import co.com.devmont.mspayment.domain.usecase.util.PaymentUtilities;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
public class PaymentUseCase {
    private final EmployeeRepository employeeRepository;
    private final ContractTypeRepository contractTypeRepository;
    private final PaymentRepository paymentRepository;


    public Payment savePayment(Payment payment) {

        Employee employee = employeeRepository.findEmployeeById(payment.getEmployeeId());
        if (employee == null) {
            // throw exception
        }

        ContractType contractType = contractTypeRepository.findById(employee.getContractTypeId());
        if (contractType == null) {
            // throw exception
        }

        payment.setPaymentValue(PaymentUtilities.calculateSalary(
                employee.getSalary(),
                contractType.getType(),
                payment.getLeaveDays(),
                payment.getMedicalDisability())
        );
        payment.setDateOfPayment(LocalDate.now());

        return paymentRepository.savePayment(payment);
    }

    public List<Payment> findPaymentsByEmployee(Long employeeId) {
        return paymentRepository.listPaymentsByEmployee(employeeId);
    }

    public List<Payment> findAllPayments() {
        return paymentRepository.listAll();
    }

}
