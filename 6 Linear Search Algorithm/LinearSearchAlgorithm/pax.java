package LinearSearchAlgorithm;

import java.util.Stack;

public class pax {
    public static void main(String[] args) {
        int [] arr ={18, 12, 9, 14, 77, 50};
        int target = 14;


        int ans = lineras(arr,target);
        System.out.println(ans);

        String atr = "Avijit";
        char targe = 'j';
        System.out.println(serch(atr,targe));

        System.out.println(sarchinrange(arr,target,2,5));
    }
    static int lineras(int[] arr , int target){
        if (arr.length == 0) {
            return  -1;
        }
//        for(int element : arr){
//            if (element == target) {
//                return target;
//            }
//        }
//        return -1;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    static boolean serch(String str,char target){

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == target){
//                return true;
//            }
//
//        }
//        return false;

        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }

    static int sarchinrange(int[] arr, int target, int start, int stop){

        for (int i = start; i <= stop ; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }




}
