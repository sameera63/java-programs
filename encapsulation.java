class person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
		}
	public void setAge(int age) {
		if(age>=0) {
			this.age=age;
			}
		else {
			System.out.println("Age cannot be negative");
		}
	}
}
public class encapsulation {
	public static void main(String args[]) {
	person person=new person();
	person.setName("sammi");
	person.setAge(18);
	System.out.println("Name:"+person.getName());
	System.out.println("Age:"+person.getAge());
	person.setAge(-5);
	}
}


