import java.util.*;
public class While004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
