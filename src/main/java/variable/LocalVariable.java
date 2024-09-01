package variable;

public class LocalVariable {

	public static void main(String[] args) {
		
		LocalVariable lv = new LocalVariable();
		//lv.gradeFour();
		//lv.castingVote();
		lv.humanGrowUp();
		
	}
	  
	public void gradeFour() {
		int grade =4;
		if(grade==4) {
			 System.out.println("you are able to get park pass"); 
		}
		
	}
	
	
	public void castingVote() {
	  int age=12;
	  //conditional statement
	  //or flow of statement
	  // if, else, and else if
	  
	  if(age>=18) {
		 System.out.println("you are able to vote"); 
	  }else
	  {
		  System.out.println("you are not old enough to Vote");  
	  }
		
		
	}
	
	public void humanGrowUp() {
		// age <=6 == infant
		// age >=7 todlar
		// age >=12 == teen ager
		// age >=19== adult
		int age=19;
		
		if(age ==6) {
			System.out.println("you are infant"); 	
		}else if (age ==7) {
			System.out.println("you are todlar");
		}else if(age ==13) {
			System.out.println("you are teen ager");
		}else {
			System.out.println("you are human");
		}
		
	}
	
	

}
