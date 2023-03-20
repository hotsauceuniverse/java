package kr.library;

import java.util.Date;

public class BookShop {

	public static void main(String[] args) {
		
		BookList booklist = new BookList(3);
		
		
//		Date date = new Date(); 		// 현재 컴퓨터 시스템의 날짜와 시간을 얻어옴
//		Date date = new Date(년, 월, 일)	// 입력한 년, 월, 일에 해당되는 날짜를 만든다
//		Date 클래스는 1900년을 기준으로 처리하므로 1900을 빼야되고 월을 입력할때는 1을 빼야된다
		BookVo book1 = new BookVo("자바1", "장세영1", "IT출", new Date(2023,3,20), 32000);
		BookVo book2 = new BookVo("자바2", "장세영2", "IT출", new Date(2023,3,20), 32000);
		BookVo book3 = new BookVo("자바3", "장세영3", "IT출", new Date(2023,3,20), 32000);
		BookVo book4 = new BookVo("자바4", "장세영4", "IT출", new Date(2023,3,20), 32000);
		
		booklist.addBook(book1);
		booklist.addBook(book2);
		booklist.addBook(book3);
		booklist.addBook(book4);
		
		System.out.println(booklist);
		
	}

}
