package co.com.devmont.mspayment.domain.model.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private static Employee employee;

    @BeforeEach
    void setUp() {
        employee = Employee.builder().
                id(1L).
                name("Employee 1").
                salary(BigDecimal.valueOf(20000000)).
                dateOfIngress(LocalDate.of(2022, 2, 1)).
                contractTypeId(1L).
                build();
    }

    @Test
    void getId() {
        assertNotNull(employee.getId());
    }

    @Test
    void getName() {
        assertNotNull(employee.getName());
    }

    @Test
    void getDateOfIngress() {
        assertNotNull(employee.getDateOfIngress());
    }

    @Test
    void getSalary() {
        assertNotNull(employee.getSalary());
    }

    @Test
    void getContractTypeId() {
        assertNotNull(employee.getContractTypeId());
    }

    @Test
    void setId() {
        employee.setId(2L);
        assertEquals(2, employee.getId());
    }

    @Test
    void setName() {
        employee.setName("Employee 2");
        assertEquals("Employee 2", employee.getName());
    }

    @Test
    void setDateOfIngress() {
        employee.setDateOfIngress(LocalDate.of(2022, 1, 1));
        assertEquals(1, employee.getDateOfIngress().getDayOfMonth());
    }

    @Test
    void setSalary() {
        employee.setSalary(BigDecimal.valueOf(100000));
        assertEquals(BigDecimal.valueOf(100000), employee.getSalary());
    }

    @Test
    void setContractTypeId() {
        employee.setContractTypeId(12L);
        assertEquals(Long.valueOf(12), employee.getContractTypeId());
    }

}