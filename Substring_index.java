//5.Write a java program to find the index of a substring.
import java.lang.*;
import java.util.*;
class Substring_index
{   
    
    public static int substring_index(String input, String sub_string)
    {
        for(int i=0;i<input.length();i++)
        {     
              int count=0;
              int dummy=i;
              for(int j=0;j<sub_string.length();j++)
              {
                if(input.charAt(dummy) != sub_string.charAt(j))
                {
                    break;
                }
                else{
                    count++;
                    dummy++;
                }
              }

              if(count == sub_string.length())
              {
                 return i;
              }
        }

        return -1;
    }
    public static void main(String args[])
    {
        
        String input="Hello readers";
        String sub_string="Hello";
        int result=substring_index(input,sub_string);

        if(result==-1)
        {
            System.out.print("Not found");
        }
        else
        {
            System.out.print("Start index of substring is: "+result);
        }
        
    }
}