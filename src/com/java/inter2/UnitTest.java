package com.java.inter2;

public class UnitTest {

	public static void main(String[] args) {
		Tank t = new Tank(150);
		Dropship d = new Dropship(125);
		scv scv = new scv(40);
		Medic m = new Medic(100);
		
		Marine mr = new Marine(40);
		
		scv.repair(t);
		scv.repair(scv);
		scv.repair(d);
		m.repair(mr);
		m.repair(m);
		
		
		//scv.repair(mr); - 인터페이스로 묶여있지 않기 때문에
		
	}

}
