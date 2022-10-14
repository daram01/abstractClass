package com.java.inter2;

public class Medic extends GroundUnit implements Repairable2{

	Medic(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	
	void repair(Repairable2 r2) { // 매개변수의 타입을 체크해야함
		if(r2 instanceof Unit) {
			Unit u = (Unit)r2;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리완료!");
		}
	}
	
	

	public String toString() {
		return "Medic";
	}
	
}
