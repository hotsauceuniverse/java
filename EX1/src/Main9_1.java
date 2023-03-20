
public class Main9_1 {

//  메소드 형식
//	접근권한 지정자 [static] 메소드의 리턴타입 메소드이름([인수, ...]){		// 메소드의 머리
//	메소드가 실행할 문장
//	[return 값;]    리턴값이 없는 메소드는 리턴타입에 "void"라고 적는다
//	}
//	메소드를 호출할 때는 메소드의 이름으로 호출하고 return 또는 "}"를 만나면 메소드가 호출된 문장으로 되돌아 간다.
	
//	접근권한 지정자 
//	private : 현재 클래스 외부에서 접근할 수 없음 (상속 불가능)
//	protected : 현재 클래스와 현재 클래스를 상속받은 자식 클래스만 접근 가능 (상속 가능)
//	package : 현재 패키지에서는 public 처럼 사용되고, 다른 패키지에서는 private 처럼 사용됨 (상속 가능) 
//	public : 아무곳에서나 자유롭게 사용 가능 (상속 가능)
	
//	정적(static) 메소드 : 클래스의 객체를 생성하지 않고 클래스 이름에 "."을 찍어서 실행할 수 있음
	
	
	public int total() {
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			sum+= i;
		}
		return sum;
	}
	
	
	
}