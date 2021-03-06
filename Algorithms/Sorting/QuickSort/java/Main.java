import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        QuickSort.input(arr, size);
        sc.close();
        QuickSort.printArray(arr, size);
        System.out.println("Sorting...");
        QuickSort.quickSort(arr, 0, size-1);
        QuickSort.printArray(arr, size);
    }    
}