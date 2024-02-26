package com.example.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private Long refNo;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus status;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMode mode;
    private int amount;

}
