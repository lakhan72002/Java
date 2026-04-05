//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5


import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i=0; i<n; i++){
            for(int space = 0; space < n-i-1; space++){
                System.out.print(" ");
            }
            for(int j =0; j<=i; j++){
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
}