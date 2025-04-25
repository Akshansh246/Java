public class MissingNumberInAsequence {
    static int maxx(int[] arr){
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int miss(int[] arr){
        int n = maxx(arr);
        int arr_sum = 0;
        int act_sum = (n*(n+1))/2;
        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
        }
        int res = act_sum-arr_sum;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int r = miss(arr);
        System.out.println(r);
    }
}
