package co.com.devmont.hibernateexample.infraestructure.entrypoints.model;

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
