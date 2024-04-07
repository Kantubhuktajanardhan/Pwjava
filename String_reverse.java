import java.lang.*;
import java.util.*;
class String_reverse
{
    public static String reverse(String word)
    {
        String output="";
        for(int i=word.length()-1;i>=0;i--)
        {
            output=output+word.charAt(i);
        }
        return output;
    }
    public static void main(String args[])
    {
        String input="Think twice";
        String word[]=input.split(" ");
        String output="";
        for(int i=0;i<word.length;i++)
        {
            output=output+reverse(word[i])+" ";
        }

        System.out.print((output.trim()).toLowerCase());
    
    }
}