package exceptionProject;

public class ExceptionTest {

	public static void main(String[] args) {
		
		//Exception 
		
		// 예외처리 : 코드상에서 개발자가 인지할 수 있는 실행시 문제점이다.
		
//		try {
//			실행문장; // 예외를 발생할 수 있는 구문
//		}catch(예외타입){
//			예외처리 구문
//		}
		
		
//		for(int i=0;i<100;i++) {
//			try {
//				int r = (int)(Math.random()*10); // 0부터 9까지의 난수
//				System.out.println(r); // r의 값을 확인해보기
//				int result = 10 / r; // 값을 나누다보면 r이 0일 때가 있는데, 정수는 0으로 나눌 수 없다. 
//									 // 즉, 오류 발생(예외 발생)
//			}catch(ArithmeticException e) { // 이 부분 빼고는 오류가 없으니 처리해달라는 코드임
//				System.out.println("0으로 나누어서 예외를 강제로 처리했습니다.");
//			}
//		}
		
		
		
//		 // 정확한 오류타입이 좋긴 하지만 Exception 타입을 적어도 무방하다.
//		int[] arr = new int[5]; // 0 ~ 4
//		
//		try {
//			int r = (int)(Math.random()*10);
//			System.out.println(r);
//			int result = 10 / r;
//			arr[5] = 10;
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나누어서 예외를 강제로 처리했습니다.");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index number 오류");
//		}catch(Exception e) { // 오류타입을 잘 모르겠으면 Exception의 타입을 적으면 된다.
//			System.out.println("모든 예외 처리");
//		}finally /*finally 는 필요에 따라 적어도, 안 적어도 됨.*/	{
//			//예외 발생 유무와 상관 없이 무조건 한 번은 실행하는 구문
//			System.out.println("예외 발생 유무와 상관 없이 무조건 한 번은 실행하는 구문");
//		}
//		arr[3] = 10;
//		System.out.println(arr[3]);
		
		
		
		// 강제로 예외 발생시킬 때 무조건 try를 써야함
//		try {
//			throw new Exception("고의로 예외발생"); // 강제로 예외 발생하게 하는 코드
//		}catch(Exception e) { 
//			System.out.println(e.getMessage());
//			e.printStackTrace(); // 예외 처리 과정을 알고 싶을 때
//		}
		
		add();
		
		// catch문 타입
		// throw에서 강제예외
		// throws에서 예외 선언
		
		try {
			sub();	
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}

		

	}// main 함수의 끝 
	
	static void add() {
		try {
		 throw new Exception("add()에서 문제 발생");
		}catch(Exception e) {
			e.printStackTrace();
		}
	} // add() end <- 이런식으로 끝에 주석처리 하면 좋음
	
	static void sub() throws ArithmeticException /* 예외 선언하기 -> 예외 처리 떠넘기기 */{
		throw new ArithmeticException("sub() 예외 발생");
	}
	
	
}
