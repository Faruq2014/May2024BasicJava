package variable;

public class TypesOfVariables {
	/*
	 * three types of variables in Java
	 *    static 
	 *    instance
	 *    local
	 */
	
  static String  lastName="Khondoker";
  String firstName;

  public static void main(String[] args) {
	   //method calling == class name (varibleName)= new class name();
	  TypesOfVariables tov= new TypesOfVariables();
	  tov.maryam();
	  tov.aoyon();
	}

	public void maryam() {
		firstName="Maryam";
		double bankAccount=50000.00;
		System.out.println(firstName+" "+lastName );
		System.out.println(firstName + " has "+bankAccount);
	}

public void aoyon() {
	  double savingAccount=5000.00;
	  firstName="Aoyon";
	  System.out.println(firstName+" "+lastName );
	  System.out.println(firstName + " has "+savingAccount);
}

	
}
