// Enter Range : 5

// Outout - 

//     1
//    212
//   32123
//  4321234
// 543212345


import java.util.*;

public class PalindromicPatternPyramid {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0;j<n-i-1; j++){
                System.out.print(" ");
            }
            
            for(int k=i+1;k>=1; k--){
                System.out.print(k);
            }
            for(int k=2; k<=i+1; k++){
                System.err.print(k);
            }
            System.out.println();
        }
    }
}