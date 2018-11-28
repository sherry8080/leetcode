package array;

public class PrimeCount {
    /*public int countPrimes(int n) {
        int ans = 0;
        if(n <= 2) return 0;
        for(int i = 2; i < n; i++){
            if(isPrime(i)){
                ans++;
            }
        }
        return ans;
    }

    public boolean isPrime(int n){
        if(n == 2) return true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }*/

    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }

        return count;
    }

    public static void main(String args[]){
        PrimeCount p = new PrimeCount();
        System.out.println(p.countPrimes(10));
    }
}
