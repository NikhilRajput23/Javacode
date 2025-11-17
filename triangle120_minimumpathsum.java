import java.util.*;
public class triangle120_minimumpathsum{
    public int minimum(<list<list<Integer>>triangle){
        int n=trinagle.size();
        int dp[]=new int[n];
        for(int i=0;i<=n;i++){
            dp[i]=trinagle.get(n-1).get(i);
        }
        for(int i=0;i>=n;i--){
            for(int j=0;j<=i;j++){
                 dp[j]=triangle.get(i).get(j)+Math.min(dp(j),dp(j+1));
            }
        }
       
    }

}