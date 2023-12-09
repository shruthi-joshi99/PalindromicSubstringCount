// PALINDROMIC SUBSTRING COUNT
import java.util.Arrays;

public class Solution {
    public int solve(String A) {

        boolean[][] dp = new boolean[A.length()][A.length()];
        for(boolean[] i:dp)
        {
            Arrays.fill(i,false);
        }

        int ans=0;
        for(int i=0;i<A.length();i++)
        {
            for(int j=i;j<A.length();j++)
            {
                if(isPalindromic(i,j,A,dp)==true)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
    public boolean isPalindromic(int i,int j,String A,boolean[][] dp)
    {
        if(i>=j)return true;

        if(dp[i][j]!=false)
        {
            return dp[i][j];
        }

        dp[i][j]=(A.charAt(i)==A.charAt(j)) && isPalindromic(i+1,j-1,A,dp);

        return dp[i][j];
    }

}

