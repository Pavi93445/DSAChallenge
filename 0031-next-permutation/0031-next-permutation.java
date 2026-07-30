class Solution {
    public void nextPermutation(int[] nums) {
      int point = -1;
      for(int i = nums.length-1;i>0;i--){
         if(nums[i-1] < nums[i]){
            point = i-1;
            break;
         }
      }
      if(point == -1){
        reverse(nums,0,nums.length-1);
        return;
      }
      
      int greatpoint = 0;
      for(int j = nums.length-1; j>=0; j--){
        if(nums[j] > nums[point]){
            greatpoint = j;
            break;
        }
      }
      swap(nums,greatpoint,point);
      reverse(nums,point+1,nums.length-1);
      
    }
    public  void swap(int[] nums,int greatpoint,int point ){
        int temp = nums[greatpoint];
        nums[greatpoint] = nums[point];
        nums[point] = temp;
      }
      public void reverse(int[] nums,int i,int j){
         while(i < j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
         }
      }
}