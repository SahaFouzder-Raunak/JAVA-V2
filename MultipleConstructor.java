public class MultipleConstructor {
    int id;
    String name;
    String Dept;

    MultipleConstructor(){
        System.out.println("This Constructor is not assign anything");
    }
    MultipleConstructor(int i,String n){
        System.out.println("This Constructor is assigns value of id and name");
        this.id=i;
        this.name=n;
    }
    MultipleConstructor(String N,String D){
        System.out.println("This Constructor is assigns value of dept and name");
        this.name=N;
        this.Dept=D;
    }
    MultipleConstructor(int i){
        System.out.println("This Constructor is assigns value of only id");
        this.id=i;
    }
    MultipleConstructor(String n,int i){
        System.out.println("This Constructor is assigns value of id last and name first");
        this.id=i;
        this.name=n;
    }


    public static void main(String[] args) {
        //MultipleConstructor obj1=new MultipleConstructor();

        //MultipleConstructor obj2=new MultipleConstructor(123,"Debasish");

        //MultipleConstructor obj3=new MultipleConstructor("Debasish","CSE");

        //MultipleConstructor obj4=new MultipleConstructor(123);

        MultipleConstructor obj5=new MultipleConstructor("Debasish",123);

        /*System.out.println(obj1.Dept);
        System.out.println(obj1.id);
        System.out.println(obj1.name);*/

        /*System.out.println(obj2.Dept);
        System.out.println(obj2.id);
        System.out.println(obj2.name);*/

        /*System.out.println(obj3.Dept);
        System.out.println(obj3.id);
        System.out.println(obj3.name);*/

        /*System.out.println(obj4.Dept);
        System.out.println(obj4.id);
        System.out.println(obj4.name);*/

        System.out.println(obj5.Dept);
        System.out.println(obj5.id);
        System.out.println(obj5.name);


    }

}
