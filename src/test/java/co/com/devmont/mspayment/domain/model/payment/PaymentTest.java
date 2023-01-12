package co.com.devmont.mspayment.domain.model.payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    private static Payment payment;

    @BeforeEach
    void setUp() {
        payment = Payment.builder().
                id(1L).
                employeeId(1L).
                dateOfPayment(LocalDate.of(2022,5, 15)).
                paymentValue(BigDecimal.valueOf(200000)).
                medicalDisability(0).
                leaveDays(0).
                build();
    }

    @Test
    void getId() {
        assertEquals(1L, payment.getId());
    }

    @Test
    void getEmployeeId() {
        assertEquals(1L, payment.getEmployeeId());
    }

    @Test
    void getDateOfPayment() {
        assertEquals(5, payment.getDateOfPayment().getMonthValue());
    }

    @Test
    void getPaymentValue() {
        assertEquals(BigDecimal.valueOf(200000), payment.getPaymentValue());
    }

    @Test
    void setId() {
        payment.setId(2L);
        assertEquals(2L, payment.getId());
    }

    @Test
    void setEmployeeId() {
        payment.setEmployeeId(2L);
        assertEquals(2L, payment.getEmployeeId());
    }

    @Test
    void setDateOfPayment() {
        payment.setDateOfPayment(LocalDate.of(2021,6, 15));
        assertEquals(2021, payment.getDateOfPayment().getYear());
    }

    @Test
    void setPaymentValue() {
        payment.setPaymentValue(BigDecimal.valueOf(500000));
        assertEquals(BigDecimal.valueOf(500000), payment.getPaymentValue());
    }

}