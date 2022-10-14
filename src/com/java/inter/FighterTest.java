package com.java.inter;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Moveable ma = new Fighter();
		Attackable at = f;
		
		//f�� ���� ������ ������ �����ִ��� üũ�� �� �����
		if(f instanceof Unit/*Ŭ������ or �������̽���*/) {
			System.out.println("Unit�� ���� Ŭ������.");
		}
		if(f instanceof Fighterable) {
			System.out.println("Fighterable�� ���� Ŭ������.");
		}
		if(f instanceof Moveable) {
			System.out.println("Moveable�� ���� Ŭ������.");
		}
		if(f instanceof Attackable) {
			System.out.println("Attackable�� ���� Ŭ������.");
		}
	}

}
