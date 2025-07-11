
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int original=n;
		int copy=n;
		int count=0;
		while(n!=0) {
			int quo=n%10;
			n/=10;
			count++;
		}
		int[] arr=new int[count];
		int ind=0;
		while(copy!=0) {
			int quo=copy%10;
			arr[ind++]=quo;
			same/=10;
		}
		int comparsion=0;
		for(int i=0;i<c;i++) {
			int temp=(int) Math.pow(arr[i],count);
			comparsion+=temp;
		}
		if(original==comparsion) {
		System.out.println("Armstring number");
		}else {
		System.out.println(comparsion);
	}
}

}
