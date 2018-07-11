import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i=0;i<n;i++){
            s[i] = sc.nextInt();
        }
        int a=0;
        int i;
        for(i=n-1;i>0;i--){
            if (s[i-1] < s[i]){
              break;
            }
        }
        if(i<=0){
            System.out.println(-1);
            return;
        }
        int j;
        for(j=n-1;j>=i;j--){
            if(s[j]>s[i-1]){
                break;
            }
        }
        int temp = s[j];
        s[j]=s[i-1];
        s[i-1]=temp;
        
        Arrays.sort(s,i,n);
        for(int l=0;l<n;l++){
            System.out.print(s[l]+" ");
        }
        
    }
}
