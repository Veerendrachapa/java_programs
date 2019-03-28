public class Main3 {

    int a = 10;
    String fun = "78";

    public void fun() {
        System.out.println("at fun method");
    }

    public static void main(String[] args) {
//        syntax for object creation
//        classname reference = new classname();
//        classname ---> Main3
        Main3 m = new Main3(); // object creation or instance
        System.out.println(m.a);  
        m.a = 100;

        System.out.println(m.a); 

        Main3 m1 = new Main3();   // object creation
        System.out.println(m1.a); 

        m1.a = 1000;
        System.out.println(m1.a); 

        m.fun();
        System.out.println("Hello World!");
        System.out.println("java technology");
    }
}
