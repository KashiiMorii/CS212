//Property of Devindra A. Ramcharan CSCI 212 111B
public abstract class ApplianceList {
	
	protected ApplianceNode first = new ApplianceNode(null); //dummy node
	protected ApplianceNode last = first;
	protected int length = 0;
	
	public void append(Appliance d) { 
		ApplianceNode newNode = new ApplianceNode(d);
		last.next = newNode;
		last = newNode;
		length++;
	} //Method append, adds new nodes for linked list
	
	public Appliance get(int index) { 
		ApplianceNode current = first.next;
		for(int i = 0; i<index; i++) {
			current = current.next;
		}
		return current.data;
	} //Method get, gets the data of the node	
}
