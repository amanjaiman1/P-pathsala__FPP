package Module_2.Arrays_Dynamic_Arrays;

public class Pre_Comput_Techniques {
    public static void printSubarraySums(int[] arr, int[][] queries) {
        int n = arr.length;

        // Calculate the prefix sum array
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }

        // Iterate over the queries and print the subarray sums
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];

            // Calculate the sum of subarray(l, r)
            int sum;
            if (l == 0) {
                sum = prefixSum[r];
            } else {
                sum = prefixSum[r] - prefixSum[l - 1];
            }

            // Print the sum
            System.out.println("Sum of subarray(" + l + ", " + r + "): " + sum);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] queries = {{0, 2}, {1, 3}, {2, 4}};

        printSubarraySums(arr, queries);
    }
}
