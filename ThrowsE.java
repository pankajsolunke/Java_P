package Corejava;


public class ThrowsE extends RuntimeException {
	
	public static void main(String[] args) throws ThrowsE {
		int x = 10,z = 20;
		
//		if(z == 20) 
//			break; --> error

//		l1 : {
//			System.out.println("start");
//			if(x == 10)
//				break l1;
//			System.out.println("end");
//		}
//		
//		int i;
//		for( i = 0; i<10; i++) {
//			if(i == 5)
//				break;
//			
//			System.out.println(i);
//		}
//		System.out.println(i);
		
//		throw new Error();
//		throw new Exception();
//		doStuff();
//	}
//	public static void doStuff() throws InterruptedException {
//		doMoreStuff();
//	}
//	public static void doMoreStuff() throws InterruptedException {
//		Thread.sleep(5000);
		
		try {
			System.out.println("Shubham Dada");
		}catch(Exception e){
			e.getMessage();
			
		}
		
		try {
			System.out.println("Abhi bro");
		}catch(ArithmeticException a) {
			
			a.toString();
		}
		
		try {
			System.out.println("abhay ");
		}catch(InterruptedException i ){
			i.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}