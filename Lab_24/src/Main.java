
public class Main {

	public static void main(String[] args) {
		
		LinkedList wallet = new LinkedList();
		
		wallet.append(new Bill(20));
		wallet.append(new Bill(10));
		wallet.append(new Bill(5));
		wallet.append(new Quarter());
		wallet.append(new Quarter());
		wallet.append(new Quarter());
		wallet.append(new Dime());
		wallet.append(new Nickel());
		wallet.append(new Nickel());
		wallet.append(new Penny());
		
		ListNode firstNode = wallet.first.next;
		
		System.out.println("First to Last print: ");
		wallet.FirstToLastPrint(firstNode);
		
		System.out.println("Last to First print: ");
		wallet.LastToFirstPrint(firstNode);
		
		System.out.println("The sum of all Money: ");
		wallet.sumMoney(firstNode);
		
		System.out.println("The sum of all quarters: ");
		wallet.sumQuarter(firstNode);
		
	}
		
		public static void FirstToLastPrint(ListNode node){
			if(node == null) return;
			System.out.println(node);
			
		}
		
		public static void LastToFirstPrint(ListNode node) {
			if(node == null) return;
			FirstToLastPrint(node.next);
			System.out.println(node.data);
		}
		
		public static void sumMoney(ListNode node) {
			if(node == null) return;
			return node.data.getValue() + sumMoney(node.next);
			
		}
		
		public static void sumQuarter(ListNode node) {
			
		}

}
