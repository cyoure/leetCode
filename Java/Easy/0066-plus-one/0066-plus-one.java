class Solution {
   public int[] plusOne(int[] digits) {
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = digits[i-1];
        }
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] == 9) {
                    digits[i] = 0;
                    newArr[i+1] = 0;
                
            } else {
                digits[i]++;
                break;
            }
        }
        if (digits[0] == 0){
            return newArr;
        } else {
            return digits;
        }
    }
}