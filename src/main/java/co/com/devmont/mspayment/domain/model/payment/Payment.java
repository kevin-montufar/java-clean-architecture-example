package co.com.devmont.mspayment.domain.model.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder(toBuilder = true)
@JsonDeserialize(builder = Payment.PaymentBuilder.class)
public class Payment {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("employee_id")
    private Long employeeId;

    @JsonProperty("date_of_payment")
    private LocalDate dateOfPayment;

    @JsonProperty("payment_value")
    private BigDecimal paymentValue;

    @JsonProperty("leave_days")
    private Integer leaveDays;

    @JsonProperty("medical_disability")
    private Integer medicalDisability;
}
