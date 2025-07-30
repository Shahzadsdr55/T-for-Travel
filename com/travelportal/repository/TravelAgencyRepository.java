package com.travelportal.repository;

import com.travelportal.model.TravelAgency;
//import org.springframework.data.jpa.repository.JpaRepository; ((baad me sahi krna hai Insha Allah))

//incomplete interface for extand with JpaRepository ((baad me sahi krna hai Insha Allah))
public interface TravelAgencyRepository <TravelAgency, Long> {
    TravelAgency findByUsername(String username);
}
