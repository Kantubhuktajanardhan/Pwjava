// 2.Write a java program to know whether the given string is palindrome
import java.lang.*;
import java.util.*;
class palindrome
{
    public static String reverse(String input)
    {
        String new_string="";
        int i=input.length()-1;
        for(;i>=0;i--)
        {
            new_string=new_string+input.charAt(i);
        }

        return new_string;
    }

    public static void main(String args[])
    {
        System.out.print("Enter the input: ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String output=reverse(input);

        if(input.equals(output))
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not Palindrome");
        }
    }
}