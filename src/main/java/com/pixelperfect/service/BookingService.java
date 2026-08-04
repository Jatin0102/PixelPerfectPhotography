package com.pixelperfect.service;

import java.util.List;

import com.pixelperfect.entity.Booking;

public interface BookingService {

    Booking saveBooking(Booking booking);

    List<Booking> getAllBookings();

    Booking getBookingById(Long id);

    void deleteBooking(Long id);

}