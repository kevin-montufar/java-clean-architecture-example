package co.com.devmont.mspayment.domain.model.type;

import co.com.devmont.mspayment.domain.model.employee.Employee;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
public class ContractType {
    private Long id;
    private String type;
    private List<Employee> employeeDataList;
}
