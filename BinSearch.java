public class BinSearch {

    int bin(int [] arr, int i, int j, int  key){
        if(i==j) {
            if (arr[i] == key) return i;
            else return 0;
        }
        else{
            int mid = (i+j)/2;
            if(key == arr[mid])
                return mid;
            else if(key< arr[mid])
                return bin(arr, i,mid-1, key);
            else
                return bin(arr, mid+1, j, key);
        }
    }
}
