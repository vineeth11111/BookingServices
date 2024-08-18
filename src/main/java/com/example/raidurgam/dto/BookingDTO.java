package com.example.raidurgam.dto;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

import com.example.raidurgam.enums.BookingStatus;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

//@Validated
@Data
public class BookingDTO {

	private UUID bookingId;
	@NotNull(message = "please provide user id")
	private String userId;
	@Positive(message="movie id cannot be negative")
	private Integer movieId;
	@NotNull(message="please select the seats")
	private List<String> seatsSelected;
	@NotNull(message="show date is missing")
	private LocalDate showDate;
	@NotNull(message="show time is missing")
	private LocalTime showTime;
	@Positive(message="booking amount cannot be negative")
	private Double bookingAmount;
	private BookingStatus bookingStatus;
	
	}

