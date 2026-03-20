class JaggedSum 
{
    public static void main(String[] args)
	{
        int[][] a = {
            {1,2},
            {3,4,5},
            {6}
    };

        int sum = 0;

        for(int[] row : a)
	{
            for(int x : row)
	{
                sum += x;

        System.out.println("Sum = " + sum);
    }
}
