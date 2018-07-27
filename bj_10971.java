import java.util.Scanner;

public class Main{
    
    public static boolean next_permutation(int[]d){
        int n = d.length;
        int i = n-1;
        while(i>0 && d[i] < d[i-1]) i--;
        if (i == 0) return false;
        int j = n-1;  
        while(d[j] < d[i-1]) j--;
        int temp = d[i-1];
        d[i-1] = d[j];
        d[j] = temp;
        
        j=n-1;
        while (i < j) {
            temp = d[i];
            d[i] = d[j];
            d[j] = temp;
            i += 1;
            j -= 1;
        }    
        return true;
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] w = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                w[i][j]=sc.nextInt();
            }
        }
        int[] d = new int[n];
        for (int i=0; i<n; i++) {
            d[i] = i;
        }
        int ans = Integer.MAX_VALUE;
        boolean ok;
        int sum;
        do {
            if(d[0]!=0) break;
            
            ok = true;
            sum = 0;
            for(int i=0;i<n-1;i++){
                if(w[d[i]][d[i+1]]==0) ok = false;
                else sum+=w[d[i]][d[i+1]];
            }
            if(ok && w[d[n-1]][d[0]]!=0){
                sum+=w[d[n-1]][d[0]];
                if(ans > sum) ans = sum;
            }
            
        } while(next_permutation(d));
        System.out.println(ans);
    }
}
