import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3과목 점수를 입력 하세요 : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int db = sc.nextInt();
		
		int total = java + jsp + db;
		double average = total / (double)3;
		
		System.out.println("평균 점수 : " + average);
		
		if(average <= 50 ) {
			System.out.println("미입니다.");
		} else if (average < 70) {
			System.out.println("우입니다.");
		} else {
			System.out.println("수입니다.");
		}
	}

}
