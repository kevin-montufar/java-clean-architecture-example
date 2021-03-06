package co.com.devmont.mspayment.infraestructure.drivenadapters.jparepository.employee;


import co.com.devmont.mspayment.infraestructure.drivenadapters.jparepository.contracttype.ContractTypeData;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "employees")
public class EmployeeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(name = "contract_type")
    private Long contractTypeId;

    private LocalDate dateOfIngress;

    private BigDecimal salary;

    @ManyToOne()
    @JoinColumn(name="contract_type", insertable = false, updatable = false)
    private ContractTypeData contractType;
}
