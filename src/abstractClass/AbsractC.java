package abstractClass;

// abstract 코드의 작성 규칙 접근제어자 뒤에 적는다.
public abstract class AbsractC {
	//추상클래스
	//1. abstract 제한을 붙여서 클래스를 선언한다.
	//2. 일반 클래스와 동일하게 멤버를 정의한다.
	//3. 추상 메소드를 정의한다. (선언부만 존재한다.)
	//4. 생성이 불가하다.
	//5. 반드시 자식 클래스에 상속되어야 한다. (상속을 위한 클래스)
	//6. 자식클래스는 반드시 추상 메소드를 오버라이딩해야한다.
	
	int x;
	
	AbsractC(){
		
	}
	
	void method() {
		
	}
	
	//추상메소드
	
	abstract void abstractMethod();
	
}
