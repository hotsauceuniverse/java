import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("윤년/평년을 판별할 년도를 입력 : ");
		int year = sc.nextInt();
		
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0; 
		
//		년도가 4로 나눠 떨어지고, 100으로 나눠 떨어지지 않거나, 400을 나눠 떨어지면 윤년, 그렇지 않으면 평년
		if (isLeapYear) {
			System.out.println(year + "년은 윤년");
		} else {
			System.out.println(year + "년은 평년");
		}
		
//		삼항연산자
//		if의 조건을 비교한 결과 조건이 참일때와 거짓일 때 실행할 문장이 각각 1문장인 경우
//		조건식 ? 조건식이 참일 경우 실행할 내용 : 조건식이 거짓일 경우 실행할 내용
		System.out.println(year + "년은 " + (isLeapYear ? "윤" : "평") + "년 입니다.");
		
		
		sc.close();

	}

}
