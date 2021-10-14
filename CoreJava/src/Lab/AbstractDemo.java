package Lab;

   abstract class Shapes{  
      abstract void draw();  
     } 
   
   class Rectangle extends Shapes{  
     void draw(){
    	 System.out.println("Drawing Rectangle!!!");
    	}  
     }  
   class Pyramid extends Shapes{  
      void draw(){
    	  System.out.println("Drawing Pyramid!!!");
    	 }  
     }  

class AbstractDemo{  
	
      public static void main(String args[]){ 
    	  
       Shapes s=new Pyramid();  
       s.draw();  
      }  
}  

