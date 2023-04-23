package Day07;

import java.util.Scanner;

public class Calculator {
	
	public static double Plus(double num1, double num2) {
		return num1+num2;
	}
	
	public static double Minus(double num1, double num2) {
		return num1-num2;
	}
	
	public static double Multi(double num1, double num2) {
		return num1*num2;
	}
	
	public static double Div(double num1, double num2) {
		return num1/num2;
	}
	
	public static void Select() {
		String[] cal = new String[5];
		cal[0] = "덧셈";
		cal[1] = "뺄셈";
		cal[2] = "곱셈";
		cal[3] = "나눗셈";
		cal[4] = "종료";
		
		System.out.println("==========");
		System.out.printf("1. %s%n", cal[0]);
		System.out.printf("2. %s%n", cal[1]);
		System.out.printf("3. %s%n", cal[2]);
		System.out.printf("4. %s%n", cal[3]);
		System.out.printf("5. %s%n", cal[4]);
		System.out.println("===========");
		System.out.println("필요한 계산을 선택하세요. \n종료를 선택하면 계산기가 종료됩니다.");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		
		do {
			Select();
			input = sc.nextInt();
			
			if(input == 1) {
				System.out.println("2개의 숫자를 입력하세요.");
				Double num1 = sc.nextDouble();
				Double num2 = sc.nextDouble();
				System.out.println(Plus(num1, num2));
			} else if(input == 2) {
				System.out.println("2개의 숫자를 입력하세요.");
				Double num1 = sc.nextDouble();
				Double num2 = sc.nextDouble();
				System.out.println(Minus(num1, num2));
			} else if(input == 3) {
				System.out.println("2개의 숫자를 입력하세요.");
				Double num1 = sc.nextDouble();
				Double num2 = sc.nextDouble();
				System.out.println(Multi(num1, num2));
			} else if(input ==4) {
				System.out.println("2개의 숫자를 입력하세요.");
				Double num1 = sc.nextDouble();
				Double num2 = sc.nextDouble();
				System.out.println(Div(num1, num2));
			}
		} while(input != 5);
		
	    System.out.println("잘가~");	
	}

}
