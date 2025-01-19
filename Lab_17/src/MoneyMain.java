
public class MoneyMain {
   
   static String[] dataSource =  {"B5","Q","B20","Q","P","D","N","D"};
   static Money[] wallet = new Money[dataSource.length];
   
   public static void main (String[] args) {
            
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            wallet[i]= new Bill(billValue);
         }   
         else
            if (dataItem == 'Q')
               wallet[i]=new Quarter();
         else
        	if(dataItem == 'D')
          	   wallet[i] = new Dime();
         else
        	if(dataItem == 'N')
        	   wallet[i] = new Nickel();
         else
        	if(dataItem == 'P')
        	   wallet[i] = new Penny();
         }

      printWallet();
   }
   public static void printWallet () {
      for (int i=0;i<wallet.length;i++) {
         if (wallet[i] instanceof Bill)
            System.out.println(wallet[i]);
         else
            System.out.println(wallet[i]);
         
      }
   }
   
   public static void sumWallet() {
	   double sum = 0;
	   for(int i=0;i<wallet.length;i++) {
		   sum = wallet[i].getValue();
	   }
	   System.out.println(sum); 
	  }
   }
