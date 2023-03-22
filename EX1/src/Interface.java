class Pointer{
	int x, y;
	public void move() {}
}	
class Shaper {
	//	변수 앞에 final이 붙으면 그 변수는 프로그램에서 값을 변경할 수 없음
	public static final double PI = 3.14;	// 정적 멤버 변수
}

//	자바는 다중상속을 허용하지 않음
//class Liner extends Pointer, Shaper {}	// ,Shaper 이후 에러 발생

//	인터페이스 : 정적(static)멤버 변수와 추상 메소드로만 구성된 클래스의 특별한 형태
interface Draw {
	public static final double PI = 3.14;	// 정적 멤버 변수
	int LIMIT = 1000;						// 인터페이스는 멤버 변수 선언 시, public static final을 생략해도 됨
	public abstract void moveTo();			// 추상 메소드
	void erase();							// 인터페이스는 메소드 선언 시, public abstract을 생략해도 됨
}

interface Graphic {
	void rotate();
	void resize();
}

//class Line extends Draw {}					// 클래스는 인터페이스를 상속받을 수 없으므로 Draw에서 에러 발생
//interface Graphics extends Point{}			// 인터페이스는 클래스를 상속받을 수 없으므로 Point에서 에러 발생
//	클래스는 클래스끼리 인터페이스는 인터페이스끼리 상속시켜야 함

interface Graphics extends Draw, Graphic {		// 인터페이스는 다중상속을 허용
//	아무런 내용도 가지지 않는 인터페이스를 표시(marker)인터페이스라고 부름
}

//	클래스 선언 시, 인터페이스에서 정의한 내용을 사용하려면 상속(extends)를 사용할 수 없고 구현(implements)을 사용한다
//	Line 클래스는 Point 클래스를 살속받고 Draw 인터페이스와 Graphic 인터페이스를 구현해서 만듬
class LineTo extends Point implements Draw, Graphic {

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveTo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void erase() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		System.out.println(Shaper.PI);
		System.out.println(Draw.PI);
		System.out.println(Draw.LIMIT);
	}
}
