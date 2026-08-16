public class TC03_variables {

     boolean a = true;       //instance variable
    char b = 'M';           //instance variable
    static byte c = 10;     //static variable
    short d = 20;           //instance variable
    static int e = 30;      //static variable
    long f = 40L;           //instance variable
    float g = 50.5f;        //instance variable
    double h = 60.6;        //instance variable

    public static void m1 () {
        int e1 = 100; //local variable & this variable is know only to the members present inside m1(1
        int o = 8; //local variable & this variable is know only to the members present inside m1()
        //outside m1() nobody knows this a variable 
        System.out.println("This is method m1");
        System.out.println(o);    //8
        int e = o+o;
        o = 2344;
    }
    public static void m2 () {
        System.out.println("This is method m2");
    }
    public static void main(String[] args) {
        TC03_variables obj = new TC03_variables();   //instance variable can be accessed by creating object of the class
        System.out.println( obj.e);       //30
        obj.e = 767;      
        System.out.println( obj.e);   //767

        TC03_variables obj2 = new TC03_variables();
        System.out.println( obj2.e);   //767 
        System.out.println( obj.e);    //767
        System.out.println( e);    
        System.out.println( c);
        obj2.e = 888;
        System.out.println( obj2.e);

        TC03_variables obj3 = new TC03_variables();
        System.out.println( obj3.e);   //888



}
}