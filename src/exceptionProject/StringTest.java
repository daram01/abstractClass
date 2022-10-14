package exceptionProject;

public class StringTest {

	public static void main(String[] args) {
		
		//가장 많이 사용하는 것
		//charA()
		//subString()
		//indexOf()
		//equals()
		//valuOf()
		
		
		
//		String str1 = "abc";
//		String str2 = "def";
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		
//		str1 = str1 + str2; // "abcdef"
//		System.out.println(str1);
//		
//		
		String str3 = new String("abc"); // 이게 원래 쓰는 방식이지만 안 씀
		String str4 = new String("abc");

		
//		if(str3 == str4) { //문자열을 비교하는 것이 아니라 주소값을 비교하는 것임
//			System.out.println("같은 문자열입니다."); // 실행되지 않음
//		}else {
//			System.out.println("다른 문자열입니다.");
//		}
//		-> 결과 : 다른 문자열입니다. 
//		
//		if(str3.equals(str4)) { //문자열을 비교할 때는 .equals를 사용한다.
//			System.out.println("같은 문자열입니다."); 
//		}else {
//			System.out.println("다른 문자열입니다.");
//		}
//		-> 결과 : 같은 문자열입니다.
		
//		String fileName = "Hello.java"; //  Hello , java 두개로 나눠서 출력
//		//				   0123456789
//		
//		
//		int index = fileName.indexOf('.'); // 내가 알고싶은 문자를 () 안에 적으면 된다.
//		System.out.println(fileName.substring(0, index)); // Hello
//		System.out.println(fileName.substring(index + 1)); //java
		
		
		
//		char c = fileName.charAt(0); // 한글자씩 따오고 싶을 때 사용
//		System.out.println(c);
		
//		for(int i=0;i<fileName.length();i++) {
//			System.out.println(fileName.charAt(i));
//		}
		
//		H
//		e
//		l
//		l
//		o
//		.
//		j
//		a
//		v
//		a
		
		//반환타입
//		String str = fileName.substring(0, 5);
//		System.out.println(str);
//		Hello
		
//		String str2 = fileName.substring(6, 10);
//		System.out.println(str2);
//		java
		
//		String str3 = fileName.substring(3);
//		System.out.println(str3);
//		lo.java
		
		
//		int x = 10;
//		String str = String.valueOf(x);
//		System.out.println(str); //10
//		System.out.println(str.charAt(0)); //1
		
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		sb.append("def");
		System.out.println(sb);
		
		

		
		
		

	}

}
