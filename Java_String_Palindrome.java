public class Java_String_Palindrome {
    public static void main(String args[])
 {
   String s1 = args[0];
   //Scanner sc = new Scanner(System.in);
   //System.out.println("Enter a string:");
   //String s1 = sc.nextLine();
   boolean flag = true;
   s1 = s1.toLowerCase();

   for(int i=0;i<s1.length()/2;i++)
   {
    if(s1.charAt(i) != s1.charAt(s1.length()-i-1))
    {
     flag = false;
     break;
    }
   }
   if(flag)
   {
    System.out.println("Entered string is palindrome");
   }
   else 
   {
    System.out.println("Entered string is not a palindrome");
   }
 }
}
