package com.example.clase_82.Services;

import com.example.clase_82.DTO.PersonalInfoDTO;
import com.example.clase_82.Entities.AdministrativeData;
import com.example.clase_82.Entities.MedicalData;
import com.example.clase_82.Entities.PersonalData;
import com.example.clase_82.Repositories.AdministrativeDataRepository;
import com.example.clase_82.Repositories.MedicalDataRepository;
import com.example.clase_82.Repositories.PersonalDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PatientServiceManual {

    private final PersonalDataRepository personalDataRepository;
    private final MedicalDataRepository medicalDataRepository;
    private final AdministrativeDataRepository administrativeDataRepository;

    public void CreatePatientManual(PersonalInfoDTO personalInfoDTO){

        PersonalData personalData = new PersonalData();
        personalData.setName(personalInfoDTO.getName());
        personalData.setSurname(personalInfoDTO.getSurname());
        personalData.setDni(personalInfoDTO.getDni());
        personalData.setBirthdate(personalInfoDTO.getBirthdate());
        personalData.setGenre(personalInfoDTO.getGenre());
        personalData.setAddress(personalInfoDTO.getAddress());
        personalData.setCity(personalInfoDTO.getCity());
        personalData.setZipCode(personalInfoDTO.getZipCode());
        personalData.setPhoneNumber(personalInfoDTO.getPhoneNumber());
        personalData.setEmail(personalInfoDTO.getEmail());
        personalData.setMaritalStatus(personalInfoDTO.getMaritalStatus());
        personalData.setNationality(personalInfoDTO.getNationality());

        personalDataRepository.save(personalData);

        MedicalData medicalData = new MedicalData();
        medicalData.setMedicalDataId(personalData.getPersonalId());
        medicalData.setBloodType(personalInfoDTO.getBloodType());
        medicalData.setAllergies(personalInfoDTO.getAllergies());
        medicalData.setChronicDiseases(personalInfoDTO.getChronicDiseases());
        medicalData.setCurrentMedication(personalInfoDTO.getCurrentMedication());
        medicalData.setHeightM(personalInfoDTO.getHeightM());
        medicalData.setWeightKg(personalInfoDTO.getWeightKg());
        medicalData.setSmoker(personalInfoDTO.getSmoker());
        medicalData.setDrinksAlcohol(personalInfoDTO.getDrinksAlcohol());

        medicalDataRepository.save(medicalData);

        AdministrativeData administrativeData = new AdministrativeData();
        administrativeData.setAdministrativeDataId(personalData.getPersonalId());
        administrativeData.setSocialSecurityNumber(personalInfoDTO.getSocialSecurityNumber());
        administrativeData.setInsuranceCompany(personalInfoDTO.getInsuranceCompany());
        administrativeData.setPolicyNumber(personalInfoDTO.getPolicyNumber());
        administrativeData.setRegistrationDate(personalInfoDTO.getRegistrationDate());
        administrativeData.setAssignedDoctor(personalInfoDTO.getAssignedDoctor());
        administrativeData.setLastVisit(personalInfoDTO.getLastVisit());
        administrativeData.setNextAppointment(personalInfoDTO.getNextAppointment());
        administrativeData.setPaymentMethod(personalInfoDTO.getPaymentMethod());
        administrativeData.setObservations(personalInfoDTO.getObservations());

        administrativeDataRepository.save(administrativeData);
    }

    public void DeletePatientManual(Integer id){
        administrativeDataRepository.deleteById(id);
        medicalDataRepository.deleteById(id);
        personalDataRepository.deleteById(id);
    }

}

