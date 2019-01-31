package first.instance;

public class TestBreak {
	public static void main(String[] args) {
		int[] number = {10,20,30,40,50};
		for (int i : number) {
			if (i==30) {
				continue;
			}
			System.out.println(i);
		}
	}
}
