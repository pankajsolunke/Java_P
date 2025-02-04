package p_W3;

public class Stu_array {
	int S_id;
	String S_n;
	float S_m;
	String S_add;
	
	public Stu_array(int s_id, String s_n, float s_m, String s_add) {
		S_id = s_id;
		S_n = s_n;
		S_m = s_m;
		S_add = s_add;
	}

//	@Override
//	public String toString() {
//		return "Stu_array [S_id=" + S_id + ", S_n=" + S_n + ", S_m=" + S_m + ", S_add=" + S_add + "]";
//	}
	

	public int getS_id() {
		return S_id;
	}

	public String getS_n() {
		return S_n;
	}

	public float getS_m() {
		return S_m;
	}

	public String getS_add() {
		return S_add;
	}
	
	
	
	public static void main(String[] args) {
		Stu_array [] list = {new Stu_array(01, "abhi", 89.80f, "MH-12"), new Stu_array(02, "pankaj", 35.90f, "MH-20")
				,new Stu_array(03, "vishal", 46.80f, "MH-19"), new Stu_array(04, "sager_D", 99.90f, "MH-21")};
		
		for(int i=0;i < list.length;i++) {
			System.out.println(list[i].getS_id()+"  "+list[i].getS_n()+"  "+list[i].getS_m()+"  "+list[i].getS_add());
		}
	}
	
}
