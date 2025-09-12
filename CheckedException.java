package Corejava;
import java.io.*;
class P{
	int x=100;
	public void methodOne(){
		System.out.println("Parent class method");
	}
}
class Q extends P{
	int x=1000;
	public void methodOne() throws ArithmeticException,NullPointerException,ClassCastException,RuntimeException{
		System.out.println("Child class method");
	}
}
public class CheckedException {
/*
 o--> The exceptions which are checked by the compiler for smooth execution of the program at runtime are called checked exceptions.
 o--> The exceptions which are not checked by the compiler are called un-checked exceptions.
 o--> RuntimeException and its child classes, Error and its child classes are unchecked except these the remaining are checked exceptions.   
	  
	 Rule:
	 	While overriding if the child class method throws any checked exception compulsory the parent class method should throw the 
	 	same checked exception or its parent otherwise we will get compile time error.
	 Example 1:
		class Parent {
		     public void methodOne() {}
		}
		class Child extends Parent{
 		    public void methodOne()throws Exception {}
		}
		Output:
		Compile time error : 
		methodOne() in Child cannot override methodOne() in Parent; 
		overridden method does not throw java.lang.Exception		
	  
	 Example 2:
	  	class Parent{
			public void methodOne() throws Exception {
				System.out.println("Parent class method");
			}
		}
		class Child extends Parent{
			public void methodOne() throws Exception{
				System.out.println("Child class method");
			}
		}
		Output:
		Compile time error :
			unhandled exception type exception
	    
 Note:--> you can write a main method handled is exception into using to the
 	    	Throw exception
 	    	
 	 Examples:
 	 1).Parent:public void methodOne()throws Exception __
 	 	Child:public void methodOne()				   __|-> Valid
 	 	
 	 2).Parent:public void methodOne()				 __
 	 	Child:public void methodOne()throws Exception__|-> invalid
	  
	 3).Parent:public void methodOne()throws Exception __
 	 	Child:public void methodOne()throws Exception  __|-> Valid
 	 	
 	 4).Parent:public void methodOne()throws IOException __
 	 	Child:public void methodOne()throws Exception    __|-> invalid
 	 	
 	 5).Parent:public void methodOne()throws IOException            		  __
 	 	Child:public void methodOne()throws EOFException,FileNotFoundException__|-> valid
 	 	
 	 6).Parent:public void methodOne()throws IOException 					 __
 	 	Child:public void methodOne()throws EOFException,InterruptedException__|-> invalid	
 	 	
 	 7).Parent:public void methodOne()throws IOException 					__
 	 	Child:public void methodOne()throws EOFException,ArithmeticException__|-> valid
 	 	
 	 8).Parent:public void methodOne() 																					__
 	 	Child:public void methodOne()throws ArithmeticException,NullPointerException,ClassCastException,RuntimeException__|-> valid
 	 	 	
*/
	
/*
	 1).public void methodOne(int i) --> valid (Overriding)
	 
	 2).private void methodOne() throws  Exception --> valid (Overloading)
	 
	 3).public native void methodOne(int i) --> valid (Overriding)
	 
	 4).public static void methodOne(double d) --> valid (Overloading)
	 
	 5).public static void methodOne(int i) 
	 	Compile time error: methodOne(int i) in Child cannot override methodOne(int) in parent; overriding method is static 
 
 	 6).public static abstract void methodOne(float f)
 	 	Compile time error: 1.illegal combination of modifiers: abstract and static
 	 	2.Child is not abstract and does not override abstract method methodOne(float) in Child
 	 	

*/

	public static void main(String[] args) {
		P pa = new P();
		pa.methodOne();
		System.out.println(pa.x);//100
		Q ch = new Q();
		ch.methodOne();
		System.out.println(ch.x);//1000
		P p = new Q();
		p.methodOne();
		System.out.println(p.x);//100
	}

}
