package com.org.day2;

public class Man {
	public String name;
	   public int age;
	   public Man(String name, int age){
	      this.name = name;
	      this.age = age;
	   }
	   public void displayPerson() {
	      System.out.println("Data of the Person class: ");
	      System.out.println("Name: "+this.name);
	      System.out.println("Age: "+this.age);
	   }
	   public class Student extends Man {
		   public String branch;
		   public int Student_id;

		   public Student(String name, int age, String branch, int Student_id){
		   super(name, age);
		      this.branch = branch;
		      this.Student_id = Student_id;
		   }
		   public void displayStudent() {
		      System.out.println("Data of the Student class: ");
		      System.out.println("Name: "+super.name);
		      System.out.println("Age: "+super.age);
		      System.out.println("Branch: "+this.branch);
		      System.out.println("Student ID: "+this.Student_id);
		   }
	public static void main(String[] args) {
		Student s = new Student("Shubham",22,"CSE",101);

		s.displayStudent();


	}

}
