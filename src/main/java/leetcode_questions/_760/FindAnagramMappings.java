package leetcode_questions._760;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAnagramMappings {
    public static void main(String[] args) {
        int[] A = new int[]{12, 28, 46, 32, 50};
        int[] B = new int[]{50, 12, 32, 46, 28};
        System.out.println(Arrays.toString(new FindAnagramMappings().anagramMappingsBF(A,B)));

        A = new int[]{12, 28, 46, 32, 50};
        B = new int[]{50, 12, 32, 46, 28};
        System.out.println(Arrays.toString(new FindAnagramMappings().anagramMappings(A,B)));

    }
    public int[] anagramMappingsBF(int[] A, int[] B) {
        for(int i =0; i < A.length; i ++) {
            int curr = A[i];

            for(int j = 0; j < B.length; j++) {
                int jCurr = B[j];
                if(curr == jCurr) {
                    A[i] = j;
                    break;
                }
            }
        }

        return A;
    }

    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int j = 0; j < B.length; j++) {
            int jCurr = B[j];
            map.put(jCurr, j);
        }

        for(int i =0; i < A.length; i ++) {
            int curr = A[i];
            A[i] = map.get(curr);
        }

        return A;
    }
}
