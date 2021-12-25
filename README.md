# miscellaneous
import java.util.*;
class Ss
{
    
    int[] x = new int[5];
    
    void acc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 numbers: \n");

        for(int i=0; i<5; i++)
        {
            System.out.println("enter number "+(i+1)+":");
            x[i] = sc.nextInt();
        }

        System.out.println("you have entered...");

        for(int i=0; i<5; i++)
        {
            System.out.println(x[i]);
            
        }

    }

    void sort()
    {
        for (int i = 0; i < 5 - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < 5; j++)
            {  
                if (x[j] < x[index]){  
                    index = j;  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  

        System.out.println("after sorting ...");

        for(int i=0; i<5; i++)
        {
            System.out.println(x[i]);
            
        } 

    }

}

class SelectionSort
{
    public static void main(String args[])
    {
        Ss obj = new Ss();
        obj.acc();
        obj.sort();

    }
}
