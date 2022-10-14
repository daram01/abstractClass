package com.java.inter2;

public class scv extends GroundUnit implements Repairable {
	// Tank, Dropship ġ���ϴ� ���
	scv(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) { // �Ű������� Ÿ���� üũ�ؾ���
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� �����Ϸ�!");
		}
	}


	public String toString() {
		return "scv";
	}
	
}
