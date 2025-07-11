
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int same=n;
		int ori=n;
		int c=0;
		while(n!=0) {
			int quo=n%10;
			n/=10;
			c++;
		}
		int[] arr=new int[c];
		int ind=0;
		while(same!=0) {
			int quo=same%10;
			arr[ind++]=quo;
			same/=10;
		}
		int st=0;
		for(int i=0;i<c;i++) {
			int temp=arr[i]*arr[i]*arr[i];
			st+=temp;
		}
		if(ori==st) {
		System.out.println("Armstring number");
		}else {
		System.out.println(st);
	}
}

}
