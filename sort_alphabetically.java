// Write the program to sort the string alphabetically
import java.lang.*;
import java.util.*;
class sort_alphabetically
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the input:");
        String input=sc.next();
        char arr[]=input.toCharArray();
        Arrays.sort(arr);
        String output=new String(arr);
        
        System.out.print("The output is :"+output);

    }
}