import java.util.*;
public class While006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
