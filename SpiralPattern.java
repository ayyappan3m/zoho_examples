package zohoexamples;

public class SpiralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 1;
		int n = 2;
		int i;
		int startrow = 0;
		int endrow = n - 1;
		int startcol = 0;
		int endcol = n - 1;
		int spiral[][] = new int[n][n];
		while(value <= n*n)
		{
			for(i = startcol;i<=endcol;i++)
			{
				spiral[startrow][i] = value++;
			}
			startrow++;
			for(i = startrow;i<=endrow;i++)
			{
				spiral[i][endcol] = value++;
			}
			endcol--;
			for(i = endcol;i>=startcol;i--)
			{
				spiral[endrow][i] = value++;
			}
			endrow--;
			for(i = endrow;i>=startrow;i--)
			{
				spiral[i][startcol] = value++;
			}
			startcol++;
		}
		for(i = 0;i<n;i++,System.out.println())
			for(int j=0;j<n;j++)
				System.out.print(spiral[i][j]+"\t");
		

	}

}
