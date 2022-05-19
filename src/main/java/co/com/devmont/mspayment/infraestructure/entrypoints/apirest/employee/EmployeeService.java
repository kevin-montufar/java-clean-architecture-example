package co.com.devmont.mspayment.infraestructure.entrypoints.apirest.employee;

import co.com.devmont.mspayment.domain.model.employee.Employee;
import co.com.devmont.mspayment.domain.usecase.employee.EmployeeUseCase;
import co.com.devmont.mspayment.infraestructure.entrypoints.model.ResponseModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/employees", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class EmployeeService {

    /**
     * Use case of employees
     */
    private final EmployeeUseCase employeeUseCase;

    /**
     * Save or update an employee (Create and Update operations letter "C" and "U" of CRUD acronym)
     * @param employee Employee to save or update when employee has id present
     * @return employee saved
     */
    @PostMapping("/save")
    public ResponseEntity<ResponseModel> saveEmployee(@RequestBody Employee employee) {
        Employee employeeSaved = employeeUseCase.saveEmployee(employee);
        return new ResponseEntity<>(
                ResponseModel.builder().meta(HttpStatus.OK).data(employeeSaved).build(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * Find all employees (Read operation letter "R" of CRUD acronym)
     * @return List of employees
     */
    @GetMapping("/list")
    public ResponseEntity<ResponseModel> getEmployees() {
        List<Employee> employees = employeeUseCase.getEmployees();
        return new ResponseEntity<>(
                ResponseModel.builder().meta(HttpStatus.OK).data(employees).build(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * Find a specific employee by code (Read operation letter "R" of CRUD acronym)
     * @param code code employee - identification number
     * @return Employee found
     */
    @GetMapping("/find/{code}")
    public ResponseEntity<ResponseModel> getEmployee(@PathVariable("code") Long code) {
        Employee employee = employeeUseCase.getEmployeeByCode(code);
        return new ResponseEntity<>(
                ResponseModel.builder().meta(HttpStatus.OK).data(employee).build(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseModel> deleteEmployee(@RequestBody Employee employee) {
        employeeUseCase.deleteEmployee(employee);
        return new ResponseEntity<>(
                ResponseModel.builder().meta(HttpStatus.OK).data(employee).build(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }
}
