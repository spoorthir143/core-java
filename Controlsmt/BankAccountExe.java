class BankAccountExe {

 public static void main(String[] account){
 
 
// double ref=BankAccount.getBalance();
// double credit=BankAccount.credit(6000.00);
// double debit=BankAccount.debit(499.9);
 
 // System.out.println(ref);
 // System.out.println(credit);
 // Sytem.out.println(debit);
 
 
 BankAccount.credit(6000.00);
 
 double balnace=BankAccount.getBalance();
 System.out.println("the balnace is:"+balnace);
 
 
 BankAccount.credit(69.9);
 
 double balances=BankAccount.getBalance();
 System.out.println("balance is:"+balances);
 
 
 
 BankAccount.debit(1000.00);
 
 double remains=BankAccount.getBalance();
 System.out.println("Remains balance is:"+remains);
 
 
 BankAccount.credit(5090.99);
 
double credited=BankAccount.getBalance();
System.out.println("Available Amount is:"+credited);
 
 
 }

}


