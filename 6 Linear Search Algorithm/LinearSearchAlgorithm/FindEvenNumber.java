package LinearSearchAlgorithm;

import com.sun.source.tree.BreakTree;

public class FindEvenNumber {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
//        System.out.println(digits(-5552552));
//        System.out.println(even(45965228));

    }
    static  int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if (even(num) )
                count++;
        }
        return count;

    }
    // function to check whether a number contains even digits or not
    static  boolean even(int num){
        int numberofDigits = digits(num);
//        if(numberofDigits %2 == 0){
//            return true;
//
//        }
//        return false;
        return numberofDigits % 2 == 0;
    }


    static int digits(int num){

        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
//
//        int count = 0;
//        while(num > 0 ){
//            count++;
//            num= num/10;
//        }
//        return count;

        return (int)(Math.log10(num) +1);
    }

}
