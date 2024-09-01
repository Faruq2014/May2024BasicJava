package constructor;

public class ConstructorBasics {
	/*
	 * Constructor has same name as class name
	 * Constructor neither void or return type
	 * constructor instantiate instance properties
	 * there are two types of constructor
	 *      user define constructor( you can have as many as 
	 *         user define constructor as you need)
	 *      default constructor
	 *        is user did not create a constructor then Java will 
	 *        provide a default constructor, you do not see it.
	 */

	public static void main(String[] args) {
		
		ConstructorBasics cb = new ConstructorBasics();
		cb.fullNameTest("Aoyon", "Khondoker");
	}

	public String fullNameTest(String fistName ,String lastName) {
		String fullName= fistName+" "+lastName;
		System.out.println(fullName);
		return fullName;
		
	}
	
}
