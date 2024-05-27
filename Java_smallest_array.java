//find smallest element in an array
class Java_smallest_array{
public static void main(String args[]){
  int[] a={3,5,7,2,42};
  int min=a[0];
  for(int i=0;i<a.length;i++){
   if(a[i]<min){
     min=a[i];
    } 
  }
 System.out.println(min);
}
}