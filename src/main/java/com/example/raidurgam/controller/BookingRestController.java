package com.example.raidurgam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.raidurgam.brokers.PaymentServiceBroker;
import com.example.raidurgam.dto.BookingDTO;
import com.example.raidurgam.service.BookingService;

import jakarta.validation.Valid;

@RestController
public class BookingRestController {
	
	@Autowired
	private PaymentServiceBroker paymentService;
	
	@Autowired
	private BookingService bookingService;

	@PostMapping("/booking")
	public BookingDTO bookTickets(@Valid @RequestBody BookingDTO bookingDTO){
		BookingDTO updatedBookingDTO = bookingService.bookingTicketService(bookingDTO);
		return paymentService.createPayment(updatedBookingDTO);
	}
	
	@GetMapping("/booking/test")
	public String test() {
		return "From test booking controller";
	}
}
