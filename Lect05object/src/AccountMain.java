
public class AccountMain {
	public static void main(String[] args) {
		
		Account acc1 = new Account("110-375-566371", "hazard", 1111111);
		Account acc2 = new Account("110-375-566371", "zzzzzz", 1100000);
		
		int amount = acc1.withdraw(70000); // 매서드호출
		
		acc2.deposit(amount); // 입금
			
		System.out.println("예금주 : " + acc1.ownerName);
		System.out.println("잔  액 : " + acc1.balance);
		
		System.out.println("예금주 : " + acc2.ownerName);
		System.out.println("잔  액 : " + acc2.balance);
	}

}
