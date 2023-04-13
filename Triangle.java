public class Triangle
{
    int a=3,b=4,c=5,p;
    double s,ar;
    Triangle()
    {
        p=a+b+c;
        s=p/2.0;
        ar=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("Perimeter of the triangle is :- "+p+ " units");
        System.out.println("Area of the triangle is :- "+ar+ " square units");

    }

    public static void main(String args[])
    {
        Triangle t = new Triangle();
    }
}
