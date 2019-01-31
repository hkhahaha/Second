package first;

public class SwitchTest {
	public static void main(String[] args) {
		char grade='A';
		
		switch (grade) {
		case 'A':
			System.out.println("成绩是A");
			break;

		default:
			System.out.println("成绩有误");
			break;
		}
		System.out.println(grade);
	}
}
