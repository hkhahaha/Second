package first;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "This is String , split by StringTokenizer, created by runoob";
		StringTokenizer st=new StringTokenizer(str);
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}
}
