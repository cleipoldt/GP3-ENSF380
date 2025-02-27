/**
 * @author      Sabrina Li <a href="mailto:sabrina.li1@ucalgary.ca">sabrina.li1@ucalgary.ca</a>
 * @version     1.0
 * @since       1.0
 */

 package edu.ucalgary.oop;

 public class DisasterVictim() {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private final int ASSIGNED_SOCIAL_ID;
    private FamilyRelation[] familyConnections;
    private MedicalRecord[] medicalRecords;
    private Supply[] personalBelongings;
    private final String ENTRY_DATE;
    private String gender;
    private String comments;
    private static int counter;

    
    // constructors
    public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {
        this.firstName = firstName;
        
        #FIXME validate
        this.ENTRY_DATE = ENTRY_DATE;

        #FIXME create ASSIGNED_SOCIAL_ID
    }

    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) throws IllegalArgumentException {
        this.firstName = firstName;

        #FIXME validate
        this.ENTRY_DATE = ENTRY_DATE;
        this.dateOfBirth = dateOfBirth;

        #FIXME create ASSIGNED_SOCIAL_ID
    }

    // getter methods
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int getAssignedSocialID() {
        return this.ASSIGNED_SOCIAL_ID;
    }

    public FamilyRelation[] getFamilyConnections() {
        return this.familyConnections;
    }

    public MedicalRecord[] getMedicalRecords() {
        return this.medicalRecords;
    }

    public Supply[] getPersonalBelongings() {
        return this.personalBelongings;
    }

    public String getEntryDate() {
        return this.ENTRY_DATE;
    }

    public String getComments() {
        return this.comments;
    }

    public String getGender() {
        return this.gender;
    }

    // setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        #FIXME validate
        this.dateOfBirth = dateOfBirth;
    }

    public void setFamilyConnections(FamilyRelation[] connections) {
        this.familyConnections = connections;
    }

    public void setMedicalRecords(MedicalRecord[] records) {
        this.medicalRecords = records;
    }

    public void setPersonalBelongings(Supply[] belongings) {
        this.personalBelongings = belongings;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // static methods

 }