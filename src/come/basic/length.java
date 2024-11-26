package come.basic;
/*
 * The length & breadth of a rectangle and radius of a circle are 
input through the keyboard. Write a program to calculate the 
area & perimeter of the rectangle, and the area & 
circumference of the circle
 */

public class length {
public static void main(String[] args) {
	
	int  length,breadth,radius,rectangle, circle;
	
      length=60;
      breadth=50;
      radius=40;
      rectangle=30;
      circle=100;
      
       int rectangle_area = 60 * 50;
    int rectangle_perimeter = 60 + 50;

    		double Math_Pi=3.14;
    		
    		double circle_area = 3.14 * 40;
    		double circle_circumference = 3.14 * 40;
    		
    		System.out.println("Area of the rectangle:"+ rectangle_area);
    		System.out.println("Perimeter of the rectangle:"+rectangle_perimeter);
    		System.out.println("Area of the circle:"+circle_area);
    		System.out.println("Circumference of the circle:"+circle_circumference);
    		
    		
    		
   
}
}
