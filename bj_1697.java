import java.util.Scanner;
import java.util.LinkedList;

public class Main{
    static final int MAX = 100001;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        boolean check[]= new boolean[MAX];
        int dist[]=new int[MAX];
        int arr[] = new int[3];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(n);
        check[n]=true;
        int now;
        while(!queue.isEmpty()){
            now = queue.pop();
            if(now == k) {
                System.out.println(dist[now]);
                return;
            }
            arr[0] = now-1;
            arr[1] = now +1;
            arr[2] = now*2;
            for(int v:arr){
                if(v>=0 && v<MAX){
                    if(check[v]==false){
                        queue.add(v);
                        check[v] = true;
                        dist[v] = dist[now]+1;
                    }
                }
            }
        }
        
    }
}
