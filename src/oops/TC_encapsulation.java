package oops;

class TC_encapsulation {

    private double num1;        //user defined value 1
    private double num2;        //user defined value 2
    
    private double result;  //0.0

    public void setValues(double value1, double value2){
        num1 = value1;
        num2 = value2;
    }

    private void addition()
    {
        result = num1+num2;
    }

    private void substraction()
    {
        result = num1-num2;
    }

    private void multiplication()
    {
        result = num1*num2;
    }

    private void division()
    {
        result = num1/num2;
    }

    public double getAddition(){
        addition();  
        return result; //num1+num2
    }

    public double getSubstraction(){
        substraction();
        return result;
    }

    public double getMultiplication(){
        multiplication();
        return result;
    }

    public double getDivision(){
        division();
        return result;
    }
}