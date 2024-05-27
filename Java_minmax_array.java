//fint minimum and maximum element of array 
import java.util.*;
class Java_minmax_array{
public static void main(String  args[]){
Scanner in = new Scanner(System.in);
int a[] = new int[5];
int max = a[0];
int min =0;
System.out.println("Enter array elements");
for(int i=0;i<a.length;i++){
a[i]=in.nextInt();
}
for(int i=0;i<a.length;i++){
if(a[i]>max){
max=a[i];
}
else if(a[i]<max){
min=a[i];
}
}
System.out.println("max is "+ max);
System.out.println("min is "+ min);
}
}