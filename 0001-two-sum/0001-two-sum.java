class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer>map = new HashMap<>();
    
    for(int i = 0;i<nums.length;i++){
        int num = nums[i];
        int moreneeded = target - nums[i];
        if(map.containsKey(moreneeded)){
            return new int[]{map.get(moreneeded),i};
        }
        map.put(num,i);
    }
     
   return new int[]{-1,-1};
    }
}