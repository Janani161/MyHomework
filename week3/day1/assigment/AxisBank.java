package week3.day1.assigment;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("Withdrawal limit is 1 Lakh/day");
	}

	public static void main(String[] args) {
		
		AxisBank money = new AxisBank();
		money.saving();
		money.fixed();
		money.deposit();
	}

}
