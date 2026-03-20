import java.util.*;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            for(int k=0; k<n-1-i; k++){
                System.out.print("  ");
            }

            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }

            for(int k=0; k<i; k++){
                System.out.print("  ");
            }

            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}