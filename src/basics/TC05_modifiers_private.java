package basics;

public class TC05_modifiers_private {

    private int a = 20;

    public void m1(){
        System.out.println("m1 default method");
    }

    public static void main(String[] args) {
        TC05_modifiers_private obj = new TC05_modifiers_private();
        System.out.println(obj.a);
    }
}
