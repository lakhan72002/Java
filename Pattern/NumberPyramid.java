// Enter Range : 5

// Output - 

//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5



import java.util.*;

public class NumberPyramid {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0;j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++){
                System.out.print(i+1);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
