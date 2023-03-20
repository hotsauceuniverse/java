
public class Main4 {

	public static void main(String[] args) {
		
//		반복 횟수가 몇 번인지 알 경우 For 사용
//		for가 실행되는 원리
//		1. 변수에 저장된 값으로 조건식을 실행해서 참이면 반복을 시작
//		2. {}을 한번 실행 한 후 변수 값을 증감치만큼 변경 후 조건식을 실행해서 참이면 {}반복, 거짓이면 {}탈출
//		
//		for(자료형 변수명 = 초기치; 조건식; 증감치;) {
//		조건식이 참인경우 실행할 문장;
//		}
	
//		변수를 선언만 하면 변수에 어떤 내용이 저장되어있는지 모르기 때문에 반드시 사용하기 전에 초기화 시켜야됨
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("100까지의 합 : " + sum);
		
		int a = 1, b, c;
		b= a++;
		c= ++a;
		System.out.println("a : " + a + ",b : " + b + ",c : " + c);
		
		
	}


	
}
