package Corejava;

public class MultiThreading1 {
	
	public static void main(String[] args) {
/*
	Multitasking:
		Executing several tasks simultaneously is the concept of multitasking.
		There are two types of multitasking's.
		1) Process based multitasking.
		2) Thread based multitasking.
		 
	1)Process based multitasking:
		Executing several tasks simultaneously where each task is a separate independent process such
		type of multitasking is called process based multitasking.
		Example:
			* While typing a java program in the editor we can able to listen mp3 audio songs at the same time
			  we can download a file from the net all these tasks are independent of each other and executing
			  simultaneously and hence it is process based multitasking. 
		 	* This type of multitasking is best suitable at "os level".

	2)Thread based multitasking:
		Executing several tasks simultaneously where each task is a separate independent part of the same program,is called Thread based multitasking.
		And each independent part is called a "Thread".
		
		1) This type of multitasking is best suitable for "programmatic level".
		2) When compared with "C++", developing multithreading examples is very easy in java because java provides in built support for multithreading 
		   through a rich API (Thread, Runnable, ThreadGroup, ThreadLocal...etc).
		3) In multi threading on 10% of the work the programmer is required to do and 90% of the work will be down by java API.
		4) The main important application areas of multithreading are:
		  1) To implement multimedia graphics.
		  2) To develop animations.
		  3) To develop video games etc.
		  4) To develop web and application servers
		5) Whether it is process based or Thread based the main objective of multitasking is to 
		   improve performance of the system by reducing response time
		
		The ways to define instantiate and start a new Thread.
		We can define a Thread in the following 2 ways.
			1. By extending Thread class.
			2. By implementing Runnable interface. 
		
		Defining a Thread by extending "Thread class":
		Example:
				|class MyThread extends Thread{
				|	public void run(){
		defining|Job of	|for(int i = 0;i<10;i++){
		a		|a	 <--|	System.out.println("Child Thread");
		Thread	|Thread	|}
				|	}
				|}
				
			class ThreadDemo
			{
				public static void main(String[] args)
				{
					MyThread t=new MyThread();//Instantiation of a Thread
					t.start();//starting of a Thread
					for(int i=0;i<5;i++)
					{
						System.out.println("main thread");
					}
				}
			}
				
	Case 1.Thread Scheduler:
	* If multiple Threads are waiting to execute then which Thread will execute 
	  1st is decided by "Thread Scheduler" which is part of JVM.
	* Which algorithm or behavior followed by Thread Scheduler we can't expect 
	  exactly it is the JVM vendor dependent hence in multithreading examples 
	  we can't expect exact execution order and exact output.
				
	Case 2.Difference between m.start() and m.run() methods.
	* In the case of m.start() a new Thread will be created which is responsible for the execution of run() method.
	* But in the case of m.run() no new Thread will be created and run() method will be executed just like a normal method by the main Thread.					
				
	Case 3.Importance of Thread class start() method.
	Example:
		start(){
			1.Register Thread with Thread Scheduler.
			2.All other mandatory low level activities.
			3.Invoke or calling run() method.
		}
	We can conclude that without executing Thread class start() method there is no chance of starting a new Thread in java.
	Due to this start() is considered as heart of multithreading.
				
	Case 4.If we are not overriding run() method:
	If we are not overriding run() method then Thread class run() method will be executed which  has empty implementation and 
	 hence we won't get any output.
	 Example:
		class MyThread extends Thread 
		{}
		class ThreadDemo
		{
			public static void main(String[] args)
			{
				MyThread t=new MyThread();
				t.start();
			}
		}
	It is highly recommended to override run() method. 
	Otherwise don't go for multithreading concept.			
				
	Case 5.Overloading of run() method.
	We can overload run() method but Thread class start() method always invokes no argument run() method the other 
	overload run() method we have to call explicitly then only it will be executed just like normal method.  
	Example:
	class MyThread extends Thread
	{
		public void run()
		{
			System.out.println("no arg method");
		}
		public void run(int i)
		{
			System.out.println("int arg method");
		}
	}
	class ThreadDemo
	{
		public static void main(String[] args)
		{
			MyThread t=new MyThread();
			t.start();
		}
	}
	Output:
	No arg method			
				
	Case 6.Overriding of start() method:
		If we override start() method then our start() method will be 
		 executed just like a normal method call and no new Thread will be started.
		 Example:
			class MyThread extends Thread
			{
				public void start()
				{
					System.out.println("start method");
				}
				public void run()
				{
					System.out.println("run method");
				}
			}
			class ThreadDemo
			{
				public static void main(String[] args)
				{
					MyThread t=new MyThread();
					t.start();
					System.out.println("main method");
				}
			}
		Output:
			start method
			main method
			
		Entire output produced by only main Thread.
		Note: It is never recommended to override start() method.	
			
	Case 7. 
		class MyThread extends Thread{
			public void start() {
				super.start(); //--> create a new thread and execute the run method
				System.out.println("Start method");
			}
			public void run() {
				System.out.println("Run method");
			}
		}
		MyThread m = new MyThread();
		m.start();
		System.out.println("main method");
		
		output:
			start method		start method
			main method			run method
			run method			main method
			
	Case 8. Life cycle of the Thread:
	Diagram:
		MyThread m = new MyThread();
									Thread Scheduler							
  ---------- m.start() ----------------it TS allocates CPU ---------if run() method completes ------
  |new/born|---------->|Ready/Runnable|------------------->|Runnung|------------------------->|Dead|
  ----------		   ----------------					   ---------						  ------
		
	* Once we created a Thread object then the Thread is said to be in new state or born state.
	* Once we call start() method then the thread will be entered into Ready or Runnable state.
	* If Thread Scheduler allocates CPU then the Thread will be entered into running state.
	* Once run() method completes then the Thread will entered into dead state. 
		
	Case 9.
		After starting a Thread we are not allowed to restart the same Thread once again otherwise 
		we will get runtime exception saying "IllegalThreadStateException".
		Example:
			MyThread t=new MyThread();
			t.start();//valid
			;;;;;;;;
			t.start();//we will get R.E saying: IllegalThreadStateException
		

//		MultiThreading m = new MultiThreading();//Instantiation of a Thread
		m.start();//Starting of a Thread
		m.run();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}		
*/		

/*
	Defining a Thread by implementing Runnable interface:
		we can define a Thread even by implementing Runnable interface also.
		Runnable interface present in java.lang.pkg and contains only one method run().
 	
 	Diagram:
 					Runnable
 					^	   ^
 				   /		\
 				  /			 \
 				 /			  \
 			Thread			MyRunnable
 			   ^			2nd Approach
 			  /
 			 /
 		MyThread
 	1st Approach			     
 				     
 	Example:
 		|class MyRunnable implements Runnable{
defining|	public void run() {
a 		|job of	|for(int i=0;i<10;i++) {
Thread	|a		|	System.out.println("Child Thread");
		|Thread	|}
		|	}
		|}
 				     
 		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);//here r is a Target Runnable
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main method");
		}			     
 	We can't expect exact output but there are several possible outputs.		     
 	
    Case Study:
    myRunnable r = new MyRunnable();
    Thread t1=new Thread();
    Thread t2=new Thread(r);
    
    Case 1: t1.start();
    	A new Thread will be created which is responsible for the execution of Thread class run() method.
    	output:main method
    		   main method
    		   main method
    		   main method
    		
    Case 2: t1.run();
    	No new Thread will be created but Thread class run() method will be executed just like a normal method call.
 		output:main method
    		   main method
    		   main method
    		   main method
    		   
    Case 3: t2.start();
    	New Thread will be  created which is responsible for the execution of MyRunnable run() method.
 		
 	Case 4: t2.run();
 		No new Thread will be created and MyRunnable run() method will be executed just like a normal method . 
 	
 	Case 5: r.start();
 		We will get compile time error saying start() method is not available in MyRunnable class.
 	
 	Case 6: r.run();
 		No new Thread will be created and MyRunnable class run() method will be executed just like a normal method call.
 	
 	Example:
 	class MyRunnable implements Runnable{
		public void run() {
			for(int i = 0; i < 5; i++)
				System.out.println("child thread");
		}
	}
	class MyDemo {
		public static void main(String[] args){

 			MyRunnable r = new MyRunnable();
			Thread t1 = new Thread();
			Thread t2 = new Thread(r);
			t1.start();
			t1.run();
			t2.start();
			t2.run();
			r.start();
			r.run();
			for(int i = 0;i < 5;i++)
				System.out.println("main method");
	}
	}
	
	In which of the above cases a new Thread will be created which is responsible for the execution of MyRunnable run() method ?
	=> t2.start();

	In which of the above cases a new Thread will be created ?
	=> t1.start();
	=> t2.start();

	In which of the above cases MyRunnable class run() will be executed ?
	=> t2.start();
	=> t2.run();
	=> r.run();
	
	Best approach to define a Thread:
	* Among the 2 ways of defining a Thread, implements Runnable approach is always recommended.
	* In the 1st approach our class should always extends Thread class there is no chance of extending any other class hence we are missing the benefits of inheritance.
	* But in the 2nd approach while implementing Runnable interface we can extend some other class also.
	* Hence implements Runnable mechanism is recommended to define a Thread.
	 
	Thread class Constructors:
	1) Thread t = new Thread();
	2) Thread t = new Thread(Runnable r);
	3) Thread t = new Thread(String name);
	4) Thread t = new Thread(Runnable r,String name);
	5) Thread t = new Thread(ThreadGroup g,String name);
	6) Thread t = new Thread(ThreadGroup g,Runnable r);
	7) Thread t = new Thread(ThreadGroup g,Runnable r,String name);
	8) Thread t = new Thread(ThreadGroup g,Runnable r,String name,long stackSize);
	 
	 
	 
*/
		
	}

}
