//Property of Devindra A. Ramcharan CSCI 212 111B
public abstract class Appliance {
    protected String SerialNum;
    protected float price;

    public void setAppliance(String SerialNum) { 
        this.SerialNum = SerialNum;
    } //Method setAppliance, reads the serial number of the appliance
    
    public String getSerialNum(){ 
        return SerialNum;
    } //Method getSerialNum, gets the Serial number of the appliance

    public char ApplianceType() { 
        return SerialNum.charAt(0);
    } //Method ApplianceType, get's the Appliance type via the first letter of the appliance so that it can be sorted

    public void setPrice(float Price) { 
        this.price = Price;
    }//Method setPrice, sets the price of the appliance

    public float getPrice(){ 
        return price;
    }//Method getPrice gets the price of the appliance

    public String toString(){ 
        return SerialNum;
    } //Method toString, returns the serial number of the appliance
} 
