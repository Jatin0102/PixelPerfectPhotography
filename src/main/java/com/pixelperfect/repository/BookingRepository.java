package com.pixelperfect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pixelperfect.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}