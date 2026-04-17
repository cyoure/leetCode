public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // 1. 첫 번째 문자열의 한 글자씩 기준으로 삼음 (기준 인덱스: j)
        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].charAt(j); // 비교할 기준 문자

            // 2. 나머지 단어들과 비교 (단어 인덱스: i)
            for (int i = 1; i < strs.length; i++) {
                // 현재 단어의 길이가 j보다 작거나(단어가 더 짧음)
                // 현재 단어의 j번째 글자가 기준 문자(c)와 다르다면
                if (j == strs[i].length() || strs[i].charAt(j) != c) {
                    // 지금까지 일치한 부분까지만 잘라서 반환
                    return strs[0].substring(0, j);
                }
            }
        }

        // 모든 단어를 다 통과했다면 첫 번째 단어 자체가 공통 접두사
        return strs[0];
    }
}