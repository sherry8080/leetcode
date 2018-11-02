package stack;

import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int ast: asteroids) {
            if(ast > 0){
                stack.push(ast);
            }else{
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -ast) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == -ast) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(ast);
                }

            }
        }
        return getArray(stack);
    }

    public int[] getArray(Stack<Integer> stack) {
        int i = 0;
        int[] result = new int[stack.size()];
        for (int r : stack) {
            result[i++] = r;
        }

        return result;

    }


    public static void main(String args[]){
        AsteroidCollision ac = new AsteroidCollision();
        int[] arr = {1, 2, -3, 5, 10, -5};
        arr = ac.asteroidCollision(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
