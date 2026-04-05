import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // while loop

        // int n=1;
        // while(n<11){
        //     System.out.println(n);
        //     n++;
        // }

        // int n=1;

        // do{
        //     System.out.println(n);
        //     n++;
        // }while(n<=10);

        int i=1;
        for(; i<=10; i++){
            System.out.println(i);
        }
        if(i==12){
            System.out.println("yes");
        }
    }
}
