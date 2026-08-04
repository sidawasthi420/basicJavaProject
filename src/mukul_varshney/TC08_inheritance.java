public class TC08_inheritance {
    public int a = 10;   //public variable
    private int b = 20;  //private variable
    protected int c = 30; //protected variable
    int d = 40;          //default variable

    public void m1() {
        System.out.println("This is method m1");
    }
    protected void m2() {
        System.out.println("This is method m2");
    }
    private void m3() {
        System.out.println("This is method m3");
    }
    public void m4() {
        System.out.println("This is method m4");
    }
    public static void main(String[] args) {
        TC08_inheritance obj = new TC08_inheritance();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();   
        System.out.println(obj.a);   //10
        System.out.println(obj.b);   //20   
        System.out.println(obj.c);   //30
        System.out.println(obj.d);   //40
    }
}
