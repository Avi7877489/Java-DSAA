package LinearSearchAlgorithm;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SearchingString {
    public static void main(String[] args) {
        String name = "Avijit";
        char target = 'j';
        System.out.println(Search2(name,target));
        System.out.println(Arrays.toString((name.toCharArray())));

    }
    // Traditional for loop
//    static boolean Search(String str, char target){
//        if (str.length() == 0) {
//            return false;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == target){
//                return true;
//            }
//        }
//        return false;
//    }


    // for of loop
    static boolean Search2(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()){
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

}
