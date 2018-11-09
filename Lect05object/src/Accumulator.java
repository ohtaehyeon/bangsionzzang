
public class Accumulator {
	
	// 멤버 필드
	int total;		// 인스터스 필드
	static int grandTotal;  // 클래스 필드(정적 필드)
	
	Accumulator(){} // 디폴트 생성자
	
	//멤버 메서드
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	//클래스 메서드 ( 정적 메서드)
	static int getGrandTotal() {
		//total = 120; //인스턴스 필드 사용 불가능
		return grandTotal;
	}
	
	
	
	
	
}
