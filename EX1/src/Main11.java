import java.util.Date;

public class Main11 {

	private int no;				// 객체가 생성될 때 마다 자동으로 1 증가
	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate;		// 객체가 생성되는 순간의 날짜와 시간
	
//	생성자 메소드
//	생성자 이름은 반드시 클래스 이름과 같아야 함
//	생성자는 return을 가지지 않음(return을 가지지 않는 메소드는 접근권한에 void를 입력하는데 생성자는 접근권한을 쓰지않음)
//	생성자를 선언하지 않으면 자바컴파일러가 아무런 일도 하지 않는 기본 생성자를 만들어줌.
//	생성자는 객체가 생성될 때 자동으로 실행되며 멤버변수를 초기화 시키는 목적으로 사용됨
	
	public Main11() {
		System.out.println("기본 생성자가 실행됨");
	}
	
	public Main11(String name, boolean gender, String memo) {
//		같은 {}에 같은 이름을 가지는 지역변수와 멤버변수가 있을 경우 지역변수에 우선권을 준다
//		super();   				// 부모클래스의 생성자를 의미
//		this();					// 현재클래스의 생성자를 의미
//		super					// 부모클래스를 의미
//		this					// 현재클래스를 의미
		this.name = name;
		this.gender = gender;
		this.memo = memo;
	}
	
	
//	객체에 저장된 내용을 출력해야 한다면 toString() 메소드를 override(재정의)
	@Override
	public String toString() {
		return name + "(" + (gender ? "남" : "여") + ")" + memo;
	}

}




