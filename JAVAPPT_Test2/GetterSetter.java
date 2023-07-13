class Person{
	private String name;
	private int age;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person prsn = new Person();
		prsn.setName("Ameer");
		prsn.setAge(30);
		prsn.setAddress("TamilNadu, India");
		
		System.out.println("Name:"+prsn.getName()+ "\nAge::"+prsn.getAge()+"\nAddress::"+prsn.getAddress());
	}

}
