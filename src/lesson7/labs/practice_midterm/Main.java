package lesson7.labs.practice_midterm;

public class Main {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.display();
        myClass.defaultDisplay1();
        //Interface1.staticMethod();
        //myClass.defaultDisplay2();
    }
}

interface Interface1{
    void display();
    //void defaultDisplay1();
    default void defaultDisplay1(){
        System.out.println("interface 1 default display");
    }
    static int staticMethod(){
        System.out.println("interface 1 static method");
        return 1;
    }
}

interface Interface2{
    void display();
    void defaultDisplay1();
//    default void defaultDisplay2(){
//        System.out.println("interface 2 default display");
//    }

    static int staticMethod(){
        System.out.println("interface 1 static method");
        return 1;
    }
}
interface Interface3 extends Interface1,Interface2{
    void defaultDisplay1();
}

class MySuperClass{
    public void display(){
        System.out.println("super class display method");
    }
}

class MyClass extends MySuperClass implements Interface1,Interface2{
//    @Override
//    public void display(){
//        System.out.println("display method");
//    }

    @Override
    public void defaultDisplay1(){
        System.out.println("implemented default display method");
    }
}