package Corejava;

//Tightly Encapsulated class
//	If the parent class is not tightly encapsulated then no child class is tightly encapsulated 


class A{
	int a = 40; //(inValid)
	private int x=10; //(Valid)
}
class B extends A{
	int y=20; //(invalid)
}
class C extends A{
	private int z=30; //(valid)
}

public class Oops {
/*--> Data Hiding:
		our internal data should not go out directly that is
		outside person can't access our internal data directly.
		
		EX.--> private int balance = 10000;
		
		By using private modifier we can implement data hiding.
		The main advantage of data hiding is security.
*/
	
/*--> Abstraction:
		Hide internal implementation and just highlight the set of 
		services is called abstraction.
		
		By using abstract classes and interfaces we can implement abstraction.
*/
	
/*--> Encapsulation:
  		Binding of data and corresponding methods into a single unit is called Encapsulation.
  		
  		If any java class follows data hiding and abstraction such type of class is said to be encapsulated class.
  		
  		Encapsulation = Datahiding + Abstraction
  		
  		Every data member should be declared as private and for every member we have to maintain getter and setter methods.
  		
  		The main disadvantage of encapsulation is it increases length of code and slows down execution.
 
 *--> Tightly Encapsulated class:
 		A class is said to be tightly encapsulated if and only if every variable of that class declared as private whether the 
 		variable has getter and setter methods or not, and whether these methods declared as public or not these 
 		checking are not required to perform.  
 */
	
	private int balance = 10000;
	public static void main(String[] args) {
		

	}

}
