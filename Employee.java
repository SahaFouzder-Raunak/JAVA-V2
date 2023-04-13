import java.io.*;
public class Employee
{
    static int no;
    public static void print(String[] n, int yoj[], String[] add )
    {
        System.out.println("Name\t\tYear of Joining\t\tAddress");
        for(int i=0; i<no; i++)
        {
            System.out.println(n[i]+"\t\t"+yoj[i]+"\t\t"+add[i]);
        }
    }
    public static void main(String args[])throws Exception//why we write String args when we don't use cmd argument
    {
        //Why scanner doesn't work accepting String array????
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter the number of employees :- ");
        no = Integer.parseInt(br.readLine());
        String name[] = new String[no];
        int year[] = new int[no];
        String address[] = new String[no];
        for(int i=0; i<no; i++)
        {
            System.out.println("Enter the name of number "+(i+1)+" employee :- ");
            name[i] = br.readLine();
            System.out.println("Enter the year of joining of number "+(i+1)+" employee :- ");
            year[i] = Integer.parseInt(br.readLine());
            System.out.println("Enter the address of number "+(i+1)+" employee :- ");
            address[i] = br.readLine();
        }
        print(name,year,address);
    }
}
