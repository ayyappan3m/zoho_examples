package zohoexamples;

public class CyclicOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = {{1,0},
						 {0,2},
						 //{2,1},
						 {0,3},
						 {3,4}};
		boolean flag = true;
		for(int i = 1;i<graph.length-1;i++)
		{
			if(graph[0][0] == graph[i][1])
			{
				System.out.println("Cyclic");
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Not Cyclic");
	}

}
