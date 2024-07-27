public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 15;
        nums[2] = 25;
        nums[3] = 35;
        nums[4] = 45;
        //if we write nums[5] = 55; it will be error
        int res = nums[2] + nums[3];
        System.out.println(nums[0]); //first 0 for index
        System.out.println(res);

        float[] nums2 = new float[] {5.0f, 6.445f, 89.984f};
        System.out.println(nums2[1]);
    }
}
