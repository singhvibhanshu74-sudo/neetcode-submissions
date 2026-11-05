class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> boi = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            boi.put(nums[i], boi.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : boi.entrySet()){
            if(entry.getValue() > nums.length / 2){
                return entry.getKey();
    }
} 
return -1;

    }
}