package binary_search;

public class Power {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        double t = myPow(x,n/2);
        if(Math.abs(n) % 2 == 1){
            return n < 0 ? 1/x*t*t : x*t*t;
        }else{
            return t*t;
        }
    }
}
