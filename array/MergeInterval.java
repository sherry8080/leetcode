package array;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class MergeInterval {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() == 0 || intervals == null) return intervals;
        List<Interval> res = new LinkedList<>();
        Collections.sort(intervals, new Comparator<Interval>(){  //sort intervals by start
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        for(int i = 0; i < intervals.size(); i++) {  //traverse intervals
            Interval t = intervals.get(i);
            int s = t.start, e = t.end;
            while(i < intervals.size() - 1 && intervals.get(i + 1).start <= e) {  //if next.start < curr.end
                Interval tmp = intervals.get(i + 1);
                s = Math.min(s, tmp.start);
                e = Math.max(e, tmp.end);
                i++;
            }
            Interval r = new Interval(s, e);
            res.add(r);
        }
        return res;
    }
}
