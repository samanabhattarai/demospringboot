package com.example.demoSpringBoot.dtoBean;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class Patient {

   public Patient(){

    }
   public Patient(int patientId){
        this.patientId = patientId;
    }

    private int patientId;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
/*
Patient patient = new Patient();

 */