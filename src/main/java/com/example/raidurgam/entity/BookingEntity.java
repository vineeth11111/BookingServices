package com.example.raidurgam.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

import com.example.raidurgam.enums.BookingStatus;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bookings")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID )
	private UUID bookingId;
	private String userId;
	private Integer movieId;
	@ElementCollection 
	private List<String> seatsSelected; 
	private LocalDate showDate;
	private LocalTime showTime;
	@Enumerated(EnumType.STRING)
	private BookingStatus bookingStatus;
	private Double bookingAmount;

	
	
}
