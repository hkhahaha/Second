package first;

public class StringReverse {
	public static void main(String[] args) {
		String string ="runoob";
		String reString = new StringBuffer(string).reverse().toString();
		System.out.println(string);
		System.out.println(reString);
	}
}
