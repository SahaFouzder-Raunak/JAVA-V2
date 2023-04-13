public class Triangle_with_cons
{
    int p;
    double s,ar;
    Triangle_with_cons(int a,int b,int c)
    {
        p=a+b+c;
        s=p/2.0;
        ar=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("Perimeter of the triangle is :- "+p+ " units");
        System.out.println("Area of the triangle is :- "+ar+ " square units");

    }

    public static void main(String args[])
    {
        Triangle_with_cons t = new Triangle_with_cons(3,4,5);
    }
}
