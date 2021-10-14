package Lab;

public class Point
{
     private int x;
     private int y;
     public Point ( ) { }
     public Point (int x, int y)
    {
      this.x = x;
      this.y = y;
    }
     public void setX(int x)
    {
      this.x = x;
    }
    public void setY (int y)
    {
      this.y = y;
    }
    public void setXY (int x, int y)
    {
     this.x = x;
     this.y = y;
    }
    public int getX( )
    {
      return x;
    }
    public int gety ( )
    {
      return y;
    }
    public int addXY ( )
    {
      return (x + y);
    }
    public void display( )
    {
    System.out.println (x);
    System.out.println (y);
    }
    public double distance (Point p2)
    {
    return(Math.sqrt( (x-p2.x)* (x-p2.x) + (y-p2.y) * (y-p2.y)) );
    }
    
    public static void main(String args[]) {
    	
    	Point point1=new Point();
    	Point point2=new Point(5,10);
    	point1.setX(3);
    	point1.setY(6);
    	point1.getX();
    	point1.gety();
    	point1.setXY(8,9);
    	point1.addXY();
    	double a = point1.distance(point2);
    	double b = point2.distance(point1);
    	
    	System.out.println("Distance between Point1 and Point2 is"+a);
    	
    	System.out.println("--------------------------------------------------------");
    	
    	System.out.println("Points of Point1 are : ");
    	point1.display();
    	
    	System.out.println("Points of Point2 are : ");
    	point2.display();
  
    	
    	}
    
}
    