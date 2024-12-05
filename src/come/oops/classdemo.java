package come.oops;

/*
 * oops: object oriented programming
 * 
 *  adv:
 *  1. code written in organize manner
 *  2. code re usability
 *  
 *  concept of oops:
 *  
 *  1.class:
 *  class is a collection of data member and member function
 *  2.object:
 *  object gives permission to access functionality of class
 *  3.inheritance:
 *  4.encapsulation:
 *  5.polymorphism
 *  6.abstraction
 * 
 */

class student123{
	int id;
	String name;
	
	public void setData() {
		id=123;
		name="prachi";
	}
	
	public void show() {
		System.out.println("id is:"+id);
		System.out.println("name is:"+name);
	}
}
public class classdemo {
	public static void main(String[] args) {
		//class_name obj_name=new class_name
		
		student123 s1=new student123();
		
		s1.setData();
		s1.show();
		
	}

}
