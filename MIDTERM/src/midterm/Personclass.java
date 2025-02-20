package midterm;

class person{
	String name;
	String address;
	int age; 
	
	public person(String name, String address, int age) {
	    this.name = name;
	    this.address = address;
	    this.age = age;
	}


public void Information(){
	System.out.println("Name= "+ name + " , Age= " + age);
}


}

public class Personclass {

	public static void main(String[] args) {
		person I1 = new person("Gavin Tung", "27 Data Street", 18);
		person I2 = new person("John Timoty", "12 Data Street", 20);
		person I3 = new person("Albara Lee", "14 Matthew Street", 24);
		person I4 = new person("Piter Lock", "101 Don Matias", 19);
		person I5 = new person("Paris Co", "116 Month Go", 18);
		
		
		
		I1.Information();
		I2.Information();
		I3.Information();
		I4.Information();
		I5.Information();
		
	}
	
}
