package co.com.devmont.mspayment.infraestructure.entry_points.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ResponseModel {
    private Object data;
    private Object meta;
}
