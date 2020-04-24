import java.util.Scanner; // library for scanner 

public class testDriver {
	
	// entry point 
	public static void main(String args[]) {
		
		// using constructor 
		Person p1 = new Person("Violeta", "Parra", 7); 
		p1.displayPerson();
		
		//using setters
		Person p2 = new Person(); 
		p2.setFirst("Ollie");
		p2.setLast("Potato");
		p2.setAge(8);
		
		p2.displayPerson();
		
		//getting input from scanner 
		/*Scanner scanner = new Scanner(System.in);  // set scanner 
		
		System.out.print("Enter Firt name: "); 
		String firstName = scanner.nextLine(); 
		
		System.out.print("Enter Last name: ");
		String lastName = scanner.nextLine(); 
		
		System.out.print("Enter Age name: ");
		int age = scanner.nextInt(); 
		
		Person p3 = new Person(); 
		
		p3.setFirst(firstName);
		p3.setLast(lastName);
		p3.setAge(age);
		
		p3.displayPerson();
		*/
		
		// creating an array of people 
		
		int arrayMaxSize = 100; // array will hold up to 10 people
		ArrayofPeople people = new ArrayofPeople(arrayMaxSize); // reference to array
		
		// inserting people in the array
		people.insert("John", "Smith", 10000);
		people.insert("Clara", "Oswald", 23);
		people.insert("Rory", "Williams", 26);
		people.insert("Amy", "Pond", 25);
		people.insert("River", "Song", 100);
		people.insert("Yazmin", "Khan", 20);
		
		// display items
		
		System.out.println("Printing array\n"); 
		people.displayArray();
		
		// searching person by last name
		String last = "Khan"; 
		Person target; // recipient for person found
		
		target = people.search(last); 
		if(target != null)
		{
			System.out.println("record found");
			target.displayPerson();
		}
		else
		{
			System.out.printf("record for %s not found\n",last);
			
		}
		
		// deleting a person 
		System.out.println("Removing Williams and Pond");
		people.remove("Williams"); 
		people.remove("Pond");
		
		// print array with removed people
		people.displayArray();
	}

}
