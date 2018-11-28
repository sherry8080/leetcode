package string;

import java.util.HashSet;
import java.util.Set;

public class NextClosetTime {

    int hour;
    int min;

    public String nextClosestTime(String time) {
        String[] times = time.split(":");
        hour = Integer.parseInt(times[0]);
        min = Integer.parseInt(times[1]);
        Set<Integer> set = new HashSet<>();

        //int[] hour_min = new int[]{hour, min};
        set.add(hour / 10);
        set.add(hour % 10);
        set.add(min / 10);
        set.add(min % 10);

        nextTime();

        while(!contains(set, hour, min)){
            nextTime();
        }

        String h = "";
        String m = "";
        if(hour >= 0 && hour <= 9){
            h = "0" + hour;
        }else{
            h = "" + hour;
        }

        if(min >= 0 && min <= 9){
            m = "0" + min;
        }else {
            m = "" + min;
        }

        return h + ":" + m;
    }

    public boolean contains(Set set, int hour, int min) {
        return set.contains(hour / 10) && set.contains(hour % 10) && set.contains(min / 10) && set.contains(min % 10);
    }

    public void nextTime(){
        min++;
        if(min == 60){
            hour++;
            min = 0;
            if(hour == 24){
                hour = 0;
            }
        }
    }

    public static void main(String args[]){
        NextClosetTime n = new NextClosetTime();
        System.out.println(n.nextClosestTime("20:48"));
    }

}
