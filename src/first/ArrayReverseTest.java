package first;

public class ArrayReverseTest {
//	public static void main(String[] args) {
//		int[] test1= {1,2,3,4,7};
//		for (int i : test1) {
//			System.out.print(test1+" ");
//		}
//		test1=ArrayReverseTest.reverse(test1);
//		for (int i : test1) {
//			System.out.print(test1+" ");
//		}
//	}
	public static void main(String[] args){
        int[] test= {1,2,4,5,7};
        for (int i : test) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        test = ArrayReverseTest.reverse(test);
        for (int i : test) {
            System.out.print(i+" ");
        }
    }
	public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0,j=result.length-1; i < arr.length; i++,j--) {
            result[j] = arr[i];
        }
        return result;
    }
//	public static int[] reverse(int[] arr){
//	        int[] result = new int[arr.length];
//	        for (int i = 0,j=result.length-1; i < arr.length; i++,j--) {
//	            result[j] = arr[i];
//	        }
//	        return result;
//	    }	
}
