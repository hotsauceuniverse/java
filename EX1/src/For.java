
public class For {

	public static void main(String[] args) {
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6-i; j++) {
					System.out.print(" ");
				}
			for(int k=1; k<=i-1; k++) {
					System.out.print("★");
				}	
				System.out.println("★");
			}
		
		System.out.println("==========");
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<2*i-1; k++) {
				System.out.print("★");
			}
			System.out.println("★");
		}
		
		System.out.println("==========");
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<2*i-1; k++) {
				System.out.print("★");
			}
			System.out.println("★");
		}
		for(int a=0; a<4; a++) {
			for(int b=0; b<=a; b++) {
				System.out.print(" ");
			}
			for(int c=5; c>2*a-1; c--) {
				System.out.print("★");
			}
			System.out.println("★");
		}
	}
}


