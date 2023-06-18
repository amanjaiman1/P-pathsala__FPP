package Module_2.Arrays_Dynamic_Arrays;

public class Prefix_Max_Element {
    public static int[] calculatePMax(int[] arr) {
        int n = arr.length;
        int[] PMAX = new int[n];

        PMAX[0] = arr[0]; // Base case: PMAX[0] is the first element of arr

        for (int i = 1; i < n; i++) {
            PMAX[i] = Math.max(PMAX[i-1], arr[i]);
        }

        return PMAX;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 6};

        int[] PMAX = calculatePMax(arr);

        System.out.println("PMax array: ");
        for (int num : PMAX) {
            System.out.print(num + " ");
        }
    }
}
