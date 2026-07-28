package basics;
             //Child (Sub class)
public class TC06_arrays {


    public int[] arrayMethod(int[] array1){
      System.out.println("Size of an array:- " + array1.length);
      for(int i= 0; i<= array1.length-1; i+=1)
        {
          System.out.println(array1[i]);
        }

        int[] arr1 = {345,567,67,45};
        return arr1;
    }

    public static void main(String[] args) {

          // int[][] arr = new int[3][3];
          // arr[0][0] = 34;
          // arr[0][1] = 56;
          // arr[1][2] = 565;
          // arr[2][1] = 545;
          //                //3<=2
          // for(int i = 0; i<=arr.length-1; i++)       //arr.length == row
          // {

          //     //i=1
          //     for(int j = 0; j<=2; j++)       //column  //j -- 0,1,2
          //     {
          //       System.out.println(arr[i][j]);   //0,0  0,1  0,2    1,0   1,1    1,2
          //     }

          // }
          int[] arr1 = {34,34,56,67,78,56,45,546};
          
          int[] arr2 = arr1.clone();   //arr1 is copied inside arrClone i.e.  arrClone --> {34,34,56,67,78,56,45,546}

          arr1[0] = 3543;

          System.out.println(arr2[0]);
          System.out.println(arr1[0]);
          // TC06_arrays obj = new TC06_arrays();
          // //obj.arrayMethod(arr1);
          
          // int[] ar = obj.arrayMethod(new int[]{34,56,5,34,45,56,34,23,546,23,56,234,56,34,45});  //anonymous array   //ar -- {345,567,67,45}

          // System.out.println("Values of the array returned by method:- ");

          // for(int i= 0; i<= ar.length-1; i+=1)
          // {
          //   System.out.println(ar[i]);
          // }
           int[] arr = new int[5];     //instantiate & declaration //size of array = 5
       
    //    arr[0] = 34;
    //    System.out.println(arr[0]);
    //    System.out.println(arr[1]);
    //    System.out.println(arr[2]);
    //    System.out.println(arr[3]);
    //    System.out.println(arr[4]);
    //    System.out.println(arr[5]);   //Runtime Exception -- java.lang.ArrayIndexOutOfBoundsException

      //  int[] arr1 = {34,34,56,67,78,56,45,546};      //size=8, index - 0 to 7 //instantiate & declaration & initialization
       
      //  for(int i= 0; i<= arr1.length-1; i+=1)
      //  {
      //    System.out.println(arr1[i]);  //34,34,56,67,78,56,45,546
      //  }
    }
}