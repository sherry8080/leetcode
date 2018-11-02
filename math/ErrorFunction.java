package math;

public class ErrorFunction {

    public static void main(String args[]){
        double theta0 = 0,theta1 = 1, alpha = 0.25;
        double delta1, delta2, error;
        int[] x = {3,1,0,4};
        int[] y = {2,2,1,3};
        for(int i = 0; i < 5; i++) {
            delta1 = 0;
            delta2 = 0;
            for(int j = 0; j < 4; j++) {
                delta1 = delta1 + (0.25 * (theta0 + theta1 * x[j] - y[j]));
                delta2 = delta2 + (0.25 * (theta0 + theta1 * x[j] - y[j]) * x[j]);
            }
            theta0 = theta0 - alpha * delta1;
            theta1 = theta1 - alpha * delta2;
            error = 0;
            for(int k = 0; k < 4; k++){
                error = error + 0.125 * (theta0 + theta1 * x[k] - y[k]) * (theta0 + theta1 * x[k] - y[k]);
            }
            System.out.println(error);
        }
    }
}
