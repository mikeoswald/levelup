package leetcode_questions._344;

public class ReverseString {
    public void reverseStringIteratively(char[] s) {
        int j = s.length - 1;
        for(int i = 0; i <= j; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
    }

    public void reverseStringRecursive(char [] s, int i, int j){
        if(i > j) return;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        reverseStringRecursive(s, i + 1, j - 1 );
    }
}
