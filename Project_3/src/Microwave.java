//Property of Devindra A. Ramcharan CSCI 212 111B
public class Microwave extends Appliance{
	
	private int watts;
	
	public Microwave(){
		super();
	} //Constructor Microwave, which extends to the Appliance class
	
	public void setWatts(int Watts) {
		this.watts = Watts;
	} //Method setWatts, which checks the amount of watts only microwaves have
	
	public int getWatts() {
		return watts;
	} //Method getWatts, which gets the values of watts only microwaves have
	
	public String toString() {
		return "Serial Number: "+ getSerialNum() + ", Price: " +getPrice() + ", Watts: " + getWatts();
	} //Method toString, which prints out the Serial Number, Price, and amount of Watts of the Microwave
}
