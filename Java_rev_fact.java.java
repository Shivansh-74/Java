//reverse and factorial in one program
import java.io.*;
import java.util.Scanner;
class Java_rev_fact{
public static void main(String args[]){
System.out.print("enter 1 for factorial ");
System.out.print("2 for reverse");
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();
int a = Integer.parseInt(args[0]);
switch(ch){
case 1:
while(a!=0){
int rem = a%10;
System.out.print(rem);
a=a/10;
}
break;
}
}
}