//Property of Devindra A. Ramcharan CSCI 212 111B
public abstract class Appliance {
	
	/**
	 * The Appliance class represents a generic appliance, such as the appliance type, it's serial number, and its price.
	 */
	
    protected String SerialNum;
    protected float price;

    /**
     * Sets the serial number of the appliance.
     *
     * @param SerialNum The serial number to be set for the appliance.
     */
    
    public void setAppliance(String SerialNum) { 
    		this.SerialNum = SerialNum;
    } //Method setAppliance
    
    /**
     * Gets the serial number of the appliance.
     *
     * @return The serial number of the appliance.
     */
    
    public String getSerialNum(){ 
        return SerialNum;
    } //Method getSerialNum
    
    /**
     * Determines the type of appliance based on the first character of the serial number.
     * 
     * @return The appliance type, which is determined by the first character of the serial number
     */

    public char ApplianceType() { 
        return SerialNum.charAt(0);
    } //Method ApplianceType
    

    /**
     * Sets the price of the appliance.
     *
     * @param Price The price of the appliance to be set.
     */

    public void setPrice(float Price) { 
        this.price = Price;
    } //Method setPrice
    
    /**
     * Gets the price of the appliance.
     *
     * @return The price of the appliance.
     */

    public float getPrice(){ 
        return price;
    } //Method getPrice
    
    /**
     * Returns the serial number of the appliance
     * @return A string is used to represent the appliance's serial number
     */

    public String toString(){ 
        return SerialNum;
    } //Method toString
} 
