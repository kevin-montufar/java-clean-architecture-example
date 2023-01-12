package co.com.devmont.mspayment.domain.model.employee;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder(toBuilder = true)
@JsonDeserialize(builder = Employee.EmployeeBuilder.class)
public class Employee {
    @NonNull
    @JsonProperty("id")
    private Long id;

    @NonNull
    @JsonProperty("name")
    private String name;

    @NonNull
    @JsonProperty("date_of_ingress")
    private LocalDate dateOfIngress;

    @NonNull
    @JsonProperty("salary")
    private BigDecimal salary;

    @NonNull
    @JsonProperty("contract_type_id")
    private Long contractTypeId;
}
