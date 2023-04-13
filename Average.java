import java.util.Scanner;
public class Average
{
    static double arr[] = new double[4];
    public static void calculate(double s)
    {
        System.out.println("The average of the numbers is :- "+(s/3.0));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 numbers :- ");
        arr[3]=0;
        for(int i=0; i<3; i++)
        {
            arr[i]=sc.nextDouble();
            arr[3]=arr[3]+arr[i];
        }
        calculate(arr[3]);

    }
}
