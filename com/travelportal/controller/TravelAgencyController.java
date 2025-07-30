//package com.travelportal.controller;
//
//import com.travelportal.model.TravelAgency;
//import com.travelportal.service.TravelAgencyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/agencies")
//public class TravelAgencyController {
//
//    @Autowired
//    private TravelAgencyService agencyService;
//
//    // Register new agency
//    @PostMapping("/register")
//    public TravelAgency registerAgency(@RequestBody TravelAgency agency) {
//        return agencyService.registerAgency(agency);
//    }
//
//    // Login agency
//    @PostMapping("/login")
//    public TravelAgency login(@RequestParam String username, @RequestParam String password) {
//        return agencyService.login(username, password);
//    }
//
//    // View all agencies (admin use)
//    @GetMapping("/all")
//    public List<TravelAgency> getAllAgencies() {
//        return agencyService.getAllAgencies();
//    }
//
//    // Approve an agency (admin use)
//    @PutMapping("/approve/{id}")
//    public TravelAgency approveAgency(@PathVariable Long id) {
//        return agencyService.approveAgency(id);
//    }
//}
