package variable;

public class LocalVariable {

	public static void main(String[] args) {
		
		LocalVariable lv = new LocalVariable();
		lv.castingVote();
	}
	
	public void castingVote() {
	  int age=17;
	  
	  if(age>=18) {
		 System.out.println("you are able to vote"); 
	  }else
	  {
		  System.out.println("you are not old enough to Vote");  
	  }
		
		
	}

}
