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
class Animal{}
class Monkey extends Animal{}

class Parent{
	private void property() {
		System.out.println("cash + land + gold");
	}
	public void marry() { //--> Overridden method
		System.out.println("Parent class method"); 
	}
}
class Child extends Parent{
	private void property() {
		System.out.println("cash + land + gold");
	}
	public final void marry() { //--> Overriding method
		System.out.println("Child class method");
		
	}
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
 		A class is said to be tightly encapsulated if and only if every variable of that class declared as
 		private whether the variable has getter and setter methods or not, and whether these methods declared 
 		as public or not these checking are not required to perform.  
 */
	
/*--> Polymorphism: 
 		Same name with different forms is the concept of polymorphism.
 		
 		Overloading:
 			Having the same name and different argument types is called method overloading.
 			Two methods are said to be overload if and only if both having the same name but different argument types.
  			Lack of overloading in C increases complexity of the programming.
  			But in java we can take multiple methods with the same name and different argument types.
  			Having overloading concept in java reduces complexity of the programming.
  
  			While resolving overloaded methods exact match will always get high priority
  			while resolving overloaded methods child class will get the more priority than parent class
  
  		Overriding:
  			whatever the parent has by default available to the child through inheritance if the child is not satisfied with 
  			parent class method implementation then child is allow to redefine that parent class method in child class in its 
  			own way this process is called overriding.
  			
  			The parent class method which is overridden is called overridden method.
  			The child class method which is overriding is called overriding method.  
 		Rules for Overriding:
 		1).In overriding method names and arguments must be same.
 			That is method signature must be same.
 		
 		2).Until 1.4 version the return types must be same but from 1.5 version onwards co-variant return types are allowed.  
 
 		3).According to this Child class method return type need not be same as Parent class method return type its Child types also allowed.
 		Example:
			class Parent {
				public Object methodOne() {
			 		return null;
				}
			}
			class Child extends Parent {
				public String methodOne() {
			 		return null;
				}
			}

			C:> javac -source 1.4  Parent.java //error 
			
			It is valid in 1.5 but invalid in 1.4.
			-----------			------------
			|  Object |         |  Number  |
			-----------         ------------
			     ^					 ^
			     |         /         |
			     |       \/          |
			     |					 |
			------------        ------------
			|  String  |        | Integer  |
 		    ------------        ------------
 		4).private methods are not visible in the child classes hence overriding concept is not applicable for private methods.
 			Based on own requirement we can declare the same Parent class private method in child class also. It is valid but not overriding.
 			
 			Parent class Final methods we can't override in the Child class.
 			Example:
				class Parent {
					public final void methodOne()	{}
				}
				class Child extends Parent{
					public void methodOne(){}
				}
			Output:
				Compile time error: 
 				 methodOne() in Child cannot override methodOne() in Parent; overridden method is final
 			
 			Parent class non final methods we can override as final in child class. we can override native methods in the child classes.
 			
 		5).We should override Parent class abstract methods in child classes to provide implementation.
 			Example:
				abstract class Parent {
		 			abstract void methodOne();
				}
				class Child extends Parent {
					public void methodOne() { }
				}
			----------------
			|    Abstract  |
			----------------
			        |
			        |-------> Overriding is Possible.
			        |
			----------------
			| Non Abstract |
			----------------
			
		6).We can override a non-abstract method as abstract this approach is helpful to stop availability of 
		   Parent method implementation to the next level child classes.
 		Example:
			class Parent {
     			public void methodOne()  { }
			}
			abstract class Child extends Parent {
     			public abstract void methodOne();
			}
 
 				Final          NonFinal				Abstract
 				  |               |       /           | /|\		  /
 				 \|/			 \|/    \/           \|/ |		\/
 			   NonFinal         Final              NonAbstract
 				  X
 
 		7).While overriding we can't reduce the scope of access modifier.
 		Example:
			class Parent {
			     public void methodOne() { }
			}
			class Child extends Parent {
			     protected void methodOne( )  { }
			}
			Output:
			Compile time error :
			methodOne() in Child cannot override methodOne() in Parent;
 			attempting to assign weaker access privileges; was public
 			
 			protected            <default>
 			    |	       /		 |
 			   \|/  	 \/			\|/
 		protected/public	  default/protected/public
 		
 		Private <- Default <- Protected <- Public
 		
 */
	private int balance = 10000;
	public void methodone(byte b) {
		System.out.println("Byte arg method");
	}
//	Overloading ex
	public void methodone(short s) {
		System.out.println("Short arg method");
	}
	public void methodone(char c) {
		System.out.println("Char arg method");
	}
	public void methodone(int i) {
		System.out.println("int arg method");
	}
	public void methodone(float f) {
		System.out.println("Float arg method");
	}
	public void methodone(long l) {
		System.out.println("Long arg method");
	}
	public void methodone(double d) {
		System.out.println("Double arg method");
	}
	public void methodtwo(String s) {
		System.out.println("String version "+ s);
	}
	public void methodtwo(StringBuffer s) {
		System.out.println("StringBuffer version "+ s);
	}
	public void methodtwo(Object o) {
		System.out.println("Object version "+ o);
	}
	public void methodThree(int i,float f) {
		System.out.println("int to float method "+ i +(" ")+ f);
	}
	public void methodThree(float f,int i) {
		System.out.println("Float to int method "+ f +(" ")+ i);
	}
	public void methodFour(int i) {
		System.out.println("General method "+ i);
	}
	public void methodFour(int...i) {
		System.out.println("Var-arg method "+ i[1]);
	}
	public void methodFive(Animal a) {
		System.out.println("Animal version "+ a);
	}
	public void methodFive(Monkey m) {
		System.out.println("Monkey version "+ m);
	}
//	
	public static void main(String[] args) {
		Oops o = new Oops();
		Parent p = new Parent();
//		p.property(); CE
		Child c = new Child();
//		c.property(); CE
		Parent p1 = new Child();
		p1.marry();
//		overloading ex
		Animal a = new Animal();
		Monkey m = new Monkey();
		Animal a1 = new Monkey();
		
//		o.methodFive(null);
//		o.methodFive(a);
//		o.methodFive(m);
//		o.methodFive(a1);
//		o.methodFour(); o/p:--> var-arg method
//		o.methodFour(10,20);
//		o.methodFour(10);
//		o.methodThree(10, 10f);
//		o.methodThree(10f, 10);
//		o.methodThree(10, 10); The methodThree(int, float) is ambiguous Error
//		o.methodtwo("shubham Dada");
////		o.methodtwo(null); reference to methodtwo() is ambiquous error
//		o.methodtwo(new Object());
//		o.methodtwo(new StringBuffer("abhi"));
//		o.methodtwo(new String());// o/p:--> string version
//		o.methodtwo(new Exception());
//		o.methodone((byte)127);
//		o.methodone((short)102);
//		o.methodone('p');
//		o.methodone((char)97);
//		o.methodone(1000);
//		o.methodone(10l);
//		o.methodone(10.5f);
//
	}

}
/*
 * 1)--> Inheritance talks about reusability.
 * 2)--> Polymorphism talks about flexibility.
 * 3)--> Encapsulation talks about security.
 * */
