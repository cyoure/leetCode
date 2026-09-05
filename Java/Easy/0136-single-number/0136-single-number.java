import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();
        int res = 0;
        for (int num : nums) {
            if (set.contains(num)) {
                duplicateSet.remove(num);
            } else {
                duplicateSet.add(num);
            }
            set.add(num);
        }
        for (Integer i : duplicateSet) {
            res = i;
        }
        return res;
    }
}