/**
 * @author      Carl Leipoldt <a href="mailto:carl.leipoldt@ucalgary.ca">carl.leipoldt@ucalgary.ca</a>
 * @version     1.1
 * @since       1.0
 */


package edu.ucalgary.oop;


public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment){
        this.location = location;
        this. treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    public Location getLocation(){
        return this.location;
    }

    public void setLocation(Location location){
        this.location = location;
    }

    public String getTreatmentDetails(){
        return this.treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails){
        this.treatmentDetails = treatmentDetails;
    }

    public String getDateOfTreatment(){
        return this.DateOfTreatment;
    }

    public void setDateOfTreatment(String dateOfTreatment){
        this.dateOfTreatment = dateOfTreatment;
    }

}
