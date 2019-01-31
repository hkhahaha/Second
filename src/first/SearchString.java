package first;

public class SearchString {
	public static void main(String[] args) {
		String str1="Google Runoob Taobao";
		int index=str1.indexOf("Runoob");
		if (index==-1) {
			System.out.println("没有找到");
		} else {
			System.out.println(index);
		}
	}
}
