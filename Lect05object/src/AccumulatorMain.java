
public class AccumulatorMain {
	
	public static void main(String[] args) {
		
		//객체생성(인스턴스 생성)
		
		Accumulator.grandTotal = 10;
		System.out.println("Accumulator.grandTotal = " + Accumulator.grandTotal);
		
		Accumulator acc1 = new Accumulator();
		Accumulator acc2 = new Accumulator();
		Accumulator acc3 = new Accumulator();
		
		acc1.accumulate(100);
		acc2.accumulate(100);
		acc3.accumulate(100);
		
		System.out.println("acc1.total = " + acc1.total);
		System.out.println("acc1.grandTotal = " + acc1.grandTotal);
		System.out.println("acc2.total = " + acc2.total);
		System.out.println("acc2.grandTotal = " + acc2.grandTotal);
		System.out.println("acc3.total = " + acc3.total);
		System.out.println("acc3.grandTotal = " + acc3.grandTotal);
	}
	

}
