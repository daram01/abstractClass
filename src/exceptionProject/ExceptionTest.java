package exceptionProject;

public class ExceptionTest {

	public static void main(String[] args) {
		
		//Exception 
		
		// ����ó�� : �ڵ�󿡼� �����ڰ� ������ �� �ִ� ����� �������̴�.
		
//		try {
//			���๮��; // ���ܸ� �߻��� �� �ִ� ����
//		}catch(����Ÿ��){
//			����ó�� ����
//		}
		
		
//		for(int i=0;i<100;i++) {
//			try {
//				int r = (int)(Math.random()*10); // 0���� 9������ ����
//				System.out.println(r); // r�� ���� Ȯ���غ���
//				int result = 10 / r; // ���� �����ٺ��� r�� 0�� ���� �ִµ�, ������ 0���� ���� �� ����. 
//									 // ��, ���� �߻�(���� �߻�)
//			}catch(ArithmeticException e) { // �� �κ� ����� ������ ������ ó���ش޶�� �ڵ���
//				System.out.println("0���� ����� ���ܸ� ������ ó���߽��ϴ�.");
//			}
//		}
		
		
		
//		 // ��Ȯ�� ����Ÿ���� ���� ������ Exception Ÿ���� ��� �����ϴ�.
//		int[] arr = new int[5]; // 0 ~ 4
//		
//		try {
//			int r = (int)(Math.random()*10);
//			System.out.println(r);
//			int result = 10 / r;
//			arr[5] = 10;
//		}catch(ArithmeticException e) {
//			System.out.println("0���� ����� ���ܸ� ������ ó���߽��ϴ�.");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index number ����");
//		}catch(Exception e) { // ����Ÿ���� �� �𸣰����� Exception�� Ÿ���� ������ �ȴ�.
//			System.out.println("��� ���� ó��");
//		}finally /*finally �� �ʿ信 ���� ���, �� ��� ��.*/	{
//			//���� �߻� ������ ��� ���� ������ �� ���� �����ϴ� ����
//			System.out.println("���� �߻� ������ ��� ���� ������ �� ���� �����ϴ� ����");
//		}
//		arr[3] = 10;
//		System.out.println(arr[3]);
		
		
		
		// ������ ���� �߻���ų �� ������ try�� �����
//		try {
//			throw new Exception("���Ƿ� ���ܹ߻�"); // ������ ���� �߻��ϰ� �ϴ� �ڵ�
//		}catch(Exception e) { 
//			System.out.println(e.getMessage());
//			e.printStackTrace(); // ���� ó�� ������ �˰� ���� ��
//		}
		
		add();
		
		// catch�� Ÿ��
		// throw���� ��������
		// throws���� ���� ����
		
		try {
			sub();	
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}

		

	}// main �Լ��� �� 
	
	static void add() {
		try {
		 throw new Exception("add()���� ���� �߻�");
		}catch(Exception e) {
			e.printStackTrace();
		}
	} // add() end <- �̷������� ���� �ּ�ó�� �ϸ� ����
	
	static void sub() throws ArithmeticException /* ���� �����ϱ� -> ���� ó�� ���ѱ�� */{
		throw new ArithmeticException("sub() ���� �߻�");
	}
	
	
}
