package co.com.devmont.mspayment.domain.usecase.payment;

import co.com.devmont.mspayment.domain.model.employee.EmployeeRepository;
import co.com.devmont.mspayment.domain.model.payment.Payment;
import co.com.devmont.mspayment.domain.model.payment.PaymentRepository;
import co.com.devmont.mspayment.domain.model.type.ContractTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PaymentUseCaseTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private ContractTypeRepository contractTypeRepository;

    @Mock
    private PaymentRepository paymentRepository;

    @Mock
    private Payment paymentMock;

    private PaymentUseCase paymentUseCase;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        paymentUseCase = new PaymentUseCase(employeeRepository, contractTypeRepository, paymentRepository);
    }

    @Test
    void savePayment() {

    }

    @Test
    void findPaymentsByEmployee() {
    }

    @Test
    void findAllPayments() {
        Mockito.when(paymentRepository.listAll()).thenReturn(Arrays.asList(paymentMock));
        assertEquals(1, paymentUseCase.findAllPayments().size());
    }
}