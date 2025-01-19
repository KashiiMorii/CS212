public class Wallet {
 private LinkedList walletContents = new LinkedList();
  public Wallet(){
	 
 }
 public void addToWallet(Money m){
	  walletContents.append(m);
 }
  public void print () {
	 
	  //point the pointer to the first element of the Linked List
	  ListNode p = walletContents.first.next;
	  //As long as the data carried by node is not null, print it out
	  while(p != null) {
		  System.out.println(p.data);
		  p = p.next;
	  }
 }
 public String getValue() {
	  double sum = 0;
	  ListNode p = walletContents.first.next;
	  while(p != null) {
		  if(p.data instanceof Bill) {
			  sum = sum + p.data.getValue();
		  }else {
			  sum = sum + p.data.getValue()/100.0;
		  }
		  p = p.next;
	  }
	  return String.format("%.2f",sum);
	 
 }
}
