package exceptionProject;

public class StringTest {

	public static void main(String[] args) {
		
		//���� ���� ����ϴ� ��
		//charA()
		//subString()
		//indexOf()
		//equals()
		//valuOf()
		
		
		
//		String str1 = "abc";
//		String str2 = "def";
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		
//		str1 = str1 + str2; // "abcdef"
//		System.out.println(str1);
//		
//		
		String str3 = new String("abc"); // �̰� ���� ���� ��������� �� ��
		String str4 = new String("abc");

		
//		if(str3 == str4) { //���ڿ��� ���ϴ� ���� �ƴ϶� �ּҰ��� ���ϴ� ����
//			System.out.println("���� ���ڿ��Դϴ�."); // ������� ����
//		}else {
//			System.out.println("�ٸ� ���ڿ��Դϴ�.");
//		}
//		-> ��� : �ٸ� ���ڿ��Դϴ�. 
//		
//		if(str3.equals(str4)) { //���ڿ��� ���� ���� .equals�� ����Ѵ�.
//			System.out.println("���� ���ڿ��Դϴ�."); 
//		}else {
//			System.out.println("�ٸ� ���ڿ��Դϴ�.");
//		}
//		-> ��� : ���� ���ڿ��Դϴ�.
		
//		String fileName = "Hello.java"; //  Hello , java �ΰ��� ������ ���
//		//				   0123456789
//		
//		
//		int index = fileName.indexOf('.'); // ���� �˰���� ���ڸ� () �ȿ� ������ �ȴ�.
//		System.out.println(fileName.substring(0, index)); // Hello
//		System.out.println(fileName.substring(index + 1)); //java
		
		
		
//		char c = fileName.charAt(0); // �ѱ��ھ� ������ ���� �� ���
//		System.out.println(c);
		
//		for(int i=0;i<fileName.length();i++) {
//			System.out.println(fileName.charAt(i));
//		}
		
//		H
//		e
//		l
//		l
//		o
//		.
//		j
//		a
//		v
//		a
		
		//��ȯŸ��
//		String str = fileName.substring(0, 5);
//		System.out.println(str);
//		Hello
		
//		String str2 = fileName.substring(6, 10);
//		System.out.println(str2);
//		java
		
//		String str3 = fileName.substring(3);
//		System.out.println(str3);
//		lo.java
		
		
//		int x = 10;
//		String str = String.valueOf(x);
//		System.out.println(str); //10
//		System.out.println(str.charAt(0)); //1
		
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		sb.append("def");
		System.out.println(sb);
		
		

		
		
		

	}

}
