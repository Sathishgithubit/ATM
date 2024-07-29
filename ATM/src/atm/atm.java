package atm;

public class atm {
	private double balance;
	private double depositAmount;
	private double withdrawAmount;
	
	//default constructor
	public atm()
	{
		
	}
	
	//getter setter
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		this.balance=balance;
	}
	
	public double getDepositAmount()
	{
		return depositAmount;
	}
	
	public void setDepositAmount(double depositAmount)
	{
		this.depositAmount = depositAmount;
	}
	
	public double getWithdrawAmount()
	{
		return withdrawAmount;
	}
	
	public void setWithdrawAmount(double withdrawAmount)
	{
		this.withdrawAmount = withdrawAmount;
	}

	
}