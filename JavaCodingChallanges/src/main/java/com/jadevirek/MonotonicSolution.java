package main.java.com.jadevirek;

/**
 *  ArrayMonotonic PROBLEM - solution, algorithm in Java
 * @see {https://leetcode.com/problems/monotonic-array/}
 *  Monotonic Array [896]  LeetCode problem
 *
 *  An array is monotonic if it is monotone increasing, or monotone decreasing. Since a <= b and b <= c implies a <= c,
 *  we only need to check adjacent elements to determine if the array is monotone increasing (or decreasing, respectively).
 *  We can check each of these properties in one pass.
 *
 * @author jaDEVirek
 */
public class MonotonicSolution {

//    private boolean decreasingFLAG = ;
//    private boolean increasingFLAG= ;

    public static  boolean isIncreasing(int [] arr){
        for(int i = 1; i<arr.length; i++){
            System.out.println( arr[i - 1] <= arr[i]);
            return arr[i - 1] <= arr[i];
        }
        return true;
    }

    /**
     *   Soultion O(n) timing complexity
     * @param arr
     * @return
     */
    static boolean isMonotonic(int[] arr){
        if(arr.length <= 2){
            return true;
        }
        int diff = 0;
        for (int i=1; i<arr.length; i++){
            int newDiff = arr[i] - arr[i-1];
            if (newDiff * diff < 0) {
                return false;
            }
            diff = newDiff;
        }
        return true;
    }

    /**
     * Other clean solution
     * @param array
     */
    public boolean isMonotonicSolve2(int[] array) {
        int store = 0;
        for (int i = 0; i < array.length - 1; ++i) {
            int c = Integer.compare(array[i], array[i+1]);
            if (c != 0) {
                if (c != store && store != 0)
                    return false;
                store = c;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isIncreasing( new int[]{1,2,2,3} ));
        System.out.println(isIncreasing( new int[]{133,1,11,} ));

    }


}
