package check_Bit;

import java.util.Scanner;

/*
  	You are given two integers A and B.
	Return 1 if B-th bit in A is set
	Return 0 if B-th bit in A is unset
 */
public class Check_Bit {


	private static int check_bit(int n, int bit) {
		// TODO Auto-generated method stub
		int set_bit=0;
		int temp=n>>bit;
		if((temp&1)==1)
		{
			set_bit=1;
		}
		return set_bit;
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int bit=scanner.nextInt();
		System.out.println(check_bit(n,bit));

	}


}
/*
	Input
	A = 4
	B = 1

	Output
	0
	
	Input
	A = 5		101  ( 0 - based indexing )
	B = 2		1

	Output
	1
*/