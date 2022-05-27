package co.com.devmont.mspayment.domain.usecase.payment;

import co.com.devmont.mspayment.domain.model.employee.Employee;
import co.com.devmont.mspayment.domain.model.employee.EmployeeRepository;
import co.com.devmont.mspayment.domain.model.payment.Payment;
import co.com.devmont.mspayment.domain.model.payment.PaymentRepository;
import co.com.devmont.mspayment.domain.model.type.ContractType;
import co.com.devmont.mspayment.domain.model.type.ContractTypeRepository;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
public class PaymentUseCase {
    private final EmployeeRepository employeeRepository;
    private final ContractTypeRepository contractTypeRepository;
    private final PaymentRepository paymentRepository;


    public Payment savePayment(Long employeeId) {

        Employee employee = employeeRepository.findEmployeeByCode(employeeId);
        if (employee == null) {
            // throw exception
        }

        ContractType contractType = contractTypeRepository.findById(employee.getContractTypeId());
        if (contractType == null) {
            // throw exception
        }
        int daysWorked = (contractType.getType().equals("FULL")) ? 30 : 20;
        BigDecimal salary = employee.getSalary().multiply(BigDecimal.valueOf(daysWorked));

        Payment payment = Payment.builder()
                .employeeId(employeeId)
                .daysWorked(daysWorked)
                .dateOfPayment(LocalDate.now())
                .paymentValue(salary)
                .build();

        return paymentRepository.savePayment(payment);
    }

    public List<Payment> findPaymentsByEmployee(Long employeeId) {
        return paymentRepository.listPaymentsByEmployee(employeeId);
    }

    public List<Payment> findAllPayments() {
        return paymentRepository.listAll();
    }

}
