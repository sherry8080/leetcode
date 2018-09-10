package stack_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExclusiveTimeFunction {

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] times = new int[n];
        Stack<Integer> functions = new Stack<Integer>();
        int prev = 0;
        for (String log : logs) {
            String[] segs = log.split(":");
            boolean isEnd = segs[1].equals("end");
            int t = isEnd ? Integer.parseInt(segs[2]) + 1 : Integer.parseInt(segs[2]);
            if (!functions.isEmpty()) {
                times[functions.peek()] += t - prev;
            }

            prev = t;
            if (isEnd) {
                functions.pop();
            } else {
                functions.push(Integer.parseInt(segs[0]));
            }
        }

        return times;

    }

    public static void main(String args[]){
        ExclusiveTimeFunction e = new ExclusiveTimeFunction();
        List<String> log = new ArrayList<>();
        log.add("0:start:0");
        log.add("1:start:2");
        log.add("1:end:5");
        log.add("0:end:6");

        int[] arr = e.exclusiveTime(2, log);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
