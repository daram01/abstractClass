package com.java.inter2;

public class scv extends GroundUnit implements Repairable {
	// Tank, Dropship 치료하는 기능
	scv(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) { // 매개변수의 타입을 체크해야함
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리완료!");
		}
	}


	public String toString() {
		return "scv";
	}
	
}
