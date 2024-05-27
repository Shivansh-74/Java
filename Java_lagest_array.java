//find smallest element in an array
public class Java_lagest_array {
    public static void main(String args[]){
      int[] a={3,5,7,2,42};
      int max=a[0];
      for(int i=0;i<a.length;i++){
       if(a[i]>max){
         max=a[i];
        } 
      }
     System.out.println(max);
    
    }
}
