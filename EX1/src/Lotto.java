import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if((i + 1) % 10 == 0) {					// 10개씩 줄 바꿈
				System.out.println();
			}
		}
		
		System.out.println("\n-----------섞기 전-----------");
		
//		lotto[0]에 저장된 값과 lotto[1]~[44] 사이의 랜덤한 위치의 값을 교환한다.
		Random random = new Random();
		for (int i = 0; i < 44; i++) {
			int r = random.nextInt(44) + 1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if((i + 1) % 10 == 0) {					// 10개씩 줄 바꿈
				System.out.println();
			}
		}
		
		System.out.println("\n-----------섞은 후-----------");
		
		System.out.print("1등 번호 : ");
		for(int i = 0; i < 6; i ++) {
			System.out.print(lotto[i] + " ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("보너스 : " + lotto[6]);
	}
}
