import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 -없이 입력하세요. : ");
		String numberCheck = sc.nextLine();
		
//      i		 : 0   1   2   3   4   5   6   7   8   9   10  11  12
//      주민등록번호 : 9   5   0   9   1   2   1   1   8   2   5   1   3
//	 			    *   *   *   *   *   *   *   *   *   *   *   *
//      가중치     : 2   3   4   5   6   7   8   9   2   3   4   5  
//				   18+ 15+ 0+  45+ 6+ 14+  8+  9+  16+ 6+  20+  5 = 	162
//		162%11=0	11-0=11		11에서 나머지를 뺀 결과가 2자리 숫자면 10자리는 버리고 1자리만 취한다.
//		      =1	   1=10
//		      =2	   2=9
//		      =10	   10=1
		
		String check = "234567892345";		// 가중치
		int sum = 0;
		for(int i = 0; i < 12; i++) {
//			문자를 곱셈 연산하면 문자의 유니코드 값으로 곱한다.
			sum += (numberCheck.charAt(i) - 48) * (check.charAt(i) - '0');
		}
		System.out.println(sum);
		
		int result = (11 - sum % 11) % 10; 
		
		if(result == numberCheck.charAt(12) - 48) {
			System.out.println("정상");
		} else {
			System.out.println("오류");
		}
		
	}

}
