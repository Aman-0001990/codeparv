import java.util.*;
//2d array 
public class class5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);   
    System.out.print("enter the rows of array :");  
        int rows  = scn.nextInt();
    System.out.print("enter the cols of array :");  
        int cols  = scn.nextInt();
     int [][] arr2 = new int[rows][cols];
    

    System.out.println("enter number ");
    for (int i =0; i<arr2.length;i++){
           for(int j=0;j<arr2[0].length;j++){
            arr2[i][j] = scn.nextInt();
           } 
        }
    
        printarr(arr2);
     

}

   
public static void printarr(int[][] arr){
       
       for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j <arr[0].length; j++) {
           System.out.print(arr[i][j] + " ");
          }
           System.out.println();
    }
    } 

}
 