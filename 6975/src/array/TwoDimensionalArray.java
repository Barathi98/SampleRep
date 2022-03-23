package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][]= { {1,2}, {1,2}};
		int b[][]= { {1,2},{1,2,}};

int c[][]=new int[2][2];
int d[][]=new int[2][2];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			
			
				c[i][j]=a[i][j] + b[i][j];
		
			System.out.print(c[i][j]+"\t");
			
		}
	System.out.println();
	}
	System.out.println("---------------------------------");
	for(int i=0;i<a.length;i++)
	{
for(int j=0;j<b.length;j++)
{
	d[i][j]=a[i][j]*b[i][j];
	System.out.print(d[i][j]+"\t");
}
	System.out.println();	
	}
}
}
