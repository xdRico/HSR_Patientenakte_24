package de.pan.patientfilebackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PatientfileItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientfileItemId;
    private String patientfileItemName;
    private String patientfileItemDescription;
    
    public PatientfileItem() {
    }

    public PatientfileItem(int patientfileItemId, String patientfileItemName, String patientfileItemDescription) {
        this.patientfileItemId = patientfileItemId;
        this.patientfileItemName = patientfileItemName;
        this.patientfileItemDescription = patientfileItemDescription;
    }

    public int getPatientfileItemId() {
        return patientfileItemId;
    }

    public void setPatientfileItemId(int patientfileItemId) {
        this.patientfileItemId = patientfileItemId;
    }

    public String getPatientfileItemName() {
        return patientfileItemName;
    }

    public void setPatientfileItemName(String patientfileItemName) {
        this.patientfileItemName = patientfileItemName;
    }

    public String getPatientfileItemDescription() {
        return patientfileItemDescription;
    }

    public void setPatientfileItemDescription(String patientfileItemDescription) {
        this.patientfileItemDescription = patientfileItemDescription;
    }
}
