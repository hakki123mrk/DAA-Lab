import java.util.Random;
import java.util.Scanner;

public class exp5 {
    static int a[] = new int[1000000];
    public static void main(String[] args) 
    throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        long start, end;
        System.out.println("*** Merge Sort Program ***");
        System.out.print("Enter the number of elements to be sorted : ");
        int n =sc.nextInt();
        Random rand = new Random();
        for( int i = 0; i < n; i++)
            a[i] = rand.nextInt(1000);
        System.out.println("Array elements to be sorted are :");
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        
        start = System.nanoTime();
        mergeSort(a, 0, n-1);
        end = System.nanoTime();
        System.out.println("\n The Sorted elements are : ");
        for( int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println("\n\nThe time taken to sort is " + (end - start) + "ns");
        sc.close();
    }

    static void mergeSort(int a[], int low, int high) {
        int mid;
        if(low < high) {
            mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid+1, high);
            merge(a, low, mid, high);
        }
    }

    static void merge(int a[], int low, int mid, int high) {
        int i, j, k;
        int temp[] = new int[100000];
        i = k = low;
        j = mid + 1;
        while((i <= mid) && (j<=high)) {
            if(a[i] < a[j]) {
                temp[k] = a[i];
                i++;
                k++;
            }
            else {
                temp[k] = a[j];
                j++;
                k++;
            }
        }

        while(i <= mid) {
            temp[k] = a[i];
            i++;
            k++;
        }

        while(j <= high) {
            temp[k] = a[j];
            j++;
            k++;
        }

        for(k = low; k <=high; k++)
            a[k] = temp[k];
    }
}
