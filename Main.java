public class Main {

	public static void main(String[] args) {
		
		
		
		Operations f = new Operations("Open Bank System");
		f.addCustomer(16850, "DIMITRIOS", "CHATZIPANAGIOTOU", "29/01/1989", 0, 1000, 1015);
		f.addCustomer(16840, "JOHN", "BATTURO", "20/05/1988", 0, 100, 1285);
		f.addCustomer(19487, "NICK", "ANTWNIOU", "01/05/1945", 0, 6100, 5550);
		f.addCustomer(47888, "DIMITRIOS", "DEM", "29/01/1980", 0, 5400, 1512);
		f.addCustomer(168540, "MELLISA", "BATTURO", "02/05/1990", 0, 5000, 1214);
		f.addCustomer(168501, "JOAN", "ANTONIOU", "05/12/1990", 0, 7788, 9568);
		
		
		
		
		
		
		System.out.println();
		
		f.enterPass(16850, 10215);  //first step for now is to enter with Id and Password to change boolean true , to do withdrawal and deposits
									//left parameter is Id , right parameter is pass.
		
		f.withdrawl(16850, 1000); // against left enter id , right the amount
		f.customerList();         // just the customers list
		f.takeWallet(16850);      //info wallet of a specific customer
		
		
		
    
	}
	
	
}
