import java.util.Scanner;
public class Matrix
{

    static int row1,column1,row2,column2;

    Matrix(int r1,int c1,int r2,int c2)
    {
        row1=r1;
        column1=c1;
        row2=r2;
        column2=c2;
    }
    static int m1[][] = new int[row1][column1];
    static int m2[][] = new int[row2][column2];
    static int sum[][] = new int[row1][column1];

    public static void getRow()
    {
        System.out.println("The number of rows for matrix 1 are :- "+row1);
        System.out.println("The number of rows for matrix 2 are :- "+row2);
    }
    public static void getColumn()
    {
        System.out.println("The number of columns for matrix 1 are :- "+column1);
        System.out.println("The number of columns for matrix 2 are :- "+column2);
    }
    public static void setElement()
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the elements :-");
        for(int i=0; i<row1; i++)
        {
            for(int j=0; j<column1; j++)
            {
                System.out.print("Element at "+i+"th row and "+j+"th column for matrix 1 is :-");
                m1[i][j] = sc2.nextInt();
            }
        }
        for(int i=0; i<row2; i++)
        {
            for(int j=0; j<column2; j++)
            {
                System.out.print("Element at "+i+"th row and "+j+"th column for matrix 2 is :-");
                m2[i][j] = sc2.nextInt();
            }
        }
    }
    public static void m_Add()
    {
        if (row1 == row2 && column1 == column2) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    sum[i][j] = m1[i][j] + m2[i][j];
                    if(j==(column1-1))
                        System.out.println("");
                    else
                        System.out.println(sum[i][j]);
                }
            }

        } else {
            System.out.println("Matrices cannot be added");
        }
    }
    public static void multiply()
    {

    }

    public static void main(String args[])
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number of rows for matrix 1 :- ");
        int r1 = sc1.nextInt();
        System.out.println("Enter the number of columns for matrix 1 :- ");
        int c1 = sc1.nextInt();
        System.out.println("Enter the number of rows for matrix 2 :- ");
        int r2 = sc1.nextInt();
        System.out.println("Enter the number of columns for matrix 2 :- ");
        int c2 = sc1.nextInt();
        Matrix mat = new Matrix(r1,c1,r2,c2);
        getRow();
        getColumn();
        setElement();
        m_Add();
    }
}
