public class multidimentional_array {

    public static void main(String[] args) {
        int[][] arr = new int[3][3]; //declaration and instantiation of 2D array
        arr[0][0] = 10; //initialization of 2D array
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;

        System.out.println("Elements of the 2D array are: ");
        for (int i = 0; i <= arr.length-1; i++) {            //outer loop for rows
            for (int j = 0; j < arr[i].length; j++) {        //inner loop for columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    } 
}
