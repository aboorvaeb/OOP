import java.util.Scanner;
public class Duplicatee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,l;
		int k=0;
		int indi;
		System.out.println("enter the number of elements to be inserted in ur array");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int []a=new int[n];
		System.out.println("enter numbers between 10 and 100" );
		for(i=0;i<n;i++)
		{	indi=0;
			System.out.println("enter the number");
			int e=input.nextInt();
			if(i==0)
			{
				a[k]=e;
				k++;
			}
			else
			{
				for(j=0;j<i;j++)
				{
					if(e==a[j])
					{
						indi=-1;
						break;			
					}
				}
				if(indi==0)
				{
					a[k]=e;
					k++;
				}
				
			}
			System.out.println("the modified array is:");
			for(l=0;l<k;l++)
			{
	System.out.println(a[l]);
			}
		}


	}

}
