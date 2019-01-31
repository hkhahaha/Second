package first;

public class InstanceCounter {
	private static int numInstance=0;
	private int a = 0;
	protected static int getCount() {
		return InstanceCounter.numInstance;
	}
	private static void addInstance() {
		numInstance++;
		InstanceCounter.numInstance++;
	}
	InstanceCounter(){
		addInstance();
		InstanceCounter.addInstance();
	}
	public static void main(String[] args) {
		System.out.println("开始数字"+getCount()+"/"+InstanceCounter.getCount()+"instance");
		for (int i = 0; i < 500; i++) {
			new InstanceCounter();
		}
		System.out.println("Created"+InstanceCounter.getCount()+"instance");
	}
}
