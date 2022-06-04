package co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.payments;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import co.com.devmont.mspayment.infraestructure.driven_adapters.jpa_repository.employees.EmployeeData;

@Setter
@Getter
@Entity
@Table(name = "payments")
public class PaymentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id", nullable = false, unique = true)
    private Long id;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "date_of_payment")
    private LocalDate dateOfPayment;

    @Column(name = "payment_value")
    private BigDecimal paymentValue;

    @Column(name = "leave_days")
    private Integer leaveDays;

    @Column(name = "medical_disability")
    private Integer medicalDisability;

    @ManyToOne()
    @JoinColumn(name="employee_id", insertable = false, updatable = false)
    private EmployeeData employeeData;

}
