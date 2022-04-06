package co.com.devmont.hibernateexample.domain.model.employee;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder(toBuilder = true)
public class Employee {
    private Long code;
    private String name;
    private String lastName;
    private LocalDate dateOfBirthday;
}
