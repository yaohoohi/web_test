
public class A {
	int age;
	String name;
	B b;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public A(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	public A(int age, String name, B b) {
		super();
		this.age = age;
		this.name = name;
		this.b = b;
	}
	
	
}
