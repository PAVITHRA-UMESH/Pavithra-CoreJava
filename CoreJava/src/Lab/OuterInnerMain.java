package Lab;

class Outer{
String s1 = ("This is Outer Class");
  void display(){
    System.out.println(s1);
  }

class Inner{
String s2 =("This is Inner Class");
  void display(){
    System.out.println(s2);
  }
 }
}
public class OuterInnerMain {

	public static void main(String[] args) {
		
		Outer.Inner obj=new Outer().new Inner();
		obj.display();
		Outer outer=new Outer();
		outer.display();
	}

}
