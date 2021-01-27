import java.util.Scanner;
public class InsertionSort {
    public static void main(String args[]) {
        int n, arr[];
        System.out.println("enter the size of array");
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        arr = new int[n];
        System.out.println("enter the elements of array");
        for(int i=0; i<n; i++)
            arr[i] = input.nextInt();

        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j;
            for(j=i-1; (temp<arr[j])&&(j>=0);j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        System.out.println("Sorted array is");
        for(int x: arr)
            System.out.println(x);
    }
}
