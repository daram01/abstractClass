package exceptionProject;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü ������ �߱� ������ �ּҰ��� ���� �ٸ�
		Person p1 = new Person("ȫ�浿", 10);
		Person p2 = new Person("ȫ�浿", 10);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
			  //������Ʈ�� �������� ���� ����. �ּҰ� ��
		if(p1.equals(p2)) { // �������̵��� ���� "ȫ�浿" == "ȫ�浿"" �� ���ϴ°�.
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		// ������ ��� -> �ٸ����� ����.
	}

}
