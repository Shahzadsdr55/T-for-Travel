package com.travelportal.model;

//import jakarta.persistence.*;

//@Entity ((baad me sahi krna hai Insha Allah))
//@Table(name = "travel_agencies") ((baad me sahi krna hai Insha Allah))
public class TravelAgency {

//    @Id ((baad me sahi krna hai Insha Allah))
//    @GeneratedValue(strategy = GenerationType.IDENTITY) ((baad me sahi krna hai Insha Allah))
    private Long id;

    private String agencyName;
    private String contactPerson;
    private String phone;
    private String email;
    private String address;
    private String username;
    private String password;
    private boolean approved;

    // Constructors
    public TravelAgency() {}

    public TravelAgency(String agencyName, String contactPerson, String phone,
                        String email, String address, String username, String password) {
        this.agencyName = agencyName;
        this.contactPerson = contactPerson;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.username = username;
        this.password = password;
        this.approved = false; // default until admin approves
    }

    // Getters and Setters
    // (You can generate these using your IDE)
}