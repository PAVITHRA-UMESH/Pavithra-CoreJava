package Lab;

import java.util.Scanner;

class Circle extends Shape
	{
	     void draw(){
	        System.out.println("Circle is Drawn");
	    }
	     void erase(){
	        System.out.println("Circle is Erased");
	    }
	}
	class Triangle extends Shape
	{
	     void draw(){
		     System.out.println("Triangle is Drawn");
	    }
	     void erase(){ 
	         System.out.println("Triangle is Erased");
	    }
	}
	class Square extends Shape
	{
	       void draw(){
		      System.out.println("Square is Drawn");
	      }
	       void erase(){
		      System.out.println("Square is Erased");
	      }
	}
 public class Shape {
		void draw(){
		     System.out.println("Shape is Drawn");
		}
		void erase(){
		     System.out.println("Shape is Erased");
		}
	
		public static Shape randshape()
		{
		switch((int)(Math.random()*3))
		{
		case 0: return new Circle();
		case 1: return new Square();
		case 2: return new Triangle();
		default : System.out.println("Default");
		return new Shape();
		}
		}
		public static void main (String arg[])
		{
		Shape shape[] = new Shape[5];
		for(int i = 0;i< shape.length; i++) {
			shape[i] = randshape();
		}
		for(int i= 0;i < shape.length; i++) { 
			shape[i].draw(); 
		}
    }
}