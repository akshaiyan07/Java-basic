import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==rev(n,0)){
		    System.out.print("T");
		}
		else{
		    System.out.print("F");
		}
	}
	public static int rev(int n,int r){
	    if(n==0){
	        return r;
	    }
	    return rev(n/10,r*10+n%10);
	}
}
