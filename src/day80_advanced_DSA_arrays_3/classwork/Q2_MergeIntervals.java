package day80_advanced_DSA_arrays_3.classwork;

import java.util.ArrayList;

public class Q2_MergeIntervals {
    public static void main(String[] args) {

        // Original List of type Intervals (Defined in the Interval Class)
        ArrayList<Interval> A = new ArrayList<>();
        A.add(new Interval(1, 3));
        A.add(new Interval(6, 9));

        //Interval which is to be inserted, needs to be passed as an object in the insert() function. So passing " new Interval(2, 5)) " in the function call

        System.out.println(insert(A, new Interval(2, 6)));

    }


    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> ans = new ArrayList<>();

        int N = intervals.size();

        //Iterate the interval list from 0 to N-1
        for (int i = 0; i < N; i++) {

            /* Since the list contains object of intervals. Assign it to variable of type Interval */
            Interval I = intervals.get(i);

            /* Case 1: Non-overlapping when (I.end < newInterval.start) */
            if (I.end < newInterval.start) {
                ans.add(I);
            }

            /* Case 2: Non-overlapping when (newInterval.end < I.start) */
            else if (newInterval.end < I.start) {
                // Adding the new interval to the ans list
                ans.add(newInterval);

                // Adding the remaining intervals of the original list into the ans list because
                // there won't be any new merge possible
                for (int j = i; j < N; j++) {
                    I = intervals.get(j);
                    ans.add(I);
                }
                return ans;
            }
            /* Case 3: Overlapping [Merging of intervals] when (I.end >= newInterval.start) */
            else {
                newInterval.start = Math.min(I.start, newInterval.start);
                newInterval.end = Math.max(I.end, newInterval.end);
            }
        }
        // Edge Case:  When nun of the interval merge, add the newInterval to the ans and return it
        ans.add(newInterval);
        return ans;
    }

}

