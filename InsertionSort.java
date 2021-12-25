import java.util.*;
class Ins
{
    int arr[] = new int[5];
    void acc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 numbers:");
        for(int i=0; i<5; i++)
        {
            arr[i]=sc.nextInt();

        }
    }

    void sort()
    {
        for (int j = 1; j < 5; j++) {  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > key ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  

    }

    void display()
    {
        System.out.println("sorted array: ");
        for(int i=0; i<5; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

}

class InsertionSort
{
    public static void main(String args[])
    {
        Ins o = new Ins();
        o.acc();
        o.sort();
        o.display();
    }
}