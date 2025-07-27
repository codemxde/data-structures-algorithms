import java.util.ArrayList;

public class Solution {

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        if (A.size() == 1) return A;

        int si = A.get(0).get(0);
        int ei = A.get(0).get(1);
        ArrayList < ArrayList <Integer>  > mergedIntervals = new ArrayList<>();

        for (int i = 1; i < A.size(); i++) {
            int startIndex = A.get(i).get(0);
            int endIndex = A.get(i).get(1);
            
            if (startIndex <= ei) {
                ei = endIndex > ei ? endIndex : ei;
            } else {
                ArrayList <Integer> mergedInterval = createMergedInterval(si, ei);
                mergedIntervals.add(mergedInterval);

                si = startIndex;
                ei = endIndex;
            }
        }

        ArrayList <Integer> mergedInterval = createMergedInterval(si, ei);
        mergedIntervals.add(mergedInterval); 

        return mergedIntervals;
    }

    public static ArrayList<Integer> createMergedInterval(int si, int ei) {
        ArrayList <Integer> mergedInterval = new ArrayList<>();
        mergedInterval.add(si);
        mergedInterval.add(ei);

        return mergedInterval;
    }

}
