package zohoexamples;

public class MakePatternUsingTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int zero = 3;
		int one = 4;
		for(int i = 1;i<=n;i++)
		{
			if(i == 1)
				System.out.print(zero+" "+one+" ");
			else
			{
				String num = "";
				for(int j = 0;j<Math.pow(2, i);j++)
				{
					num = "";
					if(j == 0)
						for(int k=1;k<=i;k++)
							num += '0';
					else
					{
						
						int temp = j;
						while(temp!=0)
						{
							num += String.valueOf(temp%2);
							temp /= 2;
						}
						
						int len = i - num.length();
						if(len != 0)
							for(int k = num.length();k<i;k++)
								num += String.valueOf(0);
					}
					
					
					for(int k = num.length()-1;k>=0;k--)
					{
						if(num.charAt(k) == '0')
							System.out.print(zero);
						else
							System.out.print(one);
						//System.out.print(num.charAt(k));
						
					}
					System.out.print(" ");
				}
				
				
			}
		}
	}

}
