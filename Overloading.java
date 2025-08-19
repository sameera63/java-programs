 class calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
		}
	public double add(double a,double b) {
		return a+b;
	}
	public String add(String a,String b) {
		return a+b;
	}
}
class Overloading{
	public static void main(String[] args) {
		calculator calc=new calculator();
		System.out.println("two ints:"+calc.add(5, 3));
		System.out.println("three ints:"+calc.add(5,3,2));
		System.out.println("two doubles:"+calc.add(5.5, 3.3));
		System.out.println("two strings:"+calc.add("hello","world"));
	}
}
