import java.util.Arrays;
import java.util.Scanner;

class Sorting
{
    int[] arr;
    Sorting()
    {
        arr = new int[] { 5, 9, 8, 23, 2, 56, 40, 60, 1 };
    }
    
    public void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i; j++) {
                int a = j + 1;
                if (arr[j] > arr[a]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            
            int a = i + 1;
            int j = i;
            int key = arr[a];
            while(key<arr[i] && j>=0)
            {
                arr[a] = arr[j];
                j--;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public void selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length-1 ; i++)
        {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[])
    {
        Sorting o1 = new Sorting();
        int[] arr = o1.arr;

        System.out.println("Enter the following sorting technics");
        System.out.println("1 : Bubble sort");
        System.out.println("2 : Insertion sort");
        System.out.println("3 : Selection sort");
        

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                o1.bubbleSort(arr);
                break;
            case 2:
                o1.insertionSort(arr);
                break;
            case 3:
                o1.selectionSort(arr);
                break;
            default:
                break;
                

        }   
        
        sc.close();
        
        


        
    }
}