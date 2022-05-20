package co.com.devmont.mspayment.domain.model.type;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class ContractType {
    private Long id;
    private String type;
}
