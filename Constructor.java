package Corejava;

abstract class A1{
	A1(){
		System.out.println(this.hashCode());
	}
}
class A2 extends A1{
	A2(){
		System.out.println(this.hashCode());
	}
}
public class Constructor {

/*
	Constructor:
	  * A constructor in java is a special type of method that is used to initialize an object when it is created.
	  *	Its name must be the same as the class name.
	  * It does not have a return type(not even void).
	  * It is automatically called when you use the new keyword.
	  * A constructor is not inherited.
	  * It is Overloaded (you can have multiple constructor with different parameters).
	  * If you define at least one constructor,java does not create a default constructor.
	  * We can take constructor in any java class including abstract class also but we can't take constructor inside interface.
	   
	Types of Constructors
 1).Default constructor (no arguments) Ex. --> A()
	If you don't define any constructor, java provides a default one.
	For every class in java including abstract classes also constructor concept is applicable.
	If we are not writing at least one constructor then compiler will generate default constructor.
	It is always no argument constructor.
	Default constructor contains only one line. super(); it is a no argument call to super class constructor.
Note.The access modifier of the default constructor is same as class modifier.
(this rule is applicable only for public and default access modifier)
	  
 2).Parameterized constructor (with arguments)
    Ex. --> A(String name)	  
	  
 3).Copy Constructor (User-defined) --> Java doesn't provide it by default, but you can write one.	  
	Ex. --> A(A obj) { x = obj.x; }
-------------------------------------------------------------------------------------------------------------------------------------------------
	
	Constructor VS instance block:
	Constructor --> A special method used to initialize an object.
	Instance Block --> A block of code inside a class that runs every time an object is created(before the constructor).
 1).Both instance block and constructor will be executed automatically for every object creation but instance block 1st followed by constructor.
 2).Instance block runs first, then the constructor.
 3).Constructor can take arguments but instance block can't take any arguments.
--------------------------------------------------------------------------------------------------------------------------------------------------

	Rules to write constructors:
	1).Name of the constructor and name of the class must be same.
	2).The only applicable modifiers for the constructors are public, default, private, protected.
	3).If we are using any other modifier we will get compile time error.

	super() vs this():
	The 1st line inside every constructor should be either super() or this() if we are not writing anything compiler will always generate super().
	Case 1:We have to take super() or this() only in the 1st line of constructor.If we are taking anywhere else we will get compile time error.
	Test()
	{
		System.out.println("constructor");
		super();
	}
	Case 2:We can use either super() or this() but not both simultaneously.
	Test()
	{
		super();
		this();
	}
	Case 3:We can use super() or this() only inside constructor. If we are using anywhere else we will get compile time error.
	public void methodOne()
	{
		super();
	}
	
	That is we can call a constructor directly from another constructor only.
	 ----super(): --> 1.we should use only in 1st line
	 |  --this(): --> 2.only one but not both 
	 |	|         |-> 3.only inside constructor
	 |	|-->Calling another constructor of same class.        
	 |-->Calling super class constructor.
	 	         
	Overloaded Constructors:
		A class can contain more than one constructor and all these constructors having the same name but
		different arguments and hence these constructors are considered as overloaded constructors.
*/
//	static int count =0;
//	{
//		count++;
//	}
	Constructor(double d){
		System.out.println("Double-argument constructor");
	}
	Constructor(int i){
		this(10.2);
		System.out.println("Int-argument constructor");
	}
	Constructor(){
		this(10);
		System.out.println("no-argument constuctor");
	}
	public static void main(String[] args) {
		Constructor c= new Constructor();
		//double-argument constructor/int-argument constructor/no-argument constructor
		Constructor c1 = new Constructor(10);
		//double-argument constructor/int-argument constructor
		Constructor c2 = new Constructor(10.5);
		//double-argument constructor
//		System.out.println(c.count);
//		System.out.println(c1.count);
//		System.out.println(c2.count);
//		
		A2 a = new A2();
		System.out.println(a.hashCode());

		
	}

}
