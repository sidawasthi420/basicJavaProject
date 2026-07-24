package basics;

class TC02_datatypes {

    //Static variables
    boolean b1 = true; 
    char c1 = 'a';
    byte b2 = 127;
    short s1 = -32768;
    int i1 = 465476434;
    long l1 = 10000l;
    float f1 = 10.5543534535353f;
    double d1 = 105.577575756757567567567567567556d;
    
    public void m1(){
        System.out.println("m1 method");
    }
    
    public static void m2(){
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
       System.out.println(TC03_variables.b2);
       System.out.println(TC03_variables.i1);
       TC03_variables.m2();
      // m2();
    }
}
