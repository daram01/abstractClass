package abstractClass;

public abstract class Unit {
	int x,y;
	abstract void move(int x, int y);
	// 자식클래스들은 선택이 아니라 필수로 오버라이딩 해야함.
	void stop() {};
}

