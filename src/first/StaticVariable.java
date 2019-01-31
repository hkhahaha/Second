package first;

public class StaticVariable {
	private static int a = 2;
	private int random = 2;
	
	public StaticVariable() {
		// TODO 自动生成的构造函数存根
		a++;
		random++;
		System.out.println(a+","+random);
	}
	
	public static void main(String[] args) {
		StaticVariable staticVariable = new StaticVariable();
		StaticVariable staticVariable2 = new StaticVariable();
		
	}
}
