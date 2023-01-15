package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.contracttypes;

import co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.employees.EmployeeData;
import co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.payments.PaymentData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ContractTypeDataTest {

    @Mock
    private EmployeeData employeeDataMock;

    private ContractTypeData contractTypeDataMock;

    @BeforeEach
    public void SetUp() {
        MockitoAnnotations.openMocks(this);
        contractTypeDataMock = new ContractTypeData();
        contractTypeDataMock.setId(1L);
        contractTypeDataMock.setType("FULL");
        contractTypeDataMock.setEmployeeDataList(Arrays.asList(employeeDataMock));
    }

    @Test
    void getId() {
        assertEquals(1L, contractTypeDataMock.getId());
    }

    @Test
    void getType() {
        assertEquals("FULL", contractTypeDataMock.getType());
    }

    @Test
    void getEmployeeDataList() {
        assertEquals(Arrays.asList(employeeDataMock), contractTypeDataMock.getEmployeeDataList());
    }

    @Test
    void setId() {
        contractTypeDataMock.setId(2L);
        assertEquals(2L, contractTypeDataMock.getId());
    }

    @Test
    void setType() {
        contractTypeDataMock.setType("PARTIAL");
        assertEquals("PARTIAL", contractTypeDataMock.getType());
    }

    @Test
    void setEmployeeDataList() {
        contractTypeDataMock.setEmployeeDataList(null);
        assertEquals(null, contractTypeDataMock.getEmployeeDataList());
    }
}