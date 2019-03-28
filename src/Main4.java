public class Main4 {

    int a = 10;
    String fun = "78";

    public void fun() {
        System.out.println("at fun method"); // 2 output
    }

    public static void main(String[] args) {

        Main4 m = new Main4(); // object creation or instance
        System.out.println(m.a);  // 1 output 

        m.fun();
        System.out.println("Hello World!"); // 3 output
        System.out.println("java technology"); // 4 output
    }
}
