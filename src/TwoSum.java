import java.util.Arrays;
//Brut solution
public class TwoSum {
        public static int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for(int i=0; i<nums.length; i++){
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j] == target - nums[i]){
                        result[0] = i;
                        result [1] = j;
                    }
                }

            }
            return result;

        }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 4, 4, 0};
        int target = 4;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}
