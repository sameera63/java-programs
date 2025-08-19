package crtproject;
import java.util.Scanner;
class marks {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a>=25) {
		System.out.println("pass");
	}
	else{
		System.out.println("fail");
	}
  }
}