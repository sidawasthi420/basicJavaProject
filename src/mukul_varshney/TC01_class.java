public class TC01_class {

    int a = 10;
    String b = "Hello";

    public void m1 () {
        System.out.println("This is method m1");
    }

    public void m2 () {
        System.out.println("This is method m2");
    }

    public static void main(String[] args) {
        System.out.println("welcome mukul"); 
        TC01_class obj = new TC01_class();
        obj.m1();
        obj.m2();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.a = 100;
        obj.b = "Hello World";
        System.out.println(obj.a);
        System.out.println(obj.b);
    }

}
