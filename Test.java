import java.util.Arrays;

public class Test {
	static int arr1[] = {1,2,3,4,5};
	static int arr2[] = {1,2,3,4,5};
	
	public static void main(String[] args) {
		System.out.println("arr1.equals(arr2): "+ arr1.equals(arr2));
		System.out.println("Array.equals(arr1,arr2): "+ Arrays.equals(arr1,arr2));
		
		
		
	}
}
