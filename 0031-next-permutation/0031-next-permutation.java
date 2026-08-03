class Solution {
    public void nextPermutation(int[] nums) {
        int point = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                point = i - 1;
                break;
            }
        }
        if(point == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        int greater = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[point]) {
                greater = i;
                break;
            }
        }
        swap(nums,point,greater);  
    reverse(nums,point+1,nums.length-1);

    }

    

    public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}