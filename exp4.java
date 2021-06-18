import java.util.Random;
import java.util.Scanner;

class exp4 {
    static int a[] = new int[1000000];
    public static void main(String[] args) 
    throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        long start, end;
        System.out.println("*** Quick Sort Program ***");
        int n =sc.nextInt();
        Random rand = new Random();
        for( int i = 0; i < n; i++)
            a[i] = rand.nextInt(100);
        System.out.println("Array elements to be sorted are :");
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        
        int low = 0, high = n-1;
        a[n] = 999;
        start = System.nanoTime();
        quicksort(a, low, high);
        end = System.nanoTime();
        
        System.out.println("\n The Sorted elements are : ");
        for( int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println("\n\nThe time taken to sort is " + (end - start) + "ns");
        sc.close();
    }

    static void quicksort(int a[], int low, int high) {
        int mid;
        if(low < high) {
            mid = partition(a, low, high);
            quicksort(a, low, mid-1);
            quicksort(a, mid+1, high);
        }
    }

    static int partition(int a[], int low, int high) {
        int pivot = a[low];
        int i = low + 1;
        int j = high;
        while(i <= j) {
            while(a[i] <= pivot)
                i++;
            while(a[j] > pivot)
                j--;
            if(i < j)
                swap(a, i, j);
        }
        swap( a, low, j);
        return j;
    }

    static void swap(int a[], int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j] ;
        a[j] = temp;
    }
}

