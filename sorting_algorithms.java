import java.lang.*;
import java.util.*;
class sorting_algorithms
{
    public static void main(String args[])
    {
        int[] arr={23,32,54,-2,65,75,100};
        //bubblesort(arr);
        //selectionsort(arr);
        insertionsort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    swap(arr,j,j-1);
                }
            }
        }
    }

    static void selectionsort(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            
            int last=arr.length-i-1;
            int max_index=maxfinder(arr,0,last);
            swap(arr,max_index,last);

        }

    }

    static void insertionsort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static int maxfinder(int[] arr,int start,int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>max)
            {
                max=i;
            }
        }
        return max;
    }


}