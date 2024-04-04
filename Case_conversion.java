// 3.Write a java program to convert upper case to lower case and vice versa.
import java.lang.*;
import java.util.*;
class Case_conversion
{
    public static void main(String args[])
    {
        System.out.print("Enter the input: ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println("The uppercase is "+input.toUpperCase());
        System.out.println("The Lowercase is "+input.toLowerCase());
    }
}