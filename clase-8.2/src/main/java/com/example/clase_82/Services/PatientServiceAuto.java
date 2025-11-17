package com.example.clase_82.Services;

import com.example.clase_82.DTO.PersonalInfoDTO;
import com.example.clase_82.Entities.AdministrativeData;
import com.example.clase_82.Entities.MedicalData;
import com.example.clase_82.Entities.PersonalData;
import com.example.clase_82.Mappers.PersonalInfoMapper;
import com.example.clase_82.Repositories.AdministrativeDataRepository;
import com.example.clase_82.Repositories.MedicalDataRepository;
import com.example.clase_82.Repositories.PersonalDataRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PatientServiceAuto {

    @Autowired
    private PersonalDataRepository personalDataRepository;

    @Autowired
    private MedicalDataRepository medicalDataRepository;

    @Autowired
    private AdministrativeDataRepository administrativeDataRepository;

    @Autowired
    private PersonalInfoMapper personalInfoMapper;

    @Transactional
    public void CreatePatientAuto(PersonalInfoDTO personalInfoDTO){
        PersonalData personalData = personalInfoMapper.personalData(personalInfoDTO);
        MedicalData medicalData = personalInfoMapper.medicalData(personalInfoDTO);
        AdministrativeData administrativeData = personalInfoMapper.administrativeData(personalInfoDTO);

        personalData = personalDataRepository.save(personalData);

        Integer id = personalData.getPersonalId();
        medicalData.setMedicalDataId(id);
        administrativeData.setAdministrativeDataId(id);

        medicalDataRepository.save(medicalData);
        administrativeDataRepository.save(administrativeData);

    }

}
