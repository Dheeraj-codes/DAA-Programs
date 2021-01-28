public class MergeSort{
    int[] arr;
    public MergeSort(int[] a){
        arr = a;
    }
    
    void mergeSort(int low , int high){
        if(low<high){
            int mid = (low + high)/2;
            mergeSort(low, mid);
            mergeSort(mid+1, high);
            merge(low, mid, high);
        }
    }
    void merge(int low, int mid, int high){
        int h= low, i = low, j = mid+1;
        int[] b = new int[arr.length];
        while((h <= mid) && (j<=high)){
            if(arr[h] <= arr[j]){
                b[i] = arr[h];
                h=  h+1;
            }
            else{
                b[i] = arr[j];
                j = j+1;
            }
            i++;
        }
        if(h>mid)
            for(int k = j; k<= high; k++){
                b[i] = arr[k];
                i++;
            }
        else
            for(int k=h; k<= mid; k++)
                b[i++] = arr[k];
        for(int k = low; k<=high; k++){
            arr[k] = b[k];
        }


    }
    void display(){
        for(int temp: arr)
            System.out.println(temp);
    }
}
