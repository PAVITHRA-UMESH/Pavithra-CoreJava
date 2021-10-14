package Lab;

   abstract class debuggable{
    abstract void dump();
   }
  class X extends debuggable{
        private int a,b,c;
        public X( int aa,int bb,int cc)
       {
        a = aa;
        b = bb;
        c = cc;
       }
        void dump()
       {
         System.out.println( "a= " + a +" b= " +b+ " c= " +c);
       }
     }
  class Y extends debuggable{
      private int x,y,z;
      public Y( int xx,int yy,int zz)
     {
      x = xx;
      y = yy;
      z = zz;
     }
      void dump()
     {
       System.out.println( "x= " + x+" y= " +y+ " z= " +z);
     }
   }
  class Z extends debuggable{
      private int p,q,r;
      public Z( int pp,int qq,int rr)
     {
      p = pp;
      q = qq;
      r = rr;
     }
      void dump()
     {
       System.out.println( "p= " + p +" q= " +q+ " r= " +r);
     }
   }
public class AbstDemo
{
    public static void main(String arg[])
    {
     X x=new X(1,2,3);
     Y y=new Y(5,10,15);
     Z z=new Z(9,4,11);
     x.dump();
     y.dump();
     z.dump();
    }
}


