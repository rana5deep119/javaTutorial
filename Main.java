class Student{
    int age;
    String name;
    public void getdata(){
        System.out.println("name "+name+" "+ "age" + age);
    }
}

public class Main{
    public static void main(String[] args){
        System.out.println("hello world");
        Student s1=new Student();
        s1.age=21;
        s1.name="deepak";
        s1.getdata();
    }
}