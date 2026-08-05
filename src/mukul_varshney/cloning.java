public class cloning {
    public static void main(String[] args) {
        int [] arr = { 10, 20, 30, 40, 50 }; //declaration, instantiation and initialization of array
        int [] arr2 = arr.clone(); //cloning of array
        arr[0] = 100; //modification of original array

        System.out.println(arr2[0]); //10
        System.out.println(arr[0]); //100

}

}
