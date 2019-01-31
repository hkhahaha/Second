package first.instance;

public class Employee2 {
	private static double salary;
	public static final String DEPARTMENT="开发人员";
	
	public static void main(String[] args) {
		salary=1000;
		System.out.println(DEPARTMENT+"平均工资:"+salary);;
		System.out.println(Employee.hk);
	}
}
