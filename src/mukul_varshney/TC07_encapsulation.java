public class TC07_encapsulation {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Invalid age"); 
		} else {
			this.age = age;
		}
	}

	public static void main(String[] args) {
		TC07_encapsulation obj = new TC07_encapsulation();
		obj.setName("Mukul");
		obj.setAge(40);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		obj.setAge(-5);
	}
}
