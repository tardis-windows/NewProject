
public class ArrayofPeople {
	
	private Person []p; // array
	private int arraySize; 
	
	// constructor, create array of objects Person
	public ArrayofPeople(int max)
	{
		p = new Person[max]; 
		arraySize = 0; 
	}
	
	//find function returns person
	public Person search(String target)
	{
		int i; 
		for(i = 0; i < arraySize; i++)
			if(p[i].getLast().equals(target))
				break;
		if(i == arraySize)
			return null; // not found
		else
			return p[i]; // found return person
	}
	
	// add person to array
	public void insert(String firstName, String lastName, int age)
	{
		p[arraySize] = new Person(firstName, lastName,age);
		arraySize++; 
	}
	
	//search and remove
	public boolean remove(String target)
	{
		int i; 
		for(i = 0; i < arraySize; i++)
			if(p[i].getLast().equals(target))
				break; // found at i 
		if(i == arraySize)  // not found
			return false;
		else
		{
			// remove the one found i
			for(int j = i; j < arraySize; j++)
				p[j] = p[j+1]; 
			arraySize--; 
			return true;  
		}
	}
	
	// display array
	public void displayArray()
	{
		for(int i = 0; i < arraySize; i++)
		{
			p[i].displayPerson();
		}
	}
}