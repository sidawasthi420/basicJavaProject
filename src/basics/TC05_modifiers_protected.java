package basics;

public class TC05_modifiers_protected {

    public void m1(){
        System.out.println("m1 default method");
    }

    public static void main(String[] args) {
        TC05_modifiers_protected obj = new TC05_modifiers_protected();
        System.out.println(obj.a);
    }
}
