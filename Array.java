import java.util.Arrays;

public class Array {
	public static void main(String args[]) {
		int [] ages= {10,30,3};
		int[] age=new int[5];
		age[0]=5;
		age[1]=34;
		age[2]=45;
		age[3]=56;
		age[4]=5;
		System.out.println(age);
		for(int num:age) {
			System.out.println(num);
		}
		System.out.println("this is from toString method");
		System.out.println(Arrays.toString(age));
	}
}
