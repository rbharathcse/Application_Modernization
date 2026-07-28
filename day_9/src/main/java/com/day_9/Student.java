package com.day_9;

public class Student {
     private String name;
     private String rollNo;
     
     private Address address;
     
     public Student(Address address) {
	    System.out.println("Student Object Created");
	}
     public void setName(String name) {
		this.name = name;
	}
     public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
     
     public void getStudentDetails() {
    	 
    	 System.out.println("Name : "+ name +" , "+"Roll No :"+ rollNo + address.getAddress());
		
	}
}
