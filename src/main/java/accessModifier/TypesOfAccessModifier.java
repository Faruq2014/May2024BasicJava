package accessModifier;

public class TypesOfAccessModifier {
	/*
	 * mainly 4 types of access modifier
	 *    private
	 *    default
	 *    protected
	 *    public
	 */
	/*
	 * inside the own class public, protected, default
	 * and private--> every one has access.
	 */

	public static void main(String[] args) {
		TypesOfAccessModifier toam= new TypesOfAccessModifier();
		toam.aoyonBedroom();
		toam.bathroom();
		toam.kitchen();
		toam.livingroom();
	}
	
	private void aoyonBedroom() {
		System.out.println("private method");
	}
	 void bathroom() {
		 System.out.println("default method");
	}
  protected static void kitchen() {
	  System.out.println("protected method");
 }
  
  public void livingroom() {
	  System.out.println("public method");
  }
}
