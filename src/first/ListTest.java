package first;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		String array[]= {"first","second","third"};
		String a ="helloworld";
		List<String> list = new ArrayList<String>();
		list.add(a);
		System.out.println("arrry's length:"+array.length);
		System.out.println("a's length"+a.length());
		System.out.println("list's size"+list.size());
		System.out.println(list);
		
		System.out.println("//////////////////");
		String s1="a"+"b"+"c";
		String s2="abc";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
