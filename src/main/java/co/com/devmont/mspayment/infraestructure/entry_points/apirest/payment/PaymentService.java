package co.com.devmont.mspayment.infraestructure.entry_points.apirest.payment;

import co.com.devmont.mspayment.domain.model.payment.Payment;
import co.com.devmont.mspayment.domain.usecase.payment.PaymentUseCase;
import co.com.devmont.mspayment.infraestructure.entry_points.model.ResponseModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/payments", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PaymentService {

    /**
     * Use case of payments
     */
    private final PaymentUseCase paymentUseCase;

    /**
     * Find all payments (Read operation letter "R" of CRUD acronym)
     * @return List of payments
     */
    @GetMapping("/list")
    public ResponseEntity<ResponseModel> getPayments() {
        List<Payment> payments = paymentUseCase.findAllPayments();
        return new ResponseEntity<>(
                ResponseModel.builder().meta(HttpStatus.OK).data(payments).build(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * Find payments of an employee (Read operation letter "R" of CRUD acronym)
     * @param employeeId Employee id
     * @return employee payments list
     */
    @GetMapping("/listByEmployee/{id}")
    public ResponseEntity<ResponseModel> getPaymentsByEmployee(@PathVariable("id") Long employeeId) {
        List<Payment> payments = paymentUseCase.findPaymentsByEmployee(employeeId);
        return new ResponseEntity<>(
                ResponseModel.builder().meta(HttpStatus.OK).data(payments).build(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * Save or update a payment (Create and Update operations letter "C" and "U" of CRUD acronym)
     * @param payment Payment to save or update when employee has id present
     * @return Payment saved
     */
    @PostMapping("/save")
    public ResponseEntity<ResponseModel> savePayment(@RequestBody Payment payment) {
        Payment paymentSaved = paymentUseCase.savePayment(payment);
        return new ResponseEntity<>(
                ResponseModel.builder().meta(HttpStatus.OK).data(paymentSaved).build(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }
}
