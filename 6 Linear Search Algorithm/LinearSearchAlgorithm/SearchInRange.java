package LinearSearchAlgorithm;

public class SearchInRange {
    public static void main(String[] args) {
        int[] num = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(SearchInrange(num,target,1,4));
//        int ans = SearchInrange(num,target,1,4);
//        System.out.println(ans);
    }

    static int SearchInrange(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
