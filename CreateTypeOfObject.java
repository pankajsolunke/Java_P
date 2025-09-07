package Corejava;

class Test1 implements Cloneable{ //must be implement Cloneable
	Test1(){
		System.out.println("run a Constructors");
	}
//	3).By Using Clone():
//	//Override clone() and make it public
//	@Override
//	public Object clone() throws CloneNotSupportedException{
//		return super.clone(); //call object's clone()
//	}
//	Test1 t1 = new Test1();
//	Test1 t2 = (Test1) t1.clone();
}
public class CreateTypeOfObject {

	public static void main(String[] args) {
/*	1).By Using new Operator:
		Test1 t = new Test1();
	
	2).By Using newInstance() :(Reflection Mechanism)
		Test1 t = (Test1) Class.forName("Test1").newInstance();
		newInstance() can only call the no-arg constructor.
		Since Java 9, newInstance() is deprecated
		
	3).By Using Clone(): -->must be implement Cloneable
		//Override clone() and make it public
		@Override
		public Object clone() throws CloneNotSupportedException{
			return super.clone(); //call object's clone()
		}
		Test1 t1 = new Test1();
		Test1 t2 = (Test1) t1.clone();
	
	4).By Using Factory methods:
		Runtime r = Runtime.getRuntime();
		DateFormat df = DateFormat.getInstance();
		
	5).By Using Deserialization:
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Test t = (Test)ois.readObject();
	
*/
	Test1 t1 = new Test1();
		
	}

}
