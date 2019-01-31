package first;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee("第一个");
		Employee employee2 = new Employee("第二个");
		
		employee1.empAge(12);
		employee1.empDesignation("高级研发工程师");
		employee1.empSalary(1000);
		employee1.printEmployee();
		
		System.out.println("=====");
		
		employee2.empAge(13);
		employee2.empDesignation("初级研发工程师");
		employee2.empSalary(900);
		employee2.printEmployee();
	}
}
