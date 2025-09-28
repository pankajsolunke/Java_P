package Corejava;

class Display
{
	public static synchronized void wish(String name) {
		for(int i=1;i<=5;i++) {
			System.out.println("static synchronized method: "+ name);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
//			System.out.println(name);
			
		}
	}
	public synchronized void wish1(String name) {
		for(int i=1;i<=5;i++) {
			System.out.println("normal synchronized method: "+ name);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
//			System.out.println(name);
		}
	}
	public static void wish2(String name) {
		for(int i=1;i<=5;i++) {
			System.out.println("normal static method: "+name);
		}
	}
	public void wish3(String name) {
		for(int i=1;i<=5;i++) {
			System.out.println("normal instance method: "+name);
		}
	}
}

class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		
		d.wish1(name);
//		d.wish2(name);
//		d.wish3(name);
//		d.wish(name);
	}
	
}
public class Synchronization {

	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread m1 = new MyThread(d1,"m1");
		MyThread m2 = new MyThread(d2,"m2");
//		Display.wish("vishal");
//		d1.wish("d1-static");
		d1.wish1("d1-non-static");
		m1.start();
		m2.start();
//		d1.wish("d1");
		
	}
}
/*
	1. Synchronized is the keyword applicable for methods and blocks but not for classes and variables.
	2. If a method or block declared as the synchronized then at a time only one Thread is allow to execute that method or block on the given object.
	3. The main advantage of synchronized keyword is we can resolve data inconsistency problems.
	4. But the main disadvantage of synchronized keyword is it increases waiting time of the Thread and effects performance of the system.
 	5. Hence if there is no specific requirement then never recommended to use synchronized keyword.
 	6. Internally synchronization concept is implemented by using lock concept.
 	7. Every object in java has a unique lock. Whenever we are using synchronized keyword then only lock concept will come into the picture.
 	8. If a Thread wants to execute any synchronized method on the given object 1st it has to get the lock of that object.
 	 	Once a Thread got the lock of that object then it's allow to execute any synchronized method on that object.
 	 	If the synchronized method execution completes then automatically Thread releases lock.
 	9. While a Thread executing any synchronized method the remaining Threads are not allowed execute any synchronized method on that object simultaneously.
 		But remaining Threads are allowed execute any non-synchronized method simultaneously.
 		[ lock concept is implemented based on object but not based on method ].
 	
	Example:
		class Display
		{
			public synchronized void wish(String name)
			{
				for(int i=0;i<5;i++)
				{
					System.out.print("good morning:");
					try
					{
						Thread.sleep(1000);	
					}
					catch (InterruptedException e)
					{}
					System.out.println(name);
				}
			}
		}
		class MyThread extends Thread
		{
			Display d;
			String name;
			MyThread(Display d,String name)
			{
				this.d=d;
				this.name=name;
			}
			public void run()
			{
				d.wish(name);
			}
		}
		class SynchronizedDemo
		{
			public static void main(String[] args)
			{
				Display d1=new Display();
				MyThread t1=new MyThread(d1,"pankaj");
				MyThread t2=new MyThread(d1,"nitin");
				t1.start();
				t2.start();
			}
		}
		
 --> If we are not declaring wish() method as synchronized then both Threads will be executed simultaneously.
 --> If we declare wish() method as synchronized then the Threads will be executed one by one that is until completing the
      1st Thread the 2nd Thread will be wait.
      
	Case Study:
		Case 1:
			Display d1=new Display();
			Display d2=new Display();
			MyThread t1=new MyThread(d1,"pankaj");
			MyThread t2=new MyThread(d2,"nitin");
			t1.start();
			t2.start();

		Diagram:
							 /----->t1
							/
					---------
					|	d1	| .wish("pankaj");
					---------
					
					 		 /----->t2
							/
					---------
					|	d2	| .wish("nitin");
					---------
		-->Even though we declared wish() method as synchronized but we will get irregular output in this case,
			because both Threads are operating on different objects.
			
		Conclusion: If  multiple Threads are operating on multiple objects then there is no impact of Synchronization.
					If multiple Threads are operating on same java objects then synchronized concept is applicable.
 
	Class level lock:
		1. Every class in java has a unique lock.
			If a Thread wants to execute a static synchronized method then it required class level lock.
		2. Once a Thread got class level lock then it is allow to execute any static synchronized method of that class.
		3. While a Thread executing any static synchronized method the remaining
			Threads are not allow to execute any static synchronized method of that class simultaneously.
		4. But remaining Threads are allowed to execute normal synchronized methods,
			normal static methods, and normal instance methods simultaneously.
		5. Class level lock and object lock both are different and there is no relationship between these two. 

	Object Lock(Instance Lock):
		1. Every object in java has one lock.
		2. When a thread enters an instance synchronized method, it acquires that object's lock.
		3. No other thread can enter any synchronized method of the same object until the lock is released.
		4. But if there are multiple objects, each has its own lock --> so threads can run simultaneously on different objects.
	-----> Output will be mixed (because d1 and d2 have different locks).
	
	Class Lock (static Lock)
		1. Every class in java has one lock (not per object).
		2. When a thread enters a static synchronized method, it acquires the class-level lock.
		3. No matter how many objects you create, only one thread can execute any static synchronized method of that class at a time.
	-----> Output will NOT be mixed (because there is only one class-level lock).
	
	
		Object Lock --> used when you want synchronization per object.
		Class Lock --> used when you want synchronization per class (shared across all objects).
		
	Synchronized block:
		1. If very few lines of the code required synchronization then it's never recommended to declare entire
			method as synchronized we have to enclose those few lines of the code with in synchronized block.
		2. The main advantage of synchronized block over synchronized method is it reduces waiting time of Thread and improves performance of the system.
 
 		Example 1: To get lock of current object we can declare synchronized block as follows.
 					If Thread got lock of current object then only it is allowed to execute this block.
 				Synchronized(this){ }
 				
 		Example 2: To get the of a particular object 'b' we have to declare synchronized block as follows.
 					If Thread got lock of 'b' object then only it is allowed to execute this block.
 				Synchronized(b){ }
 				
 		Example 3: To get class level lock we have to declare synchronized block as follows.
 					If Thread got class level lock of Display then only it allowed to execute this block.
 				Synchronized(Display.class){ }
 				
 		NOTE: As the argument to the synchronized block we can pass either object reference or ".class file" and
 		 	  we can't pass primitive values as argument [because lock concept is dependent only for objects and classes but not for primitives].
 
 	Questions:
 		1. Explain about synchronized keyword and its Advantages and Disadvantages?
 		-->* synchronized is a keyword in java used in multithreading.
 		   * This helps to avoid data inconsistency and race conditions.
 		   * synchronized = one thread at a time --> safe data but slower performance.
 		Advantages:
 		1.Keeps data safe when many threads are working.
 		2.Avoids race condition.
 		3.Maintains data consistency.
 		4.Makes program thread-safe.
 
 		Disadvantages:
 		1.Slow performance because threads wait for each other.
 		2.Can cause deadlock if locks are not used carefully.What is class level lock and when a Thread required?
 		3.Less scalability when many threads are used.
 		4.Extra overhead because JVM has to manage locks.
 		
 		2. What is object lock and when a Thread required?
 		-->* In Java, every object has a lock(also called a monitor).
 		   * When a thread enters a synchronized method or synchronized block on an object, it must acquire that object's lock.
 		   * While one thread holds the lock, no other thread can enter any synchronized method/block of the same object.
 		   * When calling an instance synchronized method
 		   		Thread needs the lock of that object(this) before executing.
 		   * When entering a synchronized block on an object
 		   		Lock is required on the object used in the block.
 		   * Not needed for non-synchronized methods
 		   		Any thread can call non-synchronized methods freely, no lock required.
 		   * Object Lock --> a lock attached to every object in java.
 		   * Thread requires object lock when it wants to execute a synchronized instance method or block on that object.
 
 		3. What is class level lock and when a Thread required?
 		-->* In Java, every class has exactly one lock called the class-level lock.
 		   * This lock is used whenever thread executes a static synchronized method or static synchronized block.
 		   * It ensures that only one thread at a time can execute any static synchronized method of the class, regardless of how many objects are created.
 		   * Class-level lock = one lock per class.
 		   * Required when: multiple threads are working on static synchronized methods or static data.  
 
 		4. What is the difference between object lock and class level lock?
 		-->
 			Different in short:
			-------------------------------------------------------------------------------------
			|	Feature				|	Object Lock(Instance)		|	Class Lock(static)		|
			-------------------------------------------------------------------------------------
			| Lock belongs to		|	Each object					|	Entire class			|
			|-----------------------------------------------------------------------------------|
			| Used by				| Instance synchronized			| Static synchronized		|
			|						| methods/blocks				| methods/blocks			|
			|-----------------------|-------------------------------|---------------------------|
			| Multiple locks?		| YES (one per object)			| NO (only one per class)	|
			|-----------------------|-------------------------------|---------------------------|
			| Parallel execution	| Possible (if objects are		| NOT possible (only one	|
			|						| different)					| thread at a time)			|
			-------------------------------------------------------------------------------------
	
 		5. While a Thread executing a synchronized method on the given object is the remaining
 		   Threads are allowed to execute other synchronized methods simultaneously on the same object?
		--> No.
 
 		6. What is synchronized block and explain its declaration?
 		-->* A synchronized block is a smaller section of code inside a method that is locked for only one thread at a time.
 		   * Instead of making the entire method synchronized, me can synchronized only the critical section (the part of code that accesses shared resources).
 		   * This improves performance, because unnecessary code is not locked.
 		   * To achieve better efficiency than synchronizing a whole method.
 		   * To provide fine-grained control on which part of code needs synchronization.
 		   * Declaration/syntax
 		   	lockobject --> the object on which the lock will be acquired.
 		   	Only one thread at a time can hold this lock and execute the block.
 		   	Once the thread exits, the lock is released and other threads can enter.
 		   	synchronized block --> used to lock only a part of the code instead of the entire method.
 		   	Declaration --> synchronized(lockobject){.....}
 		   	Advantage --> increases performance by reducing the area under lock.
 		   	
		7. What is the advantage of synchronized block over synchronized method?
		--> synchronized method:
			* If you declare a method as synchronized, the entire method is locked.
			* That means, once one thread enters, other threads must wait, even if only a small part of the method actually needs synchronization.
			* This reduce performance because unnecessary code is also locked.
			
		    synchronized block:
		    * Only a specific portion of the method(the critical section) is synchronized.
		    * Other code runs without lock, so multiple threads can still execute non-critical parts in parallel.
		    * This gives better performance and fine-grained control.
		    
		8. Is a Thread can hold more than one lock at a time?
		--> Yes, up course from different objects.
		
		Example:
			class X{
				synchronized void methodOne(){
					Y y = new Y();
					y.methodTwo();
				}
			}
			class Y{
				synchronized void methodTwo() {.....}
 			}
 			
 		Diagram:
 					/-----t1----(x),(y)
 				-------
 				|  x  |.methodOne()
 				-------
 				
 				-------
 				|  y  |.methodTwo()
 				-------
 
 		9. What is synchronized statement?
 		--> The statements which present inside synchronized method and synchronized block are called synchronized statements.
 			[Interview people created terminology].
 					
*/

