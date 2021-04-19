package ru.mirea.trppsecond3.entity;


import lombok.Getter;
import lombok.Setter;

/** Ответ на healthCheck. */
@Getter
@Setter

public class HealthResponse {

    /** Статус работы. */
    private String status;

    public HealthResponse(String ok) {
    }
}
