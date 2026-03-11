class BankAccount {

	static double balance;
	
	static double getBalance(){
	return balance;
	}
	
	static void credit(double amount){
	
	if(amount > 0.0){
	
	balance= balance + amount;
	}
	else {
		System.out.println("invalid");
	}
	}
	static void debit( double amount){
		
		if(amount>0.0){
			
			balance=balance-amount;
		}
		else{
			System.out.println("- balance");
		
		}		
	}	

	}
