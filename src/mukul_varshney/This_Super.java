public class This_Super extends extraclass{
    int a = 555;   //default variable
    public void m1(int a) {
      System.out.println(a);   //10
      System.out.println(super.a);   //777
      System.out.println(this.a);   //555
    }

    public static void main(String[] args) {
        This_Super obj = new This_Super();
        obj.m1(999);   
    }
}

