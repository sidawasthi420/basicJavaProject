public class Simpleinterest {

    private double principal;
    private double rate;
    private double time;
    private double simpleinterest;

    private void Interest() {
        simpleinterest = (principal * rate * time) / 100;

    }

    public double getinterest(){
        Interest();
        return simpleinterest;
    }

    public void setvalues(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    public static void main(String[] args) {
        Simpleinterest s1 = new Simpleinterest();
        s1.setvalues(1000, 5.5, 2);
        System.out.println("simple interest of the given value will be: " + s1.getinterest());
    }
}
