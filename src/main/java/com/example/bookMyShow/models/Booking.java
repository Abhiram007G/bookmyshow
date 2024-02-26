package com.example.bookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    private int amount;
    @OneToMany
    private List<Payment> paymentList;
    private BookingStatus bookingStatus;
    @OneToMany
    private List<ShowSeat> showSeatList;

}
