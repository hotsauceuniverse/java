package kr.library;

import java.util.Arrays;

//	여러권의 책 정보(BookVo)를 기억할 클래스
public class BookList {
	
	private BookVo[] bookList;		// 책 정보를 기억할 배열을 선언만 한 상태
	private int size;				// 배열의 크기
	private int count;				// 배열의 저장된 데이터의 갯수
	
//	기본생성자가 실행되면 30권의 책을 저장할 수 있는 배열을 만들고 배열의 크기를 넘겨받는 생성자가 실행되면 넘겨받은 크기만큼 배열을 만든다
	public BookList() {
		this(30);
	}

	public BookList(int size) {
		super();
		this.size = size;
		bookList = new BookVo[size];
	}

	public BookVo[] getBookList() {
		return bookList;
	}

	public void setBookList(BookVo[] bookList) {
		this.bookList = bookList;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		String str = "";
		str += "도서명 저자명 출판사명 출판일 가격 \n";
		for(int i=0; i<bookList.length; i++) {
			if(bookList[i] == null) {
				break;
			}
			str += bookList[i] + "\n";
		}
		return str;
	}
	
//	bookList에 BookVo클래스 객체를 저장하는 메소드
	public void addBook(BookVo book) {
//		if를 사용하는 예외처리
//		if(count < size) {
//			bookList[count++] = book;
//		} else {
//			System.out.println("추가못함");
//		}
		
//		try - catch 예외처리
//		예외가 발생될 것으로 예상되는 문장에 try를 쓰고 처리할 문장에 catch를 쓴다
		try {
			bookList[count++] = book;
		} catch (Exception e) {
//			Exception클래스는 예외의 최상위 클래스로서 모든 예외를 감지할 수 있음
			System.out.println("추가못함");
		}
	}
}
