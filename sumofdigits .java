import java.util.Scanner;
public class sumofdigits {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a numbers: ");
	        int number = scanner.nextInt();
	        int sum = 0;
	        number = Math.abs(number);
	        while (number > 0) {
	            int digit = number % 10;  
	            sum += digit;
	            number /= 10;  
	        }
     System.out.println("Sum of digits = " + sum);
	    }
	}