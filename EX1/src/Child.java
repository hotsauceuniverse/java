//	자식클래스
//  Parent 클래스를 상속받아 Child 클래스를 만든다
public class Child extends Parent {

//	Parent 클래스를 상속받았으므로 Parent 클래스의 모든 멤버 변수와 메소드를 별도로 정의하지 않아도 사용할 수 있음
//	부모 클래스의 private 권한을 가진 멤버는 상속은 받았지만 접근할 수 없음
	private int age;
	private String nickName;
	
	public Child() {
		
	}

//	자동완성기능을 사용해도 현재 클래스에서 직접 입력해 정의하지 않은 멤버는 보이지 않음
//	부모 클래스로부터 상속받은 멤버 변수의 접근 권한이 private일 경우 부모 클래스의 생설자을 호출해서 초기화 시킨다
	public Child(String name, boolean gender, int age, String nickName) {
		super(name, gender);
		this.age = age;
		this.nickName = nickName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
//		부모 클래스로부터 상속받은 멤버 변수의 접근권한이 private이면 접근할 수 없으므로 getter메소드를 사용해야함
		return getName() + "(" + (isGender() ? "남" : "여") + ") - " + age + "," + nickName;
	}
	
}
