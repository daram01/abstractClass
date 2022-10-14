package com.java.inter2;

public class Medic extends GroundUnit implements Repairable2{

	Medic(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	
	void repair(Repairable2 r2) { // �Ű������� Ÿ���� üũ�ؾ���
		if(r2 instanceof Unit) {
			Unit u = (Unit)r2;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� �����Ϸ�!");
		}
	}
	
	

	public String toString() {
		return "Medic";
	}
	
}
