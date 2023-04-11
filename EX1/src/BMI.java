import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int height;
		int weight;
		
		System.out.println("------18.5------23------25------30-------");
		System.out.println("-저체중------정상-----과체중----비만----고도비만-\n");
		
		System.out.print("키(cm)를 입력 하세요");
		height = sc.nextInt();
		
		System.out.print("몸무게(kg)를 입력 하세요");
		weight = sc.nextInt();
		
		double a = height / (double)100;

		double BMI = weight / (a * a);
		
		if(BMI < 18.5) {
			System.out.println("당신의 BMI는 " + Math.round(BMI*100)/100.0 + ", 저체중 입니다");
		} else if(BMI >= 18.5 && BMI < 23 ) {
			System.out.printf("당신의 BMI는 " + Math.round(BMI*100)/100.0 + ", 정상 입니다");
		} else if(BMI >= 23 && BMI < 25) {
			System.out.println("당신의 BMI는 " + Math.round(BMI*100)/100.0 + ", 과체중 입니다");
		} else if(BMI >= 25 && BMI < 30) {
			System.out.println("당신의 BMI는 " + Math.round(BMI*100)/100.0 + ", 비만 입니다");
		} else {
			System.out.println("당신의 BMI는 " + Math.round(BMI*100)/100.0 + ", 고도비만 입니다");
		}
				
		sc.close();
	}

}
