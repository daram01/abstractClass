package exceptionProject;

import java.util.Scanner;

public class LoginTest extends Exception {

	public static void main(String[] args) {
		String id;
		int password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id �Է� : ");
		id = sc.next();
		System.out.println("password �Է� : ");
		password = sc.nextInt();
		
		if(!id.equals("tis")) { // ���ڿ� �� equals()��� �޼ҵ带 ����Ѵ�. 
			//����ó��
			//���̵� ����ġ �մϴ�.
			try {
				throw new id("���̵� ����ġ�մϴ�.");
				}catch(id e) {
					System.out.println("���̵� �ٽ� �Է��ϼ���.");
				}
			}
		
		if(password != 1234) {
			//����ó��
			//��й�ȣ�� ����ġ �մϴ�.
			try {
				throw new password("��й�ȣ�� ����ġ�մϴ�.");
				}catch(password e) {
					System.out.println("��й�ȣ�� �ٽ� �Է��ϼ���.");
				}
		}
		
		if(id.equals("tis") && password == 1234) {
			System.out.println("�α��� ����");
		}

	}

}
