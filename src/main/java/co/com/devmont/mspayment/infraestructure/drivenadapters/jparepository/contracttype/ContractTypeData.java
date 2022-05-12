package co.com.devmont.mspayment.infraestructure.drivenadapters.jparepository.contracttype;


import co.com.devmont.mspayment.infraestructure.drivenadapters.jparepository.employee.EmployeeData;
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
    @Column(nullable = false, unique = true)
    private Long id;

    @Column(length = 50)
    private String type;

    @OneToMany(mappedBy = "contractType")
    private List<EmployeeData> employeeDataList;
}
