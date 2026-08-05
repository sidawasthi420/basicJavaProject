public class TC02_datatypes {

    //static variables for different data types
    boolean a = true;
    char b = 'M';
    byte c = 10;
    short d = 20;
    int e = 30;
    long f = 40L;
    float g = 50.5f;
    double h = 60.6;

    public void m1 () {
        System.out.println("This is method m1");
    }
    public void m2 () {
        System.out.println("This is method m2");
    } 
    public static void main(String[] args) {

        System.out.println(TC03_variables.c);
        System.out.println(TC03_variables.e);
        TC03_variables.m2();
      //TC02_datatypes obj = new TC02_datatypes();
     // System.out.println( obj.a);
      //System.out.println( obj.b);
     // System.out.println( obj.c);
     //  System.out.println( obj.d);
     // System.out.println( obj.e);
      //System.out.println( obj.f);
      //System.out.println(obj.g);
      //System.out.println( obj.h);
     // obj.m1();
      //obj.m2();

}
}