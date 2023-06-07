package method;

public class Class3 {
	
	private String name="Kevin";
	private int age=23;
	private String city="Tvm";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name is changing");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}