package com.example.clase_82.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "administrative_data")
public class AdministrativeData {

    @Id
    @Column(name = "administrative_data_id")
    private Integer administrativeDataId;

    @Column(name = "social_security_number")
    private String socialSecurityNumber;

    @Column(name = "insurance_company")
    private String insuranceCompany;

    @Column(name = "policy_number")
    private String policyNumber;

    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "assigned_doctor")
    private String assignedDoctor;

    @Column(name = "last_visit")
    private Date lastVisit;

    @Column(name = "next_appointment")
    private Date nextAppointment;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "observations")
    private String observations;

}
