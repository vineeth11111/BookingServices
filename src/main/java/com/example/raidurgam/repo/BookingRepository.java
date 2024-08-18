package com.example.raidurgam.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.raidurgam.entity.BookingEntity;

public interface BookingRepository extends JpaRepository<BookingEntity, UUID>{

}
