package method;

public class WhatClassContain {
	/*
	 * Class contain 5 things
	 *    variables
	 *    method
	 *    constructor
	 *    static block
	 *    instance block
	 */

	public static void main(String[] args) {
		String fullName="Heyder Azizi";
		System.out.println(fullName);
     System.out.println("hello main");
     //method calling == class name varibleName= new class name();
     WhatClassContain wcc= new WhatClassContain();
     wcc.messanger();  wcc.login(); 
     wcc.messanger();
     wcc.messanger();
     
     //rule of execution
     // top to bottom
     // let to right
     
     
	}
	
	
	
	public  void login() {
		
		 System.out.println("hello login");
		
		
	}
	
	
	
	public static void messanger() {
	
		 System.out.println("hello messanger");
		
		
	}
	

}


