package crtproject;
interface car {
	public void engine();
	public void gears();
	}
class bmw implements car{
	public void engine() {
		System.out.println("v6 engine");
		System.out.println("horse power:5000");
		System.out.println("torque:120N/m");
	}
	public void gears()
	{
		System.out.println(".....................");
		System.out.println("automatic gearing");
	}
}
public class abstractions {
	public static void main(String [] args) {
		bmw b1=new bmw();
		b1.engine();
		b1.gears();
	}
}

