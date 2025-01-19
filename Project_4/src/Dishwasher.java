//Property of Devindra A. Ramcharan CSCI 212 111B
/**
 * The Dishwasher class represents Dishwasher Serial Numbers and inherits from the Appliance class.
 * This class adds the functionality to check if the dishwasher is under the counter
 */
public class Dishwasher extends Appliance{
	
	private boolean IsUnderCounter;
	

    /**
     * Constructs a new Dishwasher object.
     * This constructor calls on the Appliance parent class to initialize the appliance
     */
	
	public Dishwasher() {
		super();
	} //Constructor Dishwasher
	
	 /**
     * Sets whether the dishwasher is under the counter.
     *
     * @param Is_Under_Counter A boolean value indicating whether the dishwasher is under the counter.
     * true if under the counter, false otherwise.
     */
	
	public void setIsUnderCounter(boolean Is_Under_Counter) {
		this.IsUnderCounter = Is_Under_Counter;
	} //Method setIsUnderCounter
	
    /**
     * Gets whether the dishwasher is under the counter.
     *
     * @return A boolean value that indicates if the dishwasher is under the counter.
     * true if under the counter, false otherwise.
     */
	
	public boolean getIsUnderCounter() {
		return IsUnderCounter;
	} //Method getIsUnderCounter
	
	 /**
     * Returns a string representation of the dishwasher that includes the serial number, 
     * the price, and whether the dishwasher is under the counter.
     *
     * @return A string containing the serial number, price, and if the dishwasher is under the counter.
     */
	
	public String toString() {
		return "Serial Number: "+ getSerialNum() + ", Price: " +getPrice() + ", Is under the counter?: " + getIsUnderCounter();
	} //Method toString
	
}