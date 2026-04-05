// check if the number armstrong
// 153 (sum of cube of individual digit should be equal to the original number)
//1 + 125 + 27 =153


import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2= n;

    //     int sum = 0;
    //     while(n>0){
    //         int b = n % 10;
    //         b = b*b*b;
    //         sum = sum +b;
    //         n = n / 10;
    //     }
    //     if(sum == n2){
    //         System.out.println("Yes");
    //     }
    //     else{
    //         System.out.println("no");
    //     }
    // }
   


    //Pallindrome program
    int sum = 0;
    while (n>0){
        int b = n % 10; 
        sum = (sum *10) + b; 
        n = n / 10; 
    }    
    if(sum == n2){
            System.out.println("Yes");
        }
    else{
            System.out.println("no");
        }
}
}



// n = 121 true
// 130 013 false 

