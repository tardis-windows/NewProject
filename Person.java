
public class Person {
	
	// member variables 
	private String lastName; 
	private String firstName; 
	private int age; 

	//constructor 
	public Person(String firstName, String lastName, int age)
	{
		 this.firstName = firstName; 
		 this.lastName = lastName; 
		 this.age = age; 
		/* note: this can be done without the this operator
		 * by having arguments names different and 
		 *  l_name = lastName; 
		 * f_name = firstName; 
		 * a_age = age;
		*/
	}
	public Person()
	{
		
	}
	
	//getters for private members 
	public String getLast() {return lastName;}
	public String getFirst() {return firstName;}
	public int getAge() {return age;}
	
	//setters for private members
	public void setLast(String lastName) {this.lastName = lastName;}
	public void setFirst(String firstName) {this.firstName = firstName;}
	public void setAge(int age) {this.age = age;}
	
	public void displayPerson()
	{
		System.out.printf("Name: %s %s\nAge: %d\n", firstName, lastName, age);
	}
	
}
