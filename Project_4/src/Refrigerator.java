//Property of Devindra A. Ramcharan CSCI 212 111B
/**
 * The Refrigerator class represents Refrigerator Serial Numbers and inherits from the Appliance class.
 * This class adds the functionality to track the cubic feet of the Refrigerator
 */
public class Refrigerator extends Appliance{
	private int cubicFeet;
	
	/**
     * Constructs a new Refrigerator object.
     * This constructor calls the Appliance parent class to initialize the appliance.
     */
	
	public Refrigerator() {
		super();
	} //Constructor Refrigerator
	
	  /**
     * Sets the cubic feet of the refrigerator.
     *
     * @param CubicFeet The cubic feet to be set for the refrigerator.
     */
	
	public void setcubicFeet(int CubicFeet) {
		this.cubicFeet = CubicFeet;
	} //Method setcubicFeet
	
	  /**
     * Gets the cubic feet of the refrigerator.
     *
     * @return The cubic feet of the refrigerator.
     */
	
	public int getcubicFeet() {
		return cubicFeet;
	} //Method getcubicFeet
	
	 /**
     * Returns a string representation of the refrigerator that includes
     * its serial number, price, and the cubic feet of the refrigerator
     *
     * @return A string containing the serial number, price, and the cubic feet of the refrigerator.
     */
	
	public String toString() {
		return "Serial Number: "+ getSerialNum() + ", Price: " +getPrice() + ", Cubic Feet: " + getcubicFeet() + "cu ft";
	} //Method toString
}