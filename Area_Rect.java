import java.util.Scanner;
public class Area_Rect
{
    double l,b;
    Area_Rect(double l, double b)
    {
        this.l=l;
        this.b=b;
    }
    public double returnArea()
    {
        return l*b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :- ");
        double le = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle :- ");
        double br = sc.nextDouble();
        Area_Rect r = new Area_Rect(le,br);
        double ar = r.returnArea();
        System.out.println("The area of the rectangle is :- " + ar + " square units");
    }
}
