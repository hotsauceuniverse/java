import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("년, 월, 일을 입력하세요 : ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		
//		1년1월1일부터 입력한 년도의 전년도 12월 31일까지 지난 날짜 계산
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		
//		전년도 12월 31일 까지 지난 날짜수의 올해 전달 까지 지난 날짜를 더한다
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		m[1] = year % 4 == 0 && year % 100 != 0 && year % 400 == 0 ? 29 : 28;
		for (int i = 1; i < (month); i++) {
			sum += m[i-1];
		}
		sum += day;
		
//		배열을 선언할 때 new를 사용하지 않고 {}안에 초기치를 지정하면 초기지의 개수만큼 자동으로 배열을 만들고 초기치로 초기화 시켜줌
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(week[sum % 7]);
	}

}
