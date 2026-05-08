class Solution {
   public int lengthOfLastWord(String s) {
        String lastWord;
        String[] word = s.split(" ");
        lastWord = word[word.length-1];
        System.out.println(lastWord);
        return lastWord.length();
    }
}