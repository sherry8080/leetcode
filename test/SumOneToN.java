package test;

public class SumOneToN {
    public static int getSum(int num){
        int sum = 0;
        if(num == 0) return 0;
        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0){
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(getSum(8));
    }
}
