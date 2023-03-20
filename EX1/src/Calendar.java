import java.util.Scanner;

//	달력을 출력하는 클래스
public class Calendar {

	public static void main(String[] args) {
		
//		System.out.println(CalendarMethod.isLeapYear(2023) ? "윤년" : "평년");
//		System.out.println(CalendarMethod.lastDay(2023, 3));
//		System.out.println(CalendarMethod.total(2023, 3, 15));
//		System.out.println(CalendarMethod.weekDay(2023, 3, 15));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("달력을 출력할 년, 월 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		System.out.println("----------------------------");
		System.out.printf("         %4d년 %2d월\n", year, month);
		System.out.println(" 일   월   화   수   목   금  토 ");
		System.out.println("----------------------------");
		
//		1일의 요일 만큼 반복하며 빈칸을 출력한다
		for(int i = 1; i<= CalendarMethod.weekDay(year, month, 1); i++) {
			System.out.print("    ");
		}
		
//		1일부터 달력을 출력할 달의 마지막 날짜 만큼 반복하며 날짜를 출력한다
		for(int i = 1; i <= CalendarMethod.lastDay(year, month); i++) {
			System.out.printf(" %2d ", i);
//		출력한 날짜가 토요일이고 그 달의 마지막 날짜가 아니면 줄을 바꾼다
			if(CalendarMethod.weekDay(year, month, i) == 6 && CalendarMethod.lastDay(year, month) != i) {
				System.out.println();
			}
		}
		System.out.println("\n----------------------------");
	}

}










