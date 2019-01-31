package first;

public class StringSplit {
	public static void main(String[] args) {
//		String str1="www.baidu.com";
//		String[] temp;
//		String delimeter=".";
//		temp=str1.split(delimeter);
//		System.out.println(temp[]);
		String str = "www.runoob.com";
		String[] temp;
		String delimeter = "\\."; // 指定分割字符
		temp = str.split(delimeter); // 分割字符串
		// 普通 for 循环
		for(int i =0; i < temp.length ; i++){
	         System.out.println(temp[i]);
	         System.out.println("");
	      }
	}

}
