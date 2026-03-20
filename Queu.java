import java.util.Queue;
import java.util.PriorityQueue;
class Queu
{
	public static void main(String[] args)
	{
		Queue<Integer> q = new PriorityQueue<>();
		
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(4);
		System.out.print(q);
	}
}