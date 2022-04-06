package co.com.devmont.hibernateexample.infraestructure.drivenadapters.jparepository.employee;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "EMPLOYEE")
public class EmployeeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long code;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String lastName;

    private LocalDate dateOfBirthday;

    private String job;
}
