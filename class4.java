import java.util.*;
//reverse of array
//    public class class4 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter the size of array :");
    
//         int size  = scn.nextInt();
//      int [] arr = new int[size];
//      for (int i = 0;i<size;i++){
//       System.out.print("enter number "+(i+1)+":");
//       arr [i] = scn.nextInt();
//    }        
//          ARR(arr);
//     }


//      public static void ARR(int arr[]){

//         int [] arr2 = new int[arr.length];
        
//         for(int x =0;x<arr.length;x++){
//             int val = arr[x];
//             arr2[val] = x;
//         }
//          printarr(arr2);
//      }
    
//      public static void printarr(int arr[]){
       
//         for (int i =0; i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// //add of array 

//   public class class4 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter the size of array :");
    
//         int size  = scn.nextInt();
//      int [] arr1 = new int[size];
//      for (int i = 0;i<size;i++){
//       System.out.print("enter number "+(i+1)+":");
//       arr1 [i] = scn.nextInt();
//    }      

//     System.out.print("enter the size of array :");  
//         int sizee  = scn.nextInt();
//      int [] arr2 = new int[sizee];
//      for (int i = 0;i<sizee;i++){
//       System.out.print("enter number "+(i+1)+":");
//       arr2 [i] = scn.nextInt();
//    }
//     SumOfArray(arr1,arr2);
//     }
//     public static void SumOfArray(int arr1[],int arr2[]){
//         int carry = 0;
//         int sizeee =0;
//           if(arr1.length>arr2.length){
//             sizeee = arr1.length;
//           }
//           else{
//             sizeee = arr2.length;
//           }
//         int [] arr3 = new int[sizeee+1];
//           int i = arr1.length-1;
//           int j = arr2.length-1;

//         for (int k=arr3.length-1;k>=0;k--){
//              int x = carry;
//             if (i>=0){
//                 x += arr1[i];
//                 i--;
//             }
//             if (j>=0){
//                 x += arr2[j];
//                 j--;
//             }
//             arr3[k] = x % 10;
//             carry = x/10;
//         }
        
//           printarr(arr3);
//     }



//      public static void printarr(int arr[]){
       
//         for (int i =0; i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//   } 


 public class class4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size of array :");
    
        int size  = scn.nextInt();
     int [] arr1 = new int[size];
     for (int i = 0;i<size;i++){
      System.out.print("enter number "+(i+1)+":");
      arr1 [i] = scn.nextInt();
   }      

    System.out.print("enter the size of array :");  
        int sizee  = scn.nextInt();
     int [] arr2 = new int[sizee];
     for (int i = 0;i<sizee;i++){
      System.out.print("enter number "+(i+1)+":");
      arr2 [i] = scn.nextInt();
   }
   
}
   

    
        
          

     public static void printarr(int arr[]){
       
        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

  } 
