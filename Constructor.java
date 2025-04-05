package onevideoinjava;
class Student{
	private int classno;
	private String Sname;
	
	public Student()//----> default constructor
	{
		classno = 10;
		Sname = "abhishek";
		System.out.println("default constructor");
	}
	public Student(int c , String n)//----> parameterized constructor
	{
		classno = c;
		Sname = n;
	}
	public int getno() {
		return classno;
	}
	public String getsname() {
		return Sname;
	}
}
public class Constructor {
	public static void main(String args[]) {
		Student s = new Student();
		Student s1 = new Student(11,"nitin");
		System.out.println(s.getsname() + " : " + s.getno());
		System.out.println(s1.getsname() + " : " + s1.getno());

	}
}
