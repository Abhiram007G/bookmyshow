package com.example.bookMyShow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int number;
    @OneToOne
    private SeatType seatType;
    private int rowNum;
    private int colNum;
}
