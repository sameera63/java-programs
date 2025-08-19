interface rbi{
	public void deposite();
	public void withdraw();
	public void showbalance();
}
class amount implements rbi{
	double amount=2000;
	int balance=500;
	public void deposite() {
		int balance=1000;
		if(amount>0) {
			balance+=amount;
			System.out.println("deposite amount:"+balance);
		}
		else {
			System.out.println("not deposite");		
		}
	}
	public void withdraw() {
		if(amount>0&&amount>=balance) {
			balance+=amount;
			System.out.println("withdraw amount:"+balance);
		}
		else {
			System.out.println("no withdraw");
		}
	}
	public void showbalance() {
		System.out.println("balance:"+balance);
	}
public class bank {
	public static void main(String args[]) {
		rbi b1;
		b1=new amount();
		b1.deposite();
		b1.withdraw();
		b1.showbalance();
	}
  }
}
