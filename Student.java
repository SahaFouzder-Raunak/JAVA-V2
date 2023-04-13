public class Student
{
    String name,address;
    int roll_no,ph_no;
    Student(String name,String address,int roll_no,int ph_no)
    {
        this.name=name;
        this.roll_no=roll_no;
        this.address=address;
        this.ph_no=ph_no;
        System.out.println("Name :- "+this.name);
        System.out.println("Roll no. :- "+this.roll_no);
        System.out.println("Address :- "+this.address);
        System.out.println("Phone number :- "+this.ph_no);
    }

    public static void main(String args[])
    {
        Student s1 = new Student("Sam","Rajkot",2,76325689);
        Student s2 = new Student("John","Bundi",4,94325739);
    }
}
