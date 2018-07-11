import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i=0;i<n;i++){
            s[i] = sc.nextInt();
        }
        int j=n-1;
        while(j>0 && s[j-1] < s[j]) j--;
        
        if(j<=0){
            System.out.println(-1);
            return;
        }
        int a= s[j-1];
        int k=n-1;
        while(a<s[k]) k--;
        s[j-1]=s[k];
        s[k]=a;
        k=n-1;
        while(j<k){
            int t = s[j];
            s[j] = s[k];
            s[k] = t;
            j+=1;
            k-=1;
        }

        for(int l=0;l<n;l++){
            System.out.print(s[l]+" ");
        }
        
    }
}
