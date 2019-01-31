package first;

public class Puppy {
	int Age;
	public Puppy(String name) {
		System.out.println("小狗的名字是："+name);
	}
	public int getAge() {
		System.out.println("小狗的年龄为;"+Age);
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public static void main(String[] args) {
		Puppy puppy = new Puppy("测试");
		puppy.setAge(12);
		puppy.getAge();
		System.out.println("====");
		System.out.println(puppy.Age);
		puppy.setAge(0);
		System.out.println(puppy.Age);
	}
}
