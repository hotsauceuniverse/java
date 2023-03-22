
public class InheritTest {

	public static void main(String[] args) {
		
		Parent parent1 = new Parent();
		System.out.println(parent1);
		Parent parent2 = new Parent("세영", true);
		System.out.println(parent2);
		
		Child child = new Child("성경", false, 28, "배우");
		System.out.println(child);
	}
}
