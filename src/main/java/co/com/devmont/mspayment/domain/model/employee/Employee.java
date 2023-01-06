package co.com.devmont.mspayment.domain.model.employee;

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
@JsonDeserialize(builder = Employee.EmployeeBuilder.class)
public class Employee {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("date_of_ingress")
    private LocalDate dateOfIngress;

    @JsonProperty("salary")
    private BigDecimal salary;

    @JsonProperty("contract_type_id")
    private Long contractTypeId;

}
