package zohoexamples;

public class BalanceParathesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "((abc)((de))";
		//String input = "((((abc)";
		boolean verify[] = new boolean[input.length()];
		
		int len = input.length();
		for(int i = len-1 ;i >= 0;i--)
		{
			
			for(int j =i-1;j >=0;j--)
			{
				if(verify[j]== false && input.charAt(i) == ')' && input.charAt(j) == '(' )
				{
					verify[j] = true;
					verify[i] = true;
					
					//System.out.println(i+"\t"+j);
					break;
				}
				/*else if(input.charAt(i) == '(' && input.charAt(j) == ')' && verify[j] == true)
				{
					verify[oldx] = false;
					verify[j] = true;
					break;
					
				}*/
			}
			if(input.charAt(i)!='(' && input.charAt(i)!=')') {
				//System.out.println("alp="+i);
				verify[i] = true;
			}
				
		}
		//StringBuilder sb = new StringBuilder(input);
		for(int k = 0;k<input.length();k++)
		{
			if(verify[k])
				System.out.print(input.charAt(k));
			//System.out.print(verify[k]+" ");
		}
		//System.out.print(sb);
	}

}
