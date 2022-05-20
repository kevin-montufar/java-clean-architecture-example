package co.com.devmont.mspayment.domain.model.employee;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder(toBuilder = true)
public class Employee {
    private Long id;

    private String name;

    private LocalDate dateOfIngress;

    private BigDecimal salary;

    private Long contractTypeId;
}
