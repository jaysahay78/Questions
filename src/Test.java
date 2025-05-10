import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static int testfunc(int n, int[] nums){
    int candidate = -1, count = 0;

    // Phase 1: Find a potential majority candidate
    for (int num : nums) {
        if (count == 0) {
            candidate = num;
            count = 1;
        } else if (num == candidate) {
            count++;
        } else {
            count--;
        }
    }

    // Phase 2: Verify the candidate by counting its occurrences
    count = 0;
    for (int num : nums) {
        if (num == candidate) {
            count++;
        }
    }

    // Return the candidate if it's a valid majority element
    if (count > n / 2) {
        return candidate;
    } else {
        return -1;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nums[] = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(testfunc(N, nums));
    }
}
