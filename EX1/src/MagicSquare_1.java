import java.util.Scanner;

public class MagicSquare_1 {
	public static void main(String[] args) {
		
		int n;
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("배열의 차수를 홀수로 입력하세요");
			n = sc.nextInt();
			if(n%2 == 1) {
				break;
			}
			System.out.println("홀수로~~");
		}		
		
//		입력받은 배열의 차수만큼 배열을 선언
		int[][] data = new int[n][n];
//		숫자가 채워질 첫번째 위치(첫줄 가운데)
		int i = 0, j = n/2;
		
		for(int k=1; k<Math.pow(n,2); k++) {
			data[i][j] = k;
			if(k % n == 0) {
				i++;
			}else {
				if(--i<0) {
					i=n-1;
				}
				if(++j == n) {
					j=0;
				}
			}
		}
			
		
		for (i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.printf("%3d ", data[i][j]);
			}
			System.out.println();
		}
	}
}
