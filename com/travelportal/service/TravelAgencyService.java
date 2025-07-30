package com.travelportal.service;

import com.travelportal.model.TravelAgency;
import java.util.List;

public interface TravelAgencyService {
    TravelAgency registerAgency(TravelAgency agency);
    List<TravelAgency> getAllAgencies();
    TravelAgency approveAgency(Long id);
    TravelAgency login(String username, String password);
}