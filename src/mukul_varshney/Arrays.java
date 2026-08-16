public class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[5]; //declaration and instantiation of array
        arr[0] = 10; //initialization of array
        arr[1] = 20; 
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int[] arr2 = { 60, 70, 80, 90, 100 }; //declaration, instantiation and initialization of array
        System.out.println("Elements of the  first array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Elements of the second array are: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
           
        }
        System.out.println("Length of the first array is: " + arr.length);  
        System.out.println("Length of the second array is: " + arr2.length);
    }
}
