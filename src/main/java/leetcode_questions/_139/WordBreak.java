package leetcode_questions._139;

import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        System.out.println("ANS "+ new WordBreak().wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        System.out.println("ANS "+ new WordBreak().wordBreak("leetcode", Arrays.asList("leet", "code")));
        System.out.println("ANS "+ new WordBreak().wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
        System.out.println("ANS "+ new WordBreak().wordBreak("ccbb", Arrays.asList("bc", "cb")));

    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet=new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (dp[j] && wordDictSet.contains(sub)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
