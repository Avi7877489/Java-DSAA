package LinearSearchAlgorithm;

public class RichestCustomerWealth {


    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
//               int element = accounts[person][account];
//               sum += element;
                sum += accounts[person][account];


               }
            if (sum > ans){
                ans = sum;


            }

        }
        return ans;

    }
}
