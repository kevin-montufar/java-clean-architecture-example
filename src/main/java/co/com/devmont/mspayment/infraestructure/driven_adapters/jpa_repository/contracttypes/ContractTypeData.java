package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.contracttypes;


import co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.employees.EmployeeData;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "contract_types")
public class ContractTypeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_type_id", nullable = false, unique = true)
    private Long contractTypeId;

    @Column(length = 50)
    private String type;

    @OneToMany(mappedBy = "contractType")
    private List<EmployeeData> employeeDataList;
}
