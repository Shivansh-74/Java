class Java_sort_array{
public static void main(String args[]){
int arr[]=new int[5];
for(int i=0;i<5;i++){
arr[i]=Integer.parseInt(args[i]);
}
System.out.println("original arrayy is");
for(int i=0;i<5;i++){
System.out.print(" "+arr[i]);
}
System.out.print("\nsorted arrayy\n");
for(int i=0;i<5;i++){
for(int j=i+1;j<5;j++){
if(arr[i]<arr[j]){
int temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
System.out.print(" "+arr[i]);
}
}
}