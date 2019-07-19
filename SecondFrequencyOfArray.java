package zohoexamples;
/*
 * with array
 * 
 * 
 */

public class SecondFrequencyOfArray {
	static int c = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,3,1,2,4};
		int map[][] = new int[arr.length][2];
		System.out.println(arr.length);
		for(int i = 0;i<arr.length;i++)
		{
			if(isContain(arr[i],map) == -1)
			{
				map[c][0] = arr[i];
				map[c++][1]++;
			}
			
		}
		for(int i = 0;i<=c;i++)
			System.out.println(map[i][0]+"\t"+map[i][1]);
		//System.out.println("hello");
		
	}
	static int isContain(int ele,int map[][])
	{
		int value = -1;
		for(int i = 0;i <= c;i++)
		{
			if(map[i][0] == ele)
			{
				value = i;
				map[i][1]++;
				break;
			}
		}
		return value;
	}

}
