package leetcode_questions._647;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String input1 = "abcb";
        System.out.println(new PalindromicSubstrings().countSubstrings(input1));
        System.out.println(new PalindromicSubstrings().countSubstringsOptimal(input1));

    }

    private boolean isPalindrome(String s) {
        if (s.length() < 1) {
            return false;
        }

        for (int i = 0; i < s.length(); i ++) {
            //does outer char's NOT equal?
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public int countSubstrings(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int end = s.length();
            while(i < end) {
                String temp = s.substring(i, end);
                System.out.println(temp);
                ans += isPalindrome(temp) ? 1 : 0;
                end --;
            }
        }
        //runtime o(n^3)
        //space o(1)
        return ans;
    }

    public int countSubstringsOptimal(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i ++) {
            //send in single char
            res += countAroundCenter(s, i, i);

            //send in two consecutive
            res += countAroundCenter(s, i, i + 1);
        }

        return res;
    }

    private int countAroundCenter(String s, int start, int end) {

        int res = 0;

        while (start >= 0 && end < s.length()) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            if(startChar != endChar) break;

            //expand around center:
            start--;
            end++;
            res++;
        }
        return res;
    }
}
