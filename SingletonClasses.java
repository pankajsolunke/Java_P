package Corejava;
class Test2{
	private static Test2 t1 = null;
	private static Test2 t2 = null;
	private Test2() {
		
	}
	public static Test2 getTest2() //--> getTest2() method is a factory method
	{
		if(t1 == null) {
			t1 = new Test2();
			return t1;
		}
		else if(t2 == null) {
			t2 = new Test2();
			return t2;
		}
		else {
			if(Math.random()<0.5) // Math.random() limit: 0 <= x < 1
				return t1;
			else
				return t2;
		}
	}
}

public class SingletonClasses {

/*
	  Singleton class:
	  	For any java class if we are allow to create only one
	  	object such type of class is said to be singleton class.

	Advantage of singleton class:
		If the requirement is same then instead of creating a 
		separate object for every person we will create only one 
		object and we can share that object for every required person
		we can achieve this by using singleton classes. 
		That is the main advantages of singleton classes are Performance
		will be improved and memory utilization will be improved.
	  
	Creation of our own singleton class:
		we can create our own singleton classes for this we have to use 
		private constructor, static variable and factory method.
	  
(Note):--> We can create any singleton classes like(Double ton,Trible ton.. etc)
   |
   |-----> We are not allowed to create child class is not final, how it is possible?
		--> By declaring every constructor has private.
		--> We can't create child class for this class
		
(Note)--> When ever we are creating child class object automatically parent class 
	      constructor will be executed but parent object won't be created.
	  
 
 	Factory method:
 		By using class name if we are calling a method and that method returns the same class
 		object such type of method is called factory method.
 		If object creation required under some constraints then we can implement by using factory method.
*/
	public static void main(String[] args) 
	{
		System.out.println(Test2.getTest2().hashCode());
		System.out.println(Test2.getTest2().hashCode());
		System.out.println(Test2.getTest2().hashCode());
		System.out.println(Test2.getTest2().hashCode());


	}

}
