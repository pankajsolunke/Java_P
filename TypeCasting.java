package Corejava;

/*
class Parent01{
	public void methodOne() {
		System.out.println("A");
	}
}
*/
public class TypeCasting { //extends Parent01
/*	public void methodOne() {
		System.out.println("B");
	}
	public void methodTwo() {
		System.out.println("C");
	}

 	Parent class reference can be used to hold Child class object 
 	but by using that reference we can't call Child specific methods.

  	Similarly we can use interface reference to hold implemented class object.
	Example:
	Runnable r=new Thread();
	
	Type casting syntax:
		A b = (C) d;
	   /  |	   |   \-->(name of reference variable/object)
	  /   |	   |--> Class/interface
Class/  (name of reference variable)
interface
*/
	public static void main(String[] args) 
	{	
/*	  Runnable r = new Thread();
	  Object obj = new String("Pankaj");//valid
	  System.out.println(obj.hashCode());// valid
	  System.out.println(obj.length());--> invalid
	  System.out.println(obj.toString());
	  
	  Compile time checking :
	  Rule 1: The type of "d" and "c" must have some relationship [either Child to Parent (or) 
	  Parent to Child (or) same type] otherwise we will get compile time error saying inconvertible types.
	  
	  Example 1: RunTime Checking 
	  ----------------------------------------
	  | Object obj = new String("Pankaj");   |-->(valid)
	  | StringBuffer sb = (StringBuffer)obj; |--> Runtime Exception ClassCastException
	  ----------------------------------------
		
	  Example 2: Compile Time Checking
	  --------------------------------------
	  | String s = new String("kunal");	   |--> (invalid)
	  | StringBuffer sb = (StringBuffer) s;|--> cannot cast from string to stringBuffer
	  ----------------------------------------> Compile time Exception incompatible types
	  
	  Rule 2: "C" must be either same (or) derived type of "A" 
	  otherwise we will get compile time error saying incompatible types.
	  Found: C
	  Required: A
	  
	  Example 1:
	  -------------------------------------
	  | Object o = new String("Pankaj");  |-->(valid)
	  | StringBuffer sb = (StringBuffer)o;|-->Runtime Exception ClassCastException
	  -------------------------------------
	  
	  Example 2:
	  -------------------------------------
	  | Object o = new String("kunal");   |-->(invalid)
	  | StringBuffer sb = (String)o;      |-->Compile Time cannot convert from String to StringBuffer 
	  -------------------------------------
	  
	  Runtime checking :
	  The underlying object type of "d" must be either same (or) derived type of "C" otherwise we will get runtime exception saying ClassCastException.

	  --------------------------------------
	  | Object o = new String("Solunke");  |
	  | StringBuffer sb = (StringBuffer)o; |--> Runtime Exception: ClassCastException
	  --------------------------------------

					   Object
					   /	 \
					  /	      \
				 Base1         Base2
				 /   \          /   \
			    /     \        /     \
			   /       \      /       \
         Derived1 Derived2  Derived3  Derived4

		Base1 b = new Derived2();//valid
		Object o = (Base1)b;//valid
		Object o1 = (Base2)o;//invalid
		Object o2 = (Base2)b;//invalid
		Base2 b1 = (Base1)(new Derived1());//invalid
		Base2 b2 = (Base2)(new Derived3());//valid
		Base2 b2 = (Base2)(new Derived1());//invalid
		
		Through Type Casting just we are converting the type of object but not object 
		itself that is we are performing type casting but not object casting.
		
		Through Type Casting we are not create any new objects for the existing objects 
		we are providing another type of reference variable(mostly Parent type).
		
equivalent|String s = new String("nitin");	String s--->|------------
 code  |--|Object o = (Object)s;			Object o--->|	nitin	|
      --   System.out.println(s==o);//true				-------------
	   |--|Object o = new String("nitin");
	
	Example 1)
		TypeCasting t = new TypeCasting();
		t.methodOne();// B
		t.methodTwo();// C
		((Parent01)t).methodOne();//B

	Example 2)
	
	A----->public void methodOne(){
	|		System.out.println("A");
	|	   }
	|	   
	B----->public void methodOne(){
	|	    System.out.println("B");
	|	   }
	|	   
	C----->public void methodOne(){
			System.out.println("C");
		   }
		   	   
		It is Overriding and method resolution is based on runtime object.
		C c=new C();
		c.methodOne();//C
		((B)c).methodOne();//C
		((A)((B)c)).methodOne();//C
		
	Example 3)
	
	A----->public static void methodOne(){
	|		System.out.println("A");
	|	   }
	|	   
	B----->public static void methodOne(){
	|	    System.out.println("B");
	|	   }
	|	   
	C----->public static void methodOne(){
			System.out.println("C");
	
		It is method hiding and method resolution is based on reference type.
		C c = new C();
		c.methodOne();//C
		((B)c).methodOne();//B
		((A)((B)c)).methodOne();//A
	
	Example 4)
	
	A----->int x = 777;
	|
	|
	B----->int x = 888;
	|
	|
	C----->int x = 999;
	
	Variable resolution is always based on reference type only.
	If we are changing variable as static then also we will get the same output.
	C c = new C();
	System.out.println(c.x);//999
	System.out.println(((B)c).x);//888
	System.out.println(((A)((B)c)).x);//777

*/	
	
	}

}
