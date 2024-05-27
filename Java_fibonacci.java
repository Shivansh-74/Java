import java.util.Scanner;

class Java_fibonacci{
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("enter number");
    int n = in.nextInt();
    int num=0,num1=0,num2=1;
    for(int i=0;i<n;i++){
    System.out.print(" "+num1);
    num=num2+num1;
    num1=num2;
    num2=num;
    }
}
}