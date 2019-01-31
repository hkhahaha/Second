package first.instance;

public class Employee {
	public String nameString;
	public static double hk;
	private double salary;

	public Employee(String a) {
		nameString = a;
		// TODO 自动生成的构造函数存根
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void printDetail() {
		System.out.println(nameString);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee("测试");
		employee.setSalary(1000);
		employee.printDetail();
	}
}
