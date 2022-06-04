package co.com.devmont.mspayment.domain.usecase.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PaymentUtilities {

    public static BigDecimal calculateSalary(
            BigDecimal completeSalary,
            String contractType,
            Integer leaveDays,
            Integer medicalDisability
    ) {
        BigDecimal dailySalary = completeSalary.divide(
                BigDecimal.valueOf(getDaysWorkedByContractType(contractType)), 2, RoundingMode.HALF_UP
        );
        int daysWorked = getDaysWorkedByContractType(contractType) - leaveDays - medicalDisability;
        return dailySalary.multiply(BigDecimal.valueOf(daysWorked));
    }

    private static int getDaysWorkedByContractType(String contractType) {
        return contractType.equals("FULL") ? 30 : 20;
    }
}
