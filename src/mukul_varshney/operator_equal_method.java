public class operator_equal_method {

    public static void main(String[] args) {
        double a = 10879;
        double b = 10879;
        double c = 876720;
        System.out.println(a == b);   //true
        System.out.println(a == c);   //false
        String s1 = "Mukul varshney";
        String s2 = "Mukul varshney";
        String s3 = new String("Mukul varshney");
        System.out.println(s1 == s2);   //true
        System.out.println(s1 == s3);   //false
        System.out.println(s1.equals(s3));   //true
        System.out.println(s1.equals(s2));   //true
        System.out.println(s1==s3);   //false
        

}
}
