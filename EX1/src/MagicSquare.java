
public class MagicSquare {

	public static void main(String[] args) {
		
		int[][] data = new int[5][5];
//		마방진의 첫 번째 숫자 1이 채워지는 자리는 첫줄 가운데열
		int i = 0, j = 2;
		
		for(int k=1; k<26; k++) {
			data[i][j] = k;
//			방금 배열에 채운 숫자k가 5의 배수면 다음숫자가 채워질 위치는 행만 1 증가시킨다
//			5의 배수가 아니면 오른쪽 위 방향으로 채워진다(행 +1, 열 -1)
			if(k % 5 == 0) {
				i++;
			}else {
				if(--i<0) {
//					행이 배열의 범위를 벗어나면 마지막 행으로 변경
					i=4;
				}
				if(++j == 5) {
//					열이 배열의 범위를 벗어나면 첫번째 열로 변경
					j=0;
				}
			}
		}
			
		
		for (i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.printf("%2d ", data[i][j]);
			}
			System.out.println();
		}
	}
}
