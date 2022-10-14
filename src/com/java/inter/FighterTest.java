package com.java.inter;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Moveable ma = new Fighter();
		Attackable at = f;
		
		//f가 현재 조상을 누구로 갖고있는지 체크할 때 사용함
		if(f instanceof Unit/*클래스명 or 인터페이스명*/) {
			System.out.println("Unit은 조상 클래스다.");
		}
		if(f instanceof Fighterable) {
			System.out.println("Fighterable은 조상 클래스다.");
		}
		if(f instanceof Moveable) {
			System.out.println("Moveable은 조상 클래스다.");
		}
		if(f instanceof Attackable) {
			System.out.println("Attackable은 조상 클래스다.");
		}
	}

}
