import java.io.*;
class Java_stringReverse{
 public static void main(String args[]){
 String a="Example";
 char[] ca= a.toCharArray();
 int  size= ca.length;
 String str="";
 for(int i=size-1;i>=0;i--){
 str = str+ca[i];
}
System.out.print(str);
}
}