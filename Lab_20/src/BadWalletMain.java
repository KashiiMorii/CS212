
public class BadWalletMain {
   
   static String[] dataSource =  {"B5","Q","B18","Q","B10","P","N","BAD","D","Q","D"};
   static Wallet myWallet = new Wallet();
   
   public static void main (String[] args) {
   // try / catch begins here         
      for (int i=0;i<dataSource.length;i++){
    	  try {
	         char dataItem = dataSource[i].charAt(0);
	         if (dataItem == 'B') {
	            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
	            myWallet.addToWallet(new Bill(billValue));
	         }   
	         else
	            if (dataItem == 'Q')
	               myWallet.addToWallet(new Quarter());
	            else
	            if (dataItem == 'D')
	               myWallet.addToWallet(new Dime());
	            else
	            if (dataItem == 'N')
	               myWallet.addToWallet(new Nickel());
	            else
	            if (dataItem == 'P')
	               myWallet.addToWallet(new Penny());
	         }
    	  catch(IllegalBillException e) {
    		  System.out.println("Bill amount is illegal: "+dataSource[i]);
    	  }
    	  catch(NumberFormatException e) {
    		  System.out.println("That is not a Bill: "+dataSource[i]);
    	  }
    	}
      
	  myWallet.print();
	  System.out.println("My wallet contains: $"+myWallet.getValue());
   }
   
   }

