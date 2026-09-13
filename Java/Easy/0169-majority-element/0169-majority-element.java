import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxCount = 0;
        int answer = 0;
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
                answer = num;
            }
            map.put(num, count);
        }
        return answer;
    }
}