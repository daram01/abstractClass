package bearFish;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class GameObject {
	//protected -> �ܺ� ��Ű������ ������ �ȵ�. ���� ��Ű�� �������� �����ϴ�.
	protected int distance; // �� �� �̵��Ÿ�
	protected int x, y; // ���� ��ġ(ȭ�� �� ���� ��ġ)
	
					//�浹
	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		}else {
			return false;
		}
	}
	
	protected abstract void move(); // �����̴°�
	protected abstract char getShape();
}
