package bit_manipulation;

public class CountBit {
    public static int countSetBits(int n){
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(countSetBits(9));
    }
}
