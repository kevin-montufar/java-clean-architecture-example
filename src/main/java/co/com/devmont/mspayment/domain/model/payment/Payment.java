package co.com.devmont.mspayment.domain.model.payment;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder(toBuilder = true)
public class Payment {
    private Long id;

    private Long employeeId;

    private LocalDate dateOfPayment;

    private BigDecimal paymentValue;

    private Integer leaveDays;

    private Integer medicalDisability;
}
