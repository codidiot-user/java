import java.util.Scanner;

public class N_Rotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=sc.nextInt();
		String st="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String res="";
		while(num!=0) {
			int temp=num%10;
			res=st.charAt(temp)+res;
			num/=n;
		}
		System.out.println(res);
	}

}
