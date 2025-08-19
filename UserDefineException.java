package Corejava;

/*
 *----> Customized Exceptions (User Defined Exceptions)<----
 
 	Sometimes we can create our own exception to meet our programming requirements.
 	Such type of exception are called customized exceptions (User defined Exceptions). 
*/


class ShubhamDadaException extends RuntimeException{
	ShubhamDadaException(String s){
		super(s);
	}
}

class PankajBhaiException extends RuntimeException{
	PankajBhaiException(String s){
		super(s);
	}
}

public class UserDefineException {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		
		if(age > 60) {
			throw new ShubhamDadaException(" You Can Do It ");
		}
		else if(age <20) {
			throw new PankajBhaiException(" I Can Do It ");
		}
		else {
			System.out.println(" All the Best...! ");
		}

	}

}
