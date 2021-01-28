class SelectionSort{

	public static void main(String args[]){
		int arr[] = {2,1,3,4,5}, min;
		for (int i=0; i<4; i++){
			min = i;
			for(int j=i+1; j<5; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}
		for(int x : arr){
			System.out.println(x);
		}
	}
}