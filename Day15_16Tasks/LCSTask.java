package Day15_16Tasks;

public class LCSTask {
	public int LCS(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        int[][] dp = new int[m + 1][n + 1];
        
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LCSTask lcs= new LCSTask();
       String text1= "ABCCDA";
       String text2= "ACA";
       int lengthOfLCS =lcs.LCS(text1, text2);
       System.out.println("Length of LCS is "+ lengthOfLCS);
	}

}
