//package com.travelportal.service.impl;
//
//import com.travelportal.model.TravelAgency;
//import com.travelportal.repository.TravelAgencyRepository;
//import com.travelportal.service.TravelAgencyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class TravelAgencyServiceImpl implements TravelAgencyService {
//
//    @Autowired
//    private TravelAgencyRepository repository;
//
//    @Override
//    public TravelAgency registerAgency(TravelAgency agency) {
//        return repository.save(agency);
//    }
//
//    @Override
//    public List<TravelAgency> getAllAgencies() {
//        return repository.findAll();
//    }
//
//    @Override
//    public TravelAgency approveAgency(Long id) {
//        TravelAgency agency = repository.findById(id).orElse(null);
//        if (agency != null) {
//            agency.setApproved(true);
//            repository.save(agency);
//        }
//        return agency;
//    }
//
//    @Override
//    public TravelAgency login(String username, String password) {
//        TravelAgency agency = repository.findByUsername(username);
//        if (agency != null && agency.getPassword().equals(password) && agency.isApproved()) {
//            return agency;
//        }
//        return null;
//    }
//}
