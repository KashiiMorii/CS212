//Property of Devindra A. Ramcharan CSCI 212 111B
public class Dishwasher extends Appliance{
	
	private boolean IsUnderCounter;
	
	public Dishwasher() {
		super();
	} //Constructor Dishwasher, which extends to the class Appliance
	
	public void setIsUnderCounter(boolean Is_Under_Counter) {
		this.IsUnderCounter = Is_Under_Counter;
	} //Method setIsUnderCounter, which sets the value to true or false depending on if the Dishwasher is under the counter
	
	public boolean getIsUnderCounter() {
		return IsUnderCounter;
	} //Method getIsUnderCounter, which gets the value of either true or false if the Dishwasher is under the counter
	
	public String toString() {
		return "Serial Number: "+ getSerialNum() + ", Price: " +getPrice() + ", Is under the counter?: " + getIsUnderCounter();
	} //Method toString, which displays the Serial Number and Price of the Dishwasher, and checks if the dishwasher is under the counter
	
}