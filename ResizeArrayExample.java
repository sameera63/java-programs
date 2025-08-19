import java.util.Arrays;
public class ResizeArrayExample {
	    public static void main(String[] args) {
	        int[] originalArray = {1, 2, 3, 4, 5};
	        int[] resizedArray = Arrays.copyOf(originalArray, 10);
	        System.out.println("Resized Array: " + Arrays.toString(resizedArray));
	    }
	}



