package com.example.clase_82.Repositories;

import com.example.clase_82.Entities.MedicalData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalDataRepository extends JpaRepository<MedicalData,Integer> {
}
