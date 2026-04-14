import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        // int candidate = nums[0] , count = 1;
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] == candidate){
        //         count++;
        //     } else {
        //         count --;
        //         if(count == 0){
        //             candidate = nums[i];
        //             count = 1;
        //         }
        //     }
        // }
        // return candidate;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++) {
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i]) + 1);
            else
                map.put(nums[i],1);
        }
        int count = -1;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > nums.length / 2) {
                count = e.getKey();
            }
        }
        return count;

    }
}
