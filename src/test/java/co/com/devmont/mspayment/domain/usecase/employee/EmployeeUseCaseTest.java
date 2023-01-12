package co.com.devmont.mspayment.domain.usecase.employee;

import co.com.devmont.mspayment.domain.model.employee.Employee;
import co.com.devmont.mspayment.domain.model.employee.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeUseCaseTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private Employee employeeMock;

    private EmployeeUseCase employeeUseCase;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        employeeUseCase = new EmployeeUseCase(employeeRepository);
    }

    @Test
    void saveEmployeeSuccess() {
        Mockito.when(employeeRepository.saveEmployee(Mockito.any())).thenReturn(employeeMock);
        assertEquals(employeeMock, employeeUseCase.saveEmployee(Mockito.any()));
    }

    @Test
    void getEmployeesSuccess() {
        Mockito.when(employeeRepository.listEmployees()).thenReturn(Arrays.asList(employeeMock));
        assertEquals(employeeMock, employeeUseCase.getEmployees().get(0));
    }

    @Test
    void getEmployeeByIdSuccess() {
        Mockito.when(employeeRepository.findEmployeeById(Mockito.any())).thenReturn(employeeMock);
        assertEquals(employeeMock, employeeUseCase.getEmployeeById(Mockito.any()));
    }

    @Test
    void deleteEmployeeSuccess() {
        employeeUseCase.deleteEmployee(Mockito.any());
        Mockito.verify(employeeRepository, Mockito.times(1)).deleteEmployee(Mockito.any());
    }
}