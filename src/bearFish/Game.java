package bearFish;

public class Game {
	
	public static final int MAX_X = 20;
	public static final int MAX_Y = 10;
	
	
	private char[][] map = new char[MAX_Y][MAX_X]; // ���� 0 ~ 9 , ���� 0 ~ 19 ����
	private GameObject [] m = new GameObject[2];
	int state; // 0. ���� �� 1. ���� ��
	
	{
		System.out.println("=====================");
		System.out.println("=     GAME START    =");
		System.out.println("=====================");
	}
	
	public Game() {
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = '-';
			}
		}
		m[0] = new Bear(1,0,0);
		m[1] = new Fish(2,5,5);
		state = 0;
	}
	
	public void run() {
		System.out.println();
		System.out.println("** Bear�� Fish �Ա� ������ �����մϴ�. **" );
		System.out.println();
		update(); // �迭�� B�� @�� x,y�� �̿��ؼ� �־��ִ� ����
		draw(); // �迭�� ���� ���
		
		
		while(!doesEnd()) {
			clear();
			
			for(int i=0;i<m.length;i++) {
				m[i].move();
			}
			update();
			draw();
		}
		
		System.out.println("=====================");
		System.out.println("=     GAME OVER     =");
		System.out.println("=====================");

	}

	
	private void update() {
		for(int i=m.length-1; i>=0;i--) {
			map[m[i].getY()][m[i].getX()] = m[i].getShape();
		}
//		map[m[0].getX()][m[0].getY()] = m[0].getShape();
//		map[m[1].getX()][m[1].getY()] = m[1].getShape();
	}
	
	private void draw() {
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}	
	}
	
	private void clear() {
		for(int i =0;i<m.length;i++) {
			map[m[i].getY()][m[i].getX()] = '-';
		}
	}
	
	//�浹�� �����ϴ� �޼ҵ�
	private boolean doesEnd() {
		if(m[0].collide(m[1])) {
			return true;
		}else {
			return false;
		}
	}
	
}
