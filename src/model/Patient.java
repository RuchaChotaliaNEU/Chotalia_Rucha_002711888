/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ruchachotalia
 */
public class Patient {

    
    private String patientID;
    private String primaryDoctorName;
    private vitalSignhistory vitalSignHistory;

    
    public Patient() {
        this.vitalSignHistory = new vitalSignhistory();
    }
    
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }

    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }

    public vitalSignhistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(vitalSignhistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    
   
    
  
}

