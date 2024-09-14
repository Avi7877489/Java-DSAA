package LinearSearchAlgorithm;

public class pax {
    public static void main(String[] args) {
        int [] arr ={18, 12, 9, 14, 77, 50};
        int target = 14;

        int ans = lineras(arr,target);
        System.out.println(ans);
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


}
