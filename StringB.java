package onevideoinjava;

public class StringB {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Pankaj");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append(" Deshmukh");
		
		System.out.println(sb);
		
		sb.deleteCharAt(6);
		System.out.println(sb);
		
		sb.insert(6, " Sanjay ");
		System.out.println(sb);
		
		sb.setLength(30);
		System.out.println(sb);



	}

}
