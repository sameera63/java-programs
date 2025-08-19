import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestSimple {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
                 if (n < 2) {
	            System.out.println("At least two elements required.");
	            return;
	        }

	        int[] arr = new int[n];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        Arrays.sort(arr);
	        System.out.println("Second largest number is: " + arr[n - 2]);
             sc.close();
	    }
	}
