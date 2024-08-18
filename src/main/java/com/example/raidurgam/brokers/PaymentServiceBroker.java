package com.example.raidurgam.brokers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.raidurgam.dto.BookingDTO;

@FeignClient("payment-services")
public interface PaymentServiceBroker {

	@PostMapping("/payments/")
	BookingDTO createPayment(BookingDTO bookingDTO);
}
