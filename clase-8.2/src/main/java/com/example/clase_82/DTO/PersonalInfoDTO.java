package com.example.clase_82.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonalInfoDTO {

    private String name;
    private String surname;
    private String dni;
    private Date birthdate;
    private Boolean genre;
    private String address;
    private String city;
    private String zipCode;
    private String phoneNumber;
    private String email;
    private String maritalStatus;
    private String nationality;
    private String bloodType;
    private String allergies;
    private String chronicDiseases;
    private String currentMedication;
    private Double heightM;
    private Double weightKg;
    private Boolean smoker;
    private Boolean drinksAlcohol;
    private String socialSecurityNumber;
    private String insuranceCompany;
    private String policyNumber;
    private Date registrationDate;
    private String assignedDoctor;
    private Date lastVisit;
    private Date nextAppointment;
    private String paymentMethod;
    private String observations;

}
