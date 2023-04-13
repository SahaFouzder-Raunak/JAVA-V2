import java.util.Scanner;
public class Rectangle
{
    double l,b;
    Rectangle(double l, double b)
    {
        this.l=l;
        this.b=b;
    }
    public double[] Area()
    {
        double results[] = new double[3];
        results[0]=l;
        results[1]=b;
        results[2]=l*b;
        return results;
    }
    public static void main(String args[])
    {
/*        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :- ");
        double le=sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle :- ");
        double br=sc.nextDouble();*/
        Rectangle r1=new Rectangle(4,5);
        double acc_results[] = r1.Area();
        System.out.println("The length of the rectangle is :- "+acc_results[0]+" units");
        System.out.println("The breadth of the rectangle is :- "+acc_results[1]+" units");
        System.out.println("The area of the rectangle is :- "+acc_results[2]+" square units");
        Rectangle r2=new Rectangle(5,8);
        double acc_results1[] = r2.Area();
        System.out.println("The length of the rectangle is :- "+acc_results1[0]+" units");
        System.out.println("The breadth of the rectangle is :- "+acc_results1[1]+" units");
        System.out.println("The area of the rectangle is :- "+acc_results1[2]+" square units");
    }
}
