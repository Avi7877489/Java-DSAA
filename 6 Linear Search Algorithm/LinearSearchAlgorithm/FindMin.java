package LinearSearchAlgorithm;

public class FindMin {
    public static void main(String[] args) {
        int[] num = {18, 12, -7, 3, 14, 28, -8};
        System.out.println(min(num));
    }
//    static int min(int[] arr){
//       int ans = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < ans){
//                ans = arr[i];
//            }
//        }
//
//        return ans;
//    }

   static  int min(int[] arr){
        int ans = arr[0];

       for (int i = 0; i < arr.length; i++) {
           if (arr[i] < ans){
               ans = arr[i];
           }
       }
       return ans;
   }

}
