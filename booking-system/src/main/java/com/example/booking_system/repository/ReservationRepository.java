package com.example.booking_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booking_system.entity.Reservation;
import com.example.booking_system.enums.ReservationStatus;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByUserId(Long userId);

    List<Reservation> findByStatus(ReservationStatus status);
}