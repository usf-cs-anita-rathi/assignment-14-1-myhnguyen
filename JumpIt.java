public class JumpIt
{
	public static int lowestTestCost(int[] x, int y, int z)
	{

		z += x[y];
		if (y == x.length - 1)
			return z;
		else if (y == x.length - 2)
			return lowestTestCost(x, y + 1, z);
		else {

			int path1 = lowestTestCost(x, y + 1, z);
			int path2 = lowestTestCost(x, y + 2, z);

			return Math.min(path1, path2);
		}
	}

	public static void main(String args[]) 
	{
		int[] x = { 0, 3, 80, 6, 57, 10 };
		int n = 0;
		n = lowestTestCost(x, 0, n);
		System.out.print("The cost to enter each column: ");
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
		System.out.println();
		System.out.println("Total cost: " + n);
	}
}