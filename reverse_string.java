// 1.Write a java program to Reverse a string without using the inbuilt method.
import java.lang.*;
import java.util.*;
class reverse_string
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
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String output=reverse(input);
        System.out.println("Reverse of the string is :"+ output);
    }
}