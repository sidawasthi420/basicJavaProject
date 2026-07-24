package basics;

class TC05_modifiers_default extends TC05_modifiers_2 {

    static int a = 20;

    static void m1(){
        System.out.println("m1 default method");
    }
    public void m2(){   //implement the umimplemented method
      System.out.println("m2 method of TC05_modifiers_default class");
    }

    public static void main(String[] args) {
       TC05_modifiers_2 obj = new TC05_modifiers_default();
       obj.m2();
    }
}
