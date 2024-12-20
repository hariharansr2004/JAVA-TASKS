package EncapsulationandPolymorphism;

class person {
	//Encapsulating the name and age
	//method defined
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	private int age;
	public int getAge() {
		return age;
	}
public void setAge(int age) {
	this.age=age;
}

}
//Driver Class
public class Encapsultaioneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person();
		p.setName("Hari");
		p.setAge(30);
		//Using Method to get the values from variables
		System.out.println("Name:"+p.getName());
		System.out.println("Age:"+p.getAge());
	}

}
