import java.util.Random;

// 주사위 눈 갯수 구하기
public class Main6 {

	public static void main(String[] args) {
		
		Random random = new Random();
//		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
//		배열 : 같은 이름으로 여러개의 기억장소를 만들어 사용할 경우
//		배열을 선언하면 숫자는 0, 문자는 공백, boolean은 false, 클래스로 만든 배열은 null로 자동으로 초기화 됨
//		자료형[] 배열명 = new 자료형[배열의 크기]
		int[] count = new int[6];
		
		for (int i = 1; i <= 6; i++) {
			int t = random.nextInt(6) + 1;
			System.out.println(t);
			switch (t) {
/*			case 1 :
				a++;
				break;
			case 2 :
				b++;
				break;
			case 3 :
				c++;
				break;
			case 4 :
				d++;
				break;
			case 5 :
				e++;
				break;
			case 6 :
				f++;
				break;
*/				
			case 1 :
				count[0]++;
				break;
			case 2 :
				count[1]++;
				break;
			case 3 :
				count[2]++;
				break;
			case 4 :
				count[3]++;
				break;
			case 5 :
				count[4]++;
				break;
			case 6 :
				count[5]++;
				break;
			}
		}
/*		System.out.println("1의 개수 : " + a);
		System.out.println("2의 개수 : " + b);
		System.out.println("3의 개수 : " + c);
		System.out.println("4의 개수 : " + d);
		System.out.println("5의 개수 : " + e);
		System.out.println("6의 개수 : " + f);
*/
//		배열명.length : 배열의 크기를 얻어온다
		for (int i = 0; i < count.length; i++) {
			System.out.println("1의 개수 : " + count[i]);
		}
		
	}
}
