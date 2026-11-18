// import java.util.*;
// //2d array 
// public class class6 {
//     public static void main(String[] args) {
        
//      int [][] arr2 = {
//         {10,20,30,40,50},
//         {11,12,13,14,15},
//         {22,23,24,25,26},
//         { 1, 2, 3, 4, 5}
//      };
//      printZigZag(arr2);
// }
// public static void printarr(int[][] arr,int rows,int cols){
       
//        for (int i = 0; i < rows; i++) {
//          for (int j = 0; j < cols; j++) {
//            System.out.print(arr[i][j] + " ");
//           }
//            System.out.println();
//     }
//     } 

//     public static void printZigZag(int [][] arr) {
//         for(int i=0;i<arr[0].length;i++){
//         if(i%2 == 0){
//           for(int j =0;j<arr.length;j++){
//             System.out.print(arr[j][i]+" ,");
//           }
//         }else{
//           for(int j =arr.length-1;j>=0;j--){
//             System.out.print(arr[j][i]+" ,");
//           }
//         }
//         }
//     }
// }

// 
// import java.util.*;
// //2d array 
// public class class6 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);   
//     System.out.print("enter the rows of array1 :");  
//         int rows  = scn.nextInt();
//     System.out.print("enter the cols of array1 :");  
//         int cols  = scn.nextInt();
//      int [][] arr1 = new int[rows][cols];
//     System.out.println("enter number ");
//     for (int i =0; i<rows;i++){
//            for(int j=0;j<cols;j++){
//             arr1[i][j] = scn.nextInt();
//            } 
//         }

//     System.out.print("enter the rows of array2 :");  
//         int rowss  = scn.nextInt();
//     System.out.print("enter the cols of array2 :");  
//         int colss  = scn.nextInt();
//      int [][] arr2 = new int[rowss][colss];
//     System.out.println("enter number ");
//     for (int i =0; i<rowss;i++){
//            for(int j=0;j<colss;j++){
//             arr2[i][j] = scn.nextInt();
//            } 
//         }
//     matrixmul(arr1,arr2,rows,cols,rowss,colss);
// }
   

// public static void matrixmul(int[][] arr1,int[][]arr2,int rows,int cols,int rowss,int colss){
//        int [][] arr3 = new int[rows][colss];
//        if(cols!=rowss){
//             System.out.println("Given matrix not multiply");
//             return;
//        }
//           for (int r = 0; r < rows; r++) {
//           for (int c = 0; c < colss; c++) {
//             for (int i = 0; i < cols; i++) {
//             arr3[r][c]+= arr1[r][i] * arr2[i][c];
//           }
//           }
//           }
//           printarr(arr3, rows, colss);
//     } 

//     public static void printarr(int[][] arr,int rows,int cols){
//        for (int i = 0; i < rows; i++) {
//          for (int j = 0; j < cols; j++) {
//            System.out.print(arr[i][j] + " ");
//           }
//            System.out.println();
//     }
//     } 

// }



// import java.util.*;
// //2d array 
// public class class6 {
//     public static void main(String[] args) {
//        String s = "howarahshdkja;lkabdahnsndsalk";

// int count = 0;

// for (int i = 0; i < s.length(); i++) {
//     if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
//         s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
//         s.charAt(i) == 'u') {
//         count++;
//     }
// }

// System.out.println(count);
// }
// // public static void main(String[]) {
// //     for ()
// // }
// }


//2d array 

import java.util.Scanner;

public class class6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size  of string array :");
        char s = scn.nextLine();
       char[] s = {'h','o','w','a','a','h','j','u','n','c','t','i','o','n'};

int count = 0;

for (int i = 0; i < s.length; i++) {
    if (s[i] == 'a' || s[i] == 'e' ||
        s[i] == 'i' || s[i]== 'o' ||
        s[i] == 'u') {
        count++;
    }
}

System.out.println(count);
}
// public static void main(String[]) {
//     for ()
// }
}