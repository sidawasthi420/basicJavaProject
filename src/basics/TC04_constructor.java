package basics;

class TC03_variables {

    //Static variables
    static boolean b1 = true;                   //instance variable
    char c1 = 'a';                       //instance variable
    static byte b2 = 127;
    short s1 = -32768;                   //instance variable
    static int i1 = 465;                        //instance variable      //465 ------- 45
    long l1 = 10000l;                    //instance variable
    float f1 = 10.5543534535353f;        //instance variable
    double d1 = 105.577575756757567567567567567556d;        //instance variable
    
    public static void m1(){
        int c1;
        int a = 23;    //local variables & this variable is know only to the members present inside m1() method
        //Outside m1() nobody knows this a variable
        System.out.println("m1 method");
        System.out.println(a);  //23
        int c = a+a;   //46
        a = 2344;
    }
    
    public static void m2(){
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
       boolean returnValue = a4(23, "sid", 'w', 12.23f, false);  //returnValue = false
       System.out.println(returnValue);
       //System.out.println(a4(23, "sid", 'w', 12.23f, false));
    }
}
