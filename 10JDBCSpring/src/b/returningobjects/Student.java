package b.returningobjects;

public class Student {
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
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
		this.age = age;
	}
	
	public String toString(){
		return String.format("{id = %d, name=%s, age=%d}", id, name, age);
	}
	
}
