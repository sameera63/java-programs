import java.util.Scanner;
public class print {
	public static void main(String args[]) {
		Scanner sin=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int i;
		for(i=0;i<=4;i++) {
		int a=sin.nextInt();
		int b=sin.nextInt();
	    int result;
	    result=a*b+3;
	    System.out.println("result("+a+","+b+")="+result);
	    
		}
	}
}
