package com.java.inter2;

public class Dropship extends AirUnit implements Repairable {
	
	Dropship(int hp) {
		super(hp);
		hitPoint = MAX_HP; // ������ ���ʷ� ����� ���� �ִ�ġ  HP
	}
	
	public String toString() {
		return "Dropship";
	}

	
}
