package com.pixelperfect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pixelperfect.entity.Booking;
import com.pixelperfect.entity.Customer;
import com.pixelperfect.repository.CustomerRepository;
import com.pixelperfect.service.BookingService;

@Controller
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/booking")
    public String showBookingForm(Model model) {

        Booking booking = new Booking();
        booking.setCustomer(new Customer());

        model.addAttribute("booking", booking);

        return "booking";
    }

    @PostMapping("/saveBooking")
    public String saveBooking(@ModelAttribute Booking booking) {

        // Save customer first
        Customer savedCustomer = customerRepository.save(booking.getCustomer());

        // Set saved customer into booking
        booking.setCustomer(savedCustomer);

        // Save booking
        bookingService.saveBooking(booking);

        return "redirect:/";
    }
}