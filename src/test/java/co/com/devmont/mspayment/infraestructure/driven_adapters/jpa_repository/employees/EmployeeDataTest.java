package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.employees;

import co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.contracttypes.ContractTypeData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDataTest {

    @Mock
    private ContractTypeData contractTypeDataMock;

    private EmployeeData employeeDataMock;

    @BeforeEach
    public void SetUp() {
        MockitoAnnotations.openMocks(this);
        employeeDataMock = new EmployeeData();
        employeeDataMock.setId(1L);
        employeeDataMock.setName("Employee one");
        employeeDataMock.setSalary(BigDecimal.valueOf(3000000));
        employeeDataMock.setDateOfIngress(LocalDate.of(2023, Month.JANUARY, 1));
        employeeDataMock.setContractType(contractTypeDataMock);
        employeeDataMock.setContractTypeId(1L);
    }
    @Test
    void getId() {
        assertEquals(1L, employeeDataMock.getId());
    }

    @Test
    void getName() {
        assertEquals("Employee one", employeeDataMock.getName());
    }

    @Test
    void getContractTypeId() {
        assertEquals(1L, employeeDataMock.getContractTypeId());
    }

    @Test
    void getDateOfIngress() {
        assertEquals(LocalDate.of(2023, Month.JANUARY, 1), employeeDataMock.getDateOfIngress());
    }

    @Test
    void getContractType() {
        assertEquals(contractTypeDataMock, employeeDataMock.getContractType());
    }

    @Test
    void getSalary() {
        assertEquals(BigDecimal.valueOf(3000000), employeeDataMock.getSalary());
    }

    @Test
    void setId() {
        employeeDataMock.setId(3L);
        assertEquals(3L, employeeDataMock.getId());
    }

    @Test
    void setName() {
        employeeDataMock.setName("other name");
        assertEquals("other name", employeeDataMock.getName());
    }

    @Test
    void setContractTypeId() {
        employeeDataMock.setContractTypeId(3L);
        assertEquals(3L, employeeDataMock.getContractTypeId());
    }

    @Test
    void setDateOfIngress() {
        employeeDataMock.setDateOfIngress(LocalDate.of(2022, Month.JANUARY, 1));
        assertEquals(LocalDate.of(2022, Month.JANUARY, 1), employeeDataMock.getDateOfIngress());
    }

    @Test
    void setContractType() {
        employeeDataMock.setContractType(null);
        assertEquals(null, employeeDataMock.getContractType());
    }

    @Test
    void setSalary() {
        employeeDataMock.setSalary(BigDecimal.valueOf(5000));
        assertEquals(BigDecimal.valueOf(5000), employeeDataMock.getSalary());
    }
}