// 4.Write a java program to remove a particular character from a String.
import java.lang.*;
import java.util.*;
class Removecharacter
{
    public static String remove(String input,int pos)
    {
           return input.substring(0,pos)+input.substring(pos+1);
    }
    public static void main(String args[])
    {
        System.out.print("Enter the input String: ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.print("Enter the index of the element to remove: ");
        int pos=sc.nextInt();
        String output=remove(input,pos);
        System.out.print("output: "+output);
    }
}