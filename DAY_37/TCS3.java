import java.util.*;
class TCS3
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;imax)
                {
                    max=arr[i];
                    count++;
                }
            }
            System.out.println(count);
     }
}
