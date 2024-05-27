//Enter the elements in command line and find valid and invalid numbers
class Java_invalid_number{
public static void main(String args[]){
int c=0,in=0;
for(int i=0;i<args.length;i++){
try{
  int a=Integer.parseInt(args[i]);
 }
catch(NumberFormatException e){
in++;
continue;
}
c++;}
System.out.println("invalid"+in);
System.out.println("valid"+c);

}
}