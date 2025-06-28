import java.util.*;
public class While007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=num;
		int count=0;
		while(n>0) {
			int rem=n%10;
			count=count+1;
			n=n/10;
		}
		System.out.println(count);
		
	}

}
