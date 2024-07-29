 package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImpl implements AtmOperationInterf {
	
	atm atm=new atm();
	Map<Double,String> ministmt=new HashMap<>();
	@Override
	public void viewBalance() {
		
		System.out.println("Available Balance is: " +atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount%500==0)
		{
			if(withdrawAmount<=atm.getBalance())
			{
				ministmt.put(withdrawAmount,"Amount withdrawn");
				System.out.println("collect the cash" +withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else
			{
				System.out.println("Insufficient Balance!");
			}
		}
		else
		{
			System.out.println("please enter the amount in multipple of 500");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		ministmt.put(depositAmount,"Amount Deposited");
		System.out.println(depositAmount+ "Deposited Succesfully!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
//		for(Map.Entry<Double,String>m:ministmt.entrySet())
//		{
//			System.out.println(m.getKey()+""+m.getValue()); 
//		}
		Set<Double> set=ministmt.keySet();
		for(Double d:set) {
		
			System.out.println(d+"="+ministmt.get(d));
		}
	}

}