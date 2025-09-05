// camelCase -> a way to write variable names and its a standard
// thefoxjumpedoverthelazydog
//TheFoxJumpedOVerTheLazyDog
// keep the first letter lowercase if its a variable name
// otherwise keep it capital for class names
// a class is just a blueprint for a new data type
// -> its not the object itself, but rather a plan

public class Spaceship{

    // instance variables
    
    private String description;
    private double size;
    private int passengerCount;
    private double fuelLevel;
    private boolean shieldsActive;

    // constructors
    public Spaceship(String inputdescription, int inputpassengerCount, double inputFuelLevel, boolean inputShieldsActive) {

        description = inputdescription;
        passengerCount = inputpassengerCount;
        fuelLevel = inputFuelLevel;
        shieldsActive = inputShieldsActive;

    }
    // methods

    // getters (aka accessors)
    public String getDescription(){
        return description;
    }
    public int getPassengerCount(){
        return passengerCount;
    }
    public double getFuelLevel(){
        return fuelLevel;
    }
    public boolean getShieldsActive(){
        return shieldsActive;
    }

    // setters (these are void)
    public void setDescription(String input){
        description = input;
    }
    public void setPassengerCount(int input){
        passengerCount = input;
    }
    public void setFuelLevel(double input){
        fuelLevel = input;
    }
    public void setShieldsActive(boolean input){
        shieldsActive = input;
    }

    // challenge: use 3 setters to update the values of 3 differenet instance variables, make sure to print before and after the update
}