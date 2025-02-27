/**
 * @author      Sabrina Li <a href="mailto:sabrina.li1@ucalgary.ca">sabrina.li1@ucalgary.ca</a>
 * @version     1.0
 * @since       1.0
 */

 package edu.ucalgary.oop;

 import java.util.regex.*;

 public class DisasterVictim {
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
        
        if (isValidDateFormat(ENTRY_DATE)) {
            this.ENTRY_DATE = ENTRY_DATE;
        } else {
            throw new IllegalArgumentException("ENTRY_DATE is an invalid date: " + ENTRY_DATE);
        }
        
        this.ASSIGNED_SOCIAL_ID = generateSocialID();
    }

    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) throws IllegalArgumentException {
        this.firstName = firstName;

        if (isValidDateFormat(ENTRY_DATE)) {
            this.ENTRY_DATE = ENTRY_DATE;
        } else {
            throw new IllegalArgumentException("ENTRY_DATE is an invalid date: " + ENTRY_DATE);
        }

        if (isValidDateFormat(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
        } else {
            throw new IllegalArgumentException("dateOfBirth is an invalid date: " + dateOfBirth);
        }

        this.ASSIGNED_SOCIAL_ID = generateSocialID();
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
    public static int generateSocialID() {
        // starts at 1
        DisasterVictim.counter += 1;
        return DisasterVictim.counter;
    }

    // must throw IllegalArgumentException where called if false
    public static boolean isValidDateFormat(String date) {
        Pattern validDatePattern = Pattern.compile("^\\d{4}[-]{1}\\d{2}[-]{1}\\d{2}");
        Matcher isValid = validDatePattern.matcher(date);
        return myMatcher.find();
    }

    public static int convertDateStringToInt(String dateStr) {
        String numOnlyDate = dateStr.replace("-", "");
        int dateInt = Integer.parseInt(numOnlyDate);
        return dateInt;
    }

 }