package com.java.collection;

import java.util.List;
import java.util.ArrayList;

public class EmployeeColl {
	int EmpId;
	String EmpDept;
	String EmpName;
	String EmpAddress;
	
	public void setEmpId(int EmpId) {
		this.EmpId = EmpId;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpDept(String EmpDept) {
		this.EmpDept = EmpDept;
	}
	public String getEmpDept() {
		return EmpDept;
	}
	public void setEmpName(String EmpName) {
		this.EmpName = EmpName;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpAddress(String EmpAddress) {
		this.EmpAddress = EmpAddress;
	}
	public String getEmpAddress() {
		return EmpAddress;
	}
	
	
	public static void main(String[] args) {
		
		EmployeeColl emp1 = new EmployeeColl();
		
		emp1.setEmpId(101);
		emp1.setEmpDept("Java Developer");
		emp1.setEmpName("Pankaj");
		emp1.setEmpAddress("Pune");
		
		EmployeeColl emp2 = new EmployeeColl();
		
		emp2.setEmpId(102);
		emp2.setEmpDept("Devops");
		emp2.setEmpName("Devam");
		emp2.setEmpAddress("Prayagraj");
		
		EmployeeColl emp3 = new EmployeeColl();
		
		emp3.setEmpId(103);
		emp3.setEmpDept("Tester");
		emp3.setEmpName("Deepak");
		emp3.setEmpAddress("Indore");
		
		EmployeeColl emp4 = new EmployeeColl();
		
		emp4.setEmpId(104);
		emp4.setEmpDept("Data analyst");
		emp4.setEmpName("Deepanshu");
		emp4.setEmpAddress("Delhi");
		
		EmployeeColl emp5 = new EmployeeColl();
		
		emp5.setEmpId(105);
		emp5.setEmpDept("Web Developer");
		emp5.setEmpName("Prateeti");
		emp5.setEmpAddress("Indore");
		
		EmployeeColl emp6 = new EmployeeColl();
		
		emp6.setEmpId(106);
		emp6.setEmpDept("Full Stack Developer");
		emp6.setEmpName("Shree");
		emp6.setEmpAddress("Indore");
		
		List<EmployeeColl> list = new ArrayList();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		
		for(int i = 0; i<list.size();i++) {
			EmployeeColl e1 = list.get(i);
			System.out.println(e1.getEmpId());
			System.out.println(e1.getEmpDept());
			System.out.println(e1.getEmpName());
			System.out.println(e1.getEmpAddress()+"\n");
		}
	}
}
		
		
		
//		EmployeeColl e1 = list.get(0);
//		EmployeeColl e2 = list.get(1);
//		EmployeeColl e3 = list.get(2);
//		EmployeeColl e4 = list.get(3);
//		EmployeeColl e5 = list.get(4);
//		EmployeeColl e6 = list.get(5);
		
//		for(int i = 0; i < 1; i++) {
//			
//			System.out.println(e1.getEmpId());
//			System.out.println(e1.getEmpDept());
//			System.out.println(e1.getEmpName());
//			System.out.println(e1.getEmpAddress()+"\n");
//			
//			System.out.println(e2.getEmpId());
//			System.out.println(e2.getEmpDept());
//			System.out.println(e2.getEmpName());
//			System.out.println(e2.getEmpAddress()+"\n");
//
//			System.out.println(e3.getEmpId());
//			System.out.println(e3.getEmpDept());
//			System.out.println(e3.getEmpName());
//			System.out.println(e3.getEmpAddress()+"\n");
//
//			System.out.println(e4.getEmpId());
//			System.out.println(e4.getEmpDept());
//			System.out.println(e4.getEmpName());
//			System.out.println(e4.getEmpAddress()+"\n");
//
//			System.out.println(e5.getEmpId());
//			System.out.println(e5.getEmpDept());
//			System.out.println(e5.getEmpName());
//			System.out.println(e5.getEmpAddress()+"\n");
//
//			System.out.println(e6.getEmpId());
//			System.out.println(e6.getEmpDept());
//			System.out.println(e6.getEmpName());
//			System.out.println(e6.getEmpAddress()+"\n");
//
//		}
		
//		System.out.println(list.get(0).getEmpName());
		

