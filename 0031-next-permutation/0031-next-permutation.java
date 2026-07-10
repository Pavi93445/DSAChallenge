class Solution {
    public void nextPermutation(int[] nums) {
        int point = -1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]  < nums[i+1]){
                    point = i;
                    break;
            }
        }
        if(point == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i = nums.length-1;i>point;i--){
            if(nums[i] > nums[point]){
                swap(nums,i,point);
                break;
            }
        }
        reverse(nums,point+1,nums.length-1);
    }
    public void swap(int[] nums,int start,int end){
       int temp = nums[start];
       nums[start] = nums[end];
       nums[end] = temp;
    }
    public void reverse(int[] nums,int start,int end){
       while(start < end){
        swap(nums,start,end);
        start++;
        end--;
       }
    }
}