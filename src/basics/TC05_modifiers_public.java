package basics;
             //Child (Sub class)
public class TC05_modifiers_public extends TC05_modifiers_protected {

    public static void main(String[] args) {
        int a = 34;
        int b = 23;
        int c = 34;
        int fg;                       //declaration
        String s1 = "siddhant";
        String s2 = "siddhant";       //initialization
        String s3 = new String("siddhant");  //instantiation

        System.out.println(a == b);   //false
        System.out.println(a == c);   //true
        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1.equals(s3));  //true
        System.out.println(s1==s3);  //false
    }
}