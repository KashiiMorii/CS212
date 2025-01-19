//Property of Devindra A. Ramcharan CSCI 212 111B
public class SortedApplianceList extends ApplianceList{
	
	public SortedApplianceList() {
		super();
	} //Constructor SortedApplianceList, extends to the Methods in ApplianceList
	
	public void add(Appliance d) {
		ApplianceNode newNode = new ApplianceNode(d);
		ApplianceNode current = first;
		
		while(current.next != null && current.next.data.getSerialNum().compareTo(d.getSerialNum())<0) {
			current = current.next;
		}
		
		newNode.next = current.next;
		current.next = newNode;
		if(newNode.next == null) {
			last = newNode;
		}
		length++;
		} //Method add, which adds the nodes of data in sorted positions
	}