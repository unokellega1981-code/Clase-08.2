package com.example.clase_82.Mappers;

import com.example.clase_82.DTO.PersonalInfoDTO;
import com.example.clase_82.Entities.AdministrativeData;
import com.example.clase_82.Entities.MedicalData;
import com.example.clase_82.Entities.PersonalData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonalInfoMapper {

    @Mapping(target = "personalId", ignore = true)
    PersonalData personalData(PersonalInfoDTO personalInfoDTO);

    @Mapping(target = "medicalDataId", ignore = true)
    MedicalData medicalData(PersonalInfoDTO personalInfoDTO);

    @Mapping(target = "administrativeDataId", ignore = true)
    AdministrativeData administrativeData(PersonalInfoDTO personalInfoDTO);
}
