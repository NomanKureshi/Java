import java.util.sortedset;
import java.util.treeset;
class Sortedset
{
	public static void main(String[] args)
	{
		Sortedset<integer>set = new treeset<>();
		set.add(50);
		set.add(20);
		set.add(40);
		set.add(10);
		set.add(10);
		System.out.println(set);
		System.out.print("first element" + set.first());
		System.out.println(set);
		System.out.print("last element" + set.last());
	}
}