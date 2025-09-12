package Corejava;
//Instance control flow in Parent to Child relationship :
//class Parent{
//	int x = 10;
//	{
//		methodOne();
//		System.out.println("Parent first instance block");
//	}
//	Parent(){
//		System.out.println("parent class constructor");
//	}
//	public static void main(String[] args) {
//		Parent p = new Parent();
//		System.out.println("parnet class main method");
//	}
//	public void methodOne() {
//		System.out.println(y);
//	}
//	int y = 20;
//}
public class InstanceControlFlow 
{
/*	
  Initialization:

1). private static String methodOne(String msg)  //-->1
	{
		System.out.println(msg);
		return msg;
	}
	static String m=methodOne("1");  //-->2,      //-->5
	{
		m=methodOne("2");
	}
	static                         //-->3
	{
		m=methodOne("3");                         //-->6
	}
	public static void main(String[] args)  //-->4
	{
		Object obj=new InstanceControlFlow();
	}
	
	
2). private static String methodOne(String msg) {
		System.out.println(msg);
		return msg;
	}
	public InstanceControlFlow(){
		m = methodOne("1");
	}
	{
		m = methodOne("2");
	}
	String m = methodOne("3");
	public static void main(String[] args) {
		Object obj = new InstanceControlFlow();
	}
 
	We can't access instance variables directly from static area because at 
	the time of execution of static area JVM may not identify those members.

	But from the instance area we can access instance members directly.
	Static members we can access from anywhere directly because these 
	are identified already at the time of class loading only.
*/
//	int i = 100;
//	{
//		methodOne();
//		System.out.println("First instance block");
//	}
//	InstanceControlFlow(){
//		System.out.println("Instance control flow class constructor");
//	}
//	public static void main(String[] args) {
//		InstanceControlFlow i = new InstanceControlFlow();
//		System.out.println("main method");
//	}
//	public void methodOne() {
//		System.out.println(j);
//	}
//	{
//		System.out.println("second instance block");
//	}
//	int j = 200;
}
/*
Note: Static control flow is one time activity and it will be executed at the time of class loading.
	  But instance control flow is not one time activity for every object creation it will be executed.
  
	1.) Identification of instance members from top to bottom(3 to 8).
	2.) Execution of instance variable assignments and instance blocks from top to bottom(9 to 14).
	3.) Execution of constructor.
  
  	Whenever we are creating child class object the following sequence of events will be executed automatically.
  	1.) Identification of instance members from Parent to Child.
	2.) Execution of instance variable assignments and instance block only in Parent class.
	3.) Execution of Parent class constructor.
	4.) Execution of instance variable assignments and instance blocks in Child class.
	5.) Execution of Child class constructor.
  
Note: Object creation is the most costly operation in java and hence if there is no specific 
	  requirement never recommended to crate objects.

  
  
  
  
  
  
  
  
  
 */