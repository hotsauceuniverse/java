import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 입력 : ");
		String str = sc.nextLine();
		System.out.println("문자열 크기(공백제외) : " + str.trim().length()) ;
		System.out.println("무조건 대문자 : " + str.toUpperCase());
		System.out.println("3번째 문자 : " + str.charAt(3));
		
		sc.close();
	
		
	}

}
