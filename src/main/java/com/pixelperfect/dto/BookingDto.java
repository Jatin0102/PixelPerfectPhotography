package com.pixelperfect.dto;

import java.time.LocalDate;

public class BookingDto {

    private Long bookingId;

    private Long customerId;

    private String customerName;

    private String email;

    private String mobileNumber;

    private String eventType;

    private LocalDate eventDate;

    private String eventLocation;

    private String message;

    public BookingDto() {
    }

    public BookingDto(Long bookingId, Long customerId, String customerName,
                      String email, String mobileNumber, String eventType,
                      LocalDate eventDate, String eventLocation, String message) {

        this.bookingId = bookingId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.message = message;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}