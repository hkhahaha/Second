package first;

public class CutString {
	public static void main(String[] args) {
		String aString = "this is Java";
		System.out.println(remove(aString, 0));
	}
	private static String remove(String a,int b) {
		return a.substring(0,b)+a.substring(b+1);
	}
}
