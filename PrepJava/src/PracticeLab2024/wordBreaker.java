package src.PracticeLab2024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class wordBreaker {
    public static void main(String[] args) {

        String s = "leetcode";
        List<String> wordDict = Arrays.asList(new String[]{"leet", "code"});
        System.out.println(wordBreak(s,wordDict));
    }

    private static boolean wordBreak(String s, List<String> wordDict) {

        int n=s.length();

        HashSet<String> set= new HashSet<>(wordDict);

        boolean[] dp=new boolean[n+1];
        dp[0]=true;

        for (int i=1;i<n;i++){
            for (int j=0;j<i;j++){
                if (dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
