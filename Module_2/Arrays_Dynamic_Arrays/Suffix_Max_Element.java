package Module_2.Arrays_Dynamic_Arrays;

public class Suffix_Max_Element {
    public static int[] findSuffixMax(int[] arr) {
        int n = arr.length;
        int[] suffixMax = new int[n];

        int maxSuffix = arr[n - 1];
        suffixMax[n - 1] = maxSuffix;

        for (int i = n - 2; i >= 0; i--) {
            maxSuffix = Math.max(maxSuffix, arr[i]);
            suffixMax[i] = maxSuffix;
        }

        return suffixMax;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 6};

        int[] suffixMax = findSuffixMax(arr);

        System.out.println("Suffix Max array: ");
        for (int num : suffixMax) {
            System.out.print(num + " ");
        }
    }
}
