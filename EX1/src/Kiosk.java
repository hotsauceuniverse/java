import java.util.Scanner;

public class Kiosk {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] menu = new String[3];
		menu[0] = "커피";
		menu[1] = "에이드";
		menu[2] = "스낵";
		
		String select_menu;
		
		System.out.println("=====MENU=====");
		System.out.printf("1. %s%n", menu[0]);
		System.out.printf("2. %s%n", menu[1]);
		System.out.printf("3. %s%n", menu[2]);
		System.out.println("==============");
		
		System.out.print("메뉴 선택 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1: 
		case 2: 
		case 3: 
			select_menu = menu[input-1];
			break;
		default: 
			select_menu = null;
		}
		
		String[] menu_category = new String[6];
		menu_category[0] = "아이스 아메리카노";
		menu_category[1] = "카페 라떼";
		menu_category[2] = "딸기 에이드";
		menu_category[3] = "자몽 에이드";
		menu_category[4] = "딸기 마카롱";
		menu_category[5] = "초코 마카롱";
		
		String select_category;
		
		if(input == 1) {
			System.out.println("=====CATEGORY=====");
			System.out.printf("1-1. %s%n", menu_category[0]);
			System.out.printf("1-2. %s%n", menu_category[1]);
			System.out.println("==================");
			System.out.print("종류 선택 : ");
			int cafe_menu = sc.nextInt();
			
			switch(cafe_menu) {
			case 1:
			case 2:
				select_category = menu_category[cafe_menu -1];
				break;
			default:
				select_category = null;	
			}
			
			if(select_category == null) {
				System.out.println("카테고리를 다시 선택해 주세요!");
			} else {
				System.out.printf("고르신 메뉴는 %s 입니다", select_category);
			}
			
		} else if(input == 2) {
			System.out.println("=====CATEGORY=====");
			System.out.printf("2-1. %s%n", menu_category[2]);
			System.out.printf("2-2. %s%n", menu_category[3]);
			System.out.println("==================");
			System.out.print("종류 선택 : ");
			int cafe_menu = sc.nextInt();
			
			switch(cafe_menu) {
			case 1:
			case 2:
				select_category = menu_category[cafe_menu +1];
				break;
			default:
				select_category = null;	
			}
			
			if(select_category == null) {
				System.out.println("카테고리를 다시 선택해 주세요!");
			} else {
				System.out.printf("고르신 메뉴는 %s 입니다", select_category);
			}
			
		} else if(input == 3) {
			System.out.println("=====CATEGORY=====");
			System.out.printf("3-1. %s%n", menu_category[4]);
			System.out.printf("3-2. %s%n", menu_category[5]);
			System.out.println("==================");
			System.out.print("종류 선택 : ");
			int cafe_menu = sc.nextInt();
			
			switch(cafe_menu) {
			case 1:
			case 2:
				select_category = menu_category[cafe_menu +3];
				break;
			default:
				select_category = null;	
			}
			
			if(select_category == null) {
				System.out.println("카테고리를 다시 선택해 주세요!");
			} else {
				System.out.printf("고르신 메뉴는 %s 입니다", select_category);
			}
		}
		
		sc.close();
	}
	
}




