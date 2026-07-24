package basics;

class TC01_class {

    int abs = 20;

    public void m112(){
        System.out.println("This is m1 method");
    }
    
    public static void main(String[] args) {
       TC02_datatypes obj = new TC02_datatypes();

       TC01_class obj1 = new TC01_class();
       obj.m1();     //m1 method
       obj.m2();     //m2 method

       obj1.m112();   //This is m1 method

       System.out.println(obj.b1);   //true
    }
}
