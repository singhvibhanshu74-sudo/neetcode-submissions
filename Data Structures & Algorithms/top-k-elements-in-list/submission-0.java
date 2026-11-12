class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        
        if(nums.length == 0) return nums;

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

            List<Integer> keys = new ArrayList<>(map.keySet());
            Collections.sort(keys,(a,b) -> Integer.compare(map.get(b), map.get(a)));

            int[] result = new int[k];
            for(int i = 0;i<k;i++){
                result[i] = keys.get(i);
            }
            return result;
        }
        
    }
