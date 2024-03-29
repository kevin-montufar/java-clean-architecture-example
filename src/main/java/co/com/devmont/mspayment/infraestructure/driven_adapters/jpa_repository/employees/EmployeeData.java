package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.employees;


import co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.contracttypes.ContractTypeData;
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
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(name = "contract_type")
    private Long contractTypeId;

    @Column(name = "date_of_ingress")
    private LocalDate dateOfIngress;

    @ManyToOne()
    @JoinColumn(name="contract_type", insertable = false, updatable = false)
    private ContractTypeData contractType;

    private BigDecimal salary;
}
