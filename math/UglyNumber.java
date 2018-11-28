package math;

public class UglyNumber {

    public int nthUglyNumber(int n) {

        int count = 1;
        int i = 1;
        if(n == 1){
            return 1;
        }

        while(count < n){
            i++;
            if(isUgly(i)){
                count++;
            }
        }
        return i;
    }

    public boolean isUgly(int n){

        n = getUgly(n, 2);
        if(n == 1){
            return true;
        }
        n = getUgly(n, 3);
        if(n == 1){
            return true;
        }
        n = getUgly(n, 5);
        if(n == 1){
            return true;
        }
        return false;
    }

    public int getUgly(int n, int div){
        while(n % div == 0){
            n = n / div;
        }
        return n;
    }

    public static void main(String args[]){
        UglyNumber u = new UglyNumber();
        System.out.println(u.nthUglyNumber(1352));
    }
}
