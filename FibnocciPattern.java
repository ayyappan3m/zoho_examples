package zohoexamples;

public class FibnocciPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,10,6,8,13,21};
		int max = arr[0];
		int i = 0;
		for(i = 0;i<arr.length;i++)
		{
			if(max<arr[i])
				max = arr[i];
		}
		//System.out.print(max+"=max");
		int b = 1,c = 1,t;
		while(c <= max)
		{
			for(i = 0;i<arr.length;i++)
			{
				if(c == arr[i])
				{
					System.out.print(c+"\t");
					break;
				}
			}
			t = c;
			c = c + b;
			//System.out.print(c+"\t");
			//a = b;
			b = t;
		}

	}

}
