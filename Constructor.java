package Corejava;

class A1{
	String name;
	int rollno;
	
	A1(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
		System.out.println("Name: "+ name +"\nRollno: "+ rollno );
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
	   
	Types of Constructors
 1).Default constructor (no arguments) Ex. --> A()
	If you don't define any constructor, java provides a default one.
	For every class in java including abstract classes also constructor concept is applicable.
	If we are not writing at least one constructor then compiler will generate default constructor.
	It is always no argument constructor.
	Default constructor contains only one line. super(); it is a no argument call to super class constructor.
Note.The access modifier of the default constructor is same as class modifier.(this rule is applicable only for public and default access modifier)
	  
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




*/
	static int count =0;
	{
		count++;
	}
	Constructor(){
		
	}
	Constructor(int i){
		
	}
	public static void main(String[] args) {
		Constructor c= new Constructor();
		Constructor c1 = new Constructor(10);
		Constructor c2 = new Constructor();
		Constructor c3 = new Constructor();
		System.out.println(c.count);
		System.out.println(c1.count);
		System.out.println(c2.count);
		
		A1 a1 = new A1("Om",43);

		
	}

}
