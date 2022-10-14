package exceptionProject;

import java.util.Scanner;

public class LoginTest extends Exception {

	public static void main(String[] args) {
		String id;
		int password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id 입력 : ");
		id = sc.next();
		System.out.println("password 입력 : ");
		password = sc.nextInt();
		
		if(!id.equals("tis")) { // 문자열 비교 equals()라는 메소드를 사용한다. 
			//예외처리
			//아이디가 불일치 합니다.
			try {
				throw new id("아이디가 불일치합니다.");
				}catch(id e) {
					System.out.println("아이디를 다시 입력하세요.");
				}
			}
		
		if(password != 1234) {
			//예외처리
			//비밀번호가 불일치 합니다.
			try {
				throw new password("비밀번호가 불일치합니다.");
				}catch(password e) {
					System.out.println("비밀번호를 다시 입력하세요.");
				}
		}
		
		if(id.equals("tis") && password == 1234) {
			System.out.println("로그인 성공");
		}

	}

}
