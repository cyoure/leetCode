public class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for(int i = 0; i < columnTitle.length(); i++){
             int value = (columnTitle.charAt(i)-65) + 1;
             res = res * 26 + value;
        }
        return res;
    }
}
