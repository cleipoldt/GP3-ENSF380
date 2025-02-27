/**
 * @author      Carl Leipoldt <a href="mailto:carl.leipoldt@ucalgary.ca">carl.leipoldt@ucalgary.ca</a>
 * @version     1.1
 * @since       1.0
 */



package edu.ucalgary.oop;

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    public Location(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public DisasterVictim[] getOccupants(){
        return this.occupants;
    }

    public void setOccupants(DisasterVictim[] occupants){
        this.occupants = occupants;
    }

    public Supply[] getSupplies(){
        return this.supplies;
    }

    public void setSupplies(Supply[] supplies){
        this.supplies = supplies;
    }



}
