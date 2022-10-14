package com.java.inter;

public interface MyInterface {
	//인터페이스 특징
	//1. 생성이 불가하다.
	//2. 클래스처럼 멤버를 정의할 수 없다.
	//3. 두가지 형식의 멤버만 정의 할 수 있다. (추상메소드, final 상수, 디폴트 메소드) ★
	//	  멤버의 제한자는 생략 가능하다.
	//4. 반드시 클래스에 상속해야한다.
	//5. 자식클래스는 반드시 추상메소드를 오버라이딩 해야한다.
	//6. 인터페이스간 상속도 가능하다.
	//7. 클래스와 다르게 다중 상속이 가능하다. (잘 쓰지는 않음)
	//8. 클래스와 동일하게 다형성을 적용할 수 있다. ★★
	
	//public static final int MAX = 100; // 제한자 -> public static final
	//public abstract void method();	   // 제한자 -> public abstract
	// 위의 두가지 형식만 가능함. 다른 건 안 됨.
	
	int MAX = 100;
	void method();
}
