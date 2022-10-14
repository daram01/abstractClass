package bearFish;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class GameObject {
	//protected -> 외부 패키지에서 접근이 안됨. 같은 패키지 내에서는 가능하다.
	protected int distance; // 한 번 이동거리
	protected int x, y; // 현재 위치(화면 맵 상의 위치)
	
					//충돌
	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		}else {
			return false;
		}
	}
	
	protected abstract void move(); // 움직이는것
	protected abstract char getShape();
}
