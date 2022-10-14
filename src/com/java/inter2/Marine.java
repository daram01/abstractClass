package com.java.inter2;

public class Marine extends GroundUnit implements Repairable2 {

	Marine(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Marine";
	}

}
