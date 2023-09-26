import java.util.ArrayList;
import java.util.Scanner;

public class SubarraySumMultipleOfK {
    public static boolean checkSubarraySum(int[] arr, int k) {
        // ... (same checkSubarraySum function as before)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();

        System.out.println("Enter the elements of the array (enter a non-integer to finish):");
        while (scanner.hasNextInt()) {
            int element = scanner.nextInt();
            arrList.add(element);
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            arr[i] = arrList.get(i);
        }

        boolean result = checkSubarraySum(arr, k);
        System.out.println("Result: " + result);

        // Add return statement to indicate the result
        if (result) {
            System.out.println("There exists a subarray with a sum divisible by k.");
        } else {
            System.out.println("No subarray with a sum divisible by k found.");
        }
    }
}
