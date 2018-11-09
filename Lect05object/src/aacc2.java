
public class Account {
	
	// 멤버 필드
	String accountNo;   //계좌번호
	String ownerName;	   //예금주
	int balance;			//잔액
	
	// 생성자
	Account(String accountNo, String ownerName, int string){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = string;		
	}
	// 멤버 메서드
	
	// 입금하다
	void deposit(int amount) {
		balance += amount;
	}
	// 출금하다
	int withdraw(int amount) {
		if(balance < amount) {
			System.out.println("잔액이 부족합니다");
			return 0;
		}
		balance -= amount;
		return amount;
	}
	

}
