//Property of Devindra A. Ramcharan CSCI 212 111B
public class Refrigerator extends Appliance{
	private int cubicFeet;
	
	public Refrigerator() {
		super();
	} //Constructor Refrigerator, which extends to the class Appliance
	
	public void setcubicFeet(int CubicFeet) {
		this.cubicFeet = CubicFeet;
	} //Method setcubicFeet, which sets the cubic feet of only refrigerators
	
	public int getcubicFeet() {
		return cubicFeet;
	} //Method getcubicFeet, which gets the cubic feet of only refrigerators
	
	public String toString() {
		return "Serial Number: "+ getSerialNum() + ", Price: " +getPrice() + ", Cubic Feet: " + getcubicFeet() + "cu ft";
	} //Method toString, which prints out the Serial Number, Price, and Cubic Feet of the refrigerator
}