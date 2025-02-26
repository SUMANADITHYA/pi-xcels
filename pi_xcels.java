package program;
import java.util.*;
public class pi_xcels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		 int[] result = isDigit(n, arr);

		 
//		 	System.out.println(Arrays.toString(result));
		 
		 for(int i = 0; i<n; i++)
		 {
			 System.out.print(result[i]+" ");
		 }
		
		
	}
	
	public static int[] isDigit(int n , int arr[])
	{
		int num = 0;
		
		for(int i =0; i<n; i++)
		{
			num = num * 10 + arr[i];
		}
		
		num += 1;
		
		String newStr = String.valueOf(num);
		
		int res [] = new int[newStr.length()];
		
		for(int i =0; i< newStr.length(); i++)
		{
			res[i] = newStr.charAt(i)-'0';
		}
		
		return res;
	}

}
