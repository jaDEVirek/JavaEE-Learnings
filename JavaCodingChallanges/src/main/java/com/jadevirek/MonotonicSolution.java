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



    public static void main(String[] args) {

        System.out.println(isIncreasing( new int[]{1,2,2,3} ));
        System.out.println(isIncreasing( new int[]{133,1,11,} ));

    }


}
