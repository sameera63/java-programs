import java.util.Arrays;
public class CheckArraysEqual {
	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {1, 2, 3, 4, 5};
	        if (Arrays.equals(array1, array2)) {
	            System.out.println("Equal");
	        } else {
	            System.out.println("Not Equal");
	        }
	    }
	}