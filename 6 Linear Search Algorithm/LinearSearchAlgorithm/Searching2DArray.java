package LinearSearchAlgorithm;

import java.util.Arrays;

public class Searching2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 96},
                {18, 12}
        };
        int target = 34;
        int[] ans = search2(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
        System.out.println("min vlu is : " + minvlu(arr));

    }

    static int[] search2(int[][] arr, int target){
//        if (arr.length == 0){
//            return -1;
//        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[] {-1, -1};

    }

    // print max value

    static int max(int[][] arr){
//        int max = arr[0][0];

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row] [col] > max){
//                    max = arr[row][col];
//                }
//
//            }
//
//        }
        // Same
        int max = Integer.MIN_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if (element > max){
                    max = element;
                }
            }
        }
        return max;

    }

    // Print Minimum value

    static int  minvlu(int[][] arr) {
        int min = Integer.MAX_VALUE;

        for (int[] ints : arr) {
            for(int element : ints){
                if (element < min){
                    min = element;
                }
            }

        }
        return min;
    }
}
