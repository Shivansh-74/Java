//wap to check number is positive or nagative if positive check even or odd

import java.util.Scanner;

public class Java_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int a = in.nextInt();
        if(a>=0){
            if(a%2==0){
                System.out.println("Number is positive");
                System.out.println("Number is even");

            }
            else{
                System.out.println("Number is positive");
                System.out.println("Number is odd");
            }
        }
        else{
            System.out.println("Number is negetive");
        }
    }
}
