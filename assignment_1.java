
public class assignment_1 {

	public static void main(String[] args) {
		// 1. Write a program(WAP) to print INEURON using pattern programming logic.
		
		int n=7;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0 || j==(n-1)/2 ||i==(n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			for(j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || j==i)
					System.out.print("*");
				else
					System.out.print(" ");				
			}
			System.out.print(" ");
			
			for(j=0;j<n;j++)
			{
				if(i==0 || i==(n-1)/2 ||j==0 || i==(n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			for(j=0;j<n;j++)
			{
				if(j==0 && i!=(n-1) || i==(n-1) && j!=0 && j!=(n-1) || j==(n-1) && i!=(n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			for(j=0;j<n;j++)
			{
				if(i==0 && j!=0 && j!=(n-1) || i==(n-1)/2 && j!=(n-1) ||j==0 && i!=0 || j==(n-1) && i<(n-1)/2 && i!=0 || j==i-1 && i>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			for(j=0;j<n;j++)
			{
				if(i==0 && j!=0 && j!=(n-1) ||j==0 && i!=0 && i!=(n-1) || i==(n-1) && j!=0 && j!=(n-1) || j==(n-1) && i!=0 && i!=(n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			for(j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || j==i)
					System.out.print("*");
				else
					System.out.print(" ");				
			}
			System.out.print(" ");
			
		System.out.println();
		}
		System.out.println();
		
		//2. Write a program to print
		//   1 1 1 1
		//   2 2 2 2
		//   3 3 3 3
		//   4 4 4 4
		
		n=4;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		// 3. Write a program to print the given below pattern:
		n=14;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0 || j==0 || i==(n-1) || j==(n-1) || (i+j)<=(n-1)/2 || (j-i)>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 4. Write a program to print the given below pattern:
		n=14;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==0 && i>=(n-1)/2 || i==(n-1) || j==(n-1) && i>=(n-1)/2 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 5. Write a program to print the given below pattern:
		n=14;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==0 || i==0 || i==(n-1) || (i+j)<=(n-1)/2 || i-j>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
