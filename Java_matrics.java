//sum of two matrics
import java.util.*;
class Java_matrics{
public static void main(String args[]){
int r[][]=new int[3][4];
int c[][]=new int[3][4];
int sum[][]=new int[3][4];
Scanner in=new Scanner(System.in);
System.out.println("enter the elements of 1st matrix");
for(int i=0;i<3;i++){
for(int j=0;j<4;j++){
r[i][j] = in.nextInt();
}
}

System.out.println("enter the elements of 2nd matrix");
for(int i=0;i<3;i++){
for(int j=0;j<4;j++){
c[i][j] = in.nextInt();
}
}
for(int i=0;i<3;i++){
for(int j=0;j<4;j++){
sum[i][j]=r[i][j]+c[i][j];
}
}
for(int i=0;i<3;i++){
for(int j=0;j<4;j++){
System.out.print(sum[i][j]+" ");
}
System.out.println();
}
}
}