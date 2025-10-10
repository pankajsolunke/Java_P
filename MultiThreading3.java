package Corejava;

//class ThreadA extends Thread{
//	int total = 0;
//	public void run() {
//		
//		
//		for(int i=0;i<5;i++) {
////			Thread.yield();
//			System.out.println("yield "+ i);
////		synchronized(this) {
////			System.out.println("child thread starts calcuation");//step-2
////			for(int i=0;i<=100;i++)
////				total = total + i;
////			System.out.println("child thread giving notification call");//step-3
////			this.notify();
//		}
//	}
//}
class MyRunnable implements Runnable {
	public void run() {
		for(int j=0;j<5;j++) {
			System.out.println("non yield "+j);
		}
	}
}
public class MultiThreading3 {

	public static void main(String[] args) throws InterruptedException {
//		ThreadA a = new ThreadA();
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
//		a.start();
		t.join();
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(t.getPriority());
//		a.setPriority(8);
//		System.out.println(a.getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("main "+i);
//		a.start();
//		synchronized(a) {
//			System.out.println("main thread calling wait() method");//step-1
//			a.wait();
//			System.out.println("main thread got notification call");//step-4
//			System.out.println(a.total);
		}
		
	}
}
/*	
	Inter Thread communication wait(), notify(), notifyAll():
	* Two Threads can communicate with each other by using wait(), notify() and notifyAll() methods.
	* The Thread which is required updation it has to call wait() method on the required object then immediately the Thread will entered into waiting state.
	* The Thread which is performing updation of object, it is responsible to give notification by calling notify() method.
	* After getting notification the waiting Thread will get those updations.
	* wait(),notify() and notifyAll() methods are available in object class but not in Thread class because Thread can call these methods on any common object.
	* To call wait(), notify() and notifyAll() methods compulsory the current Thread should be owner of that object.
	* i.e., current Thread should has lock of that object.
	* i.e., current Thread should be in synchronized area.
	* Hence we can call wait(), notify() and notifyAll() methods only from synchronized area otherwise we will get runtime exception saying IllegalMonitorStateException.
	* Once a Thread calls wait() method on the given object 1st it releases the lock of that object immediately and entered into waiting state.
	* Once a Thread calls notify() (or) notifyAll() methods it releases the lock of that object but may not immediately.
	* Except these (wait(),notify(),notifyAll()) methods there is no other place(method) where the lock release will be happen.
		----------------------------------------
		|	Method	  |Is Thread Releases Lock?|
		----------------------------------------
		| yield()	  |			NO			   |
		----------------------------------------
		| join()	  |			NO			   |
		----------------------------------------
		| sleep()	  |			NO			   |
		----------------------------------------
		| wait()	  |			YES			   |
		----------------------------------------
		| notify()	  |			YES			   |
		----------------------------------------
		| notifyAll() |			YES			   |
		----------------------------------------
	* Once a Thread calls wait(),notify(),notifyAll() methods on any object then it releases the lock of that particular object but not all locks it has.
	 	1. public final void wait() throws InterruptedException
	 	2. public final native void wait(long ms) throws InterruptedException
	 	3. public final void wait(long ms,int ns) throws InterrputedEception
	 	4. public final native void notify()
	 	5. public final void notifyAll()
	 	
	Diagram:						1) If waiting thread got notification.
									2) If time expires.
									3) If waiting thread got interrupted.
					-----------------------						
					|Another waiting	  |					---------------
					|state to get the lock|<----------------|waiting state|
	 				-----------------------					---------------
	 						   |								   ^
	 		  				   |								   |
	 		  if waiting thread|								   |obj.wait();
	 			    got lock   |								   |obj.wait(1000);
	 						   |								   |obj.wait(1000,100);
	 						   |								   |
							   ▼								   |		if run() method
	----------t.start()---------------- if TS allocates CPU	 -------------   completes		-------------
	|new/born|-------->|Ready/Runnable|--------------------->|	Running	 |----------------->|	dead	|
	----------		   ----------------						 -------------					-------------
	
	Example 1:
		class ThreadA
		{
			public static void main(String[] args)throws InterruptedException
			{
				ThreadB b=new ThreadB();
				b.start();
				synchronized(b)
				{
					System.out.println("main Thread calling wait() method");//step-1
					b.wait();
					System.out.println("main Thread got notification call");//step-4
					System.out.println(b.total);
				}
			}
		}
		class ThreadB extends Thread
		{
			int total=0;
			public void run()
			{
				synchronized(this)
				{
					System.out.println("child thread starts calcuation");//step-2
					for(int i=0;i<=100;i++)
					{
						total=total+i;
					}
					System.out.println("child thread giving notification call");//step-3
					this.notify();
				}
			}
		}
		Output:
		main Thread calling wait() method
		child thread starts calculation
		child thread giving notification call
		main Thread got notification call
		5050
		
	Example 2:
	Producer consumer problem:
		Producer(producer Thread) will produce the items to the queue and consumer(consumer thread) will consume the items from the queue.
		If the queue is empty then consumer has to call wait() method on the queue object then it will entered into waiting state.
		After producing the items producer Thread call notify() method on the queue to give notification so that consumer Thread will get that notification and consume items.
		
	Diagram:
				-----------------
	------------|--->		 ---|------------> 
	  producer  -----------------  consumer
	  				  Queue
	  				  
 	Example:
 		class Producer{
 			Producer(){ 
 				synchronized(q){
 					producer items to the queue
 					q.notify();
 				}
 			}
 		}
 		
 		class Consumer{
 			Consumer(){
 				synchronized(q){
 					if(q is empty){
 						q.wait();
 					}
 					else
 						continue items;
 				}
 			}
 		}
 		
	Notify vs NotifyAll():
		We can use notify() method to give notification for only one Thread.
		If multiple Threads are waiting then only one Thread will get the chance and remaining Threads has to wait for further notification.
		But which Thread will be notify(inform) we can't expect exactly it depends on JVM.
		We can use notifyAll() method to give the notification for all waiting Threads.
		All waiting Threads will be notified and will be executed one by one, because they are required lock.
		
	NOTE: On which object we are calling wait(), notify() and notifyAll() methods that corresponding object lock we have to get but not other object locks.
	  
	Example:  
	  								Stack s1 = new Stack();
	  								Stack s2 = new Stack();
	  								/					  \
	  							   /					   \
	  							  /							\
	  							 /							 \
	  					synchronized(s1){				synchronized(s1){
	  						;;;;;;							;;;;;;
	  						s2.wait();						s1.wait();
	  						;;;;;;							;;;;;;
	  					}								}
	  					(invalid)						(valid)
	  				R.E:IllegalMonitorStateException
	  
	Which of the following statements are True ?
	1) Once a Thread calls wait() on any Object immediately it will entered into waiting state without releasing the lock ?
	--> NO
	2) Once a Thread calls wait() on any Object it reduces the lock of that Object but may not immediately ?
	--> NO
	3) Once a Thread calls wait() on any Object it immediately releases all locks whatever it has and entered into waiting state ?
	--> NO
	4) Once a Thread calls wait() on any Object it immediately releases the lock of that particular Object and entered into waiting state ?
	--> YES
	5) Once a Thread calls notify() on any Object it immediately releases the lock of that Object ?
	--> NO
	6) Once a Thread calls notify() on any Object it releases the lock of that Object but may not immediately ?
	--> YES
	  
	Dead Lock:
		If 2 Threads are waiting for each other forever(without end) such type of situation(infinite waiting) is called dead lock.
		There are no resolution techniques for dead lock but several prevention(avoidance) techniques are possible. 
	  	Synchronized keyword is the cause for deadlock hence whenever we are using synchronized keyword we have to take special care.
	  
	Example:
	class A
	{
		public synchronized void foo(B b)
		{
			System.out.println("Thread1 starts execution of foo() method");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{}
			System.out.println("Thread1 trying to call b.last()");
			b.last();
		}
		public synchronized void last()
		{
			System.out.println("inside A, this is last()method");
		}
	}
	class B
	{
		public synchronized void bar(A a)
		{
			System.out.println("Thread2 starts execution of bar() method");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{}
			System.out.println("Thread2 trying to call a.last()");
			a.last();
		}
		public synchronized void last()
		{
			System.out.println("inside B, this is last() method");
		}
	}
	class DeadLock implements Runnable
	{
		A a=new A();
		B b=new B();
		DeadLock()
		{
			Thread t=new Thread(this);
			t.start();
			a.foo(b);//main thread
		}
		public void run()
		{
			b.bar(a);//child thread
		}
		public static void main(String[] args)
		{
			new DeadLock();//main thread
		}
	}
	Output:
	Thread1 starts execution of foo() method
	Thread2 starts execution of bar() method
	Thread2 trying to call a.last()
	Thread1 trying to call b.last()
	//here cursor always waiting.

	NOTE: If we remove at least one synchronized keyword then we won't get DeadLock.
		  Hence synchronized keyword in the only reason for DeadLock due to this while using synchronized keyword we have to handling carefully.
		  
	Daemon Threads:
		The Threads which are executing in the background are called daemon Threads.
		The main objective of daemon Threads is to provide support for non-daemon Threads like main Thread.
	
	Example:
		Garbage collector
		
	When ever the program runs with low memory the JVM will execute Garbage Collector to provider free memory. So that the main Thread can continue it's execution.
	
	* We can check whether the Thread is daemon or not by using isDaemon() method of Thread class.
		public final boolean isDaemon();
	* We can change daemon nature of a Thread by using setDaemon() method.
		public final void setDaemon(boolean b);
	* But we can change daemon nature before starting Thread only.
	  That is after starting the Thread if we are trying to change the daemon nature we will get R.E saying IllegalThreadStateException.
	* Default Nature: Main Thread is always non daemon and we can't change its daemon nature because it's already started at the beginning only.
	* Main Thread is always non daemon and for the remaining Threads daemon nature will be inheriting from 
	   parent to child that is if the parent is daemon child is also daemon and if the parent is non daemon then child is also non daemon.
	* Whenever the last non daemon Thread terminates automatically all daemon Threads will be terminated.
	
	Example:
		class MyThread extends Thread{
		
		}
	  	class DaemonThreadDemo{
	  		public static void main(String[] args){
	  			System.out.println(Thread.currentThread().isDaemon());
	  			MyThread t = new MyThread();
	  			System.out.println(t.isDaemon());
	  			t.start();
	  			t.setDaemon(true);
	  			System.out.println(t.isDaemon());
	  		}
	  	}
	Output:
		false
		false
		R.E:IllegalThreadStateException
	  
	Example:
		class MyThread extends Thread{
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("lazy thread");
					try{
						Thread.sleep(2000);
					}
					catch(InterruptedException e)
					{}
				}
			}
		}
	  	class DaemonThreadDemo{
	  		public static void main(String[] args){
	  			MyThread t = new MyThread();
	  			t.setDaemon(true);		//---> 1
	  			t.start();
	  			System.out.println("end of main Thread");
	  		}
	  	}
	Output:
		End of main Thread
		
	* If we comment line 1 then both main & child Threads are non-Daemon, and hence both threads will be executed until there completion.
	* If we are not comment line 1 then main thread is non-Daemon and child thread is Daemon.
	* Hence when ever main Thread terminates automatically child thread will be terminated.
	  
	Lazy Thread:
		* If we are commenting line 1 then both main and child Threads are non daemon and hence both will be executed until they completion.
		* If we are not commenting line 1 then main Thread is non daemon and child Thread is daemon and hence whenever main Thread terminates automatically child Thread will be terminated.
		
	Deadlock vs Starvation:
		* A long waiting of a Thread which never ends is called deadlock.
		* A long waiting of a Thread which ends at certain point is called starvation.
		* A low priority Thread has to wait until completing all high priority Threads.
		* This long waiting of Thread which ends at certain point is called starvation.
	
	How to kill a thread in the middle of the line?
		* We can call stop() method to stop a Thread in the middle then it will be entered into dead state immediately.
		 	public final void stop();
		* stop() method has been deprecated and hence not recommended to use.
		
	suspend and resume methods:
		* A Thread can suspend another Thread by using suspend() method then that Thread will be paused temporarily.
		* A Thread can resume a suspended Thread by using resume() method then suspended Thread will continue its execution.
		 	1. public final void suspend();
		 	2. public final void resume();
		* Both methods are deprecated and not recommended to use.
		
	RACE condition:
		Executing multiple Threads simultaneously and causing data inconsistency problems is nothing but Race condition.
		We can resolve race condition by using synchronized keyword.
		
	ThreadGroup:
		Based on functionality we can group Threads as a single unit which is nothing but ThreadGroup.
		ThreadGroup provides a convenient way to perform common operations for all Threads belongs to a particular group.
		We can create a ThreadGroup by using the following constructors.
			ThreadGroup g = new ThreadGroup(String gName);
		We can attach a Thread to the ThreadGroup by using the following constructor of Thread class
			Thread t = new Thread(ThreadGroup g,String name);
			
	Example:
		ThreadGroup g=new ThreadGroup("Printing Threads");
		MyThread t1=new MyThread(g,"Header Printing");
		MyThread t2=new MyThread(g,"Footer Printing");
		MyThread t3=new MyThread(g,"Body Printing");
		-----------
		g.stop();
	  
	ThreadLocal(1.2v):
		We can use ThreadLocal to define local resources which are required for a particular Thread like DBConnections, counterVariables etc.,
		We can use ThreadLocal to define Thread scope like Servlet Scopes(page,request,session,application).
	  
	GreenThread:
		Java multiThreading concept is implementing by using the following 2 methods:
			1. GreenThread Model
			2. Native OS Model
			
	1. GreenThread Model:
		The threads which are managed completely by JVM without taking support for underlying OS, such type of threads are called Green Threads.
		
	2. Native OS Model:
		The Threads which are managed with the help of underlying OS are called Native Threads.
		Windows based OS provide support for Native OS Model
		Very few OS like SunSolaries provide support for GreenThread Model
		Anyway Green Thread model is deprecated and not recommended to use.
	  
	Life Cycle of a Thread:
	  
	  What is the difference between extends Thread and implements Runnable?
	  --> 1. Extends Thread is useful to override the public void run() method of Thread class.
	  	  2. Implements Runnable is useful to implement public void run() method of Runnable interface.
	  	  
	  Extends Thread, implements Runnable which one is advantage?
	  --> If we extend thread class, there is no scope to extend another class.
	  
	  Example:
	  	class MyClass extends Frame, Thread//invalid
	  	If we write implements Runnable still there is a scope to extend one more class.
	  	
	  Example:
	  	1. class MyClass extends Thread implements Runnable{}
	  	2. class MyClass extends Frame implements Runnable{}
	  	
	  How can you stop a thread which is running?
	  -->
	  	 Step 1: Declare a boolean type variable and store false in that variable.
	  	 		boolean stop=false;
	  	 		
	  	 Step 2: If the variable becomes true return from the run() method.
	  	 		If(stop) return;
	  	 		
	  	 Step 3: Whenever to stop the thread store true into the variable.
	  	 		System.in.read();//press enter
	  	 		Obj.stop=true;
	  
	  
	QUESTIONS:
	  
	What is a Thread?
	Which Thread by default runs in every java program?
	Ans: By default main Thread runs in every java program.
	What is the default priority of the Thread?
	How can you change the priority number of the Thread?
	Which method is executed by any Thread?
	Ans: A Thread executes only public void run() method.
	How can you stop a Thread which is running?
	Explain the two types of multitasking?
	What is the difference between a process and a Thread?
	What is Thread scheduler?
	Explain the synchronization of Threads?
	What is the difference between synchronized block and synchronized keyword?
	What is Thread deadlock? How can you resolve deadlock situation?
	Which methods are used in Thread communication?
	What is the difference between notify() and notifyAll() methods?
	What is the difference between sleep() and wait() methods?
	Explain the life cycle of a Thread?
	What is daemon Thread?
		  
	  
	  
*/

