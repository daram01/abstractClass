package com.java.inter2;

public class Dropship extends AirUnit implements Repairable {
	
	Dropship(int hp) {
		super(hp);
		hitPoint = MAX_HP; // 유닛이 최초로 실행될 때의 최대치  HP
	}
	
	public String toString() {
		return "Dropship";
	}

	
}
