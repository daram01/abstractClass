package exceptionProject;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성을 했기 때문에 주소값이 서로 다름
		Person p1 = new Person("홍길동", 10);
		Person p2 = new Person("홍길동", 10);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
			  //오브젝트의 이퀄스를 쓰는 것임. 주소값 비교
		if(p1.equals(p2)) { // 오버라이딩을 통해 "홍길동" == "홍길동"" 을 비교하는것.
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		// 최초의 결과 -> 다름으로 나옴.
	}

}
