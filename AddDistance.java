import java.util.Scanner;
public class AddDistance
{
    public static void add(double f1,double i1,double f2,double i2)
    {
        double f=(f1+f2);
        double i=(i1+i2);
        if(i>=12.0)
        {
            double a=i/12.0;
            f=f+a;
            i=i%12.0;
        }
        System.out.println("Total distance is :- "+f+" feet and "+i+" inches");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //why system.in inside Scanner class constructor?
        System.out.println("Enter the first length in feet; if null enter 0 :- ");
        double f1 = sc.nextDouble();
        System.out.println("Enter the first length in inches; if null enter 0 :- ");
        double i1 = sc.nextDouble();
        while(i1>=12.0)
        {
            System.out.println("Inches must be less than 12");
            System.out.println("Enter the first length in feet; if null enter 0 :- ");
            i1 = sc.nextDouble();
        }
        System.out.println("Enter the second length in feet; if null enter 0 :- ");
        double f2 = sc.nextDouble();
        System.out.println("Enter the second length in inches; if null enter 0 :- ");
        double i2 = sc.nextDouble();
        while(i2>=12.0)
        {
            System.out.println("Inches must be less than 12");
            System.out.println("Enter the second length in feet; if null enter 0 :- ");
            i2 = sc.nextDouble();
        }
        add(f1,i1,f2,i2);
    }
}
