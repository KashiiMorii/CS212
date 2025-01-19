//Property of Devindra A. Ramcharan CSCI 212 111B
/**
 * The Microwave class represents Microwave Serial Numbers and inherits from the Appliance class.
 * This class adds the functionality to track the amount of watts the Microwave has
 */
public class Microwave extends Appliance{
	
	private int watts;
	
	/**
     * Constructs a new Microwave object.
     * This constructor calls the Appliance parent class to initialize the appliance.
     */
	
	public Microwave(){
		super();
	} //Constructor Microwave
	
	  /**
     * Sets the amount of watts of the microwave.
     *
     * @param Watts The watts of the microwave is to be set for it.
     */
	
	public void setWatts(int Watts) {
		this.watts = Watts;
	} //Method setWatts
	
	 /**
     * Gets the amount of watts of the microwave.
     *
     * @return The amount of watts of the microwave.
     */
	
	public int getWatts() {
		return watts;
	} //Method getWatts
	

    /**
     * Returns a string representation of the microwave that includes
     * its serial number, price, and the amount of watts it has
     *
     * @return A string containing the serial number, price, and the amount of watts of the microwave.
     */
	
	public String toString() {
		return "Serial Number: "+ getSerialNum() + ", Price: " +getPrice() + ", Watts: " + getWatts();
	} //Method toString
}
