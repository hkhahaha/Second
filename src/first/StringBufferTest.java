package first;

import java.lang.StringBuffer;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("测试的内容:");
		stringBuffer.append("测试内容1");
		stringBuffer.append("测试内容2");
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.reverse());
	}
}
