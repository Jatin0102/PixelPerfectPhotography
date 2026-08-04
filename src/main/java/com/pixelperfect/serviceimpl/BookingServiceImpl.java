package com.pixelperfect.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pixelperfect.entity.Booking;
import com.pixelperfect.repository.BookingRepository;
import com.pixelperfect.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking) {

        return bookingRepository.save(booking);

    }

    @Override
    public List<Booking> getAllBookings() {

        return bookingRepository.findAll();

    }

    @Override
    public Booking getBookingById(Long id) {

        return bookingRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteBooking(Long id) {

        bookingRepository.deleteById(id);

    }

}