import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int original=num;
		int copy=num;
		int count=0;
		while(num!=0) {
			int quo=num%10;
			num/=10;
			count++;
		}
		int[] arr=new int[count];
		int ind=0;
		while(copy!=0) {
			int quo=copy%10;
			arr[ind++]=quo;
			copy/=10;
		}
		int comparsion=0;
		for(int i=0;i<count;i++) {
			int temp=(int) Math.pow(arr[i],count);
			comparsion+=temp;
		}
		if(original==comparsion) {
		System.out.println("Armstrong number");
		}else {
		System.out.println(comparsion);
	}
	}
}

