package projects.org;

import java.util.Scanner;

public class Cardvalidation {

	public static void main(String[] args) {
	Cardvalidation cv=new Cardvalidation();
	cv.Method();

	}

	private void Method() {	
		int[] cno=new int[16];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the card number");
		int i;
		for( i=0;i<cno.length;i++)
		{
			cno[i]=sc.nextInt();
			//System.out.println(cno[i]);
		}
		int checksum=cno[cno.length-1];
		System.out.println("The cheksum is "+ checksum);
		
		
		// for finding add position from right
		int len=cno.length-1;
		
	
	    
	    int[] b=new int[len];
	    for(int j=len-1;j>=0;j--)
	    {
	      if(j%2==0)
	      {
	        b[j]=cno[j]*2;
	        if(b[j]>9)
	        {
	          int rem=b[j]%10;
	          int quo=b[j]/10;
	          b[j]=rem+quo;
	        }
	      }
			else
			{
				b[j]=cno[j];
			}
			System.out.print(b[j]+" ");
				}
		System.out.println();
		int sum=0;
		for(int k=b.length-1;k>=0;k--)
		{
		sum=sum+b[k];
		}
		System.out.println("The sum of total number is "+ sum);
		
int c=10-(sum%10);
if(c==checksum)
{
	System.out.println("credit card is valid");
}
else
	System.out.println("Not valid");
		
		
	}

}
