
public class Main8 {

	public static void main(String[] args) {
		
//		while의 최초 진입 조거이 거짓이면 {}블록을 한번도 실행하지 않음
		int sum = 0, i = 0;
		while(i < 100) {
			sum += ++i;
		}
		System.out.println("1~100합계 : " + sum);
		
//		while의 최초 진입 조건이 거짓이더라도 {}블록을 한번은 실행함
		sum = i = 0;
		do {
			sum += ++i;
		} while(i<100);
		System.out.println("1~100합계 : " + sum);
		
	}

}
