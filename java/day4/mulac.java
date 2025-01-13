public class mulac {



	public static void main(String[] args) {

		int[]arr= {12,34,12,23,5,10,70,90,900};

		int n=arr.length;

		int []temp=new int[n];

		int index=0;

		for(int i=0;i<n;i++) {

			if(arr[i]%10!=0) {

				temp[index++]=arr[i];

			}

		}

		for(int i=0;i<n;i++) {

			if(arr[i]%10==0) {

				temp[index++]=arr[i];

			}

		}

		for(int i=0;i<n;i++) {

			int arr1[]=temp;

			System.out.print(arr1[i]+" ");

		}



	}



}