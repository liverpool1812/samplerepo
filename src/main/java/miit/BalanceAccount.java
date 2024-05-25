package miit;

public class BalanceAccount {

	public static void main(String[] args) {
		String owner;
		int balance;
		
		public BalanceAccount(String ownername,int accountbalance)
		{
			owner=ownername;
			balance=accountbalance;
		}
		public void deposit(int amount)
		{
			balance=balance+amount;
	}
		public boolean withdraw(int amount) {
			if(amount<=balance) {
				balance=balance-amount;
				return true;
			}else {
				System.out.println(Insufficeient funds);
				return false;
			}
				
		}
		public int getbalance() {
			return balance;
		}
}
}
	
