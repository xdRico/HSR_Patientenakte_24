package de.gruppe6.patientfilefrontend.model;

public class PatientfileItem {
    private String patientfileItemName;
    private String patientfileItemDescription;

    public PatientfileItem() {
    }

    public PatientfileItem(String patientfileItemName, String patientfileItemDescription) {
        this.patientfileItemName = patientfileItemName;
        this.patientfileItemDescription = patientfileItemDescription;
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
