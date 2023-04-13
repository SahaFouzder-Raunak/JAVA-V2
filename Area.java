import java.util.Scanner;
public class Area
{
    double len,breadth;
    public void setDim(double a,double b)
    {
        len=a;
        breadth=b;
    }
    public double getArea()
    {
        return len*breadth;
    }
    public static void main(String args[])
    {
        Area ar = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :- ");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle :- ");
        double br = sc.nextDouble();
        ar.setDim(l,br);
        System.out.println("The area of the rectangle is :- "+ar.getArea()+" square units");

    }
}
