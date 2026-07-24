package oops;

class TC05_modifiers_3 {

    public static void main(String[] args) {
      
       TC_encapsulation obj = new TC_encapsulation();
       obj.setValues(6.8,3.4);
       System.out.println(obj.getAddition());
       System.out.println(obj.getSubstraction());
       System.out.println(obj.getDivision());
       System.out.println(obj.getMultiplication());
    }
}
