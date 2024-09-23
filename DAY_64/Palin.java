public class Palin{
    public static boolean ialincheck(int n){
         int org=n;
        int rev =0;
        while(n!=0){
           int rem =n%10;
           rev = rev*10+rem;
           n =n/10;

           }
            if(org==rev){
            return true;}
            else
                return false;
          
    }
    public static void main(String [] args){
        int  n=128;
         if(ialincheck(n)){
            System.out.print(n+" is a palindrome");
         }
         else 
          System.out.println(n+ " is not a palindrome");
        
       

    }
}
