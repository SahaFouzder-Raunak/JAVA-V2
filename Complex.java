import java.util.Scanner;
public class Complex
{
    public static void Add(double a, double b,double c, double d)
    {
        double p=a+c;
        double q=b+d;
        System.out.println("The sum of the complex numbers is :- "+p+"+"+q+"i");
    }
    public static void Subtract(double a, double b,double c, double d)
    {
        double p=a-c;
        double q=b-d;
        System.out.println("The difference of the complex numbers is :- "+p+"+"+q+"i");
    }
    public static void Multiply(double a, double b,double c, double d)
    {
        double p=(a*c)-(b*d);
        double q=(a*d)+(b*c);
        System.out.println("The product of the complex numbers is :- "+p+"+"+q+"i");
    }
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the real part of the 1st complex number :- ");
        double r1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the 1st complex number :- ");
        double i1 = sc.nextDouble();
        System.out.println("The 1st complex number entered is :- "+r1+"+"+i1+"i");
        System.out.println("Enter the real part of the 2nd complex number :- ");
        double r2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the 2nd complex number :- ");
        double i2 = sc.nextDouble();
        System.out.println("The 2nd complex number entered is :- "+r2+"+"+i2+"i");
        Add(r1,i1,r2,i2);
        Subtract(r1,i1,r2,i2);
        Multiply(r1,i1,r2,i2);
    }
}
