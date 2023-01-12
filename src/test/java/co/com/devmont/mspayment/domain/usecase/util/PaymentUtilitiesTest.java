package co.com.devmont.mspayment.domain.usecase.util;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PaymentUtilitiesTest {

    @Test
    void calculateSalary() {
        assertEquals(
                BigDecimal.valueOf(10000020),
                PaymentUtilities.calculateSalary(
                        BigDecimal.valueOf(10000000),
                        "FULL",
                        0,
                        0
                )
        );
    }
}