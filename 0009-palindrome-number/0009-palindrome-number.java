class Solution {
    public boolean isPalindrome(int x) {
        String strX =  Integer.toString(x);
        for (int i = 0; i < strX.length(); i++) {
            if (strX.charAt(i) != strX.charAt(strX.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}