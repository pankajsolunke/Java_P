package Corejava;

class A01{
	static int i = B01.j;
}
class B01{
	static int j = C01.methodOne();
}
class C01{
	public static int methodOne() {
		return Coupling.k;
	}
}
public class Coupling {

	static int k = 10;
	public static void main(String[] args) {

		Coupling c = new Coupling();
/*
	Coupling:
		The degree of dependency between the components is called coupling.
  
  	The above components are said to be tightly coupled to each other because 
  	the dependency between the components is more.
  
  	Tightly coupling is not a good programming practice because it has several serious disadvantages.

	1) Without effecting remaining components we can't modify any component hence enhancement(development) will become difficult.
	2) It reduces maintainability of the application.
	3) It doesn't promote reusability of the code.
	
	It is always recommended to maintain loosely coupling between the components.
  
*/
		
/*
	Cohesion:
		For every component we have to maintain a clear well defined functionality such type of component is said to be follow high cohesion.
 
 	Diagram:
 											   ------------	   ----------	   -----------
 	------------				-----------	   |		  |--->|		|----->|		 |.....
 	|login page|				|		  |--->|		  |	   ----------	   -----------
 	|validation|				-----------	   |		  |		inbox.jsp	   compose.jsp
 	|inbox	   |				 login.jsp	   |		  |	   ----------
 	|Compose   |							   |		  |--->|		|.....
 	|Forward   |							   |		  |	   ----------
 	|	.	   |							   ------------		error.jsp				High Cohesion
 	|	.	   |							 validate servlet
 	|	.	   |--->Low Cohesion
 	------------	
 	TotalServlet.java
 	
 
 	High Cohesion is always good programming practice because it has several advantages.
 	
 		1) Without effecting remaining components we can modify any component hence enhancement will become very easy.
 		2) It improves maintainability of the application.
 		3) It promotes reusability of the application.(where ever validation is required we can reuse the same validate servlet without rewriting)
 
 	Note: It is highly recommended to follow loosely coupling and high cohesion.
 
 
 
*/
	}

}
