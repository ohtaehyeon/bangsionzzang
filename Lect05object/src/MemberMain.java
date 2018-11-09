import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberMain {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		
		Member[] memberList = new Member[3];
		
		for(int i = 0; i < memberList.length; i++) {
			// 객체 생성
			//memberList[i] = new Member();
			Member member = new Member();
			memberList[i] = member;
			
			
			System.out.print("이름 : ");
			member.setName(reader.readLine());
			
			System.out.print("나이 : ");
			member.setAge(Integer.parseInt(reader.readLine()));
			
			System.out.print("성별 : ");
			member.setGender((char)reader.read());
			reader.readLine();
			
			System.out.println("전화번호 : ");
			member.setPhone(reader.readLine());		
		}
			System.out.println("======회원목록======");
			System.out.println("이름  나이  성별  전화번호");
			for(int i = 0; i < memberList.length; i++) {
				Member member = memberList[i];
				System.out.printf("%s  %d  %c  %s\n", member.getName(),member.getAge()
				,member.getGender(), member.getPhone());
			}
		
	
	}
}
