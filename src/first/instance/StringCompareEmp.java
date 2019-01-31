package first.instance;

public class StringCompareEmp {
	public static void main(String[] args) {
		String str = "HelloWorld";
		String anotherString = "hello";
		Object object = str;

		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(object.toString()));
 
		Integer x = 5;
		System.out.println(x.compareTo(3));
		System.out.println(x.compareTo(5));
		System.out.println(x.compareTo(8));
	}
}
