public class TC04_constructor {
    
    int a;  //instance variable
    int b;  //instance variable

    public void m() {
        System.out.println("This is method m");   // default constructor is called automatically when object is created
    }


    public TC04_constructor() {   //constructor with no parameter
    a = 10;
    b = 20;
    }

    public TC04_constructor(int x, int y) {   //constructor with parameter
        a = x;
        b = y;
    }

    public static void main(String[] args) {
        TC04_constructor obj1 = new TC04_constructor();   //calling constructor with no parameter
        System.out.println(obj1.a);   //10
        System.out.println(obj1.b);   //20

        TC04_constructor obj2 = new TC04_constructor(100, 200);   //calling constructor with parameter
        System.out.println(obj2.a);   //100
        System.out.println(obj2.b);   //200
    }

}
