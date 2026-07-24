package basics;

class TC03_variables implements dummy_interface {

    //Static variables
    static final int a = 45;                    //Its mandatory to assign value to final variable at the time of creation
    static boolean b1 = true;                   //instance variable       //default
    char c1 = 'a';                       //instance variable
    static byte b2 = 127;
    short s1 = -32768;                   //instance variable
    static int i1 = 465;                        //instance variable      //465 ------- 45
    long l1 = 10000l;                    //instance variable
    float f1 = 10.5543534535353f;        //instance variable
    double d1 = 105.577575756757567567567567567556d;        //instance variable
    
    TC03_variables()    //no-argument constructor
    {
        System.out.println("No argument constructor");
    }

    TC03_variables(float a)    //parameterised constructor
    {
        System.out.println(a);
    }

    TC03_variables(int e, int w)    //parameterised constructor
    {
        System.out.println(e+w);
    }

    void m1(){                                      //default access
        int c1;
        int a = 23;    //local variables & this variable is know only to the members present inside m1() method
        //Outside m1() nobody knows this a variable
        System.out.println("m1 method");
        System.out.println(a);  //23
        int c = a+a;   //46
        a = 2344;
    }
    
    @Override
    public void m2(){
        System.out.println("m2 method");
    }

    public static int a1(){
        System.out.println("sid");    //sid
        int a = 20;
        int b = 30;
        int c = a+b;   //50
        return c;
    }

    public static boolean a4(int a, String b, char c, float d, boolean b1){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        return b1;
    }

    public static void main(String[] args) {
       TC03_variables obj = new TC03_variables();
    }
}
