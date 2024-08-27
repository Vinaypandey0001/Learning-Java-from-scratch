import java.util.*;
public class TCS2
{
 	public static void main(String[] args)
 	{
        		
        String str="Hello";
        int count1=0,count2=0;
        for(int i=0;i< str.length();i++)
    	{
            if(str.charAt(i)=='*')
        		count1++;##
            else if(str.charAt(i)=='#')
         		count2++;
    		}
        System.out.println(count1-count2);
	}
}
