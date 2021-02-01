public class MaxMin_by_half_divide {

    Pair maxmin(int [] a, int i, int j){
        Pair p = new Pair();
        if(i == j){
            p.max = a[i];
            p.min = a[i];
            return p;
        }
        else if(i == j-1){
            if(a[i]>a[j]){
                p.max = a[i];
                p.min = a[j];
            }
            else{
                p.max = a[j];
                p.min = a[i];
            }
            return p;
        }
        else{
            int mid = (i+j)/2;
            Pair p1 = maxmin(a, i, mid);
            Pair p2 = maxmin(a, mid+1, j);

            if(p1.max < p2.max)
                p1.max = p2.max;
            if(p1.min > p2.min)
                p1.min = p2.min;
            return p1;
        }

    }
}
