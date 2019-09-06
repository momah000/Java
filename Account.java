public class Account{
	private double balance;
	private double amount;

	public Account(double balance, double amount){
		this.Balance=Balance=0;
		this.Amount=amount;
	}
	public int deposit(double money){
		return money+balance;
	}
	public int withdrawn(double money){
		if(balance>=money){
			return balance-money;
		}
	}

	public double getBalance(){
    	return balance;
    }
    public double getAmount(){
    	return amount;
    }
    public double getMissingAmount(){
    	return 

    }
    public String getMessage(){
    	return("the ammount cannot be withdrawn")
}