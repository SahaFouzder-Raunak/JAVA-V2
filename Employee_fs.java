import java.util.Scanner;

//can this program be done by generating multiple objects
// and keeping salary and hrs as states of class?
public class Employee_fs
{
    static int no;
    public static void getInfo(double[] s,double[] h)
    {
        for(int i=0; i<no; i++)
        {
            double sal1 = AddSal(s[i]);
            double sal2 = AddWork(h[i]);
            double sal = sal1 + sal2;
            System.out.println("Final Salary of Employee "+(i+1)+" is :- $"+sal);
        }
    }
    public static double AddSal(double a)
    {
        if(a<500)
        {
            return (a+10.0);
        }
        else
        {
            return a;
        }
    }
    public static double AddWork(double h)
    {
        if(h>6)
        {
            return 5.0;
        }
        else
        {
            return 0.0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of employees :- ");
        no = sc.nextInt();
        double sal[] =  new double[no];
        double hrs[] = new double[no];
        for(int i=0; i<no; i++)
        {
            System.out.println("Enter the salary of Employee "+(i+1)+" :-");
            sal[i] = sc.nextDouble();
            System.out.println("Enter the hours of work /day of Employee "+(i+1)+" :-");
            hrs[i] = sc.nextDouble();
        }
        getInfo(sal,hrs);
    }
}
