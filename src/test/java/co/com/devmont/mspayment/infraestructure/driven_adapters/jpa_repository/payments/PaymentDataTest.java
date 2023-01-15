package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.payments;

import co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.employees.EmployeeData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class PaymentDataTest {

    @Mock
    private EmployeeData employeeDataMock;
    PaymentData paymentDataMock;

    @BeforeEach
    public void SetUp() {
        MockitoAnnotations.openMocks(this);
        paymentDataMock = new PaymentData();
        paymentDataMock.setId(1L);
        paymentDataMock.setEmployeeId(2L);
        paymentDataMock.setDateOfPayment(LocalDate.of(2023, Month.JANUARY, 13));
        paymentDataMock.setPaymentValue(BigDecimal.valueOf(3000000));
        paymentDataMock.setLeaveDays(0);
        paymentDataMock.setMedicalDisability(0);
        paymentDataMock.setEmployeeData(employeeDataMock);
    }

    @Test
    void getId() {
        assertEquals(1L, paymentDataMock.getId());
    }

    @Test
    void getEmployeeId() {
        assertEquals(2L, paymentDataMock.getEmployeeId());
    }

    @Test
    void getDateOfPayment() {
        assertEquals(LocalDate.of(2023, Month.JANUARY, 13), paymentDataMock.getDateOfPayment());
    }

    @Test
    void getPaymentValue() {
        assertEquals(BigDecimal.valueOf(3000000), paymentDataMock.getPaymentValue());
    }

    @Test
    void getLeaveDays() {
        assertEquals(0, paymentDataMock.getLeaveDays());
    }

    @Test
    void getMedicalDisability() {
        assertEquals(0, paymentDataMock.getMedicalDisability());
    }

    @Test
    void getEmployeeData() {
        assertEquals(employeeDataMock, paymentDataMock.getEmployeeData());
    }

    @Test
    void setId() {
        paymentDataMock.setId(3L);
        assertEquals(3L, paymentDataMock.getId());
    }

    @Test
    void setEmployeeId() {
        paymentDataMock.setEmployeeId(1L);
        assertEquals(1L, paymentDataMock.getEmployeeId());
    }

    @Test
    void setDateOfPayment() {
        paymentDataMock.setDateOfPayment(LocalDate.of(2023, Month.JULY, 1));
        assertEquals(LocalDate.of(2023, Month.JULY, 1), paymentDataMock.getDateOfPayment());
    }

    @Test
    void setPaymentValue() {
        paymentDataMock.setPaymentValue(BigDecimal.valueOf(5000000));
        assertEquals(BigDecimal.valueOf(5000000), paymentDataMock.getPaymentValue());
    }

    @Test
    void setLeaveDays() {
        paymentDataMock.setLeaveDays(2);
        assertEquals(2, paymentDataMock.getLeaveDays());
    }

    @Test
    void setMedicalDisability() {
        paymentDataMock.setMedicalDisability(2);
        assertEquals(2, paymentDataMock.getMedicalDisability());
    }

    @Test
    void setEmployeeData() {
        paymentDataMock.setEmployeeData(null);
        assertEquals(null, paymentDataMock.getEmployeeData());
    }
}