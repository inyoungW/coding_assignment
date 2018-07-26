import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        boolean broken[]= new boolean [10];
        for(int i=0;i<m;i++){
            broken[sc.nextInt()]=true;
        }
        int ans = n-100;
        if(ans < 0){
            ans = -ans;
        }
        
        for(int i=0;i<=1000000;i++){
            int c= i;
           int len = Main.possible(c,broken);

            if(len > 0){
                int press = c-n;
                if (press < 0){
                    press =-press;
                }
                if(ans > len + press){
                    ans = len+press;
                }
            }
        }
        System.out.println(ans);
    }
    public static int possible(int c,boolean[] broken){
         int len = 0;
            if(c==0){
                if(broken[0]){
                    return 0;
                } else { 
                    return 1;
                }
            }
             while(c > 0){
                if(broken[c%10]){
                    return 0;
                }
                len +=1;
                c/=10;
            }
            return len;
    }

}
