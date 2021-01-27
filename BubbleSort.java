import java.util.Scanner;
class BubbleSort{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array:- ");
		size = input.nextInt();
		System.out.println("Enter the elements of array\n");
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = input.nextInt();
		}

		for(int i=1; i<size; i++){
			for(int j=0; j<size-i; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array is\n");
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);

	}
}