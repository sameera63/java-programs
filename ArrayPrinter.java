import java.util.Scanner;
import java.util.Arrays;
public class ArrayPrinter { 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		int size=scanner.nextInt();
		int[] Array=new int[size];
		System.out.println("enter" +size+ "integers");
		int i;
		for(i=0;i<size;i++) {
			Array[i]=scanner.nextInt();
			}
		System.out.println("the array is:" +Arrays.toString(Array));
		scanner.close();
	}
}
