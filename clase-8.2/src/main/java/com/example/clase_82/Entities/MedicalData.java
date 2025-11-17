package com.example.clase_82.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "medical_data")
public class MedicalData {

    @Id
    @Column(name = "medical_data_id")
    private Integer medicalDataId;

    @Column(name = "blood_type")
    private String bloodType;

    @Column(name = "allergies")
    private String allergies;

    @Column(name = "chronic_diseases")
    private String chronicDiseases;

    @Column(name = "current_medication")
    private String currentMedication;

    @Column(name = "height_m")
    private Double heightM;

    @Column(name = "weight_kg")
    private Double weightKg;

    @Column(name = "smoker")
    private Boolean smoker;

    @Column(name = "drinks_alcohol")
    private Boolean drinksAlcohol;

}
