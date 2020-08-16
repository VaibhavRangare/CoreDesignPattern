package creational.prototype;

public class ComplexObject implements Cloneable {
	private String name;
	private String department;
	private int age;
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ComplexObject(String name, String dept, int age, String country) {
		setName(name);
		setDepartment(dept);
		setAge(age);
		setCountry(country);
	}

	public String toString() {
		return name + ", " + department + ", " + age + ", " + country;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {

	}

}
