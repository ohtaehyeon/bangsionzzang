// JavaBean, VO(Value Object), Model, DTO
public class Person {
	
	
	
	// 접근 제한자 public > protected > default > private
	// 필드 (상태, 데이터 표현, Field, 변수:Variable)
	String name;
	private int age;
	private char gender;
	private String phone;
	
	//default 생성자
	public Person() {
		
	}			
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age-1;
	}
	public Person(String name, int age, char gender, String phone) {
		this(name,age);
		/*this.name = name;
		this.age = age;*/
		this.gender = gender;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//메소드
	/*public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age) {
		if(age < 0 || age > 120) {
			System.out.println("잘못됬음");
			age = 0;
		}else {
			this.age = age;
		}
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}*/

}
