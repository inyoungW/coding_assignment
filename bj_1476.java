import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int a=1,b=1,c = 1;
        int day = 0;
        while(true){
            day +=1;
            if(a==e && b==m && c==s){
                System.out.println(day);
                break;
            }
            if(++a>15) a=1;
            if(++b>28) b=1;
            if(++c>19) c=1;
        }
    }
}
