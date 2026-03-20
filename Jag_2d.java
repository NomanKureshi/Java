import java.util.Arrays;

class Jag_2d 
{
    public static void main(String[] args)
	{

        int[][] NK = new int[3][];

        NK[0] = new int[3];
        NK[0][0] = 11;

        NK[1] = new int[2];
        NK[1][0] = 23;

        NK[2] = new int[2];
        NK[2][0] = 87;

        System.out.println(Arrays.deepToString(NK));
    }
}
