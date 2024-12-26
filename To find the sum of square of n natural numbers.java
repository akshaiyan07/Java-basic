import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sl=new Scanner(System.in);
        int n=sl.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int sq=i*i;
            sum=sum+sq;
            System.out.println(sum);
        }
    }
}
