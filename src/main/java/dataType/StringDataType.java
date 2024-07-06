package dataType;

public class StringDataType {

	public static void main(String[] args) {
		
       String anyThing = "hkhEE44@!~ ";
       //String is refferencial data type
       // unlimited memory
       // anything between ""
       
       // how to declare 
       String firstName ="Aoyon";
       // String is the data type== you must declare data type
		//firstName is the variabl name 
       // "Aoyon"; = is the value of the variable
       
       String lastName="Khondoker";
       
       // only addition is allow for String data type       
       String fullName=firstName +lastName;
       System.out.println(fullName);
       
       // and concatenation also allow
       
       String fullNameOne =firstName+"  "+lastName;
       System.out.println(fullNameOne);
       
       String fullNameTwo=  "my full name is "+firstName+"  "+lastName;
       System.out.print(fullNameTwo);
       
     //String fullNameThree=  firstName/lastName; only addition is allowed
	}

}
