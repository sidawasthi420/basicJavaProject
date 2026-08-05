public class TC06_non_access_modifiers {
    
    final int a = 10;   //final variable
    static int b = 20;  //static variable
    volatile int c = 30; //volatile variable
    transient int d = 40; //transient variable

    public void m1() {
        System.out.println("This is method m1");
    }

    static void m2() {
        System.out.println("This is method m2");
    }

    public static void main(String[] args) {
        TC06_non_access_modifiers obj = new TC06_non_access_modifiers();
        System.out.println(obj.a);   //10
        System.out.println(b);       //20
        System.out.println(obj.c);   //30
        System.out.println(obj.d);   //40

        obj.m1();   //This is method m1
        m2();       //This is method m2
    }
}
