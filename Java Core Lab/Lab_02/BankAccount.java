package Lab_02;

public class BankAccount {

	private String accountHolderName; 
	private int accountNumber;
	private int balance;
	
	
	public BankAccount(String accountHolderName, int accountNumber, int balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//get and set Value
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	//Deposit add method
	public void deposit(int amount) {
		balance +=amount;
	}
	
		
	// withdraw add method
	
	public void withdraw(int amount) {
		if(amount <= balance) {
			balance -=amount;
		}else {
			 System.out.println("Insufficient Balance!");
		}
	}
	

	public static void main(String[] args) {
		// create a bank acc
		BankAccount acc = new BankAccount("Priyush", 12345, 6000);
		
		// Perform transition
		acc.deposit(1000);
		acc.withdraw(2000);
		
		//get balance
		int currentBalance = acc.getBalance();
				
        // Ternary operator to check minimum balance 
		
		String status = (currentBalance >=5000) ? "Minimum Balance Maintained": "Minimum Balance not Maintained";
		
		//Display results
		System.out.println("Current Balance : " +currentBalance);
		System.out.println("Status : " +status);

	}


}
