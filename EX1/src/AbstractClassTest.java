import java.util.Scanner;

//	다형성 : 하나의 메소드가 서로 다른 클래스에서 다양하게 사용되는 것을 말함
//	다형성을 구현할 메소드를 포함하 클래스는 같은 부모클래스를 가져야 함
//	부모 클래스와 자식 클래스에 반드시 같은 메소드가 있어야 하고 자식 클래스는 이를 반드시 Override 해서 사용해야 함
//	부모 클래스의 객체에 자식 클래스의 객체를 대입해서 실행해야 함
abstract class Shape{
	public abstract void draw();		// 다형성을 구현할 메소드, 추상 메소드
}

class Point extends Shape{
	@Override
	public void draw() {
		System.out.println("점을 찍는다.");
	}
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("선을 그린다.");		
	}	
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
}

public class AbstractClassTest {

	public static void main(String[] args) {
		Shape shape = new Point();
		shape.draw();
		
		Shape[] shapes = {new Point(), new Line(), new Circle()};
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 메뉴를 선택하세요");
		int menu = sc.nextInt();
		
		shapes[menu-1].draw();
		sc.close();
	}
}


