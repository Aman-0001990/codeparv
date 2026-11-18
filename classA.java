
// class classA{
//     public static void main(String[]args){
// int  marks = 20;
// int x = 6;
// if (marks == 20 && x > 3 ){
//     System.out.println("gud");
// }
// else  {
//     System.out.println("bad");
// }
//     }
// }

// import java.util.Scanner;

// class classA{
//     public static void main(String[]args){
//         Scanner scn = new Scanner(System.in);

// int  marks = scn.nextInt();
// int x = 6;
// if (marks == 20 && x > 3 ){
//     System.out.println("gud");
// }
// else  {

//     System.out.println("bad");
// }

//     }
// }
 // Q1  
// import java.util.Scanner;

// class classA{
// public static void main(String[]args){
//     Scanner scn = new Scanner(System.in);
//     System.out.print("enter number:");
//     int num = scn.nextInt();
     
//      for (int i = 3;i<=num;i++){
//        boolean isPrime = true;
//     for (int j = 2;j*j <= i;j++ ){
//         if(j%num==0){
//          isPrime = false;
//          break;
//         }
        
//     }
//     if(isPrime== true){
//         System.out.print(i + " ");
//     }
//     }
       

// }
// }


// public class classA {
//     public static void main(String[] args) {
//         int n = 10; 

//         int a = 1, b = 1;

//         System.out.print("Fibonacci Series: ");

//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");

//             int c = a + b;
//             a = b;
//             b = c;
//         }
//     }
// }



// public class classA {
//     public static void main(String[] args) {
//       // Scanner scn = new Scanner(System.in);
//       // System.out.print("enter number:");
//       int n = 1456;
//         int a = 10;
//       while(n>0){
//         int rem = n%a;
//         System.out.print(rem + "," );
//         n = n/a;
//         }
       
//     }
// }

// import java.util.Scanner;

// public class classA {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       System.out.print("enter number:");
//       int n = scn.nextInt();
//       int s = n;
//         int len = 0;
//         int rem2;
//       while(n>0){
//         n = n /10;
//        len++;
//         }
//        System.out.println(len);

//       //  while (s >0){
//         rem2 = s / 10^(len-1);
//         // s = s % 10^(len-1);
//         // len--;
//         System.out.println(rem2);
//       //  }
//     }
// }

//  public class classA {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       System.out.print("enter number:");
//       int n = scn.nextInt();
//       int len = 3;
//       // int ncopy = n;
//       // while(ncopy>0){
//       //   ncopy = ncopy /10;
//       //  len++;
//       //   }
//        int div = 1;
//    while (len>=1){
//     div = div*10;
//     len--;
//   }
//         int que = n;
//         que = que /div;
//         int rem = n % div;


//         System.out.print(rem);
//         System.out.print(que);
//     }
// }

//Gcd*lcm = n1*n2//
// public class classA {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       System.out.print("enter number:");
//       int n1 = scn.nextInt();
//       System.out.print("enter number:");
//       int n2= scn.nextInt();

//       int div;
//       int que;
//       int rem;
//       if (n1>n2){
//            div = n1;
//            que = n2;
//       }
//       else {
//         div = n2;
//         que = n1;
//       }
//       while (que!= 0){
//       rem = div%que;
//       div = que;
//       que = rem;
//       }
//       System.out.println(div);
//       int Gcd = div;
//       int Lcm;
//       Lcm = (n1*n2)/Gcd;
//       System.out.println(Lcm);

//     }
// }

// public class classA {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       System.out.print("enter number n:");
//       int n = scn.nextInt();
//       System.out.print("enter number k:");
//       int k = scn.nextInt();
//       int len = 0;
//      int ncopy = n;
//       while(ncopy>0){
//         ncopy = ncopy /10;
//        len++;
//     }
//      k = k % len;
//         if (k < 0) {
//             k = k + len;
//         }
//         System.out.println(k);
//       int kcopy = k;
      
     
//     System.out.println(len);
//     int div =1;
//     while (kcopy>0){
//         div = div*10;
//         kcopy--;
//     }
//     int divedent = n/div;
//     int remainder = n%div;
//     System.out.println(remainder);
//     int pow = len-k;
//     int mul = 1;
//     while(pow >0){
//         mul = mul*10;
//         pow--;
//     }
//     System.out.print((remainder*mul)+divedent);    
//     }
// }


// import java.util.Scanner;

// public class classA {
//     public static void main(String[] args) {

//         Scanner scn = new Scanner(System.in);

//         System.out.print("Enter number n: ");
//         int n = scn.nextInt();

//         System.out.print("Enter rotation k: ");
//         int k = scn.nextInt();

//         // Find length of number
//         int len = 0;
//         int temp = n;

//         while (temp > 0) {
//             temp = temp / 10;
//             len++;
//         }
//         System.out.println("len:"+len);
//         // Handle cases where k > length or k is negative
//         k = k % len;
//         System.out.println("k:"+k);
//         if (k < 0) {
//             k = k + len;
//         }
//      System.out.println("k:"+k);
//         // Find divisor (10^k)
//         int div = 1;
//         for (int i = 1; i <= k; i++) {
//             div = div * 10;
//         }

//         int remainder = n % div;
//         int dividend = n / div;

//         // Find multiplier (10^(len-k))
//         int mul = 1;
//         for (int i = 1; i <= (len - k); i++) {
//             mul = mul * 10;
//         }

//         int ans = remainder * mul + dividend;

//         // Print answer with leading zeros
//         System.out.printf("%0" + len + "d", ans);

//         scn.close();
//     }
// }



//  public class classA {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       System.out.print("enter number n:");
//       int n = scn.nextInt();
//       int x = n-1;
//      for (int i = 1;i<=n;i++){
//         for (int j=n-1;j>=i;j--){
//             System.out.print( " \t" );
//         }
//             for(int l=1;l<=i;l++){
//                  System.out.print( "* \t");
//             }
        
//         System.out.println();
//      }    
//     }
// }
//method 2
// public class classA {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       System.out.print("enter number n:");
//       int n = scn.nextInt();
//       int nost =1;
//       int nosp =n-1;   
//      for (int i = 1;i<=n;i++){
//            for (int j = 1;j<=nosp;j++){
//             System.out.print(" \t");                  //         *
//            }                                          //       * *
//              for (int k = 1;k<=nost;k++){             //     * * *
//             System.out.print("*\t");                  //   * * * *
//            }                                          // * * * * *
//          nost++;
//          nosp--;
//         System.out.println();
//      }
//     }
// }

// diamond
// public class classA {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       System.out.print("enter number n:");
//       int n = scn.nextInt();
//      int nosp = n/2+1 ;
//      int nostr = 1 ;
//      for (int i = 1 ; i<=n/2+1;i++ ){
//       for (int j = 1;j<=nosp;j++){
//         System.out.print(" ");
//       }
//       for (int k =1 ;k<=nostr;k++){
//         System.out.print(nostr);
//       }
//       System.out.println();
//       nostr = nostr+2;
//       nosp--;
//      }

//      int nospp = n/2 ;
//      int nostrr = n/2+1 ;
//      for (int a = 1 ; a<=n/2;a++ ){
//       for (int b = 1;b<=nospp;b++){
//         System.out.print(" ");
//       }
//       for (int c =1 ;c<=nostrr;c++){
//         System.out.print(nostrr);
//       }
//       System.out.println();
//       nostrr = nostrr-2;
//       nospp++;
//      }
//     }
// }

// cross
// public class classA {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       System.out.print("enter number n:");
//       int n = scn.nextInt();
//       int row =1;
//       int col =1;
     
//      for (int i = 1 ; i<=5;i++ ){
//        for (int k =1 ;k<=5;k++){
//         if(i == k || i + k == 6){
//            System.out.print("*\t");
//         }
//         else{
//          System.out.print(" \t");
//         }
//       }
//       System.out.println();

//      }
//     }
// }


// public class classA {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       System.out.print("enter number n:");
//       int n = scn.nextInt();
    
     
//      for (int i = 1 ; i<=5;i++ ){
//        for (int k =i ;k<=5;k++){
//            System.out.print(k);
//       }
//       System.out.println();

//      }
//     }
// }