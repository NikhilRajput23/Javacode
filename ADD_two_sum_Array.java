import java.util.Scanner;
class ADD_two_sum_Array {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ADD_two_sum_Array obj = new ADD_two_sum_Array();
        int[] result = obj.twoSum(nums, target);
        System.out.print("[ ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.print("]");
    }
}
