
// // first and second largest element of the array
import java.util.Scanner;
// public class class3 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter how many number of array you formed :");
//         int n = scn.nextInt();
//      int [] arr = new int[n];
//    for (int i = 0;i<n;i++){
//       System.out.print("enter number "+(i+1)+":");
//       arr [i] = scn.nextInt();
//    }
//     int temp = 0;
//    for (int i=0;i<n-1;i++){
//       if (arr[i]>arr[i+1]){
//         temp = arr[i];
//         arr[i] = arr[i+1];
//         arr[i+1] = temp;
//       }  

//         for (int j=0;j<n-2;j++){
//       if (arr[j]>arr[j+1]){
//         temp = arr[j];
//         arr[j] = arr[j+1];
//         arr[j+1] = temp;
//        }
//       } 
//    }
//     System.out.println("first Maximum number is:"+arr[n-1]);
//     System.out.println("second Maximum number is:"+arr[n-2]);
//     }
// }

// number exist in array
// import java.util.Scanner;
// public class class3 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter the size of array :");
    
//         int size  = scn.nextInt();
//      int [] arr = new int[size];
//     int it = 1;
//      for (int i = 0;i<size;i++){
//       System.out.print("enter number "+(i+1)+":");
//       arr [i] = scn.nextInt();
//    }

//    System.out.print("enter number which you find in array :");
//    int n = scn.nextInt();
//    boolean found = false;
//    for (int i=0;i<size;i++){
//         if(n == arr[i]){
//          found = true;
//          break;
//         }
//         else if (n < arr[i]){
//           found = false;
//           break;
//         }
//          it++;
//     }
//           if(found == true){
//          System.out.print(" Number found");
//         }
        
//         else{
//           System.out.print(" Number not found");
//         }
//          System.out.print(it);
//   }
// }
// pattren by array 
// import java.util.Scanner;
// public class class3 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter the size of array :");

//         int size  = scn.nextInt();
//      int [] arr = new int[size];
   
//      for (int i = 0;i<size;i++){
//       System.out.print("enter number "+(i+1)+":");
//       arr [i] = scn.nextInt();
//    }

//    int temp = 0;
//    for (int i=0;i<size-1;i++){
//        if(arr[i]>temp){
//        temp = arr[i];
//     }
//   }
//     int var = arr[size-1];;
//     int rows = temp;
//     int col = size;
//     int str = 1;
//     for (int h = rows; h>=1;h--){
//       for (int j= 0;j<arr.length;j++){
//         if(arr[j]>=h){
//         System.out.print("* ");
//         }
//         else{
//           System.out.print("  ");
//         }
//       }
//       System.out.println();
//     }

//     System.out.println(rows);
//     System.out.println(col);
//   }
// }
//
 // binary search non deacring order

// import java.util.Scanner;
// public class class3 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter the size of array :");
    
//         int size  = scn.nextInt();
//      int [] arr = new int[size];
//     int it = 1;
//      for (int i = 0;i<size;i++){
//       System.out.print("enter number "+(i+1)+":");
//       arr [i] = scn.nextInt();
//    }

//    System.out.print("enter number which you find in array :");
//    int n = scn.nextInt();
//    System.out.println(binarySearch(arr, n));
//   }
//  public static boolean binarySearch(int[] arr,int number){
//     int low = 0;
//     int high = arr.length-1;
//     while(low <= high){
//       int mid = (low+high)/2;
//       if(arr[mid]==number){
//         return true;
//       }
//       else if (arr[mid]>number){
//         high = mid-1;
//       }
//       else{
//         low = mid+1;
//       }
//     }
//     return false;
//  }
 
// }
//// array swap
// import java.util.Scanner;
// public class class3 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter the size of array :");
    
//         int size  = scn.nextInt();
//      int [] arr1 = new int[size];
//      for (int i = 0;i<size;i++){
//       System.out.print("enter number "+(i+1)+":");
//       arr1 [i] = scn.nextInt();
//    }
//    reversearray(arr1);
//   }
  
//    public static void reversearray(int arr[]){
//   int swap = 0;
//   int first = 0;
//   int last = arr.length-1;
//    while (first <= last ){
//         swap = arr[first] ;
//         arr[first] = arr[last];
//         arr[last] =  swap;
//         first++;
//         last--;
//    }
//  for (int j=0;j<arr.length;j++){
//     System.out.print(arr[j]+" ");
// }
// }
// }
//  int [] arr2 = new int[size];
//  for (int k = 0 ;k<size;k++){
//       arr2[k] = arr1[k];
//  }

//  for (int j=0;j<size;j++){
//     System.out.print(arr2[j]+" ");
//    }

////
import java.util.Scanner;
public class class3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size of array :");
    
        int size  = scn.nextInt();
     int [] arr1 = new int[size];
     for (int i = 0;i<size;i++){
      System.out.print("enter number "+(i+1)+":");
      arr1 [i] = scn.nextInt();
   }

    System.out.print("enter the k :");
        int k  = scn.nextInt();
    reversearray(arr1,k);
  }
  
   public static void reversearray(int arr[],int k){
  int swap = 0;
  int first1 =0;
  int first = 0;
  int n = arr.length-1;
  int last = n-k;
  int last1 = n-k+1;
  int last2 = arr.length-1;
   while (first <= last ){
        swap = arr[first] ;
        arr[first] = arr[last];
        arr[last] =  swap;
        first++;
        last--;
   }
 while (last1 <= n ){
        swap = arr[last1] ;
        arr[last1] = arr[n];
        arr[n] =  swap;
        last1++;
        n--;
   }

   while (first1 <= last2 ){
        swap = arr[first1] ;
        arr[first1] = arr[last2];
        arr[last2] =  swap;
        first1++;
        last2--;
   }



 for (int j=0;j<arr.length;j++){
    System.out.print(arr[j]+" ");
}
}
}

// while (first <= last ){
//         swap = arr[first] ;
//         arr[first] = arr[last];
//         arr[last] =  swap;
//         first++;
//         last--;
//    }

// sum of subarray
// import java.util.*;

//    public class class3 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter the size of array :");
    
//         int size  = scn.nextInt();
//      int [] arr = new int[size];
//      for (int i = 0;i<size;i++){
//       System.out.print("enter number "+(i+1)+":");
//       arr [i] = scn.nextInt();
//    }        
//      int maxsum = 0;
//     for (int start = 0; start<arr.length; start++){
//         for (int end = start ; end<arr.length;end++){
//        int csum  = sumOfSubArray(arr, start, end);
//        if (maxsum<csum){
//         maxsum = csum;
//        }
//         //  printSubArray(arr, start, end);
//         }
//     }
        
//         System.out.println(maxsum);

//     }

//     public static int  sumOfSubArray(int[] arr, int start, int end ){
//         int sum = 0;
//         while(start<=end) {
//             sum = sum + arr[start];
//             start++;
//         }
//         return sum;
//     }

//    public static void printSubArray(int[] arr, int start, int end){
//    for (int i = start ; i <= end;i++){
//             System.out.print(arr[i]+" ");
//          }
//          System.out.println();

// }


    
// }

//


//    public class class3 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter the size of array :");
    
//         int size  = scn.nextInt();
//      int [] arr = new int[size];
//      for (int i = 0;i<size;i++){
//       System.out.print("enter number "+(i+1)+":");
//       arr [i] = scn.nextInt();
//    }        
//        int csum  = MaxSum(arr);
        
//         System.out.println(csum);

//     }



//      public static int MaxSum(int arr[]){
//         int curSum =0;
//         int maxsum = 0;
//         for (int i = 0 ; i<arr.length;i++){
//             if (curSum<0){
//                 curSum = arr[i];
//             }
//             else{
//                 curSum += arr[i];
//             }
            
            
//             if (maxsum<curSum){
//              maxsum = curSum;
//            }    
//         }
//          return maxsum;
//      }
    
//     public static int  sumOfSubArray(int[] arr, int start, int end ){
//         int sum = 0;
//         while(start<=end) {
//             sum = sum + arr[start];
//             start++;
//         }
//         return sum;
//     }

//    public static void printSubArray(int[] arr, int start, int end){
//    for (int i = start ; i <= end;i++){
//             System.out.print(arr[i]+" ");
//          }
//          System.out.println();

// }
// }