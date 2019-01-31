package first;

public class ArrayTest {
	public static void main(String[] args) {
		int[] array;
		array= new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=i;
		}
		for (int i : array) {
			System.out.println(array[i]);
		}
	}
}
