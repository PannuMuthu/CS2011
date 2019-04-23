package chapter7;
import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int key = input.nextInt();
	int element = input.nextInt();
	int arr[] = new int[element];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=input.nextInt();
	}
	System.out.println(binarySearch(arr, key));
}
/** Use binary search to find the key in the list */
public static int binarySearch(int[] list, int key) { 
	int low = 0;
	int high = list.length - 1;
	while (high >= low) {
		int mid = (low + high) / 2; 
		if (key < list[mid]) {
			high = mid - 1;
		}
		else if (key == list[mid])
			return mid; 
		else
			low = mid + 1;
		}
		return -1; // Now high < low, key not found 18 }
}

}