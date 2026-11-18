

// public class class2 {
//     public static void main(String[] args) {
//      Scanner scn = new Scanner(System.in);
//       System.out.print("enter number n:");
//       int n = scn.nextInt();
//       int square = getsquare(n);
//       int sum = getsum(48,67);
//       System.out.println(square);
//       System.out.println(sum);
//     }
//     public static int getsquare(int x){
//         return x*x;
//     }
//     public static int  getsum(int x, int y){
//         return x+y;
//     }
// }



import java.util.Scanner;

// public class class2 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         System.out.print("enter number n:");
//         int n = scn.nextInt();

//         game(n);
//     }

//     public static boolean iseven(int x) {
//         if (x % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public static void game(int x) {
//         boolean isEven = iseven(x);

//         if (isEven) {
//             System.out.println("yes");
//         } else {
//             System.out.println("no");
//         }
//     }
// }

// pytagores triplet

public class class2 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("enter number a:");
    int a = scn.nextInt();
    System.out.print("enter number b:");
    int b = scn.nextInt();
    System.out.print("enter number c:");
    int c = scn.nextInt();
    istriplet(a, b, c);
    
    }
    public static void istriplet(int a,int b,int c ){
        if (a*a == (b*b) + (c*c)){
            System.out.println("yes");
        }
        else if (b*b == (a*a) + (c*c)){
            System.out.println("yes");
        }
         else if (c*c == (a*a) + (b*b)){
            System.out.println("yes");
        }
        else{
           System.out.println("no");
        }
    }
    
}