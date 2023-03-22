// 	추상 클래스 : 한 개 이상의 추상 메소드를 포함한 클래스로 불완전한 클래스이기 때문에 객체를 만들어 사용할 수 없음
//	추상 클래스는 상속을 시키기 위해 만드는 클래스로 추상 클래스를 상속받은 자식 클래스는 상속받은 추상 메소드를 반드시 Override 시켜서 사용해야됨
abstract class Product{
//	추상 메소드 : 아무런 일도 하지않는 메소드로 {}을 가지지 않는 메소드로 abstract예약어를 사용
//	public void move() {}  : 아무런 일도 하지않는 일반 메소드
	public abstract void move();
}

// 	추상 클래스 Product를 상속받아 Camera 클래스를 만듬
class Camera extends Product {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}

//	파일 이름과 같은 이름을 가지는 클래스에만 public을 붙여야 함
public class AbstractClass {

	public static void main(String[] args) {
	
//		Product product = new Product(); 	// 추상 클래스는 객체를 만들어 사용할 수 없음
	}
}
