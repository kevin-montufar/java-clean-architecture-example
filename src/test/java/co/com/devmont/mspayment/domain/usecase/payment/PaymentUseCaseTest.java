package co.com.devmont.mspayment.domain.usecase.payment;

import co.com.devmont.mspayment.domain.model.employee.Employee;
import co.com.devmont.mspayment.domain.model.employee.EmployeeRepository;
import co.com.devmont.mspayment.domain.model.payment.Payment;
import co.com.devmont.mspayment.domain.model.payment.PaymentRepository;
import co.com.devmont.mspayment.domain.model.type.ContractType;
import co.com.devmont.mspayment.domain.model.type.ContractTypeRepository;
import co.com.devmont.mspayment.domain.usecase.util.PaymentUtilities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PaymentUseCaseTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private ContractTypeRepository contractTypeRepository;

    @Mock
    private PaymentRepository paymentRepository;

    @Mock
    private Payment paymentMock;

    @Mock
    private Employee employeeMock;

    @Mock
    private ContractType contractTypeMock;

    private PaymentUseCase paymentUseCase;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        paymentUseCase = new PaymentUseCase(employeeRepository, contractTypeRepository, paymentRepository);
    }

    @Test
    void savePaymentSuccess() {

        contractTypeMock = ContractType.builder().type("FULL").build();
        paymentMock = Payment.builder().
                id(1L).
                employeeId(1L).
                dateOfPayment(LocalDate.of(2022, 5, 15)).
                paymentValue(BigDecimal.valueOf(200000)).
                medicalDisability(0).
                leaveDays(0).
                build();
        employeeMock = Employee.builder().salary(BigDecimal.valueOf(10000000)).build();


        Mockito.when(employeeRepository.findEmployeeById(Mockito.any())).thenReturn(employeeMock);
        Mockito.when(contractTypeRepository.findById(Mockito.any())).thenReturn(contractTypeMock);
        Mockito.when(paymentRepository.savePayment(Mockito.any())).thenReturn(paymentMock);

        try (MockedStatic<PaymentUtilities> paymentUtilitiesMock = Mockito.mockStatic(PaymentUtilities.class)) {
            System.out.println("ok");
            paymentUtilitiesMock.when(
                    () -> PaymentUtilities.calculateSalary(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())
            ).thenReturn(BigDecimal.valueOf(12300000));

            assertEquals(paymentMock, paymentUseCase.savePayment(Payment.builder().build()));
        }
    }

    @Test
    void findPaymentsByEmployeeSuccess() {
        Mockito.when(paymentRepository.listPaymentsByEmployee(Mockito.anyLong())).thenReturn(Arrays.asList(paymentMock));
        assertEquals(1, paymentUseCase.findPaymentsByEmployee(1L).size());
    }

    @Test
    void findAllPaymentsSuccess() {
        Mockito.when(paymentRepository.listAll()).thenReturn(Arrays.asList(paymentMock));
        assertEquals(1, paymentUseCase.findAllPayments().size());
    }
}