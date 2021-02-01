class Pair{
    int max, min;
}
public class MaxMin{
    static Pair maxmin(int [] a, int i,int length){
        Pair p = new Pair();
        if(i >= length-2){
            if(a[i]>a[i+1]){
                p.max = a[i];
                p.min = a[i+1];
                return p;
            }
            else{
                p.max = a[i+1];
                p.min = a[i];
                return p;
            }
        }
        p = maxmin(a, i+1, length);
        if(p.max > a[i]){
            if(p.min <a[i])
                return p;
            p.min=  a[i];
            return p;
        }
        else{
            p.max = a[i];
            if(p.min < a[i])
                return p;
            p.min = a[i];
            return p;

        }
    }
    public static void main(String args[]){
        int[] a = {70,290,0,80,140,290,14};
        
        Pair p = new Pair();
        p = maxmin(a, 0, 7);

        System.out.println(p.max+","+p.min);
    }
}