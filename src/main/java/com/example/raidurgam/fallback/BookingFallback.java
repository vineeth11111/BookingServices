package com.example.raidurgam.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingFallback {

	@GetMapping("/booking-fallback")
	public String bookingFallback() {
		return " Booking service is under the maintenance please try after sometime from bookingservice ...";
	}
}
