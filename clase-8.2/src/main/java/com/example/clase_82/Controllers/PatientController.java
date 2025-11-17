package com.example.clase_82.Controllers;

import com.example.clase_82.DTO.PersonalInfoDTO;
import com.example.clase_82.Services.PatientServiceAuto;
import com.example.clase_82.Services.PatientServiceManual;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class PatientController {

    private PatientServiceAuto patientServiceAuto;
    private PatientServiceManual patientServiceManual;

    @PostMapping("/createpatientauto")
    public String CreatePatientAuto(@RequestBody PersonalInfoDTO personalInfoDTO){
        patientServiceAuto.CreatePatientAuto(personalInfoDTO);
        return "El paciente ha sido guardado";
    }

    @PostMapping("/createpatientmanual")
    public String CreatePatientManual(@RequestBody PersonalInfoDTO personalInfoDTO){
        patientServiceManual.CreatePatientManual(personalInfoDTO);
        return "El paciente ha sido guardado";
    }

    @DeleteMapping("/deletepatientmanual/{id}")
    public String DeleteOldPatient(@PathVariable String id){
        patientServiceManual.DeletePatientManual(Integer.parseInt(id));
        return "El paciente ha sido borrado";
    }

}

