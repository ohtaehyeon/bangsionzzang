
public class PersonMain {
	public static void main(String[] args) {
		
		//객체 생성
		Person p = new Person(); // p:객체변수 , Person:생성자
		
		//p.name = "이산";
		//p.age = 25;
		p.setName("설현");
		p.setAge(25);
		p.setGender('M');
		p.setPhone("010112313123"); 
		
		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println("성별 : " + p.getGender());
		System.out.println("전화 : " + p.getPhone());
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "설현";
		p2.name = "공유";
		
		System.out.println("p1.name = " + p1.name);
		System.out.println("p2.name = " + p2.name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
