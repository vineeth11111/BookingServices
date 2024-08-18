package com.example.raidurgam.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.raidurgam.dto.BookingDTO;
import com.example.raidurgam.entity.BookingEntity;
import com.example.raidurgam.enums.BookingStatus;
import com.example.raidurgam.repo.BookingRepository;
import com.example.raidurgam.service.BookingService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

	private @Autowired BookingRepository BookingRepo;
	@Override
	public BookingDTO bookingTicketService(BookingDTO bookingDTO) {
		
		BookingEntity bookingEntity = BookingEntity.builder().bookingAmount(bookingDTO.getBookingAmount())
		                       .userId(bookingDTO.getUserId())
		                       .showDate(bookingDTO.getShowDate())
		                       .showTime(bookingDTO.getShowTime())
		                       .bookingStatus(BookingStatus.PENDING)
		                       .movieId(bookingDTO.getMovieId())
		                       .build();
	 BookingEntity savedBookingEntity = BookingRepo.save(bookingEntity);
	 
	 bookingDTO.setBookingStatus(BookingStatus.PENDING);
	 bookingDTO.setBookingId(savedBookingEntity.getBookingId());
	 
	 return bookingDTO;
	}

}
