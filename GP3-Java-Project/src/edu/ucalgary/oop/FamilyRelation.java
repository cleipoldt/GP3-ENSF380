/**
 * @author      Carl Leipoldt <a href="mailto:carl.leipoldt@ucalgary.ca">carl.leipoldt@ucalgary.ca</a>
 * @version     1.3
 * @since       1.0
 */



package edu.ucalgary.oop;

public class FamilyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo){
        this.personOne = personOne;
        this.relationshipTo = relationshipTo;
        this.personTwo = personTwo;
    }

    public DisasterVictim getPersonOne(){
        return this.personOne;
    }
    
    public void setPersonOne(DisasterVictim personOne){
        this.personOne = personOne;
    }

    public String getRelationshipTo(){
        return this.relationshipTo;
    }

    public void setRelationshipTo(String relationshipTo){
        this.relationshipTo = relationshipTo;
    }

    public DisasterVictim getPersonTwo(){
        return this.personTwo;
    }

    public void setPersonTwo(DisasterVictim personTwo){
        this.personTwo = personTwo;
    }
}
